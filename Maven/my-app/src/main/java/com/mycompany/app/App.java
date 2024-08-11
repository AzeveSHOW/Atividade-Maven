package com.mycompany.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
        String link = "jdbc:mysql://localhost:3306/atividade_maven";
        String nomeusuario = "root";
        String senha = "root";
        String criartabela = "CREATE TABLE IF NOT EXISTS carro (" +
                "id INT AUTO_INCREMENT PRIMARY KEY," +
                "nome VARCHAR(50) NOT NULL," +
                "cor VARCHAR(30) NOT NULL)";

        try (Connection connection = DriverManager.getConnection(link, nomeusuario, senha);
             Statement statement = connection.createStatement()) {

            statement.execute(criartabela);
            System.out.println("Tabela 'carro' criada com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        }
    }

