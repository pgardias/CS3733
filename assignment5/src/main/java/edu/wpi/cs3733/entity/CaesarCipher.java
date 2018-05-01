package edu.wpi.cs3733.entity;

/**
 * Caesar cipher; you must implement the cipher and the observer pattern
 */
public class CaesarCipher implements Observer {

	private String text;

	public CaesarCipher() {

	}

	public void setText(String text){
		this.text = caesarCipherConversion(text);
	}

	public String getText(){
		return text;
	}

	@Override
	public void notify(Object object){
		setText((String) object);
	}

	public String caesarCipherConversion(String text){
		String str = "";
		for (int i = 0; i < text.length(); i++) {
			char c = (char)(text.charAt(i) + 1);
			// '!' is the ASCII character following a space
			if (c == '!') {
				str += (char) (text.charAt(i));
			} else {
				if (c > 'z' || (c > 'Z' && c < 'a')) {
					str += (char) (text.charAt(i) - (26 - 1));
				} else {
					str += (char) (text.charAt(i) + 1);
				}
			}
		}
		return str;
	}
}
