package model;

public class PhoneDescription {

    private String brandName;
    private Long releaseYear;
    private Integer memory;
    private Float screenDimensions;
    private Integer cameraPixels;

    //----------GETTER/SETTER----------

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Long getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Long releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public Float getScreenDimensions() {
        return screenDimensions;
    }

    public void setScreenDimensions(Float screenDimensions) {
        this.screenDimensions = screenDimensions;
    }

    public Integer getCameraPixels() {
        return cameraPixels;
    }

    public void setCameraPixels(Integer cameraPixels) {
        this.cameraPixels = cameraPixels;
    }
}
