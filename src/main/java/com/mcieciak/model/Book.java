package com.mcieciak.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Mateusz on 11.08.2016.
 */

@AllArgsConstructor
@NoArgsConstructor
public @Data class Book extends BaseId{
    private String title;
    private String author;
    private int available;
}
