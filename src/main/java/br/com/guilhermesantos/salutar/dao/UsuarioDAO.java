package br.com.guilhermesantos.salutar.dao;

import br.com.guilhermesantos.salutar.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDAO extends CrudRepository<Usuario,Integer> {

    public Usuario findByLogin(String login);
}
