package org.example.repositories;

import org.example.entities.Cliente;
import org.example.entities.Endereco;
import org.example.entities.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
