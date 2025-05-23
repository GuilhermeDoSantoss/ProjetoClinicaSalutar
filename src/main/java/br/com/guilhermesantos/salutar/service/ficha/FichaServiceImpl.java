package br.com.guilhermesantos.salutar.service.ficha;

import br.com.guilhermesantos.salutar.dao.FichaPacienteDAO;
import br.com.guilhermesantos.salutar.model.FichaPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class FichaServiceImpl implements IFichaService {


    @Autowired
    private FichaPacienteDAO dao;

    @Override
    public FichaPaciente cadastrar(FichaPaciente nova) {
        nova.setUuid(UUID.randomUUID().toString());
        nova.setAtivo(1);
        return dao.save(nova
        );
    }

    @Override
    public FichaPaciente alterar(FichaPaciente ficha) {
        FichaPaciente tmp = dao.findById(ficha.getIdFicha()).orElse(null);
        if(tmp != null){
            if(ficha.getAtivo() != null){
                tmp.setAtivo(ficha.getAtivo());
            }
            return dao.save(ficha);
        }
        return null;
    }

    @Override
    public List<FichaPaciente> buscarPorNome(String nome) {
        return dao.findByNomePacienteContaining(nome);
    }

    @Override
    public FichaPaciente recuperarPeloId(Integer id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public boolean excluir(Integer id) {
        FichaPaciente ficha = recuperarPeloId(id);
        if (ficha != null){
            ficha.setAtivo(0);
            dao.save(ficha);
            return true;
        }
        return false;
    }
}
