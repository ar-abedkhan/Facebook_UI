package com.abedkhan.facebookui;

public class Profilestory {

     public String profilestory,imagecount,title;

    public Profilestory(String profilestory, String imagecount, String title) {
        this.profilestory = profilestory;
        this.imagecount = imagecount;
        this.title = title;
    }

    public String getProfilestory() {
        return profilestory;
    }

    public void setProfilestory(String profilestory) {
        this.profilestory = profilestory;
    }

    public String getImagecount() {
        return imagecount;
    }

    public void setImagecount(String imagecount) {
        this.imagecount = imagecount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
