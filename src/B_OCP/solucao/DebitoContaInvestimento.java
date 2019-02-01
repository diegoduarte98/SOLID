package B_OCP.solucao;

import java.math.BigDecimal;

public class DebitoContaInvestimento extends DebitoConta {

    @Override
    public String debitar(BigDecimal valor, String conta) {
        // Debita Conta Investimento
        // Isentar Taxas
        return formatarTransacao();
    }
}
