package factorymethod;

public class ServicoRede implements Servico {
    public String concertar() {
        return "Rede concertada";
    }

    public String limpar() {
        return "Trafego de rede limpo";
    }

    public String formatado() {
        return "Rede formatada";
    }
}
