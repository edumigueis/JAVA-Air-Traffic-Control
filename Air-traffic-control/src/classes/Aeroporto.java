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
public class Aeroporto implements Cloneable
{
    static AtomicInteger nextId = new AtomicInteger();
    private int idAeroporto;
    private String codigoIATA = "";
    private String codigoICAO = "";
    private String nomeAero = "";
    private String pais = "";
    private String cidade = "";
    private final ListaDuplamenteLigadaDesordenada<Voo> listaVoos;

    /**
     * Construtor da classe Aeroporto
     * 
     * @param codigoIATA
     * @param codigoICAO
     * @param nome
     * @param pais
     * @param cidade
     */
    public Aeroporto(String codigoIATA, String codigoICAO, String nome, String pais, String cidade)
    {
        this.codigoIATA = codigoIATA;
        this.codigoICAO = codigoICAO;
        this.nomeAero = nome;
        this.pais = pais;
        this.cidade = cidade;
        this.listaVoos = new ListaDuplamenteLigadaDesordenada<Voo>();
        this.idAeroporto = nextId.incrementAndGet();
    }
    
    public String getCodigoIATA()
    {
        return this.codigoIATA;
    }
    public String getCodigoICAO()
    {
        return this.codigoICAO;
    }
    public String getNome()
    {
        return this.nomeAero;
    }
    public String getPais()
    {
        return this.pais;
    }
    public String getCidade()
    {
        return this.cidade;
    }
    public ListaDuplamenteLigadaDesordenada<Voo> getVoos()
    {
        return this.listaVoos;
    }
    public void setCodigoIATA(String codigo) throws Exception
    {
        if(codigo.equals(""))
        {
            throw new Exception("Código IATA inválido.");
        }
        else
        this.codigoIATA = codigo;
    }
    public void setCodigoICAO(String codigo) throws Exception
    {
        if(codigo.equals(""))
        {
            throw new Exception("Código ICAO inválido.");
        }
        else
        this.codigoICAO = codigo;
    }
    public void setNome(String nome) throws Exception
    {
        if(nome.equals(""))
        {
            throw new Exception("Nome inválido.");
        }
        else
        this.nomeAero = nome;
    }
    public void setPais(String pais) throws Exception
    {
        if(pais.equals(""))
        {
            throw new Exception("País inválido.");
        }
        else
        this.pais = pais;
    }
    public void setCidade(String cidade) throws Exception
    {
        if(cidade.equals(""))
        {
            throw new Exception("Cidade inválida.");
        }
        else
        this.cidade = cidade;
    }
    public String toString(){
        return "IdAeroporto: " + this.idAeroporto + "" + " codigo IATA: " + codigoIATA + " codigo ICAO " + codigoICAO +
        " nome areporto " + nomeAero + " pais: " + pais + " cidade " + cidade;

    }
    public int haschCode(){
        int ret = 111;
        ret = ret *5 + this.cidade.hashCode();
        ret = ret * 5 + this.codigoIATA.hashCode();
        ret = ret * 5 + this.codigoICAO.hashCode();
        ret = ret * 5 + new Integer(this.idAeroporto).haschCode();
        ret = ret * 5 + this.nomeAero.hashCode();
        ret = ret * 5 + this.pais.hashCode();
        if(ret<0)
            ret = -ret;

        return ret;
    }
    public Object clone(){
        Aeroporto clone = null;
        try{
            Aeroporto = new Aeroporto(this);
        }
        catch(Exception e){}
        return clone;

    }
    public boolean equals(Object obj){
        if(obj == null)
            return false;
        if(obj == this)
            return true;
        if(obj.getClass() != this.getClass())
            return false;
        Aeroporto aero = (Aeroporto) obj;
        if(!this.cidade.equals(aero.cidade) || !this.pais.equals(aero.pais) || !this.codigoIATA.equals(aero.codigoIATA) ||
       !this.codigoICAO.equals(aero.codigoICAO) || this.idAeroporto != aero.idAeroporto || !this.nomeAero.equals(aero.nomeAero))
            return false;
        return true;
    }
    public Aeroporto(Aeroporto modelo){
        if(modelo == null){
            throw new Exception("modelo para cópia não pode ser nulo");
        }
        this.cidade = modelo.cidade;
        this.codigoIATA = modelo.codigoIATA;
        this.codigoICAO = modelo.codigoICAO;
        this.idAeroporto = modelo.idAeroporto;
        this.nomeAero = modelo.nomeAero;
        this.pais = modelo.pais;
    }

    
}
