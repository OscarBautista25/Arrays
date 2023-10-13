package VectorObjeto;

import java.util.Scanner;

public class Prueba2 {
    public static void main(String[] args) {
        Tienda2 tienda = new Tienda2("Tienda Cuántica", "Pepito Pérez", 123456);
        Computador2 computador1 = new Computador2("Acer", 50, "Intel iCore 7", "Windows", 18500000);
        Computador2 computador2 = new Computador2("Toshiba", 80, "Intel iCore 5", "Windows", 15500000);
        Computador2 computador3 = new Computador2("Mac", 100, "Intel iCore 7", "Mac", 2500000);
        tienda.añadir(computador1);
        tienda.añadir(computador2);
        tienda.añadir(computador3);
        Scanner sc = new Scanner(System.in);
        String marca = sc.next();
        System.out.println("El computador a buscar: " +marca + " se encuentra en la posición " + tienda.buscar(marca));
        tienda.imprimir();
    }
}
