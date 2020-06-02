package com.company;

class Movie {

    String genre;
    String title;
    int rating;

    void playIt() {
        System.out.println("Playing the movie");
    }

}

public class MovieTestDrive {
    public static void main(String[] args){
        Movie one = new Movie();
        one.genre = " Horror";
        one.title = "The Comjuring";
        one.rating = 7;

        Movie two = new Movie();
        two.genre = "Action";
        two.title = "Avengers: Age of Ultron";
        two.rating = 8;

        Movie three = new Movie();
        three.genre = "Comedy";
        three.title = "Phir Herapheri";
        three.rating = 9;

        three.playIt();

    }
}
