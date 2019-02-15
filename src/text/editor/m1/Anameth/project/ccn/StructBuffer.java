package text.editor.m1.Anameth.project.ccn;

/*
 * @Author by ONABANJI Abiola
 */

public class StructBuffer {
	private int debut;
	private int longueur;

	public StructBuffer()
	{
		this.debut=1; // this is bcos i started my at A = 1, and not A = 0;
		this.longueur=0;
	}
	
	public StructBuffer(int debut, int longueur)
	{
		this.debut = debut;
		this.longueur = longueur;
	}
	
	/*
	 * Returns the value of the starting point
	 */
	public int getDebut() {
		return debut;
	}
	
	/*
	 * Sets the value of the starting point
	 */
	public void setDebut(int debut) {
		this.debut = debut;
	}
	
	/*
	 *  Returns the value of the length
	 */
	public int getLongueur() {
		return longueur;
	}
	
	/*
	 *  Set the value of the length
	 */
	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}
	
	

}
