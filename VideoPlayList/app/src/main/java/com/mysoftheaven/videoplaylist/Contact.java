package com.mysoftheaven.videoplaylist;

/**
 * Created by USER on 9/18/2017.
 */

public class Contact {

    int image;
    String designation;
    String telePhone;
    String name;

    public Contact(int image, String name, String designation, String telePhone) {
        this.image = image;
        this.designation = designation;
        this.telePhone = telePhone;
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public String getDesignation() {
        return designation;
    }

    public String getTelePhone() {
        return telePhone;
    }

    public String getName() {
        return name;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setTelePhone(String telePhone) {
        this.telePhone = telePhone;
    }

    public void setName(String name) {
        this.name = name;
    }
}
