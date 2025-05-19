package br.com.guilhermesantos.salutar.service.auth;

import br.com.guilhermesantos.salutar.dao.UsuarioDAO;
import br.com.guilhermesantos.salutar.model.Usuario;
import br.com.guilhermesantos.salutar.security.SalutarToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class AuthServicecImpl implements IAuthService {

    @Autowired
    private UsuarioDAO dao;

    @Override
    public Usuario criarUsuario(Usuario novo) {

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);
        String novaSenha = encoder.encode(novo.getSenha());
        novo.setSenha(novaSenha);

        return dao.save(novo);
    }

    @Override
    public SalutarToken realizarLogin(Usuario dadosLogin) {

        Usuario res = dao.findByLogin(dadosLogin.getLogin());
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        if (res != null){
            if(encoder.matches(dadosLogin.getSenha(), res.getSenha())){
                return new SalutarToken("minhasenha123");
            }
        }
        return null;
    }
}
