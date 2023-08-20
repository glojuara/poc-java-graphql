package br.com.ornitorrinco.graphql;

import java.util.Arrays;
import java.util.List;

public class AuthorInput {

    private String firstName;
    private String lastName;


    public AuthorInput() {
    }

    public AuthorInput(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}