package text.editor.m1.Anameth.project.ccn;

/*
 * @Author by Noel Plouzeau and ONABANJI Abiola
 */
import java.io.InputStream;

public interface IHM {
	
	 /**
     * Starts the reading of the read stream set by setReadStream operation
     */
    public void runInvokerLoop();

    /**
     * Stops the read stream loop now.
     */
    public void stopLoop();

    /**
     * Sets the read stream that will be used by runInvokerLoop
     *
     * @param inputStream the read stream
     * @throws IllegalArgumentException if inputStream is null
     */
    public void setReadStream(InputStream inputStream);


    /**
     * Registers a new keyword/command pair
     *
     * @param keyword a non-null String
     * @param cmd     a non-null Command reference
     * @throws java.lang.IllegalArgumentException for null parameters
     */
    public void addCommand(String keyword, Commande cmd);
    
    /*
     *  This reads what my users write. it has the same function as the Scanner.
     */
    public String readUserInput(String prompt);



}
