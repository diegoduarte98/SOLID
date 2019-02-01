package A_SRP.solucao;

import java.time.LocalDateTime;

public class Cliente {

    private Long clienteId;

    private String nome;

    private String email;

    private String cpf;

    private LocalDateTime dataCadastro;

    public String getEmail() {
        return email;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public Boolean isValid()
    {
        return EmailService.isValid(email) && CPFService.isValid(cpf);
    }
}
