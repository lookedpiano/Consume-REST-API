package com.udacity.joke.entity;

public class Cat {

    private String breeds;
    private String categories;
    private String id;
    private String url;
    private Long width;
    private Long height;

    public Cat(String breeds, String categories, String id, String url, Long width, Long height) {
        this.breeds = breeds;
        this.categories = categories;
        this.id = id;
        this.url = url;
        this.width = width;
        this.height = height;
    }

    public Cat() {
    }

    public String getBreeds() {
        return breeds;
    }

    public void setBreeds(String breeds) {
        this.breeds = breeds;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getWidth() {
        return width;
    }

    public void setWidth(Long width) {
        this.width = width;
    }

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cat{breeds=" + breeds +
                "cat" + categories +
                "id=" + id +
                ", url=" + url +
                ", width=" + width +
                ", height=" + height +
                "}";
    }
}
