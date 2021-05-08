public abstract class Anuncio {
    private String titulo;
    private String texto;
    protected double valorArte;
    protected double valorTotal;

    public Anuncio(){};
    
    public Anuncio (String t, String te, Double va){
        this.titulo = t;
        this.texto = te;
        this.valorArte = va;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getTexto(){
        return this.texto;
    }

    public double getValorArte(){
        return this.valorArte;
    }

    public void setTitulo(String t){
        this.titulo = t;
    }

    public void setTexto(String te){
        this.texto = te;
    }

    public void setValorArte(double va){
        this.valorArte = va;
    }

    public abstract void totalAPagar();
    public void mostraDados(){
        System.out.print("Título: " + getTitulo() + "\nTexto: " + getTexto() + "\nValor da arte: " + getValorArte());
    };
}