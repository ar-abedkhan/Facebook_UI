package com.abedkhan.facebookui;

public class Storymodel {

    public String Storyupload,idname,image;


    public Storymodel(String storyupload, String idname, String image) {
        Storyupload = storyupload;
        this.idname = idname;
        this.image = image;
    }


    public String getStoryupload() {
        return Storyupload;
    }

    public void setStoryupload(String storyupload) {
        Storyupload = storyupload;
    }

    public String getIdname() {
        return idname;
    }

    public void setIdname(String idname) {
        this.idname = idname;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
