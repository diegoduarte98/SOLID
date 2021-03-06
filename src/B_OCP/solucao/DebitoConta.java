package B_OCP.solucao;

import java.math.BigDecimal;
import java.util.Random;

public abstract class DebitoConta {

    public String numeroTransacao;

    public abstract String debitar(BigDecimal valor, String conta);

    public String formatarTransacao() {
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        Random random = new Random();

        // Numero de transacao formatado
        return numeroTransacao;
    }
}
