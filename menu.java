package tallermatricesobj;
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int dimension = 0;

        System.out.println("ingrese la dimension de la matriz");
        dimension = sc.nextInt();

        System.out.println("Ingrese la opcion que desea realizar");
        opcion= sc.nextInt();

        boolean continuar = true;
        while(continuar){
            System.out.println("\n--- Menú de opciones ---");
            System.out.println("1. Llenar matriz de productos");
            System.out.println("2. Mostrar matriz de productos");
            System.out.println("3. Punto 3");
            System.out.println("4. Punto 4");
            System.out.println("5. Punto 5");
            System.out.println("6. Punto 6");
            System.out.println("7. Punto 7");
            System.out.println("8. Punto 8");
            System.out.println("9. Punto 9");
            System.out.println("10. Punto 10");
            System.out.println("11. Punto 11");
            System.out.println("12. Salir");

        }

        switch (opcion) {
            case 1:
                punto1 objp1 = new punto1();
                objp1.P1(dimension);
                break;
            case 2:
                punto2 objp2 = new punto2();
                objp2.P2(dimension);
                break;
            case 3:
                punto3 objp3 = new punto3();
                objp3.P3(dimension);
                break;
            case 4:
                punto4 objp4 = new punto4();
                objp4.P4(null, dimension);
                break;
            case 5:
                punto5 objp5 = new punto5();
                objp5.P5(dimension);
                break;
            case 6:
                
                break;
            case 7:
                Punto7 objp7 = new Punto7();
                objp7.P7(dimension);
                break;
            case 8:
                Punto8 objp8 = new Punto8();
                objp8.P8(dimension);
                break;
            case 9:
                Punto9 objp9 = new Punto9();
                objp9.P9(dimension);
                break;
            case 10:
                Punto10 objp10 = new Punto10();
        
                objp10.P10(dimension);
                break;
            case 11:
                Punto11 objp11 = new Punto11();  
                objp11.P11(dimension);
                break;
             
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
        }
    }
}
  
    
    
           
