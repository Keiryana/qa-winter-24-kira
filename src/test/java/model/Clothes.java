package model;

public class Clothes {

    private String productType;
    private String productColor;
    private Integer productPrice;
    private Float modelHeight;
    private Boolean gender;

    //----------GETTER/SETTER--------


    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    public Float getModelHeight() {
        return modelHeight;
    }

    public void setModelHeight(Float modelHeight) {
        this.modelHeight = modelHeight;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }
}
