package classes;

import java.lang.reflect.*;
import java.util.ArrayList; 

public class ListaDuplamenteLigadaDesordenada <X>
{  
    protected class No
    {
	private No ante;
        private X  info;
        private No prox;

        public No (No a, X i, No p)
        {
            this.ante = a;
            this.info = i;
            this.prox = p;
        }

        public No (X i)
        {
            this.ante = null;
            this.info = i;
            this.prox = null;
        }

        public No getAnte ()
        {
            return this.ante;
        }
        
        public X getInfo ()
        {
            return this.info;
        }

        public No getProx ()
        {
            return this.prox;
        }

        public void setAnte (No a)
        {
            this.ante = a;
        }
        
        public void setInfo (X i)
        {
            this.info = i;
        }

        public void setProx (No p)
        {
            this.prox = p;
        }
    } 

    protected No primeiro, ultimo;

    public ListaDuplamenteLigadaDesordenada()
    {
        this.primeiro = this.ultimo = null;
    }

    protected X meuCloneDeX (X x)
    {
        X ret=null;

        try
        {
            Class<?> classe = x.getClass();
            Class<?>[] tiposDosParms = null;
            Method metodo = classe.getMethod("clone",tiposDosParms);
            Object[] parms = null;
            ret = (X)metodo.invoke(x,parms);
        }
        catch (Exception erro)
        {} 

        return ret;
    }

    public void insiraNoInicio (X i) throws Exception
    {
        if (i == null)
            throw new Exception ("Informacao ausente");

        X inserir = null;
        
        if (i instanceof Cloneable)
            inserir = meuCloneDeX (i);
        else
            inserir = i;
            
        this.primeiro = new No (null, inserir, this.primeiro);

        if (this.primeiro.getProx()!= null)
            this.primeiro.getProx().setAnte (this.primeiro);

        this.primeiro.setAnte (null);
        
        if (this.ultimo == null)
            this.ultimo = this.primeiro;
    }

    public void insiraNoFim (X i) throws Exception
    {
        if (i == null)
            throw new Exception ("Informacao ausente");

        X inserir = null;
        if (i instanceof Cloneable)
            inserir = meuCloneDeX (i);
        else
            inserir = i;
            
        if (this.ultimo == null) // && this.primeiro==null
        {
            this.ultimo   = new No (inserir);
            this.primeiro = this.ultimo;
        }
        else
        {
            this.ultimo.setProx (new No (this.ultimo,inserir,null));
            this.ultimo = this.ultimo.getProx();
        }
    }
    
    public void removaDoInicio () throws Exception
    {
        if (this.primeiro==null /*&& this.ultimo==null*/)
            throw new Exception ("Nada a remover");

        this.primeiro = this.primeiro.getProx();

        if (this.primeiro==null) //so tinha 1 elemento
            this.ultimo = null;
        else
            this.primeiro.setAnte (null);
    }
    
    public void removaDoFim () throws Exception
    {
        if (this.primeiro==null/*&&this.ultimo==null*/)
            throw new Exception ("Nada a remover");

        this.ultimo = this.ultimo.getAnte();

        if (this.ultimo==null)
            this.primeiro=null;
        else
            this.ultimo.setProx(null);
    }
    
    public void remova (X i) throws Exception
    {
        if (i==null)
            throw new Exception ("Informacao ausente");

        if (this.primeiro==null/*&&this.ultimo==null*/)
            throw new Exception ("Lista vazia");

        if (i.equals(this.primeiro.getInfo()))
        {
			this.primeiro = this.primeiro.getProx();

			if (this.primeiro==null) //so tinha 1 elemento
				this.ultimo = null;
			else
				this.primeiro.setAnte (null);
				
			return;
        }

        No atual=this.primeiro;

        for(;;) // FOR EVER (repete até Exception ou return)
        {
            if (atual==null)
                throw new Exception ("Informacao inexistente");

            if (i.equals(atual.getInfo()))
            {
				if (atual==this.primeiro)
				{
					this.primeiro = this.primeiro.getProx();

					if (this.primeiro==null) //so tinha 1 elemento
						this.ultimo = null;
					else
						this.primeiro.setAnte (null);
						
					return;
				}
				
				if (atual==this.ultimo)
				{
					this.ultimo = this.ultimo.getAnte();

					if (this.ultimo==null)
						this.primeiro=null;
					else
						this.ultimo.setProx(null);
						
					return;
				}
				
				atual.getAnte().setProx(atual.getProx());
				atual.getProx().setAnte(atual.getAnte());
                return;
            }

            atual=atual.getProx();
        }
    }
    
    public boolean tem (X i) throws Exception
    {
		if (i==null)
		    throw new Exception ("Informacao ausente");
		
        No atual=this.primeiro;

        while (atual!=null)
        {
            if (i.equals(atual.getInfo()))
                return true;
                
            atual = atual.getProx();
        }
        
        return false;
    }

    public int getQtd ()
    {
        No  atual=this.primeiro;
        int ret  =0;

        while (atual!=null)
        {
            ret++;                
            atual = atual.getProx();
        }
        
        return ret;
    }
    
    public X getDoInicio () throws Exception
    {
        if (this.primeiro==null/*&&this.fim==null)*/)
            throw new Exception ("Nada a obter");

        X ret = this.primeiro.getInfo();
        if (ret instanceof Cloneable)
            ret = meuCloneDeX (ret);
            
        return ret;
    }
    
