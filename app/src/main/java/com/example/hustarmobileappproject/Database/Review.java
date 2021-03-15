package com.example.hustarmobileappproject.Database;

public class Review {
    private int reviewSeq;
    private String reviewComment;
    private String reviewRating;
    private String reviewDate;

    public Review(int reviewSeq, String reviewComment, String reviewRating, String reviewDate) {
        this.reviewSeq = reviewSeq;
        this.reviewComment = reviewComment;
        this.reviewRating = reviewRating;
        this.reviewDate = reviewDate;
    }

    public int getReviewSeq() {
        return reviewSeq;
    }

    public void setReviewSeq(int reviewSeq) {
        this.reviewSeq = reviewSeq;
    }

    public String getReviewComment() {
        return reviewComment;
    }

    public void setReviewComment(String reviewComment) {
        this.reviewComment = reviewComment;
    }

    public String getReviewRating() {
        return reviewRating;
    }

    public void setReviewRating(String reviewRating) {
        this.reviewRating = reviewRating;
    }

    public String getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(String reviewDate) {
        this.reviewDate = reviewDate;
    }
}



