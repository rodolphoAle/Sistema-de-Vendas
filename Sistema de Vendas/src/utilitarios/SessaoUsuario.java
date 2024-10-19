/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;

import model.Funcionarios;

/**
 *
 * @author rodolpho
 */
public class SessaoUsuario {
    private static Funcionarios funcionarioLogado;

    public static void setFuncionarioLogado(Funcionarios funcionario) {
        funcionarioLogado = funcionario;
    }

    public static Funcionarios getFuncionarioLogado() {
        return funcionarioLogado;
    }
}

