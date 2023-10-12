/**
 * ElementoDuplicado
 */
public class ElementoDuplicado {

    public static void main(String[] args) {
        int[] duplicados = {3, 4, 5, 8, 3, 8, 5};

        for (int i = 0; i < duplicados.length; i++) {
            for (int j = i+1; j < duplicados.length; j++) {
                if (duplicados[i]==duplicados[j]) {
                    System.out.println("Elemento duplicados: " +duplicados[j]);
                    
                }
            }
            
        }
        
    }
}