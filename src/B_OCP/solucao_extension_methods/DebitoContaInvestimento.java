package B_OCP.solucao_extension_methods;

public class DebitoContaInvestimento extends DebitoConta {

    public static String debitarContaInvestimento(DebitoConta debitoConta) {

        // Logica de negócio para debito em conta investimento.
        return debitoConta.formatarTransacao();
    }
}
