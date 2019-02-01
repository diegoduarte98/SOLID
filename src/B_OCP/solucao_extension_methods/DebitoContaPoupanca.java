package B_OCP.solucao_extension_methods;

public class DebitoContaPoupanca extends DebitoConta {

    public static String debitarContaPoupanca(DebitoConta debitoConta)
    {
        // Logica de negócio para debito em conta poupanca.
        return debitoConta.formatarTransacao();
    }
}
