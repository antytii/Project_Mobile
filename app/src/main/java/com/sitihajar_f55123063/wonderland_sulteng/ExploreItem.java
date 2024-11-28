package com.sitihajar_f55123063.wonderland_sulteng;

public class ExploreItem {
    private int imageResId;
    private String title;
    private String description;

    public ExploreItem(int imageResId, String title, String description) {
        this.imageResId = imageResId;
        this.title = title;
        this.description = description;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
