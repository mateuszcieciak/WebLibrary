package com.mcieciak.dao;

import com.mcieciak.model.Rent;
import com.mcieciak.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentRepository extends JpaRepository<Rent, Long>{

    // Dzieki temu Query za pomocą jednego zapytania wyciagna sie Renty z uzytkownikami i ksiazkami
    // npdst zalogowanego uzytkownika
    @Query("SELECT r FROM Rent r " +
            "LEFT JOIN FETCH r.user " +
            "LEFT JOIN FETCH r.book " +
            "WHERE r.user = :userParam ")
    List<Rent> findByUser(@Param("userParam") User user);
}
