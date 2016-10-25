/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastros;

import java.sql.Date;

/**
 *
 * @author Gabriela Farias
 */
public class Agenda {
    public String novo_evento;
    public int id_evento;
    public int id_conta;
    public String descricao;
    public String nome;
    public int telefone;
    public float salario;
    public String senha;
    public String nome_conta;
    public float valor_conta;
    public int id_pessoa;
    public Date data_evento;
    public float novo_salario;
    public float preco_desejo;
    public String nome_desejo;
    public float sobra_salario;
    public float soma_salario;
    public Date data_vencimento;
    public float desejos_comprar;
    public String nome_desejo_comprar;
    public String nome_conta_hoje;
    public Float valor_conta_hoje;
    public String evento_hoje;
    
    public String getNome(){
        return nome;
    }
}
