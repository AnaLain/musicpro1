package com.musicpro1.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.musicpro1.demo.model.Cliente;
import com.musicpro1.demo.repository.IClienteJpaRepositoy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class ClienteJpaRepositoyTest {
    @Autowired
    private IClienteJpaRepositoy repo;

    public void saveCliente(){
        Cliente Fab = new Cliente("342316542", "Fab", "Savedra", "30", "Santiago", "fem", "fab@duoc.cl", "FabSa123");
        Cliente Juan = new Cliente("342316567", "Juan", "Pedraza", "30", "Santiago", "mas", "juan@duoc.cl", "JuanPe123");

        repo.save(Fab);
        repo.save(Juan);

        repo.flush();
        assertEquals(2, repo.findAll().size());
    }
}
