package br.com.guilhermesantos.salutar.controller;

import br.com.guilhermesantos.salutar.model.Usuario;
import br.com.guilhermesantos.salutar.security.SalutarToken;
import br.com.guilhermesantos.salutar.service.auth.IAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class AuthController {

    @Autowired
    private IAuthService service;

    @PostMapping("/usuarios")
    public ResponseEntity<Usuario> adicionarNovo(@RequestBody Usuario novo){
        Usuario res = service.criarUsuario(novo);
        if (res != null){
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();
    }

    @PostMapping("/login")
    public ResponseEntity<SalutarToken> efetuarLogin(@RequestBody Usuario dadosLogin){
        SalutarToken token = service.realizarLogin(dadosLogin);
        if (token != null){
            return ResponseEntity.ok(token);
        }
        return ResponseEntity.status(403).build();
    }
}
