package com.gbs.plus.discvoery.discoveryclient.controllers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private int id;
    private String isbn;
    private String title;
    private String author;
}
