package B_OCP.solucao;

import java.math.BigDecimal;

public class DebitoContaCorrente extends DebitoConta {

    @Override
    public String debitar(BigDecimal valor, String conta) {

        // Debita Conta Corrente
        return formatarTransacao();
    }
}
