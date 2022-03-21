package Computer;

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

    public EMail(String bodyLetter) {
        this.bodyLetter = bodyLetter;
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

    public void letterText() {
        System.out.println(headerLetter + "\n" + bodyLetter + "\n" + signatureLetter);

    }

    public String letterText2() {
        String s = "\n" + headerLetter + "\n" + bodyLetter + "\n" + signatureLetter;
        return s;
    }

}
