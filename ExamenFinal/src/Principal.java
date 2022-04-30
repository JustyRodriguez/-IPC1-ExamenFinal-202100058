
import java.util.Scanner;
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int respuesta=0;
        while(respuesta!=4){
        Scanner entrada= new Scanner(System.in);
        System.out.println("++++++++++++++++++++++");
        System.out.println("+  Menú de Opciones  +");
        System.out.println("+  1. Problema 1     +");
        System.out.println("+  2. Problema 2     +");
        System.out.println("+  3. Problema 3     +");
        System.out.println("+  4. Salir          +");
        System.out.println("++++++++++++++++++++++");
        respuesta=entrada.nextInt();
        
        switch(respuesta){
            case 1:
                System.out.println("Este es el problema 1");
                Scanner numero=new Scanner(System.in);
                int num1;
                int num2;
                System.out.println("Porfavor ingrese el primer número");
                num1=numero.nextInt();
                System.out.println("Porfavor ingrese el segundo número");
                num2=numero.nextInt();
                if (num1>num2){
                System.out.println("El número mayor es: "+num1);
                }
                else{
                System.out.println("El número mayor es: "+num2);
                }
                break;
            case 2:
                System.out.println("Este es el problema 2");
                Scanner leer = new Scanner(System.in);
                System.out.print("Introduzca numero de filas: ");
                int piramide=leer.nextInt();
                while(piramide%2==0){
                System.out.println("Porfavor ingresa un número impar");
                piramide=leer.nextInt();
                leer.nextLine();
                }
                int signo=1;
                int espacios=(piramide/2)+2;
                for(int i=0; i<=(piramide/2)+2; i++){
                espacios--;
                for(int j=0; j<=espacios; j++){
                    System.out.print(" ");
                }
                for(int z=0; z<signo; z++){
                    System.out.print("*");
                }
                signo=signo+2;
                System.out.print("\n");
                }
                break;
            case 3:
                System.out.println("Este es el problema 3");
                break;
            case 4:
                System.out.println("Saliendo del programa");
                break; 
            default:
                System.out.println("No hay caso, seleccione otra opción");
                break;
        }
        
       System.out.println();
       System.out.println();
    }
    }
}
