package br.com.ornitorrinco.graphql;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Controller
public class AuthorController {
    @MutationMapping
    public Author createAuthor(@Argument AuthorInput authorInput) {
        String firstName = authorInput.getFirstName();
        String lastName = authorInput.getLastName();
        return new Author(UUID.randomUUID().toString(), firstName, lastName);
    }

}
