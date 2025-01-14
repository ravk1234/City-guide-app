package example.com.cityguide.model;

import java.io.Serializable;

public class Shop implements Serializable{

    private int imageId;
    private String name;
    private float rating;
    private String place;
    private String overview;
    private String address;
    private String location;
    private String sampleReviewUsername;
    private String sampleReview;
    private float sampleReviewUserRating;
    private int totalRatings;

    public Shop(int imageId, String name, float rating, String place, String overview, String address, String location, String sampleReviewUsername, String sampleReview, float sampleReviewUserRating, int totalRatings) {
        this.imageId = imageId;
        this.name = name;
        this.rating = rating;
        this.place = place;
        this.overview = overview;
        this.address = address;
        this.location = location;
        this.sampleReviewUsername = sampleReviewUsername;
        this.sampleReview = sampleReview;
        this.sampleReviewUserRating = sampleReviewUserRating;
        this.totalRatings = totalRatings;
    }

    public int getImageId() {
        return imageId;
    }

    public String getName() {
        return name;
    }

    public float getRating() {
        return rating;
    }

    public String getPlace() {
        return place;
    }

    public String getOverview() {
        return overview;
    }

    public String getSampleReviewUsername() {
        return sampleReviewUsername;
    }

    public String getSampleReview() {
        return sampleReview;
    }

    public float getSampleReviewUserRating() {
        return sampleReviewUserRating;
    }

    public int getTotalRatings() {
        return totalRatings;
    }

    public String getAddress() {
        return address;
    }

    public String getLocation() {
        return location;
    }
}
