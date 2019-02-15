package text.editor.m1.Anameth.project.ccn;

/*
 * @Author by ONABANJI Abiola
 */

public class MoteurImp implements Moteur {
	
	//attributs
	private String contenu;
	private Clipboard cboard;
	private StructBuffer buffer; // this is for my textboard
	
	// construtor
	public MoteurImp(String contenu, Clipboard cboard, StructBuffer buffer) {
		super();
		this.contenu = contenu;
		this.cboard = cboard;
		this.buffer = buffer;
	}
	/*
	 *  Creating an empty content, pressparie (chilpboard) and buffer (text surface)
	 */
	
	public MoteurImp() {
		contenu = "";
		cboard = new Clipboard();
		buffer = new StructBuffer();
	}
	/*
	 * (non-Javadoc)
	 * @see fr.istic.m1.aco.tp1.Moteur#getConteun()
	 */

	@Override
	public String getConteun() {
		return contenu;
	}
	/*
	 * (non-Javadoc)
	 * @see fr.istic.m1.aco.tp1.Moteur#getDebut()
	 */

	@Override
	public int getDebut() {
		return buffer.getDebut();
	}
	/*
	 * (non-Javadoc)
	 * @see fr.istic.m1.aco.tp1.Moteur#getLongueur()
	 */

	@Override
	public int getLongueur() {
		return buffer.getLongueur();
	}
	/*
	 * (non-Javadoc)
	 * @see fr.istic.m1.aco.tp1.Moteur#selectionner(int, int)
	 */
	
	@Override
	public void selectionner(int debut, int longueur) { // this is used for the second test (test2)
		buffer.setDebut(debut);
		buffer.setLongueur(longueur);
		
	}
	/*
	 * (non-Javadoc)
	 * @see fr.istic.m1.aco.tp1.Moteur#saisir(java.lang.String)
	 */
	
	@Override
	public void saisir(String t) { // this is used for the first test (test1 - test5)
		int debut = buffer.getDebut();
		int longueur = buffer.getLongueur();
		if (contenu.isEmpty()){// test for when the console is at the starting point
			this.contenu = t;
			buffer.setDebut(t.length());
		}
		else if(longueur == 0){// test for when the console is at the middle
			String beforeSelect = contenu.substring(0, debut);
			String afterSelect = contenu.substring(debut);
			this.contenu = beforeSelect + t + afterSelect;
			buffer.setDebut(t.length() + debut);
		}
		else{// test for when the console is at the end
			String beforeSelect = contenu.substring(0, debut);
			String afterSelect = contenu.substring(debut + longueur);
			this.contenu = beforeSelect + t + afterSelect;
			buffer.setDebut(debut + t.length());
			buffer.setLongueur(0);
		}
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see fr.istic.m1.aco.tp1.Moteur#getClipboardContains()
	 * this is also known as presspapier.
	 * it is used to store the strings after its been cut, or copied
	 */
	@Override
	public String getClipboardContains() {
	
		return cboard.getClipboardContains();
	}
	
	/*
	 * (non-Javadoc)
	 * @see fr.istic.m1.aco.tp1.Moteur#getBuffer()
	 * 
	 */
	@Override
	public String getBuffer() {
		if(buffer.getDebut() < 0){// this is for exception case of selection
			return "";
		}
		else{
			return contenu.substring(buffer.getDebut(), buffer.getDebut() + buffer.getLongueur());
		}
		
	}
	/*
	 * (non-Javadoc)
	 * @see fr.istic.m1.aco.tp1.Moteur#couper()
	 */
	/*
	 * In order for the cut (couper) function to work, we need to implement the copy(copier) function
	 * and a delete function.
	 */
	@Override
	public void couper() {
		int start = buffer.getDebut();
		int length = buffer.getLongueur();
		copier();
		// The delete function starts from here.
		if(length == 0){
			String beforeSelect = contenu.substring(0, start);
			String afterSelect = contenu.substring(start);
			buffer.setDebut(start - getBuffer().length());
			this.contenu = beforeSelect + afterSelect;
		}
		else{
			String beforeSelect = contenu.substring(0, start);
			String afterSelect = contenu.substring(start + length);
			buffer.setDebut(start - getBuffer().length());
			buffer.setLongueur(0);
			this.contenu = beforeSelect + afterSelect;
		}
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see fr.istic.m1.aco.tp1.Moteur#copier()
	 * Copy function
	 */
	@Override
	public void copier() {
		this.cboard.setClipboardContains(getBuffer());
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see fr.istic.m1.aco.tp1.Moteur#coller()
	 * the paste function
	 */
	@Override
	public void coller() {
		saisir(cboard.getClipboardContains());
		
	}

}
