package com.appstructural.vremenskaprognoza.miwok.model;

/**
 * Created by Mika on 5/22/2017.
 */

public class Word {

    private String mMiwok;
    private String mEnglish;
    private int mImageId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;
    private int mAudioResourceId;


    public Word(String mEnglish,String mMiwok, int mAudioResourceId ) {
        this.mMiwok = mMiwok;
        this.mEnglish = mEnglish;
        this.mAudioResourceId=mAudioResourceId;
    }

    public Word(String mEnglish,String mMiwok,int mImageId,int mAudioResourceId) {
        this.mEnglish = mEnglish;
        this.mMiwok = mMiwok;
        this.mImageId = mImageId;
        this.mAudioResourceId=mAudioResourceId;

    }

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }

    public String getmMiwok() {
        return mMiwok;
    }


    public String getmEnglish() {
        return mEnglish;
    }


    public int getmImageId() {
        return mImageId;
    }
    // Does word have an image
    public boolean hasImage(){

        return mImageId!=NO_IMAGE_PROVIDED;

    }
}
