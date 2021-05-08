import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Digital();
        Impresso();
    }

    public static void Digital() {
        Scanner input = new Scanner(System.in);

        System.out.print("================\nDIGITAL\n================\n");
        
        System.out.print("Digite o título: ");
        String tituloDigital = input.nextLine();
        System.out.print("Digite o texto: ");
        String textoDigital = input.nextLine();
        System.out.print("Digite o tipo de animação: ");
        String tipoAnimacaoDigital = input.nextLine();
        System.out.print("Digite o valor da arte: R$");
        double valorArteDigital = input.nextDouble();
        System.out.print("Digite o tempo(m): ");
        int tempoDigital = input.nextInt();
        System.out.print("Digite os direitos autorais: R$");
        double direitosAutoraisDigital = input.nextDouble();

        Digital d = new Digital(tempoDigital, direitosAutoraisDigital, tipoAnimacaoDigital, tituloDigital, textoDigital, valorArteDigital);
        System.out.print("\n=========\nDADOS\n=========\n");
        d.mostraDados();
        System.out.print("\nLucro: R$" + d.lucro() + "\n\n");
    }

    public static void Impresso() {
        Scanner input = new Scanner(System.in);

        System.out.print("================\nIMPRESSO\n================\n");
        
        System.out.print("Digite o título: ");
        String tituloImpresso = input.nextLine();
        System.out.print("Digite a imagem: ");
        String imagemImpresso = input.nextLine();
        System.out.print("Digite o texto: ");
        String textoImpresso = input.nextLine();
        System.out.print("Digite a largura(cm): ");
        double larguraImpresso = input.nextDouble();
        System.out.print("Digite a altura(cm): ");
        double alturaImpresso = input.nextDouble();
        System.out.print("Digite a quantidade: ");
        int quantidadeImpresso = input.nextInt();
        System.out.print("Digite o valor da arte: R$");
        double valorArteImpresso = input.nextDouble();

        Impresso i = new Impresso(imagemImpresso, larguraImpresso, alturaImpresso, quantidadeImpresso, tituloImpresso, textoImpresso, valorArteImpresso);
        System.out.print("\n=========\nDADOS\n=========\n");
        i.mostraDados();
        System.out.print("\nLucro: R$" + i.lucro());
    }
}
