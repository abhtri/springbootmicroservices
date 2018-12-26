package org.abhishek.bean;

import org.springframework.stereotype.Component;

public class Image {
    public int id;
    public String url;
    public String title;

    public Image(int id, String url, String title) {
        this.id = id;
        this.url = url;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
