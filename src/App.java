import java.util.Scanner;

public class App {
    private static double areaTrianguloRetangulo;
    private static double areaDocirculo;
    private static double areaDoTrapezio;
    private static double areaDoQuadrado;
    private static double areaDoRetangulo;

    public static void main(String[] args) throws Exception {
        //teste
        lerNumero();
        imprimir();
    }

    public static void lerNumero() {
        Scanner leitor = new Scanner(System.in);

        double A, B, C;
        double pi = 3.14159;

        A = leitor.nextDouble();
        B = leitor.nextDouble();
        C = leitor.nextDouble();
        
        // Colocar uma função de verdade e fica de boa
        areaTrianguloRetangulo = (A * C) / 2.0;

        areaDocirculo = pi * Math.pow(C, 2.0);
        areaDoTrapezio = ((A + B) * C) / 2.0;
        areaDoQuadrado = Math.pow(B, 2.0);
        areaDoRetangulo = A * B;

        leitor.close();
    }

    public static void imprimir() {
        System.out.printf("TRIANGULO: %.3f\n", areaTrianguloRetangulo);
        System.out.printf("CIRCULO: %.3f\n", areaDocirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaDoTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaDoQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaDoRetangulo);
		
		System.out.printf("ARAGON É LINDO");
    }
}
