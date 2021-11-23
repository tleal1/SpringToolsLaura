package com.laura.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.laura.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{

}