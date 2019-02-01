package A_SRP.violacao;

import A_SRP.SendMail;

import java.sql.*;
import java.time.LocalDateTime;

public class Cliente {

    private Long clienteId;

    private String nome;

    private String email;

    private String cpf;

    private LocalDateTime dataCadastro;

    public String adicionarCliente() throws SQLException {

        if (!email.contains("@"))
            return "Cliente com e-mail inválido";

        if (cpf.length() != 11)
            return "Cliente com CPF inválido";

        Connection conn = DriverManager.getConnection("jdbc:jdbc:mysql://localhost:3306/" , "user" , "password");
        PreparedStatement ps = conn.prepareStatement("INSERT INTO CLIENTE (NOME, EMAIL CPF, DATA_CADASTRO) VALUES (?, ?, ?, ?))");
        ps.setString(1, nome);
        ps.setString(2, email);
        ps.setString(3, cpf);
        ps.setTimestamp(4, Timestamp.valueOf(dataCadastro));

        ps.execute();
        ps.close();

        conn.close();

        String from = "abc@gmail.com";
        String to = "xyz@gmail.com";
        String subject = "Bem Vindo.";
        String message = "Parabéns! Você está cadastrado.";

        SendMail sendMail = new SendMail(from, to, subject, message);
        sendMail.send();

        return "Cliente cadastrado com sucesso!";
    }
}
