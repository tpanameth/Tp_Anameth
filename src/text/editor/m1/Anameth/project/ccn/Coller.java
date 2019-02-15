package text.editor.m1.Anameth.project.ccn;

/*
 * @Author by ONABANJI Abiola
 */

/*
 * This is used to for pasting words during the operation.
 * It's symbol is "V" in the class Configurator.java
 */
public class Coller implements Commande{

	//Attributs
		private Moteur moteurReceiver;
		
		
		// construtor
		public Coller(Moteur moteurReceiver) {
			
			this.moteurReceiver = moteurReceiver;
			
		}

		
		/*
		 * (non-Javadoc)
		 * @see text.editor.m1.Anameth.project.ccn.Commande#execteur()
		 */
		@Override
		public void execteur() {
			moteurReceiver.coller();
			
		}

}
