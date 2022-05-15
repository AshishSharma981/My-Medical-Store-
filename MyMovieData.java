package com.example.medicalstore;

class MyMovieData {

   private String movieName;
   private  String movieData;
   private Integer movieImage;


   public String getMovieName() {
      return movieName;
   }

   public void setMovieName(String movieName) {
      this.movieName = movieName;
   }

   public String getMovieData() {
      return movieData;
   }

   public void setMovieData(String movieData) {
      this.movieData = movieData;
   }

   public Integer getMovieImage() {
      return movieImage;
   }

   public void setMovieImage(Integer movieImage) {
      this.movieImage = movieImage;
   }

   public MyMovieData(String movieName, String movieData, Integer movieImage) {
      this.movieName = movieName;
      this.movieData = movieData;
      this.movieImage = movieImage;



   }
}
