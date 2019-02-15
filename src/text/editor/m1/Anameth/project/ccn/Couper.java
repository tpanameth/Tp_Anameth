package text.editor.m1.Anameth.project.ccn;

/*
 * @Author by ONABANJI Abiola
 */

/*
 * This is used to for cutting words during the operation.
 * It's symbol is "X" in the class Configurator.java
 */
public class Couper implements Commande {
	
	//Attributs
		private Moteur moteurReceiver;
		
		// construtor
		public Couper(Moteur moteurReceiver) {
			
			this.moteurReceiver = moteurReceiver;
		}

		
		/*
		 * (non-Javadoc)
		 * @see text.editor.m1.Anameth.project.ccn.Commande#execteur()
		 */
		@Override
		public void execteur() {
			moteurReceiver.couper();
			
		}

}
