package br.com.guilhermesantos.salutar.service.ficha;

import br.com.guilhermesantos.salutar.model.FichaPaciente;

import java.util.List;

public interface IFichaService {

    public FichaPaciente cadastrar( FichaPaciente nova);
    public FichaPaciente alterar(FichaPaciente ficha);
    public List<FichaPaciente> buscarPorNome(String nome);
    public FichaPaciente recuperarPeloId(Integer id);
    public boolean excluir (Integer id);


}
