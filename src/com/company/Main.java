package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Loran"," Dishdishyan ", Author.Gender.MALE);
        Author author2 = new Author("Moris"," Berberyan ", Author.Gender.OTHER);
        Author author3 = new Author("Naira"," Mkrtchyan ", Author.Gender.FEMALE);

        Book book = new Book("Anurjner",new ArrayList<>(),22.5);
        book.getAuthors().add(author1);
        book.getAuthors().add(author2);
        book.getAuthors().add(author3);

        for (int i = 0; i < book.getAuthors().size(); i++) {
            System.out.println(book.getAuthors().get(i).getName() + book.getAuthors().get(i).getSurname() + book.getAuthors().get(i).getGender());
        }
    }
}
