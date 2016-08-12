package com.mcieciak.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Created by Mateusz on 12.08.2016.
 */

@NoArgsConstructor
@AllArgsConstructor

@MappedSuperclass
public @Data class BaseId {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
