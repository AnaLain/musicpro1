package com.musicpro1.demo;


import static org.junit.jupiter.api.Assertions.assertEquals;

import com.musicpro1.demo.model.Cliente;
import com.musicpro1.demo.repository.IClienteJpaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class ClienteJpaRepositoryTest {
    @Autowired
    private IClienteJpaRepository repo;

    public void  saveCliente(){
        Cliente Marcos = new Cliente("254811947", "Marcos", "Oreyana", "20", "Mont", "M", "m@gmail.com", "MarOre123");
        Cliente Maria = new Cliente("254811948", "Maria", "Diaz", "30", "SanFernando", "F", "ma@gmail.com", "MrDiaz123");

        repo.save(Marcos);
        repo.save(Maria);

        repo.flush();

        assertEquals(2, repo.findAll().size());
    }
}
