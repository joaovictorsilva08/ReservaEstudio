package org.example.repositories;

import org.example.entities.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudioRepository extends JpaRepository<Estudio, Long> {

    // Busca por nome
    Estudio findByEstnome(String estnome);

    // Verifica se já existe CNPJ cadastrado
    boolean existsByEstcnpj(String estcnpj);
}
