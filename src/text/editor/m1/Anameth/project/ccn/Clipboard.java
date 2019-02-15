package text.editor.m1.Anameth.project.ccn;

public class Clipboard {
	private String clipboardContains;
	

	public Clipboard(String clipboardContains) {
		this.clipboardContains = clipboardContains;
	}

	public Clipboard() {
		clipboardContains = "";
	}

	public String getClipboardContains() {
		return clipboardContains;
	}

	public void setClipboardContains(String clipboardContains) {
		this.clipboardContains = clipboardContains;
	}

}
