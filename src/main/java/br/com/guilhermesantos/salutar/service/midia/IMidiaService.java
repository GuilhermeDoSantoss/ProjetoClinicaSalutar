package br.com.guilhermesantos.salutar.service.midia;

import br.com.guilhermesantos.salutar.model.Midia;

public interface IMidiaService {

    public Midia cadastrarNova(Midia midia);
    public Midia alterarDados(Midia midia);
    public boolean excluir(Integer id);
    public Midia recuperarPeloId(Integer id);
}
