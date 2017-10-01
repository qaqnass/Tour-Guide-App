package com.nanoddegree.tourguideapp;

/**
 * Created by qaqnass on 01/10/17.
 */

public class Shop {

  private String title;
  private int imageURL;


  public Shop(String title, int imageURL) {
    setTitle(title);
    setImageURL(imageURL);
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getImageURL() {
    return imageURL;
  }

  public void setImageURL(int imageURL) {
    this.imageURL = imageURL;
  }

  @Override
  public String toString() {
    return "Word{" +
        "Show Title=" + title + ", " +
        "Image Url=" + imageURL +
        "}";
  }
}
