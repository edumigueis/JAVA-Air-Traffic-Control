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
     * @param codigoIATA código IATA do aeroporto
     * @param codigoICAO código ICAO do aeroporto
     * @param nome nome do aeroporto
     * @param pais país onde se localiza o aeroporto
     * @param cidade cidade onde se localiza o aeroporto
     */
    public Aeroporto(String codigoIATA, String codigoICAO, String nome, String pais, String cidade)
    {
        this.codigoIATA = codigoIATA;
        this.codigoICAO = codigoICAO;
        this.nomeAero = nome;
        this.pais = pais;
        this.cidade = cidade;
        this.listaVoos = new ListaDuplamenteLigadaDesordenada<>();
        this.idAeroporto = nextId.incrementAndGet();
    }
    
    /**
     * Pega o codigoIATA
     * @return codigoIATA
     */    
    public String getCodigoIATA()
    {
        return this.codigoIATA;
    }
    
    /**
     * Pega o codigoICAO
     * @return codigoICAO
     */
    public String getCodigoICAO()
    {
        return this.codigoICAO;
    }
    
    /**
     * Pega o nome do aeroporto
     * @return nomeAero
     */
    public String getNome()
    {
        return this.nomeAero;
    }
    
    /**
     * Pega o país
     * @return pais
     */
    public String getPais()
    {
        return this.pais;
    }
    
    /**
     * Pega a cidade
     * @return cidade
     */
    public String getCidade()
    {
        return this.cidade;
    }
    
    /**
     * Pega os voos da lista
     * @return
     */
    public ListaDuplamenteLigadaDesordenada<Voo> getVoos()
    {
        return this.listaVoos;
    }
    
    /**
     * Dá o valor do parametro ao Código IATA
     * @param codigo
     * @throws Exception Código IATA é inválido
     */
    public void setCodigoIATA(String codigo) throws Exception
    {
        if(codigo.equals(""))
        {
            throw new Exception("Código IATA inválido.");
        }
        else
            this.codigoIATA = codigo;
    }
    
    /**
     * Dá o valor do parametro ao Código ICAO
     * @param codigo
     * @throws Exception Código ICAO é inválido
     */
    public void setCodigoICAO(String codigo) throws Exception
    {
        if(codigo.equals(""))
        {
            throw new Exception("Código ICAO inválido.");
        }
        else
            this.codigoICAO = codigo;
    }
    
    /**
     * Dá o valor do parametro ao nome
     * @param nome
     * @throws Exception nome passado é inválido
     */
    public void setNome(String nome) throws Exception
    {
        if(nome.equals(""))
        {
            throw new Exception("Nome inválido.");
        }
        else
            this.nomeAero = nome;
    }
    
    /**
     * Dá o valor do parametro ao pais
     * @param pais
     * @throws Exception país passado é inválido
     */
    public void setPais(String pais) throws Exception
    {
        if(pais.equals(""))
        {
            throw new Exception("País inválido.");
        }
        else
            this.pais = pais;
    }
    
    /**
     * Dá o valor do parametro a cidade
     * @param cidade
     * @throws Exception cidade passada é inválido
     */
    public void setCidade(String cidade) throws Exception
    {
        if(cidade.equals(""))
        {
            throw new Exception("Cidade inválida.");
        }
        else
        this.cidade = cidade;
    }
    
    public void addVoo(Voo voo) throws Exception
    {
        if(voo == null)
        {
            throw new Exception("Voo inválido.");
        }
        else
        this.listaVoos.insiraNoFim(voo);
    }
    
     /**
     * Constrói uma string que representa a classe
     * @return uma string com os atributos
     */
    @Override
    public String toString(){
        return "IdAeroporto: " + this.idAeroporto + "" + " codigo IATA: " + codigoIATA + " codigo ICAO " + codigoICAO +
        " nome areporto " + nomeAero + " pais: " + pais + " cidade " + cidade;

    }
    
    /**
     * Constrói o haschCode da classe
     * @return haschCode da classe
     */
    @Override
    public int hashCode(){
        int ret = 111;
        ret = ret *5 + this.cidade.hashCode();
        ret = ret * 5 + this.codigoIATA.hashCode();
        ret = ret * 5 + this.codigoICAO.hashCode();
        ret = ret * 5 + new Integer(this.idAeroporto).hashCode();
        ret = ret * 5 + this.nomeAero.hashCode();
        ret = ret * 5 + this.pais.hashCode();
        if(ret<0)
            ret = -ret;

        return ret;
    }
    
     /**
     * Clona a classe
     * @return o clone
     */
    @Override
    public Object clone()
    {
        Aeroporto clone = null;
        try
        {
            clone = new Aeroporto(this);
        }
        catch(Exception e)
        {}
        
        return clone;
    }
    
    /**
     * Compara se a classe passada é igual a essa
     * @param obj
     * @return
     */
    @Override
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
     /**
     * Atribui os valores do modelo a essa classe
     * @param modelo
     * @throws Exception é lançada uma exceção se o parâmetro for nulo
     */
    public Aeroporto(Aeroporto modelo) throws Exception
    {
        if(modelo == null)
        {
            throw new Exception("modelo para cópia não pode ser nulo");
        }
        this.cidade = modelo.cidade;
        this.codigoIATA = modelo.codigoIATA;
        this.codigoICAO = modelo.codigoICAO;
        this.idAeroporto = modelo.idAeroporto;
        this.nomeAero = modelo.nomeAero;
        this.pais = modelo.pais;
        this.listaVoos = modelo.listaVoos;
    }  
}
