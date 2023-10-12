package ArrayObjeto;

public class Tienda {
    String nombre; // Atributo que define el nombre de la tienda
    String propietario; // Atributo que define el propietario de la tienda
    int identificadorTributario; /* Atributo que define el identificador tributario de la tienda */
    Computadores[] computadores; /* Atributo que define un array de computadores de la tienda */
    /* Atributo que define la cantidad de computadores que tiene la tienda */
    static int númeroComputadores;


    public Tienda(String nombre, String propietario, int identificadorTributario,
            int tamaño) {
        if (tamaño < 1) { // Si el tamaño es menor que 1, es insuficiente
            System.out.println("Cantidad de computadores insuficientes.");
        } else {
            this.nombre = nombre;
            this.propietario = this.propietario;
            this.identificadorTributario = identificadorTributario;
            computadores = new Computadores[tamaño]; /* Se crea el array de computadores */
            númeroComputadores = 0;
        }
    }


    /**
     * Método que determina si la tienda está llena, es decir, si su array
     * de computadores completó su tamaño
     *
     * @return Valor booleano que determina si el array de computadores
     *         está lleno
     */
    public boolean tiendaLlena() {
        return númeroComputadores == computadores.length;
    }

 /**
     * Método que determina si la tienda está vacía, es decir, si su array
     * de computadores no tiene elementos
     *
     * @return Valor booleano que determina si el array de
     *         computadores está vacío
     */
    public boolean tiendaVacía() {
        return númeroComputadores == 0;
    }


    public void añadir(Computadores computador) {
        // Si la tienda está llena, no se puede agregar el computador
        if (tiendaLlena()) {
            System.out.println("La tienda está llena. No se puede añadir elemento.");
        } else {
            computadores[númeroComputadores] = computador;
            númeroComputadores++; /* Se incrementa el contador de computadores */
        }
    }


    /**
     * Método que elimina un computador del array de computadores de
     * la tienda
     *
     * @param marcaComputador Parámetro que define la marca de un
     *                        computador que se eliminará del array de computadores
     *                        de la
     *                        tienda
     * @return Valor booleano que determina si un computador se pudo
     *         eliminar o no del array de computadores
     */
    public boolean eliminar(String marcaComputador) {
        // Se busca el computador en el array
        int pos = buscar(marcaComputador);
        if (pos < 0) {
            return false; /* Si no encuentra al computador, devuelve un valor boolean con false */
        }
        /*
         * Si el computador se encuentra, se elimina el computador de su posición y se
         * mueven las posiciones de los demás elementos en el array
         */
        for (int i = pos; i < númeroComputadores; i++) {
            computadores[i] = computadores[i + 1];
        }
        númeroComputadores--; /*
                               * Decrementa la cantidad de
                               * computadores
                               */
        return true;
    }


    public int buscar(String marcaComputador) {
        for (int i = 0; i < númeroComputadores; i++) { /*
                                                        * Recorre el
                                                        * array de computadores
                                                        */
            if (computadores[i].marca.equals(marcaComputador))
                // Si se encuentra el computador buscado
                return i; /*
                           * Retorna la posición del computador buscado
                           * en el array
                           */
        }
        return -1; // Si no encontró el computador en el array
    }


    /**
     * Método que imprime en pantalla los datos del array de
     * computadores de la tienda
     */
    public void imprimir() {
        for (int i = 0; i < númeroComputadores; i++) {
            System.out.println("Computador" + i);
            System.out.println("Marca = " + computadores[i].marca);
            System.out.println("Cantidad de memoria = " + computadores[i].cantidadMemoria);
            System.out.println("Características del procesador = " + computadores[i].caracteristicaProcesador);
            System.out.println("Sistema operativo = " + computadores[i].sistemaOperativo);
            System.out.println("Precio = " + computadores[i].precio);
        }
    }
}

