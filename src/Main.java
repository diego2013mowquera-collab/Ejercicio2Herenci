import Geometria.FiguraGeometrica;
import java.util.Scanner;
//Cada clase debe tener el metodo imprimir datos
//En cada figura debe sobreescribir el metodo para que muestre a parte del area los elementos propios de cado figura
//2. implementar un menu que permita seleccionar la figura geometrica y posteriormente pida el ingreso por teclado de los datos
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int opcion=0;
        do{
            System.out.println("Calculo de areas y perimetros");
            System.out.println("1.Circulo");
            System.out.println("2.Cuadrado");
            System.out.println("3.Triangulo");


            System.out.println("5. Salir");
            System.out.println("Ingrese una opcion");
            opcion= sc.nextInt();

            switch(opcion){
                case 1 :

                    System.out.println("Ingrese el valor del radio");
                    double radio=sc.nextDouble();
                    Circulo circulo1=new Circulo("Rojo",radio);



                    circulo1.imprimirDatos();
                    break;

                case 2:
                    System.out.println("Ingrese el valor del lado");
                    double lado=sc.nextDouble();
                    Cuadrado cuadrado1=new Cuadrado("Rojo",lado);



                    break;


                case 3 :
                    System.out.println("Ingrese el valor de la base");
                    double base=sc.nextDouble();
                    System.out.println("Imgrese la altura");
                    double altura=sc.nextDouble();
                    Triangulo triangulo1=new Triangulo("Rojo",base, altura);


                    triangulo1.setBase(base);
                    triangulo1.setBase(altura);
                    triangulo1.calcularArea();
                    triangulo1.calcularPerimetro();
                    break;


                default:
                    System.out.println("Ingrese una opcion correcta ");





            }




        }while(opcion!=5);


    }

}