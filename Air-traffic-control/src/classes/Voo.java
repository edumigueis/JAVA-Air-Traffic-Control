/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Eduardo Migueis, Rodrigo Smith and Manuela Benassi.
 * @since 2020.
 */
public class Voo {
    private int idVoo;
    private int numeroVoo = 0;
    private String aeroOrigem = "";
    private String aeroDestino = "";
    private String companhiaOperadora = "";
    
    public Voo(int numeroVoo, String companhiaOperadora, String aeroOrigem, String aeroDestino){
        this.numeroVoo = numeroVoo;
        this.aeroOrigem = aeroOrigem;
        this.aeroDestino = aeroDestino;
        this.companhiaOperadora = companhiaOperadora;
        this.idVoo++;
    }
    
    public int getNumeroVoo(){
        return this.numeroVoo;
    }
    public String getCompanhiaOperadora(){
        return this.companhiaOperadora;
    }
    public String getAeroOrigem(){
        return this.aeroOrigem;
    }
    public String getAeroDestino(){
        return this.aeroDestino;
    }
    
    
    public void setCompanhiaOperadora(String comp) throws Exception
    {
        if(comp.equals("")){
            throw new Exception("Nome da companhia inválido.");
        }
        else
        this.companhiaOperadora = comp;
    }
    public void setAeroOrigem(String aerOr) throws Exception
    {
        if(aerOr.equals("")){
            throw new Exception("Nome do aeroporto de origem inválido.");
        }
        else
        this.aeroOrigem = aerOr;
    }
    public void setAeroDestino(String aerDes) throws Exception
    {
        if(aerDes.equals("")){
            throw new Exception("Nome do aeroporto de destino inválido.");
        }
        else
        this.aeroDestino = aerDes;
    }
    public void setNumeroVoo(int nmr) throws Exception
    {
        if(nmr < 0){
            throw new Exception("Numero do voo inválido.");
        }
        else
        this.numeroVoo = nmr;
    }
}
