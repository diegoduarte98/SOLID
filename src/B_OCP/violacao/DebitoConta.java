package B_OCP.violacao;

import java.math.BigDecimal;

public class DebitoConta {

    public void debitar(BigDecimal valor, String conta, TipoConta tipoConta) {
        if (tipoConta == TipoConta.CORRENTE) {
            // Debita Conta Corrente
        }

        if (tipoConta == TipoConta.POUPANCA) {
            // Valida Aniversário da Conta
            // Debita Conta Poupança
        }
    }
}
