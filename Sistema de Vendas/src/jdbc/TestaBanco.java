/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import javax.swing.JOptionPane;

/**
 *
 * @author rodolpho
 */
public class TestaBanco {
   
    public static void main(String[] args){
    
        try {
            
            new Banco().getConexao();
            JOptionPane.showMessageDialog(null,"conectado com sucesso");
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"erro ao conectar " +erro.getMessage());
        }
    
    }
    
}
