import java.util.Scanner;

public class precificacao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

    int corte = 5;
    int plastificacao = 1;
    

    System.out.print("Escreva o preço da folha usada: R$");
    double precodafolha = scanner.nextDouble();

    System.out.print("Escreva o preço da trabalho da máquina: R$");
    double trabalhodamaquina = scanner.nextDouble();

    System.out.print("Escreva a quantidade de folhas usadas no projeto: ");
    int quantidadedefolha = scanner.nextInt();

    System.out.print("Você vai precisar cortar o projeto? Responda sim ou nao: ");
    String opcao = scanner.next();

    if (opcao.equalsIgnoreCase("sim")){

    double x = (precodafolha+trabalhodamaquina);
    double y = (x*quantidadedefolha);
    int z = (corte+plastificacao);
    double projeto = (y+z);

    System.out.printf("O projeto vai custar R$%.3f%n",projeto);


    } else {

    if (opcao.equalsIgnoreCase("nao")){
    double x = (precodafolha+trabalhodamaquina);
    double y = (x*quantidadedefolha);
    double z = (y+plastificacao);
    double projeto = z;

    
    System.out.printf("O projeto vai custar R$%.3f%n",projeto);

    scanner.close();

    }
    
    }
}
}
    

