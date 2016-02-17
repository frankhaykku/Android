package ru.strangeapps.quotesbook.Utils;

public class Quote {
    private String mDate;
    private String mRating;
    private String mText;
    private String mId;

    public Quote(String mDate, String mRating, String mText, String mId) {
        this.mDate = mDate;
        this.mRating = mRating;
        this.mText = mText;
        this.mId = mId;
    }

    public Quote(String mDate, String mText, String mId) {
        this.mDate = mDate;
        this.mText = mText;
        this.mId = mId;
    }

    public String getText() { return mText; }
    public String getDate() { return mDate; }
    public String getRating() { return mRating; }
    public String getId() { return mId; }
}
