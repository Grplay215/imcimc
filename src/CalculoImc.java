import java.util.Scanner;

public class CalculoImc {

    int peso;
    int altura;
    int imc;
    String nome;
    double imc2;


    public void obterDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("qual o nome do seu aluno?");
        nome = leitor.nextLine();

        System.out.println("Qual a altura dele(a)?");
        peso = leitor.nextInt();

        System.out.println("e o peso?");
        altura = leitor.nextInt();

        calcularImc();
    }


    public void calcularImc(){
       double alturaEmMetros = altura / 100.0;
        imc = peso / (alturaEmMetros * alturaEmMetros);


    }

    public void determinarIMC(){
        if(imc < 18.5){
            imc2 = "abaixo do peso"
        } else if(){

        } else if(){

        } else if(){

        } else if(){

        } else if(){

        } else if(){

        }


    }


}
