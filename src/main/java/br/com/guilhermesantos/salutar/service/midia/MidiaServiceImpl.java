package br.com.guilhermesantos.salutar.service.midia;

import br.com.guilhermesantos.salutar.dao.MidiaDAO;
import br.com.guilhermesantos.salutar.model.Midia;
import org.springframework.stereotype.Component;

@Component
public class MidiaServiceImpl implements IMidiaService{

    private MidiaDAO dao;

    @Override
    public Midia cadastrarNova(Midia midia) {
        return dao.save(midia);
    }

    @Override
    public Midia alterarDados(Midia midia) {
        return dao.save(midia);
    }

    @Override
    public boolean excluir(Integer id) {
        if (dao.existsById(id)){
            dao.deleteById(id);
        }
        return false;
    }

    @Override
    public Midia recuperarPeloId(Integer id) {
        return dao.findById(id).orElse(null);
    }
}
