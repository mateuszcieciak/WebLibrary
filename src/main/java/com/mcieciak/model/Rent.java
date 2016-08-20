package com.mcieciak.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "rent")
public @Data class Rent extends BaseId{

    public enum Status{ IN_PROGRESS, FINISHED }

    @Column(name="rent_date")
    private Date rentDate;
    @Column(name="return_date")
    private Date returnDate;

    @Enumerated(EnumType.STRING)
    private Status status=Status.IN_PROGRESS;

    @ManyToOne(fetch=FetchType.LAZY)
    // Kolumna klucza obcego
    @JoinColumn(name="book_id")
    private Book book;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    public Rent(Book book, User user){
        rentDate=new Date();
        this.book=book;
        this.user=user;
    }

}
