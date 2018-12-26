package org.abhishek.bean;

import java.util.List;

public class Gallery {
    public int id;
    public List<Images> images;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Images> getImages() {
        return images;
    }

    public void setImages(List<Images> images) {
        this.images = images;
    }
}
