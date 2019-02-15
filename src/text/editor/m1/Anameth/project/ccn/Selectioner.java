package text.editor.m1.Anameth.project.ccn;


import java.util.logging.Logger;

/*
 * @Author by ONABANJI Abiola
 */
/*
 * This is used to for selecting words during the operation.
 * It's symbol is "S" in the class Configurator.java
 */
public class Selectioner implements Commande{
	
		//attributs
		private Moteur moteurReceiver;
		private IHM ihmInvoker;
		
		
		// construtor
		public Selectioner(Moteur moteurReceiver, IHM ihmInvoker) {
			this.moteurReceiver = moteurReceiver;
			this.ihmInvoker = ihmInvoker;
		}


		@Override
		public void execteur() {
			
			int start= 0; int length = 0;
			
			try {
				start = Integer.parseInt(this.ihmInvoker.readUserInput("Please type selection start "));
				length = Integer.parseInt(this.ihmInvoker.readUserInput("Please type selection length "));
	
			} catch (NumberFormatException ex) {
				ex.printStackTrace();
			}
			if (start >=0 && length >=0) {
				this.moteurReceiver.selectionner(start, length);
			}else{
				Logger.getGlobal().warning("Waring, Start value must be at least 0, and Length value must be at least 0.");
				
			}
			
			
			
		}

}
