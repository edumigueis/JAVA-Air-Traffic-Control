package classes;

/**
 * @author Eduardo Migueis, Rodrigo Smith and Manuela Benassi.
 * @since 2020.
 */
public class Voo implements Cloneable
{
    private int idVoo;
    private int numeroVoo = 0;
    private String aeroOrigem = "";
    private String aeroDestino = "";
    private String companhiaOperadora = "";
    
    /**
     * Construtor da classe voo
     * @param numeroVoo número do voo
     * @param companhiaOperadora companhia aérea
     * @param aeroOrigem aeroporto de origem
     * @param aeroDestino aeroporto de destino
     * @throws Exception é lançada uma exceção se algum parâmetro do tipo String for uma cadeia vazia ou do tipo Integer, negativo.
     */
    public Voo(int numeroVoo, String aeroOrigem, String aeroDestino, String companhiaOperadora) throws Exception 
    {
        if(numeroVoo < 0 || aeroOrigem.equals("") || aeroDestino.equals("") || companhiaOperadora.equals(""))
            throw new Exception("Dados ausentes");
                    
        this.numeroVoo = numeroVoo;
        this.aeroOrigem = aeroOrigem;
        this.aeroDestino = aeroDestino;
        this.companhiaOperadora = companhiaOperadora;
    }
    
    /**
     * pega o numero do voo
     * @return retorna o número do voo
    */
    public int getNumeroVoo() 
    {
        return this.numeroVoo;
    }
    
    /**
     * pega a companhia Operadora
     * @return retorna a companhia operadora
     */
    public String getCompanhiaOperadora() 
    {
        return this.companhiaOperadora;
    }
    
    /**
     * pega o aeroporto de origem
     * @return retorna o aeroporto de origem do voo
     */
    public String getAeroOrigem() 
    {
        return this.aeroOrigem;
    }
    
    /**
     * pega o aeroporto de destino
     * @return retorna o aeroporto de destino do voo 
     */
    public String getAeroDestino() 
    {
        return this.aeroDestino;
    }
    
    /**
     * seta o valor do parametro à companhia operadora
     * @param comp companhia aérea a ser setada
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
     * seta o valor do parametro ao nome do aeroporto
     * @param aerOr aeroporto de origem a ser setado
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
     * seta o valor do parametro ao aeroporto de destino
     * @param aerDes aeroporto de destino a ser setado
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
     * seta o valor do parametro ao nuumero do voo
     * @param nmr número de voo a ser setado
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
    @Override
    public String toString(){
        return 
        "Número do voo: " + numeroVoo + "\n" +
        "Aeroporto de origem: " + aeroOrigem + "\n" +
        "Aeroporto de destino: " + aeroDestino + "\n" +
        "Companhia operadora: " + companhiaOperadora;
    }
    
    /**
     * Constrói o haschCode da classe
     * @return haschCode da classe
     */
    @Override
    public int hashCode()
    {
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
    @Override
    public Object clone()
    {
        Voo clone = null;
        try
        {
            clone = new Voo(this);
        }
        catch(Exception e)
        {}      
        return clone;
    }
    
    /**
     * Compara se a classe passada é igual a essa
     * @param obj objeto a ser verificado se é igual à instância chamante do método
     * @return ture se forem iguais e, false, se não
     */
    @Override
    public boolean equals(Object obj)
    {
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
     * @throws Exception é lançada uma exceção se o parâmetro for nulo
     */
    public Voo(Voo modelo) throws Exception
    {
        if(modelo == null){
            throw new Exception("modelo para cópia não pode ser nulo");
        }
        this.aeroDestino = modelo.aeroDestino;
        this.companhiaOperadora = modelo.companhiaOperadora;
        this.idVoo = modelo.idVoo;
        this.numeroVoo = modelo.numeroVoo;
        this.aeroOrigem = modelo.aeroOrigem;
    }
}
