package A_SRP.solucao;

public class ClienteService {

    public String adicionarCliente(Cliente cliente)
    {
        if (!cliente.isValid())
            return "Dados inválidos";

        ClienteRepository repo = new ClienteRepository();
        repo.adicionarCliente(cliente);

        EmailService.enviar("empresa@empresa.com", cliente.getEmail(), "Bem Vindo", "Parabéns está Cadastrado");

        return "Cliente cadastrado com sucesso";
    }
}
