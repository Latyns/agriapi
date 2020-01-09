package com.agriapi.agriculture.repository;

import com.agriapi.agriculture.entities.Parcelle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParcelleRepository extends JpaRepository<Parcelle, Long> {


}