    public X getPos (int pos) throws Exception
    {
        if (this.primeiro==null/*&&this.fim==null)*/)
            throw new Exception ("Nada a obter");

        No  atual=this.primeiro;
        int ret  = 0;

        while (atual!=null && ret <= pos)
        {
            ret++;                
            atual = atual.getProx();
        }
        
        return atual.getInfo();
    }

    public X getDoFim () throws Exception
    {
        if (this.primeiro==null/*&&this.ultimo==null)*/)
            throw new Exception ("Nada a obter");

        X ret = this.ultimo.getInfo();
        if (ret instanceof Cloneable)
            ret = meuCloneDeX (ret);
            
        return ret;
    }

    public boolean isVazia ()
    {
        return this.primeiro==null/*&&this.ultimo==null*/;
    }

    public void invertaSe ()
    {
		if (this.primeiro==null)
		    return; // lista vazia; nao há o que inverter
		    
		if (this.primeiro.getProx() == null)
		    return; // lista com um elemento só; nao ha o que inverter
		    
		// tendo 2 ou mais nós, percorre invertendo
        No backup, atual=this.primeiro;
        while (atual!=null)
        {
			backup = atual.getProx();
			atual.setProx (atual.getAnte());
			atual.setAnte (backup);
			atual = backup;
		}
		
		// this.primeiro vira this.ultimo e vice-versa 
		backup        = this.primeiro;
		this.primeiro = this.ultimo;
		this.ultimo   = backup;
    }

    public ListaDuplamenteLigadaDesordenada<X> inversao ()
    {
        ListaDuplamenteLigadaDesordenada<X> ret =
        new ListaDuplamenteLigadaDesordenada<X> ();
        
        for (No atual=this.primeiro; atual!=null; atual=atual.getProx())
        {
            // preferi nao usar this.insiraNoInicio pelo bem da eficiencia,
            // economizando tempo, deixando de validar, e economizando
            // memória e tempo, deixando de clonar; e fica a pergunta:
            // entendem porque não é necessario clonar? Nao entendendo,
            // monitoria!
            ret.primeiro = new No (null,atual.getInfo(),ret.primeiro);

			if (ret.primeiro.getProx()!=null)
				ret.primeiro.getProx().setAnte (ret.primeiro);

			ret.primeiro.setAnte (null);
			
			if (ret.ultimo==null)
				ret.ultimo=ret.primeiro;
		}

        return ret;
	}

    @Override
    public String toString ()
    {
        String ret="[";

        No atual=this.primeiro;

        while (atual!=null)
        {
            ret=ret+atual.getInfo();

            if (atual!=this.ultimo)
                ret=ret+",";

            atual=atual.getProx();
        }

        return ret+"]";
    }
    
    public ArrayList<X> toArrayList ()
    {
        ArrayList<X> ret = new ArrayList<X>();
        
        try
        {
            No atual = this.primeiro;
            
            while(atual != null)
            {
                ret.add(atual.getInfo());
                atual = atual.getProx();
            }
            
        }
        catch (Exception e)
        {}      
        
        return ret;
    }
    

    @Override
    public boolean equals (Object obj)
    {
        if (this==obj)
            return true;

        if (obj==null)
            return false;

        if (this.getClass()!=obj.getClass())
            return false;

        ListaDuplamenteLigadaDesordenada<X> lista =
       (ListaDuplamenteLigadaDesordenada<X>)obj;

        No atualThis =this .primeiro;
        No atualLista=lista.primeiro;

        while (atualThis!=null && atualLista!=null)
        {
            if (!atualThis.getInfo().equals(atualLista.getInfo()))
                return false;

            atualThis  = atualThis .getProx();
            atualLista = atualLista.getProx();
        }

        if (atualThis != null )
            return false;

        if (atualLista != null)
            return false;

        return true;
    }

    @Override
    public int hashCode ()
    {
        final int PRIMO = 13; // qualquer número primo serve
        
        int ret=666; // qualquer inteiro positivo serve

        for (No atual=this.primeiro;
             atual!=null;
             atual=atual.getProx())
             ret = 17*ret + atual.getInfo().hashCode();

        if (ret<0) ret = -ret;

        return ret;
    }


    public ListaDuplamenteLigadaDesordenada (ListaDuplamenteLigadaDesordenada<X> modelo) throws Exception
    {
        if (modelo==null)
            throw new Exception ("Modelo ausente");

        if (modelo.primeiro==null)
            return; // sai do construtor, pq this.primeiro ja é null

        this.primeiro = new No (modelo.primeiro.getInfo());

        No atualDoThis   = this  .primeiro;
        No atualDoModelo = modelo.primeiro.getProx();

        while (atualDoModelo!=null)
        {
            atualDoThis.setProx (new No (atualDoThis,atualDoModelo.getInfo(),null));
            atualDoThis   = atualDoThis  .getProx ();
            atualDoModelo = atualDoModelo.getProx ();
        }

        this.ultimo = atualDoThis;
    }

    @Override
    public Object clone ()
    {
        ListaDuplamenteLigadaDesordenada<X> ret=null;

        try
        {
            ret = new ListaDuplamenteLigadaDesordenada (this);
        }
        catch (Exception erro)
        {} // sei que this NUNCA é null e o contrutor de copia da erro quando seu parametro é null

        return ret;
    }
}
