package A_SRP.solucao;

import java.sql.*;

public class ClienteRepository {

    public void adicionarCliente(Cliente cliente) {

        try {
            Connection conn = DriverManager.getConnection("jdbc:jdbc:mysql://localhost:3306/" , "user" , "password");
            PreparedStatement ps = conn.prepareStatement("INSERT INTO CLIENTE (NOME, EMAIL CPF, DATA_CADASTRO) VALUES (?, ?, ?, ?))");
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getEmail());
            ps.setString(3, cliente.getCpf());
            ps.setTimestamp(4, Timestamp.valueOf(cliente.getDataCadastro()));

            ps.execute();
            ps.close();

            conn.close();
        } catch (SQLException e) {

        }
    }
}
