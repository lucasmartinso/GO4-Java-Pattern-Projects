package factorymethod;

public class ServicoCelular implements Servico {
    public String concertar() {
        return "Celular concertado";
    }

    public String limpar() {
        return "Celular limpo";
    }

    public String formatado() {
        return "Celular formatado";
    }
}
