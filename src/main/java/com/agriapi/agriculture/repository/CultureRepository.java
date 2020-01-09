package com.agriapi.agriculture.repository;

import com.agriapi.agriculture.entities.Culture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CultureRepository extends JpaRepository<Culture, Long> {


}
