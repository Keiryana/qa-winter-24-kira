package model;

import java.math.BigDecimal;

public class TableParameters {

    //--------ATTRIBUTES---------
    Character Article;
    Float width;
    Float lenght;
    Float height;
    BigDecimal price;

    //-------GETTER/SETTER--------

    public Character getArticle() {
        return Article;
    }

    public void setArticle(Character article) {
        Article = article;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }

    public Float getLenght() {
        return lenght;
    }

    public void setLenght(Float lenght) {
        this.lenght = lenght;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
