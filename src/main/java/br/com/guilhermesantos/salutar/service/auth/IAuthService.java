package br.com.guilhermesantos.salutar.service.auth;

import br.com.guilhermesantos.salutar.model.Usuario;
import br.com.guilhermesantos.salutar.security.SalutarToken;

public interface IAuthService {

    public Usuario criarUsuario(Usuario novo);
    public SalutarToken realizarLogin(Usuario dadosLogin);
}
