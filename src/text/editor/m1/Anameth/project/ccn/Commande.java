package text.editor.m1.Anameth.project.ccn;

/**
 * Created by plouzeau on 2014-06-01.
 */
/*
 * @Author by ONABANJI Abiola
 */

/**
 * Defines a common interface for concrete commands.
 */
public interface Commande {
	/**
     * Calls an appropriate operation on an appropriate receiver.
     * 'Appropriates' are defined in concrete implementation of Command.
     */
	public void execteur();
	

}
