package gof.facade;

import subsistema1.cep.CrmService;
import subsistema2.crm.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidada(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, estado, cidade);
    }
}
