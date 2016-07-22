package com.example.emillozev.recyclerviewandcards;

public class CardInfo {
    private String mName;
    private String mDescription;
    private int mPhoto;

    public CardInfo(String name, String description, int photo) {
        mName = name;
        mDescription = description;
        mPhoto = photo;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public int getPhoto() {
        return mPhoto;
    }

    public void setPhoto(int photo) {
        mPhoto = photo;
    }
}
