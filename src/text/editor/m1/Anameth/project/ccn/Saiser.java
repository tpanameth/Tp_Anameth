package text.editor.m1.Anameth.project.ccn;

import java.util.logging.Logger;

/*
 * @Author by ONABANJI Abiola
 */

/*
 * This is used to start writing words during the operation.
 * It's symbol is "A" in the class Configurator.java
 */
public class Saiser implements Commande {
	
		//attributs
			/*
			 *  moteurReceiver and ihmInvoke that will be accessible from the execute() method,
			 * 
			 */
			private Moteur moteurReceiver;
			private IHM ihmInvoker;
			
			
			// construtor
			public Saiser(Moteur moteurReceiver, IHM ihmInvoker) {
				this.moteurReceiver = moteurReceiver;
				this.ihmInvoker = ihmInvoker;
			}

			/*
			 * (non-Javadoc)
			 * @see text.editor.m1.Anameth.project.ccn.Commande#execteur()
			 */
			@Override
			public void execteur() {
				/*
				 * Using IHM to ask the user to input a text
				 */
				String text = ihmInvoker.readUserInput("Please Write a text here: ");
				if (text == null || text.isEmpty()) {
					
					// Notifying for an error.
					Logger.getGlobal().warning("Waring, User must write a text!!!");
				}else{
					// Calling the operation saisir on the Moteur and passing it into the type text.
					moteurReceiver.saisir(text);
				}
						
			}
}
