package ArrayObjeto;

import java.util.Scanner;

public class Prueba {
    /**
     * Método main que crea una tienda de computadores que contiene
     * tres computadores. Luego se solicita ingresar por teclado la marca
     * de un computador a buscar en la tienda
     */
    public static void main(String[] args) {
              
        Tienda tienda = new Tienda("Tienda Cuántica", "Pepito Pérez", 123456, 5);
        Computadores computador1 = new Computadores("Acer", 50, "Intel iCore 7", "Windows", 18500000);
        Computadores computador2 = new Computadores("Toshiba", 80, "Intel iCore 5", "Windows", 15500000);
        Computadores computador3 = new Computadores("Mac", 100, "Intel iCore 7", "Mac", 2500000);
        tienda.añadir(computador1);
        tienda.añadir(computador2);
        tienda.añadir(computador3);
        Scanner sc = new Scanner(System.in);
        String marca = sc.next();
        System.out.println("El computador a buscar: " +marca + " se encuentra en la posición " + tienda.buscar(marca));
        tienda.imprimir();
    }
}
