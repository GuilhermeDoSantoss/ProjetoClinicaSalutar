package br.com.guilhermesantos.salutar.teste;

import br.com.guilhermesantos.salutar.model.FichaPaciente;
import br.com.guilhermesantos.salutar.service.ficha.IFichaService;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Nested
@SpringBootTest
@ActiveProfiles("test")
public
class FichaTests {

    @Autowired
    IFichaService service;

    @Test
    public void shouldCreateFicha() {
        FichaPaciente f = new FichaPaciente();
        f.setNomePaciente("Guilherme");
        FichaPaciente res = service.cadastrar(f);
        assertTrue(res != null && res.getUuid() != null && res.getAtivo() == 1);
    }

    @Test
    public void shouldDeleteFicha() {
        assertTrue(service.excluir(1));
    }

    @Test
    public void shouldNotDeleteFicha() {
        assertFalse(service.excluir(1234982));
    }
}
