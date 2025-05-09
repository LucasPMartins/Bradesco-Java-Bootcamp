package subsistema2.crm;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstancia(){

        return instancia;
    }

    public String recuperarCidada(String cep){
        return "Uberlândia";
    }

    public String recuperarEstado(String cep){
        return "MG";
    }
}
