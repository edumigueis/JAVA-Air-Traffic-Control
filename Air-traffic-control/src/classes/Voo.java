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
public class Voo implements Cloneable
{

    private int idVoo;
    static AtomicInteger nextId = new AtomicInteger();
    private int numeroVoo = 0;
    private String aeroOrigem = "";
    private String aeroDestino = "";
    private String companhiaOperadora = "";
    /**
     * Construtor da classe voo
     * @param numeroVoo
     * @param companhiaOperadora
     * @param aeroOrigem
     * @param aeroDestino
     */

    public Voo(int numeroVoo, String companhiaOperadora, String aeroOrigem, String aeroDestino) 
    {
        this.numeroVoo = numeroVoo;
        this.aeroOrigem = aeroOrigem;
        this.aeroDestino = aeroDestino;
        this.companhiaOperadora = companhiaOperadora;
        this.idVoo = nextId.incrementAndGet();
    }
    /**
     * pega o numero do voo
     * @return numeroVoo
    */

    public int getNumeroVoo() 
    {
        return this.numeroVoo;
    }
    /**
     * pega a companhia Operadora
     * @return companhiaOperadora
     */

    public String getCompanhiaOperadora() 
    {
        return this.companhiaOperadora;
    }
    /**
     * pega o aeroporto de origem
     * @return aeroOrigem
     */

    public String getAeroOrigem() 
    {
        return this.aeroOrigem;
    }
    /**
     * pega o aeroporto de destino
     * @return aeroDestino 
     */

    public String getAeroDestino() 
    {
        return this.aeroDestino;
    }
    /**
     * da o valor do parametro a companhia operadora
     * @param comp
     * @throws Exception nome passado é inválido
     */

    public void setCompanhiaOperadora(String comp) throws Exception 
    {
        if (comp.equals(""))
        {
            throw new Exception("Nome da companhia inválido.");
        } 
        else 
        {
            this.companhiaOperadora = comp;
        }
    }
    /**
     * da o valor do parametro ao nome do aeroporto
     * @param aerOr
     * @throws Exception nome passado é inválido
     */
    public void setAeroOrigem(String aerOr) throws Exception 
    {
        if (aerOr.equals("")) 
        {
            throw new Exception("Nome do aeroporto de origem inválido.");
        } 
        else 
        {
            this.aeroOrigem = aerOr;
        }
    }
    /**
     * da o valor do parametro ao aeroporto de destino
     * @param aerDes
     * @throws Exception nome passado é inválido
     */

    public void setAeroDestino(String aerDes) throws Exception 
    {
        if (aerDes.equals("")) 
        {
            throw new Exception("Nome do aeroporto de destino inválido.");
        } 
        else {
            this.aeroDestino = aerDes;
        }
    }
    /**
     * da o valor do parametro ao nuumero do voo
     * @param nmr
     * @throws Exception numero do voo passado é inválido
     */

    public void setNumeroVoo(int nmr) throws Exception 
    {
        if (nmr < 0) 
        {
            throw new Exception("Numero do voo inválido.");
        } 
        else 
        {
            this.numeroVoo = nmr;
        }
    }

    /**
     * Constrói uma string que representa a classe
     * @return uma string com os atributos
     */
    public String toString(){
        return "Número do voo: " + numeroVoo + " " + ", aeroporto de origem " + aeroOrigem + ", aeroporto de destino:  " + aeroDestino +
        ", companhia operadora: " + companhiaOperadora + ", idVoo: " + idVoo ;
    }
    /**
     * Constrói o haschCode da classe
     * @return haschCode da classe
     */
    public int haschCode(){
        int ret = 111;
        ret = ret *5 + this.aeroDestino.hashCode();
        ret = ret * 5 + this.aeroOrigem.hashCode();
        ret = ret * 5 + this.companhiaOperadora.hashCode();
        ret = ret * 5 + new Integer(this.numeroVoo).hashCode();
        ret = ret * 5 + new Integer(this.idVoo).hashCode();
        if(ret<0)
            ret = -ret;

        return ret;
    }
    /**
     * Clona a classe
     * @return o clone
     */
    public Object clone(){
        Voo clone = null;
        try{
            clone = new Voo(this);
        }
        catch(Exception e){}
        return clone;

    }
    /**
     * Compara se a classe passada é igual a essa
     * @param obj
     * @return
     */
    public boolean equals(Object obj){
        if(obj == null)
            return false;
        if(obj == this)
            return true;
        if(obj.getClass() != this.getClass())
            return false;
        Voo voo = (Voo) obj;
        if(!this.aeroDestino.equals(voo.aeroDestino) || !this.aeroOrigem.equals(voo.aeroOrigem) || !this.companhiaOperadora.equals(voo.companhiaOperadora) ||
        this.idVoo != voo.idVoo || this.numeroVoo != voo.numeroVoo)
            return false;
        return true;
    }
    /**
     * Atribui os valores do modelo a essa classe
     * @param modelo
     */
    public Voo(Voo modelo) throws Exception{
        if(modelo == null){
            throw new Exception("modelo para cópia não pode ser nulo");
        }
        this.aeroDestino = modelo.aeroDestino;
        this.companhiaOperadora = modelo.companhiaOperadora;
        this.idVoo = modelo.idVoo;
        this.nomeAero = modelo.nomeAero;
        this.aeroOrigem = modelo.aeroOrigem;
    }

}
