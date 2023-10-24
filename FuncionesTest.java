import java.util.Scanner;

public class FuncionesTest {
    public static void main(String[] args) {
        elegirOperacion();
    }

    static float sumar(float numero1, float numero2){
        return numero1+numero2;
    }
    static float multiplicar(float numero1, float numero2){
        return numero1*numero2;
    }
    static float dividir(float numero1, float numero2){
        return numero1/numero2;
    }
    static void elegirOperacion(){
        float numero1=0;
        float numero2=0;
        byte opcion=0;
        Scanner entradaTeclado=new Scanner(System.in);

        System.out.println("Este programa es una calculadora de operaciones basicas de un solo uso");
                            //de un solo uso");
        System.out.println();
        System.out.println("1. Sumar");
        System.out.println("2. Multiplicar");
        System.out.println("3. Dividir");
        System.out.println("4. Salir");
        opcion=entradaTeclado.nextByte();
        //system("cls");

        if(opcion<4 && opcion>0){
            System.out.println("Escribe el primer numero:");
            numero1=entradaTeclado.nextFloat();
            System.out.println("Escribe el segundo numero:");
            numero2=entradaTeclado.nextFloat();
            System.out.println("El resultado es:");
        }

        switch(opcion){
            case 1: System.out.println(sumar(numero1, numero2));
                break;
            case 2: System.out.println(multiplicar(numero1, numero2)); break;
            case 3: System.out.println(dividir(numero1, numero2)); break;
            case 4: System.out.println("Bye"); break;
            default: System.out.println("No has elegido una opcion valida");
        }
        entradaTeclado.close();
    }
}
