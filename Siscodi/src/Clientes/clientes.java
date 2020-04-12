/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clientes;

import DAO.ClasseDAO;

/**
 *
 * @author Aluno
 */
public class clientes extends ClasseDAO{
    
    private int    idCliente;
    private String endereco;
    private String telefone;
    private String cpf;
    private String Nome;
    private String Cidade;
    private double valorPrazo;
    private int IdVendaPrazo;
    private String quitado;

    public int getIdVendaPrazo() {
        return IdVendaPrazo;
    }

    public void setIdVendaPrazo(int IdVendaPrazo) {
        this.IdVendaPrazo = IdVendaPrazo;
    }


    public double getValorPrazo() {
        return valorPrazo;
    }

    public void setValorPrazo(double valorPrazo) {
        this.valorPrazo = valorPrazo;
    }

    public  int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }
    
    public void setQuitado(String Quitado){
         this.quitado = Quitado;
    }
    public String getQuitado (){
        return quitado;
    }
    
    
}
