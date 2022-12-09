package com.abedkhan.facebookui.Models;

public class FriendModel {

    public String mutualCount,Confirmbtn,deleteBtn,reqProImg,reqProName,mutualImg;


    public FriendModel(String mutualCount, String confirmbtn, String deleteBtn, String reqProImg, String reqProName, String mutualImg) {
        this.mutualCount = mutualCount;
        Confirmbtn = confirmbtn;
        this.deleteBtn = deleteBtn;
        this.reqProImg = reqProImg;
        this.reqProName = reqProName;
        this.mutualImg = mutualImg;
    }

    public String getMutualCount() {
        return mutualCount;
    }

    public void setMutualCount(String mutualCount) {
        this.mutualCount = mutualCount;
    }

    public String getConfirmbtn() {
        return Confirmbtn;
    }

    public void setConfirmbtn(String confirmbtn) {
        Confirmbtn = confirmbtn;
    }

    public String getDeleteBtn() {
        return deleteBtn;
    }

    public void setDeleteBtn(String deleteBtn) {
        this.deleteBtn = deleteBtn;
    }

    public String getReqProImg() {
        return reqProImg;
    }

    public void setReqProImg(String reqProImg) {
        this.reqProImg = reqProImg;
    }

    public String getReqProName() {
        return reqProName;
    }

    public void setReqProName(String reqProName) {
        this.reqProName = reqProName;
    }

    public String getMutualImg() {
        return mutualImg;
    }

    public void setMutualImg(String mutualImg) {
        this.mutualImg = mutualImg;
    }
}
