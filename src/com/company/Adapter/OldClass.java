package com.company.Adapter;

import java.util.List;

public class OldClass  {

    private final String firstName;
    private final String lastName;
    private final List<String> favoriteMovies;

    public OldClass(String firstName, String lastName, List<String> favoriteMovies) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.favoriteMovies = favoriteMovies;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<String> getFavoriteMovies() {
        return favoriteMovies;
    }
}
