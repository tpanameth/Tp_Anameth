package text.editor.m1.Anameth.project.ccn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

public class IHMimpl implements IHM{

	   
	  //attributs
	private HashMap<String, Commande> commands = new HashMap<>();
    private boolean stopLoop = false;
    private InputStream inputStream;
    private BufferedReader bufferedReader;

	@Override
    public void runInvokerLoop() {
        while (!stopLoop) {
            String userInput = null;
            try {
                userInput = readUserInput();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if(userInput == null) {
                stopLoop = true;
                break;
            }
            Commande cmdToExecute = commands.get(userInput);
            if (cmdToExecute != null) {
                cmdToExecute.execteur();
            }
        }
    }

	@Override
    public void stopLoop() {
        stopLoop = true;
    }

    private String readUserInput() throws IOException {
        return bufferedReader.readLine();
    }
    
    @Override
    public String readUserInput(String prompt){
    	System.out.println(prompt);
    	try{
    		return readUserInput();
    	}catch(IOException e){
    		e.printStackTrace();
    		return "";
    	}
    }

    /**
     * Registers a new keyword/command pair
     *
     * @param keyword a non-null String
     * @param cmd     a non-null Command reference
     * @throws java.lang.IllegalArgumentException for null parameters
     */
    @Override
    public void addCommand(String keyword, Commande cmd) {
        if ((keyword == null) || (cmd == null)) {
            throw new IllegalArgumentException("null parameter");
        }
        commands.put(keyword,cmd);
    }

    @Override
    public void setReadStream(InputStream inputStream) {
        if(inputStream == null) {
            throw new IllegalArgumentException("null inputStream");
        }
        this.inputStream = inputStream;
        this.bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
    }


	
}
