import java.lang.reflect.*;

public class ListaDuplamenteLigadaOrdenada <X extends Comparable<X>>
// X extends Comparable<X> indica que só serão aceitas, como
// parâmetros da classe ListaDuplamenteLigadaOrdenada, classe que herdem
// da interface Comparable<X>, ou seja, apenas Xs comparáveis
// com outros Xs serão aceitos; isso garante que posso usar o
// método compareTo com objetos chamantes do tipo X.
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
    } //fim da classe No

    // PASSADO
    // PARA
    // REVISAR
    // TUDO,
    // TUDINHO
    // MESMO,
    // DAQUI
    // PARA
    // FRENTE;
    // REVISADO!!!

    protected No primeiro, ultimo;

    public ListaDuplamenteLigadaOrdenada ()
    {
        this.primeiro=this.ultimo=null;
    }

    protected X meuCloneDeX (X x)
    {
      //return (X)x.clone();

        X ret=null;

        try
        {
            Class<?> classe = x.getClass();
            Class<?>[] tiposDosParms = null; // null pq clone nao tem parametros
            Method metodo = classe.getMethod("clone",tiposDosParms);
            Object[] parms = null; // null pq clone nao tem parametros
            ret = (X)metodo.invoke(x,parms);
        }
        catch (Exception erro)
        {} // pq sei que estou chamando clone de um objeto que é Cloneable e, portanto, nao há risco do método não existir ou de ser chamado com parametros errado

        return ret;
    }

    // retirei o método public void insiraNoInicio (X i) throws Exception
    // pois ele não faz sentido neste tipo de lista

    // retirei o método public void insiraNoFim (X i) throws Exception
    // pois ele não faz sentido neste tipo de lista

    // novo método que insere, mantendo a ordem
    public void insira (X i) throws Exception
    {
        if (i==null)
            throw new Exception ("Informacao ausente");

        X inserir;
        if (i instanceof Cloneable)
            inserir = meuCloneDeX (i);
        else
            inserir = i;

        if (this.primeiro==null)
        {
            this.primeiro = this.ultimo = new No (inserir);
            return;
        }

        int comp=inserir.compareTo(this.primeiro.getInfo());

        if (comp<0)
        {
            this.primeiro = new No (null,inserir,this.primeiro);

			if (this.primeiro.getProx()!=null)
				this.primeiro.getProx().setAnte (this.primeiro);

			this.primeiro.setAnte (null);
        
			if (this.ultimo==null)
				this.ultimo=this.primeiro;
				
            return;
        }

        if (comp==0)
            throw new Exception ("Informacao repetida");

        No atual=this.primeiro;

        for(;;)
        {
            if (atual.getProx()==null)
                break;

            comp=i.compareTo(atual.getProx().getInfo());

            if (comp==0)
                throw new Exception ("Informacao repetida");

            if (comp<0)
                break;

            atual=atual.getProx();
        }

        atual.setProx (new No (atual,inserir,atual.getProx()));
        atual = atual.getProx();
        
        if (atual.getProx() == null)
            this.ultimo = atual;
        else
            atual.getProx().setAnte(atual);
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

    public X getDoFim () throws Exception
    {
        if (this.primeiro==null/*&&this.ultimo==null)*/)
            throw new Exception ("Nada a obter");

        X ret = this.ultimo.getInfo();
        if (ret instanceof Cloneable)
            ret = meuCloneDeX (ret);
            
        return ret;
    }

    public boolean isvazia ()
    {
        return this.primeiro==null/*&&this.ultimo==null*/;
    }

    // retirei o método public void invertaSe ()
    // pois ele não faz sentido neste tipo de lista

    // retirei o método public ListaSimplesDesordenada<X> inversao ()
    // pois ele não faz sentido neste tipo de lista

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

    public boolean equals (Object obj)
    {
        if (this==obj)
            return true;

        if (obj==null)
            return false;

        if (this.getClass()!=obj.getClass())
            return false;

        ListaDuplamenteLigadaOrdenada<X> lista =
       (ListaDuplamenteLigadaOrdenada<X>)obj;

        No atualThis =this .primeiro;
        No atualLista=lista.primeiro;

        while (atualThis!=null && atualLista!=null)
        {
            if (!atualThis.getInfo().equals(atualLista.getInfo()))
                return false;

            atualThis  = atualThis .getProx();
            atualLista = atualLista.getProx();
        }

        if (atualThis!=null  /* && atualLista==null */)
            return false;

        if (atualLista!=null /* && atualThis ==null */)
            return false;

        // atualThis==null && atualLista==null
        return true;
    }

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

    // construtor de copia
    public ListaDuplamenteLigadaOrdenada (ListaDuplamenteLigadaOrdenada<X> modelo) throws Exception
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

    public Object clone ()
    {
        ListaDuplamenteLigadaOrdenada<X> ret=null;

        try
        {
            ret = new ListaDuplamenteLigadaOrdenada (this);
        }
        catch (Exception erro)
        {} // sei que this NUNCA é null e o contrutor de copia da erro quando seu parametro é null

        return ret;
    }
}
