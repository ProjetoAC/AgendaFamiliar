/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastros;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gabriela Farias
 */
public class AgendaDAO {
    public static void cadastrar_evento(String novo_evento, String data_evento, String descricao, int id_pessoa){
        
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Agenda", "postgres", "postgres");
            
            PreparedStatement ag = conexao.prepareStatement("insert into evento (nome_evento, data_evento, descricao, id_cadastro) values (?, ?, ?, ?)");
            
            ag.setString(1, novo_evento);
            Date data = new Date(new SimpleDateFormat("yyyy-MM-dd").parse(data_evento).getTime());
            ag.setDate(2, data);
            ag.setString(3, descricao);
            ag.setInt(4, id_pessoa);
            
            ag.executeUpdate();
            ag.close();
            conexao.close();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AgendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AgendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(AgendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void cadastro_pessoa(String nome,int telefone,float salario,String senha){
        
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Agenda", "postgres", "postgres");
            
            PreparedStatement ag = conexao.prepareStatement("insert into cadastros (nome, telefone, salario, senha) values (?, ?, ?, ?)");
            
            ag.setString(1, nome);
            ag.setInt(2, telefone);
            ag.setFloat(3, salario);
            ag.setString(4, senha);
            
            ag.executeUpdate();
            ag.close();
            conexao.close();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AgendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AgendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    
    public static void despezas(String nome_conta, float valor_conta, String data_vencimento, int id_pessoa){
        
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Agenda", "postgres", "postgres");
            
            PreparedStatement ag = conexao.prepareStatement("insert into conta (valor_conta, nome_conta, id_cadastro, data) values (?, ?, ?, ?)");
            
            ag.setFloat(1, valor_conta);
            ag.setString(2, nome_conta);
            ag.setInt(3, id_pessoa);
            Date data = new Date(new SimpleDateFormat("yyyy-MM-dd").parse(data_vencimento).getTime());
            ag.setDate(4, data);
            
            ag.executeUpdate();
            ag.close();
            conexao.close();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AgendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AgendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(AgendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static ArrayList<Agenda> listar(){
        ArrayList<Agenda> agendas = new ArrayList<Agenda>();
        
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jbdc:postgresql://localhost:5432/Agenda", "postgres", "postgres");
            PreparedStatement ag = conexao.prepareStatement("select cadastros.*, nome_evento from cadastros right join evento on (cadastros.id_eventos = evento.id_evento)");
            
            ResultSet rs = ag.executeQuery();
            while(rs.next()) {
                Agenda agenda = new Agenda();
                agenda.nome = rs.getString("nome");
                agenda.telefone = rs.getInt("telefone");
                agenda.salario = rs.getFloat("salario");
                agenda.novo_evento = rs.getString("novo_evento");
                agendas.add(agenda);
            }
            
            rs.close();
            ag.close();
            conexao.close();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AgendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AgendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
      

        return agendas;
    }
    
    public static ArrayList<Agenda> listarEventos(int id_pessoa){
        ArrayList<Agenda> agendas = new ArrayList<Agenda>();
        
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Agenda", "postgres", "postgres");
            PreparedStatement ag = conexao.prepareStatement("select * from evento where id_cadastro = ?");
            
            ag.setInt(1, id_pessoa);
            
            ResultSet rs = ag.executeQuery();
            while(rs.next()) {
                Agenda agenda = new Agenda();
                agenda.id_evento = rs.getInt("id_evento");
                agenda.data_evento = rs.getDate("data_evento");
                agenda.novo_evento = rs.getString("nome_evento");
                agenda.descricao = rs.getString("descricao");
                agendas.add(agenda);
            }
            
            rs.close();
            ag.close();
            conexao.close();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AgendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AgendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
      

        return agendas;
    }

    public static ArrayList<Agenda> listarConta(int id_pessoa){
        ArrayList<Agenda> agendas = new ArrayList<Agenda>();
        
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Agenda", "postgres", "postgres");
            PreparedStatement ag = conexao.prepareStatement("select * from conta where id_cadastro = ?");
            
            ag.setInt(1, id_pessoa);
            
            ResultSet rs = ag.executeQuery();
            while(rs.next()) {
                Agenda agenda = new Agenda();
                agenda.id_conta = rs.getInt("id_conta");
                agenda.valor_conta = rs.getFloat("valor_conta");
                agenda.nome_conta = rs.getString("nome_conta");
                agendas.add(agenda);
            }
            
            rs.close();
            ag.close();
            conexao.close();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AgendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AgendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
      

        return agendas;
    }

    
    public static Agenda login(String nome, String senha){
        
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Agenda", "postgres", "postgres");
            PreparedStatement ag = conexao.prepareStatement("select * from cadastros where nome = ? and senha = ?");
            
            ag.setString(1, nome);
            ag.setString(2, senha);
            ResultSet rs = ag.executeQuery();
            
            if (rs.next()) {
                Agenda agenda = new Agenda();
                agenda.nome = rs.getString("nome");
                agenda.senha = rs.getString("senha");
                agenda.id_pessoa = rs.getInt("id_cadastro");
                
                
                rs.close();
                ag.close();
                conexao.close();
                
                return agenda;
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AgendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AgendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }  
    
       public static void excluir(int id_evento, int id_pessoa) {
        
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Agenda", "postgres", "postgres");
            PreparedStatement ps = conexao.prepareStatement("delete from evento where id_evento=?");
            
            ps.setInt(1, id_evento);
            
            ps.executeUpdate();
            ps.close();
            conexao.close();
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AgendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AgendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
       
       
           
       public static void excluirConta(int id_conta, int id_pessoa) {
        
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Agenda", "postgres", "postgres");
            PreparedStatement ps = conexao.prepareStatement("delete from conta where id_conta=?");
            
            ps.setInt(1, id_conta);
            
            ps.executeUpdate();
            ps.close();
            conexao.close();
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AgendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AgendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
       
    public static void desejos(String nome_desejo, float preco_desejo, int id_pessoa){
        
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Agenda", "postgres", "postgres");
            
            PreparedStatement ag = conexao.prepareStatement("insert into desejos (nome, preco, id_cadastro) values (?, ?, ?)");
            
            ag.setString(1, nome_desejo);
            ag.setFloat(2, preco_desejo);
            ag.setInt(3, id_pessoa);
            
            ag.executeUpdate();
            ag.close();
            conexao.close();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AgendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AgendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }   
       
    public static void novoSalario(float novo_salario, int id_pessoa){
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Agenda", "postgres", "postgres");
            PreparedStatement ag = conexao.prepareStatement("update cadastros set salario = ? where id_cadastro = ?");
            
            ag.setFloat(1, novo_salario);
            ag.setInt(2, id_pessoa);
            
            ag.executeUpdate();
            ag.close();
            conexao.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AgendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AgendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
 
    public static ArrayList<Agenda> listarEventos(int id_pessoa, Date data_evento, String novo_evento, String descricao, String nome){
        ArrayList<Agenda> agendas = new ArrayList<Agenda>();
  
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Agenda", "postgres", "postgres");
            PreparedStatement ag = conexao.prepareStatement("SELECT nome, evento.*, conta.* FROM cadastros join evento on (cadastros.id_cadastro = evento.id_cadastro)  join conta on (cadastros.id_cadastro = conta.id_cadastro) where evento.id_cadastro = ? ORDER BY data_evento ASC  ");
            
            ag.setInt(1, id_pessoa);
            
            ResultSet rs = ag.executeQuery();
            while(rs.next()){
                Agenda agenda = new Agenda();
                agenda.nome = rs.getString("nome");
                agenda.novo_evento = rs.getString("nome_evento");
                agenda.data_evento = rs.getDate("data_evento");
                agenda.descricao = rs.getString("descricao");
                agendas.add(agenda);
            }
            
            rs.close();
            ag.close();
            conexao.close();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AgendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AgendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return agendas;
    }

        public static ArrayList<Agenda> listarContas(int id_pessoa, Date data_vencimento, String nome_conta, float valor_conta){
        ArrayList<Agenda> agendas = new ArrayList<Agenda>();
  
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Agenda", "postgres", "postgres");
            PreparedStatement ag = conexao.prepareStatement("SELECT nome, evento.*, conta.* FROM cadastros join evento on (cadastros.id_cadastro = evento.id_cadastro)  join conta on (cadastros.id_cadastro = conta.id_cadastro) where evento.id_cadastro = ? ORDER BY data_evento ASC  ");
            
            ag.setInt(1, id_pessoa);
            
            ResultSet rs = ag.executeQuery();
            while(rs.next()){
                Agenda agenda = new Agenda();
                agenda.nome_conta = rs.getString("nome_conta");
                agenda.data_vencimento = rs.getDate("data");
                agenda.valor_conta = rs.getFloat("valor_conta");
                agendas.add(agenda);
            }
            
            rs.close();
            ag.close();
            conexao.close();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AgendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AgendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return agendas;
    }

    
    
    public static void somaSalario(int id_pessoa, float sobra_salario){ //terminar
        
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/pessoas", "postgres", "postgres");
            PreparedStatement ag = conexao.prepareStatement("select sum(valor_conta) from conta where id_cadastro = ?");
                    
            ag.setInt(1, id_pessoa);
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AgendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AgendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
