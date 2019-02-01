package B_OCP.solucao_extension_methods;

import java.math.BigDecimal;
import java.util.Random;

public abstract class DebitoConta {

    public String numeroConta;

    public BigDecimal valor;

    public String numeroTransacao;

    public String formatarTransacao() {
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        Random random = new Random();

        // Numero de transacao formatado
        return numeroTransacao;
    }
}
