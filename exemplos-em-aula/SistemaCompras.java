import java.util.Scanner;
public class SistemaCompras {
    public static void main (String[] args) {
        // Checa o valor de compra e método de pagamento
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual o valor da compra?\n");
        double valorCompra = scanner.nextDouble();
        System.out.print("Qual a opção de pagamento? (1 - à vista, 2 - parcelado)\n");
        int metodoPgto = scanner.nextInt();
        // Cálculo de acordo com o método de pagamento
        if (metodoPgto == 1) {
            System.out.print("Qual o meio de pagamento? (1 - boleto, 2 - pix)   \n");
            int meioPgto = scanner.nextInt();
            if (meioPgto == 1) {
                double valorFinal = valorCompra;
                System.out.print("O valor final da compra é R$" + valorFinal);
            } else {
                double valorFinal = valorCompra - (valorCompra * 0.05);
                System.out.print("O valor final da compra é R$" + valorFinal);
            }
        } else if (metodoPgto == 2) {
            System.out.print("Quantas parcelas irá dividor? Escolha entre 2 ou 3 parcelas. \n");
            int numParcelas = scanner.nextInt();
            if (numParcelas == 2) {
                double valorFinal = valorCompra + (valorCompra * 0.05);
                double valorParcela = valorFinal / numParcelas;
                System.out.print("O valor final da compra é R$" + valorFinal + " em " + numParcelas + " parcelas de R$" + valorParcela + "\n");}
                else if (numParcelas == 3) {
                    double valorFinal = valorCompra + (valorCompra * 0.10);
                    double valorParcela = valorFinal / numParcelas;
                    System.out.print("O valor final da compra é R$" + valorFinal + " em " + numParcelas + " parcelas de R$" + valorParcela + "\n");
                } else {
                    System.out.print("Número de parcelas inválido. Tente novamente. \n");
            }
        } else {
            System.out.print("Opção inválida. Tente novamente. \n" );
        }
        scanner.close();
        }
    }