package org.example.control;

import org.example.model.PessoaFisica;
import java.sql.SQLException;
import java.util.List;

public interface PessoaFisicaInterface {
    void inserirPessoaFisica(PessoaFisica pessoaFisica) throws SQLException;
    void atualizarPessoaFisica(PessoaFisica pessoaFisica) throws SQLException;
    void excluirPessoaFisica(int codUsuario) throws SQLException;
    PessoaFisica buscarPessoaFisicaPorId(int codUsuario) throws SQLException;
    List<PessoaFisica> listarPessoasFisicas() throws SQLException;
}
