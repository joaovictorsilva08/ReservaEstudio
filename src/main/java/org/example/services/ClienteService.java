package org.example.services;

import org.example.entities.Cliente;
import org.example.exceptions.ResourceNotFoundException;
import org.example.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }

    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Optional<Cliente> buscarPorId(Long id) {
        return clienteRepository.findById(id);
    }

    public Cliente atualizar(Long id, Cliente cliente) {
        return clienteRepository.findById(id)
                .map(clienteExistente -> {
                    cliente.setId(id);
                    return clienteRepository.save(cliente);
                }).orElseThrow(() -> new ResourceNotFoundException("Cliente não encontrado com id " + id));
    }

    public void deletar(Long id) {
        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Cliente não encontrado com id " + id));
        clienteRepository.delete(cliente);
    }
}
