package text.editor.m1.Anameth.project.ccn;

/*
 * @Author by Abiola ONABANJI 
 */

/*
 * This is used to print out the result after all operations as been performed.
 * It's symbol is "P" in the class Configurator.java
 */
public class Afficher implements Commande{
	
	//attributs
	private Moteur moteur;
	
	// construtor
	public Afficher(Moteur moteur) {
		this.moteur = moteur;
	}


	@Override
	public void execteur() {
		System.out.println(this.moteur.getConteun());
	}

}
