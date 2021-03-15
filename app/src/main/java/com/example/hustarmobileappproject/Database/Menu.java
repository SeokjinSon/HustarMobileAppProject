package com.example.hustarmobileappproject.Database;

public class Menu {
    private int menSeq;
    private String menuName;
    private int menuPrice;
    private String menuImage;
    private String menuCategory;

    public Menu(int menSeq, String menuName, int menuPrice, String menuImage, String menuCategory) {
        this.menSeq = menSeq;
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.menuImage = menuImage;
        this.menuCategory = menuCategory;
    }

    public int getMenSeq() {
        return menSeq;
    }

    public void setMenSeq(int menSeq) {
        this.menSeq = menSeq;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(int menuPrice) {
        this.menuPrice = menuPrice;
    }

    public String getMenuImage() {
        return menuImage;
    }

    public void setMenuImage(String menuImage) {
        this.menuImage = menuImage;
    }

    public String getMenuCategory() {
        return menuCategory;
    }

    public void setMenuCategory(String menuCategory) {
        this.menuCategory = menuCategory;
    }
}
