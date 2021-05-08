public class Digital extends Anuncio implements CalculaLucro{
    private int tempo;
    private double direitosAutorais;
    private String tipoAnimacao;

    public Digital(){};

    public Digital(int tempo, double da, String ta, String t, String te, double va){
        super(t, te, va);
        this.tempo = tempo;
        this.direitosAutorais = da;
        this.tipoAnimacao = ta;
    };

    public void setTempo(int t){
        this.tempo = t;
    }

    public void setDireitosAutorais(double da){
        this.direitosAutorais = da;
    }

    public void setTipoAnimacao(String ta){
        this.tipoAnimacao = ta;
    }

    public int getTempo(){
        return this.tempo;
    }

    public double getDireitosAutorais(){
        return this.direitosAutorais;
    }

    public String getTipoAnimacao(){
        return this.tipoAnimacao;
    }

    public void totalAPagar(){
        this.valorTotal = (this.tempo * this.valorArte) + this.direitosAutorais;
    }

    public void mostraDados(){
        totalAPagar();
        System.out.print("Título: " + getTitulo() + "\nTexto: " + getTexto() + "\nTempo: " + getTempo());
        System.out.print("\nDireitos autorais: " + getDireitosAutorais() + "\nTipo de animação: " + getTipoAnimacao());
        System.out.print("\nValor da arte: R$" + getValorArte() + "\nValor total: R$" + this.valorTotal);
    }

    @Override
    public double lucro(){
        if (this.valorTotal < 1000){
            return ((this.valorTotal * 7.5) / 100);
        } 
        else if(this.valorTotal >= 1000 && this.valorTotal < 1350){
            return ((this.valorTotal * 9) / 100);
        } else {
            return ((this.valorTotal * 15) / 100);
        }
    };
}
