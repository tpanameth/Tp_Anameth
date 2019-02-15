package text.editor.m1.Anameth.project.ccn;

/*
 * @Author by ONABANJI Abiola
 */

/*
 * This is used to for copying words during the operation.
 * It's symbol is "C" in the class Configurator.java
 */
public class Copier implements Commande{

	//Attributs
	private Moteur moteurReceiver;
	
	
	// construtor
	public Copier(Moteur moteurReceiver) {
		
		this.moteurReceiver = moteurReceiver;
		
	}

	
	/*
	 * (non-Javadoc)
	 * @see text.editor.m1.Anameth.project.ccn.Commande#execteur()
	 */
	@Override
	public void execteur() {
		moteurReceiver.copier();
		
	}

}
