public class Impresso extends Anuncio implements CalculaLucro{
    private String imagem;
    private double largura;
    private double altura;
    private int qtde;

    public Impresso(){};

    public Impresso(String i, double l, double a, int q, String t, String te, double va){
        super(t, te, va);
        this.imagem = i;
        this.largura = l;
        this.altura = a;
        this.qtde = q;
    }

    public void setImagem(String i){
        this.imagem = i;
    }

    public void setLargura(double l){
        this.largura = l;
    }

    public void setAltura(double a){
        this.altura = a;
    }

    public void setQuantidade(int q){
        this.qtde = q;
    }

    public String getImagem(){
        return this.imagem;
    }

    public double getLargura(){
        return this.largura;
    }

    public double getAltura(){
        return this.altura;
    }

    public int getQuantidade(){
        return this.qtde;
    }

    public void totalAPagar(){
        this.valorTotal = ((this.altura * this.largura) * this.qtde) + this.valorArte; 
    };

    @Override
    public void mostraDados(){
        totalAPagar();
        System.out.print("Título: " + getTitulo() + "\nTexto: " + getTexto() + "\nImagem: " + getImagem());
        System.out.print("\nLargura: " + getLargura() + "\nAltura: " + getAltura() + "\nQuantidade: " + getQuantidade());
        System.out.print("\nValor da arte: R$" + getValorArte() + "\nValor total: R$" + this.valorTotal);
    }

    @Override
    public double lucro(){
        if (this.valorTotal < 500){
            return ((this.valorTotal * 5) / 100);
        } 
        else if(this.valorTotal >= 500 && this.valorTotal < 1000){
            return ((this.valorTotal * 10) / 100);
        } else {
            return ((this.valorTotal * 15) / 100);
        }
    };
}