package factorymethod;

public class ServicoComputador implements Servico {

    public String concertar() {
        return "Computador concertado";
    }

    public String limpar() {
        return "Computador limpo e com pasta térmica nova";
    }

    public String formatado() {
        return "Computador formatado";
    }
}
