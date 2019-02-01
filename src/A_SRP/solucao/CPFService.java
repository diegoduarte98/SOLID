package A_SRP.solucao;

public class CPFService {

    public static Boolean isValid(String cpf) {
        return cpf.length() == 11;
    }
}
