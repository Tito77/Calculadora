/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Calculadora {

        // TODO code application logic here
         public void MenuPrincipal(){
        System.out.println("Operaciones disponibles:");
        System.out.println("    1-Sumar");
        System.out.println("    2-Restar");
        System.out.println("    3-Multiplicar");
        System.out.println("    4-Dividir");
        System.out.println("    5-Salir");
        System.out.println("Elija la operacion que desea realizar:");
        Scanner lector=new Scanner(System.in);
        int eleccion= lector.nextInt();
        System.out.println("");
        switch(eleccion){
            case 1: MenuSuma();
                break;
            case 2: MenuResta();
                break;
            case 3: MenuMultiplicacion();
                break;
            case 4: MenuDivision();
                break;
            case 5: System.exit(0);
                break;
            default:MenuPrincipal();
                break;
        }
    
    }
    
    public void MenuSuma(){
        System.out.println("En este momento, usted esta sumando ...");
        System.out.println("Escriba el primer digito:");
        Scanner lector=new Scanner(System.in);
        double uno= lector.nextDouble();
        System.out.println("Escriba el segundo digito:");
        double dos= lector.nextDouble();
        System.out.println("");
        double resultado=new Operaciones().getSuma(uno,dos);
        System.out.println("El resultado es: "+resultado);
        System.out.println("");
        MenuPrincipal();
    }
    
    public void MenuResta(){
        System.out.println("En este momento, usted esta restando ...");
        System.out.println("Escriba el primer digito:");
        Scanner lector=new Scanner(System.in);
        double uno= lector.nextDouble();
        System.out.println("Escriba el segundo digito:");
        double dos= lector.nextDouble();
        System.out.println("");
        double resultado=new Operaciones().getResta(uno,dos);
        System.out.println("El resultado es: "+resultado);
        System.out.println("");
        MenuPrincipal();
    }
    
    public void MenuMultiplicacion(){
        System.out.println("En este momento, usted esta multiplicando ...");
        System.out.println("Escriba el primer digito:");
        Scanner lector=new Scanner(System.in);
        double uno= lector.nextDouble();
        System.out.println("Escriba el segundo digito:");
        double dos= lector.nextDouble();
        System.out.println("");
        double resultado=new Operaciones().getMulplicacion(uno,dos);
        System.out.println("El resultado es: "+resultado);
        System.out.println("");
        MenuPrincipal();
    }
    
    public void MenuDivision(){
        System.out.println("En este momento, usted esta dividiendo ...");
        System.out.println("Escriba el primer digito:");
        Scanner lector=new Scanner(System.in);
        double uno= lector.nextDouble();
        System.out.println("Escriba el segundo digito:");
        double dos= lector.nextDouble();
        System.out.println("");
        double resultado=new Operaciones().getDivision(uno,dos);
        System.out.println("El resultado es: "+resultado);
        System.out.println("");
        MenuPrincipal();
    }
        
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora prueba= new Calculadora();
        prueba.MenuPrincipal();
    }    
}
