package edu.wpi.cs3733.entity;

/**
 * Elbonian cipher; you must implement the cipher and the observer pattern
 */
public class ElbonianCipher implements Observer {

    private String text;

    public ElbonianCipher() {
    }

    public void setText(String text) {
        this.text = elbonianCipherConversion(text);
    }

    public String getText() {
        return text;
    }

    @Override
    public void notify(Object object) {
        setText((String) object);
    }

    public String elbonianCipherConversion(String text) {
        String input = text.toLowerCase();
        String str = "";
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                str += "27";

            } else {
                str += Integer.toString(alphabet.indexOf(input.charAt(i)) + 1);
            }
        }
        return str;
    }
}
