package com.abedkhan.facebookui;

public class Postmodel {

    public String caption,postupload,idname,profileimage;


    public Postmodel(String caption, String postupload, String idname, String profileimage) {
        this.caption = caption;
        this.postupload = postupload;
        this.idname = idname;
        this.profileimage = profileimage;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getPostupload() {
        return postupload;
    }

    public void setPostupload(String postupload) {
        this.postupload = postupload;
    }

    public String getIdname() {
        return idname;
    }

    public void setIdname(String idname) {
        this.idname = idname;
    }

    public String getProfileimage() {
        return profileimage;
    }

    public void setProfileimage(String profileimage) {
        this.profileimage = profileimage;
    }
}
