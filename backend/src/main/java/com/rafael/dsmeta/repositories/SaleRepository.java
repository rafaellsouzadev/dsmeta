package com.rafael.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafael.dsmeta.entities.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long>{

}
