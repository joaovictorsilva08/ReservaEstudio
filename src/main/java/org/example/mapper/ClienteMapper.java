//package org.example.mapper;
//
//
//import org.example.dto.ClienteDTO;
//import org.example.entities.Cliente;
//
//public class ClienteMapper {
//
//    public static ClienteDTO toDTO(Cliente cliente) {
//        if (cliente == null) return null;
//
//        ClienteDTO dto = new ClienteDTO();
//        dto.setCliid(cliente.getCliid());
//        dto.setClinome(cliente.getClinome());
//        dto.setClicpf(cliente.getClicpf());
//        dto.setClirg(cliente.getClirg());
//        dto.setClidataNascimento(cliente.getClidataNascimento());
//        dto.setClisexo(cliente.getClisexo());
//        dto.setClidataCadastro(cliente.getClidataCadastro());
//        dto.setCliobservacoes(cliente.getCliobservacoes());
//        dto.setCliativo(cliente.isCliativo());
//
//        return dto;
//    }
//
//    public static Cliente toEntity(ClienteDTO dto) {
//        if (dto == null) return null;
//
//        Cliente cliente = new Cliente();
//        cliente.setCliid(dto.getCliid());
//        cliente.setClinome(dto.getClinome());
//        cliente.setClicpf(dto.getClicpf());
//        cliente.setClirg(dto.getClirg());
//        cliente.setClidataNascimento(dto.getClidataNascimento());
//        cliente.setClisexo(dto.getClisexo());
//        cliente.setClidataCadastro(dto.getClidataCadastro());
//        cliente.setCliobservacoes(dto.getCliobservacoes());
//        cliente.setCliativo(dto.isCliativo());
//
//        return cliente;
//    }
//}
