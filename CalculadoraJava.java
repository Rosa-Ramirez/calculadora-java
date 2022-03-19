package calculadora.java;
import java.util.Scanner;
public class CalculadoraJava {

    public static void main(String[] args) {
        System.out.println("Calculadora");
        System.out.println("Digite el numero de la opción que desea realizar.");
        int accion;
        Scanner Leeraccion = new Scanner (System.in);
        System.out.println("1. Sumar");
        System.out.println("2. Retar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Potencia");
        System.out.println("6. Raiz");
        accion = Leeraccion.nextInt();
        
        
        
        Funciones Calculadora = new Funciones();
        switch(accion){
            
            case 1:
                double sum1;
                double sum2;
                 Scanner Leersum1 = new Scanner (System.in);
                 Scanner Leersum2 = new Scanner (System.in);
                 System.out.println("Ingrese el primer valor");
                 sum1 = Leersum1.nextDouble();

                System.out.println("Ingrese el segundo valor");
                sum2 = Leersum2.nextDouble();
                System.out.println(Calculadora.sumar(sum1, sum2));
                break;
            
            case 2:
                double rest1;
                double rest2;
                 Scanner Leerrest1 = new Scanner (System.in);
                 Scanner Leerrest2 = new Scanner (System.in);
                 System.out.println("Ingrese el primer valor");
                 rest1 = Leerrest1.nextDouble();

                 System.out.println("Ingrese el segundo valor");
                 rest2 = Leerrest2.nextDouble();
                System.out.println(Calculadora.restar(rest1, rest2));
                break;
            
            case 3:
                double mult1;
                double mult2;
                 Scanner Leermult1 = new Scanner (System.in);
                 Scanner Leermult2 = new Scanner (System.in);
                 System.out.println("Ingrese el primer valor");
                 mult1 = Leermult1.nextDouble();

                 System.out.println("Ingrese el segundo valor");
                 mult2 = Leermult2.nextDouble();
                System.out.println(Calculadora.multiplicar(mult1, mult2));
                break;
                
            case 4:
                double div1;
                double div2;
                 Scanner Leerdiv1 = new Scanner (System.in);
                 Scanner Leerdiv2 = new Scanner (System.in);
                 System.out.println("Ingrese el primer valor");
                 div1 = Leerdiv1.nextDouble();

                 System.out.println("Ingrese el segundo valor");
                 div2 = Leerdiv2.nextDouble();
                System.out.println(Calculadora.dividir(div1, div2));
                break;
            
            case 5:
                double num;
                double pot;
                Scanner Leernum = new Scanner (System.in);
                Scanner Leerpot = new Scanner (System.in);
                System.out.println("Ingrese el valor del que desea saber su potencia");
                num = Leernum.nextDouble();
                System.out.println("Ingrese la potencia a la que desee elevarlo");
                pot = Leerpot.nextDouble();
                System.out.println(Calculadora.potencia(num, pot));
                break;
                
            case 6:
                double numr;
                Scanner Leernumr = new Scanner (System.in);
                System.out.println("Ingrese el valor del que desea saber su raiz");
                numr = Leernumr.nextDouble();
                System.out.println(Calculadora.raiz(numr));
                break;
        }

    }
}
