package factorymethod;

public class ServicoFactory {

    public static Servico obterService(String servico) {
        Class classe = null;
        Object objeto = null;

        try {
            classe = Class.forName("factorymethod.Servico" + servico);
            objeto = classe.newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("Servico Inexistente" + e);
        }

        if(!(objeto instanceof Servico)) {
            throw new IllegalArgumentException("Servico Invalido");
        }

        return (Servico) objeto;
    }
}
