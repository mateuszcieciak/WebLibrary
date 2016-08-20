package com.mcieciak.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by Mateusz on 12.08.2016.
 */

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public
@Data
class User extends BaseId {

    // Ten enum jest stricte zwiazany z ta klasa, wiec nie tworze go w osobnej
    public enum Role {
        ADMIN, USER
    }

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email", unique = true)
    private String email;
    private String password;

    // Dzieki temu w bazie danych bedzie jako string, a nie 0 i 1
    @Enumerated(EnumType.STRING)
    private Role role=Role.USER;
}
