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

    public Voo(int numeroVoo, String companhiaOperadora, String aeroOrigem, String aeroDestino) 
    {
        this.numeroVoo = numeroVoo;
        this.aeroOrigem = aeroOrigem;
        this.aeroDestino = aeroDestino;
        this.companhiaOperadora = companhiaOperadora;
        this.idVoo = nextId.incrementAndGet();
    }

    public int getNumeroVoo() 
    {
        return this.numeroVoo;
    }

    public String getCompanhiaOperadora() 
    {
        return this.companhiaOperadora;
    }

    public String getAeroOrigem() 
    {
        return this.aeroOrigem;
    }

    public String getAeroDestino() 
    {
        return this.aeroDestino;
    }

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
    public String toString(){
        return "Número do voo: " + numeroVoo + " " + ", aeroporto de origem " + aeroOrigem + ", aeroporto de destino:  " + aeroDestino +
        ", companhia operadora: " + companhiaOperadora + ", idVoo: " + idVoo ;
    }
    
    public int haschCode(){
        int ret = 111;
        ret = ret *5 + this.aeroDestino.hashCode();
        ret = ret * 5 + this.aeroOrigem.hashCode();
        ret = ret * 5 + this.companhiaOperadora.hashCode();
        ret = ret * 5 + new Integer(this.numeroVoo).haschCode();
        ret = ret * 5 + new Integer(this.idVoo).haschCode();
        if(ret<0)
            ret = -ret;

        return ret;
    }
    public Object clone(){
        Voo clone = null;
        try{
            clone = new Voo(this);
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
        Voo voo = (Voo) obj;
        if(!this.aeroDestino.equals(voo.aeroDestino) || !this.aeroOrigem.equals(voo.aeroOrigem) || !this.companhiaOperadora.equals(voo.companhiaOperadora) ||
        this.idVoo != voo.idVoo || this.numeroVoo != voo.numeroVoo)
            return false;
        return true;
    }
    public Voo(Voo modelo){
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
