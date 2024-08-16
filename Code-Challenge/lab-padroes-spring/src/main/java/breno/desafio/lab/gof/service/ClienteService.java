package breno.desafio.lab.gof.service;

import breno.desafio.lab.gof.model.Cliente;

public interface ClienteService {
    Iterable<Cliente> findAll();

    Cliente findById(Long id);

    void insert(Cliente cliente);

    void update(Long id, Cliente cliente);

    void delete(Long id);
}
