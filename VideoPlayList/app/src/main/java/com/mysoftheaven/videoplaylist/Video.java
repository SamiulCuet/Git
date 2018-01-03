package com.mysoftheaven.videoplaylist;

/**
 * Created by USER on 12/12/2017.
 */

public class Video {
    int image;
    String title;

    public Video( String title,int image) {
        this.image = image;
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
