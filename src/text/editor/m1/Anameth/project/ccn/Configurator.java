package text.editor.m1.Anameth.project.ccn;

/*
 * @Author by Abiola ONABANJI 
 */

/*
 *  X for Cut (fr Couper)
 *  C for Copy (fr Copier)
 *  V for Paste (fr Coller)
 *  S for Selecting (fr Selectioner)
 *  A for Writing (fr Saiser)
 *  P for Print (fr Afficher)
 */
public class Configurator {

	 //attributs
	private Moteur moteur; // this is the receiver
	private IHMimpl ihm; // this is the invoker
	
	
	public static void main(String lineArgs[]) {

		Configurator client = new Configurator();
        client.run();

    }

    private void run() {
        ihm = new IHMimpl();
        moteur = new MoteurImp();
        ihm.setReadStream(System.in);
        configureCommands();
        ihm.runInvokerLoop();
    }

    

    private void configureCommands() {

    	ihm.addCommand("X", new Couper(moteur));
    	ihm.addCommand("C", new Copier(moteur));
    	ihm.addCommand("V", new Coller(moteur));
    	ihm.addCommand("S", new Selectioner(moteur, ihm));
    	ihm.addCommand("A", new Saiser(moteur, ihm));
    	ihm.addCommand("P", new Afficher(moteur));

    }
}
