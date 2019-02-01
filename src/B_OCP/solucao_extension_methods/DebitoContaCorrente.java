package B_OCP.solucao_extension_methods;

public class DebitoContaCorrente extends DebitoConta {

    public static String debitarContaCorrente(DebitoConta debitoConta) {

        // Logica de negócio para debito em conta corrente.
        return debitoConta.formatarTransacao();
    }
}
