/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Eduardo Migueis, Rodrigo Smith and Manuela Benassi.
 * @since 2020.
 */
public class Aeroporto {
    static AtomicInteger nextId = new AtomicInteger();
    private int idAeroporto;
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
        this.idAeroporto = nextId.incrementAndGet();
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
    public ListaDuplamenteLigadaOrdenada<Voo> getVoos(){
        return this.listaVoos;
    }
    public void setCodigoIATA(String codigo) throws Exception
    {
        if(codigo.equals("")){
            throw new Exception("Código IATA inválido.");
        }
        else
        this.codigoIATA = codigo;
    }
    public void setCodigoICAO(String codigo) throws Exception
    {
        if(codigo.equals("")){
            throw new Exception("Código ICAO inválido.");
        }
        else
        this.codigoICAO = codigo;
    }
    public void setNome(String nome) throws Exception
    {
        if(nome.equals("")){
            throw new Exception("Nome inválido.");
        }
        else
        this.nomeAero = nome;
    }
    public void setPais(String pais) throws Exception
    {
        if(pais.equals("")){
            throw new Exception("País inválido.");
        }
        else
        this.pais = pais;
    }
    public void setCidade(String cidade) throws Exception
    {
        if(cidade.equals("")){
            throw new Exception("Cidade inválida.");
        }
        else
        this.cidade = cidade;
    }
}
