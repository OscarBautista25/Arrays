package VectorObjeto;

import java.util.Vector;

public class Tienda2 {
    String nombre; // Atributo que define el nombre de la tienda
    String propietario; // Atributo que define el propietario de la tienda
    int identificadorTributario; /* Atributo que define el identificador tributario de la tienda */
    Vector computador2;
    public Tienda2(String nombre, String propietario, int identificadorTributario) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.identificadorTributario = identificadorTributario;
        computador2 = new Vector();
    }
    public boolean tiendaLlena() {
        return false;
    }

    public boolean tiendaVacía() {
        return computador2.size()==0;
    }


    public void añadir(Computador2 computador) {
        
        computador2.add(computador);
    }

    public boolean eliminar(String marcaComputador) {
 
        int pos = buscar(marcaComputador);
        if (pos < 0) {
            return false; 
        }
        computador2.removeElementAt(pos);
        return true;
    }


    public int buscar(String marcaComputador) {
        Computador2 computador;
        for (int i = 0; i < computador2.size(); i++) {
            computador =(Computador2) computador2.elementAt(i);
            if(computador.marca.equals(marcaComputador))         
                
                return i; 
        }
        return -1; // Si no encontró el computador en el array
    }


    /**
     * Método que imprime en pantalla los datos del array de
     * computadores de la tienda
     */
    public void imprimir() {
        for (int i = 0; i < computador2.size(); i++) {
            System.out.println("Computador" + i);
            Computador2 computador =(Computador2) computador2.elementAt(i);
            System.out.println("Marca = " + computador.marca);
            System.out.println("Cantidad de memoria = " + computador.cantidadMemoria);
            System.out.println("Características del procesador = " + computador.caracteristicaProcesador);
            System.out.println("Sistema operativo = " + computador.sistemaOperativo);
            System.out.println("Precio = " + computador.precio);
        }
    }

    
}
