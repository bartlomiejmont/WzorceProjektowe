package com.company.Adapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Adapter implements NewInterface {

    private final OldClass person;

    public Adapter(OldClass person) {
        this.person = person;
    }

    @Override
    public String getFullName() {
        return (this.person.getFirstName()+ " " + this.person.getLastName());
    }

    @Override
    public Collection<String> getFirstAndLastMovie() {
        List<String> movies = new ArrayList<String>();

        if(this.person.getFavoriteMovies().size() == 0){
            return movies;
        }

        movies.add(this.person.getFavoriteMovies().get(0));

        if(this.person.getFavoriteMovies().size() == 1){
            return movies;
        }

        movies.add(this.person.getFavoriteMovies().get(this.person.getFavoriteMovies().size()-1));

        return movies;
    }
}
