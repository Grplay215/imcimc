import java.util.Scanner;

public class CalculoImc {

    double peso;
    double altura;
    double imc;
    String nome;
    String resultadoDoImc;


    public void obterDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("qual o nome do seu aluno?");
        nome = leitor.nextLine();

        System.out.println("Qual a altura dele(a)?");
        altura = leitor.nextDouble();

        System.out.println("e o peso?");
        peso = leitor.nextDouble();

        calcularImc();
    }


    public void calcularImc(){
        double altura2x;
                altura2x = altura * altura;
        imc = peso / altura2x;

        determinarIMC();
    }

    public void determinarIMC() {
        if (imc <= 18.5) {
            resultadoDoImc = "abaixo do peso";
        } else if (imc >= 18.6 && imc <= 24.9) {
            resultadoDoImc = "como peso ideal";
        } else if (imc >= 25.0 && imc <= 29.9) {
            resultadoDoImc = "levemente acima do peso";
        } else if (imc >= 30.0 && imc <= 34.9) {
            resultadoDoImc = "com obesidade grau 1";
        } else if (imc >= 35.0 && imc <= 39.9) {
            resultadoDoImc = "com obesidade grau 2 (severa)";
        } else if (imc >= 40.0) {
            resultadoDoImc = "com obesidade grau 3 (mórbida)";

        }
        resultados();
    }


    public void resultados(){

        System.out.println("--------------");
        System.out.println("o aluno " +nome+ " ");
        System.out.println("que tem " +altura+ " metros de altura");
        System.out.println("e " +peso+ " quilos");
        System.out.println("--------------");
        System.out.println("está com o imc de " +imc+ " ");
        System.out.println("e está " +resultadoDoImc+ " ");
    }


}
