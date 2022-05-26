package Unidad9.Tacon_Miranda_Alfonso_U8U9_Examen.Ejercicio4;

public class productLine {
    private String productLine;
    private String textDescription;
    private String htmlDesription;
    private String image;

    public productLine(String productLine, String textDescription, String htmlDesription, String image) {
        this.productLine = productLine;
        this.textDescription = textDescription;
        this.htmlDesription = htmlDesription;
        this.image = image;
    }

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public String getTextDescription() {
        return textDescription;
    }

    public void setTextDescription(String textDescription) {
        this.textDescription = textDescription;
    }

    public String getHtmlDesription() {
        return htmlDesription;
    }

    public void setHtmlDesription(String htmlDesription) {
        this.htmlDesription = htmlDesription;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "productLine{" +
                "productLine='" + productLine + '\'' +
                ", textDescription='" + textDescription + '\'' +
                ", htmlDesription='" + htmlDesription + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
