package com.example.hustarmobileappproject.Database;

public class Store {
    private int storeSeq;
    private String storeName;
    private String storeAddress;
    private String storeIntroduce;
    private String storePhoneNum;
    private String storeImage;

    public Store(int storeSeq, String storeName, String storeAddress,
                 String storeIntroduce, String storePhoneNum, String storeImage) {
        this.storeSeq = storeSeq;
        this.storeName = storeName;
        this.storeAddress = storeAddress;
        this.storeIntroduce = storeIntroduce;
        this.storePhoneNum = storePhoneNum;
        this.storeImage = storeImage;
    }

    public int getStoreSeq() {
        return storeSeq;
    }

    public void setStoreSeq(int storeSeq) {
        this.storeSeq = storeSeq;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public String getStoreIntroduce() {
        return storeIntroduce;
    }

    public void setStoreIntroduce(String storeIntroduce) {
        this.storeIntroduce = storeIntroduce;
    }

    public String getStorePhoneNum() {
        return storePhoneNum;
    }

    public void setStorePhoneNum(String storePhoneNum) {
        this.storePhoneNum = storePhoneNum;
    }

    public String getStoreImage() {
        return storeImage;
    }

    public void setStoreImage(String storeImage) {
        this.storeImage = storeImage;
    }
}