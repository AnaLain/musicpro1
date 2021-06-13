package com.musicpro1.demo.repository;

import com.musicpro1.demo.model.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteJpaRepositoy extends JpaRepository<Cliente,Long>{
    Cliente findByclienteid(String clienteid);
}
