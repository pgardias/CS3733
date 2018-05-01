package edu.wpi.cs3733.entity;

/**
 * Hash 'cipher'; you must implement the cipher (use String.hashCode()) and the observer pattern
 */
public class HashCipher implements Observer {

	private String text;

	public HashCipher() {
	}

	public void setText(String text) {
		this.text = Integer.toString(hashCipherConversion(text));
	}

	public String getText(){
		return text;
	}

	@Override
	public void notify(Object object){
		setText((String) object);
	}

	public int hashCipherConversion(String text) {
		return text.hashCode();
	}
}
