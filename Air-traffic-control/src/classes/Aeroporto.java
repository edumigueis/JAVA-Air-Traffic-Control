/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 * @author Eduardo Migueis, Rodrigo Smith and Manuela Benassi.
 * @since 2020.
 */
public class Aeroporto {
    private int idVoo;
    private String codigoIATA = "";
    private String codigoICAO = "";
    private String nomeAero = "";
    private String pais = "";
    private String cidade = "";
    private ListaDuplamenteLigadaOrdenada<Voo> listaVoos;
    
    public Aeroporto(String codigoIATA, String codigoICAO, String nome, String pais, String cidade){
        this.codigoIATA = codigoIATA;
        this.codigoICAO = codigoICAO;
        this.nomeAero = nome;
        this.pais = pais;
        this.cidade = cidade;
        this.listaVoos = new ListaDuplamenteLigadaOrdenada<Voo>();
    }
    
    public String getCodigoIATA(){
        return this.codigoIATA;
    }
    public String getCodigoICAO(){
        return this.codigoICAO;
    }
    public String getNome(){
        return this.nomeAero;
    }
    public String getPais(){
        return this.pais;
    }
    public String getCidade(){
        return this.cidade;
    }
    
    public void setCodigoIATA(String codigo) throws Exception
    {
        if(codigo.equals("")){
            throw new Exception("Código inválido.");
        }
        else
        this.codigoIATA = codigo;
    }
    public void setCodigoICAO(String codigo) throws Exception
    {
        if(codigo.equals("")){
            throw new Exception("Código inválido.");
        }
        else
        this.codigoICAO = codigo;
    }
}
