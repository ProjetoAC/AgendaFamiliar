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
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/agenda_familiar", "agenda_familiar", "gabriela$1");
            
            PreparedStatement ag = conexao.prepareStatement("insert into eventos (nome_evento, data_evento, descricao, id_cadastro) values (?, ?, ?, ?)");
            
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
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/agenda_familiar", "agenda_familiar", "gabriela$1");
            
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
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/agenda_familiar", "agenda_familiar", "gabriela$1");
            
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
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/agenda_familiar", "agenda_familiar", "gabriela$1");
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
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/agenda_familiar", "agenda_familiar", "gabriela$1");
            PreparedStatement ag = conexao.prepareStatement("select * from eventos where id_cadastro = ?");
            
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
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/agenda_familiar", "agenda_familiar", "gabriela$1");
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
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/agenda_familiar", "agenda_familiar", "gabriela$1");
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
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/agenda_familiar", "agenda_familiar", "gabriela$1");
            PreparedStatement ps = conexao.prepareStatement("delete from eventos where id_evento=?");
            
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
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/agenda_familiar", "agenda_familiar", "gabriela$1");
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
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/agenda_familiar", "agenda_familiar", "gabriela$1");
            
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
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/agenda_familiar", "agenda_familiar", "gabriela$1");
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
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/agenda_familiar", "agenda_familiar", "gabriela$1");
            PreparedStatement ag = conexao.prepareStatement("SELECT nome, eventos.* FROM cadastros join eventos on (cadastros.id_cadastro = eventos.id_cadastro) where eventos.id_cadastro = ? ORDER BY data_evento ASC  ");
            
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
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/agenda_familiar", "agenda_familiar", "gabriela$1");
            PreparedStatement ag = conexao.prepareStatement("SELECT nome, conta.* FROM cadastros join conta on (cadastros.id_cadastro = conta.id_cadastro) where conta.id_cadastro = ? ORDER BY data ASC  ");
            
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

    
    
    public static ArrayList<Agenda> somaConta(int id_pessoa){ 
        ArrayList<Agenda> agendas = new ArrayList<Agenda>();
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/agenda_familiar", "agenda_familiar", "gabriela$1");
            PreparedStatement ag = conexao.prepareStatement("select cadastros.id_cadastro, salario - sum(valor_conta) as total from conta join cadastros on (cadastros.id_cadastro = conta.id_cadastro) where extract(month from data) = extract(month from current_date) and extract(year from data) = extract(year from current_date) and conta.id_cadastro = ? group by cadastros.id_cadastro");
                    
            ag.setInt(1, id_pessoa);
            
            ResultSet rs = ag.executeQuery();
            while(rs.next()){
                Agenda agenda = new Agenda();
                agenda.soma_salario = rs.getFloat("total");
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

    public static ArrayList<Agenda> desejosComprar(int id_pessoa, float soma_salario){ 
        ArrayList<Agenda> agendas = new ArrayList<Agenda>();
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/agenda_familiar", "agenda_familiar", "gabriela$1");
            PreparedStatement ag = conexao.prepareStatement("select preco, nome from desejos where id_cadastro = ?");
                    
            ag.setInt(1, id_pessoa);
            
            ResultSet rs = ag.executeQuery();
            while(rs.next()){
                Agenda agenda = new Agenda();
                agenda.desejos_comprar = rs.getFloat("preco");
                if (soma_salario < agenda.desejos_comprar) {
                    agenda.nome_desejo_comprar = rs.getString("nome");
                }
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
    
    public static ArrayList<Agenda> contaAtual(int id_pessoa){ 
        ArrayList<Agenda> agendas = new ArrayList<Agenda>();
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/agenda_familiar", "agenda_familiar", "gabriela$1");
            PreparedStatement ag = conexao.prepareStatement("select cadastros.id_cadastro, valor_conta as valor, nome_conta from conta join cadastros on (cadastros.id_cadastro = conta.id_cadastro) where data = current_date and conta.id_cadastro = ?");
                    
            ag.setInt(1, id_pessoa);
            
            ResultSet rs = ag.executeQuery();
            while(rs.next()){
                Agenda agenda = new Agenda();
                agenda.nome_conta_hoje = rs.getString("nome_conta");
                agenda.valor_conta_hoje = rs.getFloat("valor");
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
    
    public static ArrayList<Agenda> eventoAtual(int id_pessoa){ 
        ArrayList<Agenda> agendas = new ArrayList<Agenda>();
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/agenda_familiar", "agenda_familiar", "gabriela$1");
            PreparedStatement ag = conexao.prepareStatement("select cadastros.id_cadastro, nome_evento as data from eventos join cadastros on (cadastros.id_cadastro = eventos.id_cadastro)  where data_evento = current_date and eventos.id_cadastro = ?");
                    
            ag.setInt(1, id_pessoa);
            
            ResultSet rs = ag.executeQuery();
            while(rs.next()){
                Agenda agenda = new Agenda();
                agenda.evento_hoje = rs.getString("data");
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
    
    
}

