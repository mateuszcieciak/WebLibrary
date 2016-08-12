package com.mcieciak.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Mateusz on 11.08.2016.
 */

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="book")
public @Data class Book extends BaseId{
    private String title;
    private String author;
    private int available;
}
