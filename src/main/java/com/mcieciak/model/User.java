package com.mcieciak.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Mateusz on 12.08.2016.
 */

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user")
public @Data class User extends BaseId{

    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="email", unique = true)
    private String email;
    private String password;
}
