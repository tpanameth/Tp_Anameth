package text.editor.m1.Anameth.project.ccn;
/**
 * Created by Onabanji on 2019-02-05.
 */
public interface Moteur {
	
	// variables
	/*
	 * This is used to cut and copy strings from my StructBuffer
	 */
	public void couper();
	public void copier();
	public void coller();
	public String getClipboardContains();
	/**
	 * This is used to write into my StructBuffer
	 * @param t
	 */
	public void saisir(String t);
	public void selectionner (int debut, int longueur);
	public String getBuffer();
	/**
	 * 
	 *  This is used to get the start and the length of strings in my StructBuffer, which serves as the text editor.
	 * @return
	 */
	public String getConteun();
	public int getDebut();
	public int getLongueur();
	
}
