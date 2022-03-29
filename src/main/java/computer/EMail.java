package main.java.computer;

import java.util.ArrayList;

public class EMail {
    private boolean letterSent;
    private boolean letterDelivered;
    private String signatureLetter;
    private String headerLetter;
    private String bodyLetter;

    public EMail(String headerLetter, String bodyLetter, String signatureLetter) {
        this.headerLetter = headerLetter;
        this.signatureLetter = signatureLetter;
        this.bodyLetter = bodyLetter;
    }

    public EMail(String headerLetter, String bodyLetter) {
        this.headerLetter = headerLetter;
        this.bodyLetter = bodyLetter;
    }


    public int sizeBoxLetters() {
        ArrayList<String> boxLetters = new ArrayList<>();
        boxLetters.add("Stop War");
        boxLetters.add("We love Ukraine");
        boxLetters.add("We are together!");
        return boxLetters.size();
    }

    public void setBodyLetter(String bodyLetter) {
        this.bodyLetter = bodyLetter;
    }

    public void setHeaderLetter(String headerLetter) {
        this.headerLetter = headerLetter;
    }

    public void setSignatureLetter(String Garry) {
        this.signatureLetter = signatureLetter;
    }

    public String getBodyLetter() {
        return bodyLetter;
    }

    public String getHeaderLetter() {
        return headerLetter;
    }

    public String getSignatureLetter() {
        return signatureLetter;
    }


    public String letterText() {
        String s = "\n" + headerLetter + "\n" + bodyLetter + "\n" + signatureLetter;
        return s;
    }

}
