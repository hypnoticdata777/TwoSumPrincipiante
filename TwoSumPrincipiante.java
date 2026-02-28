import java.util.HashMap;

public class TwoSumPrincipiante {

    // Mejorado de O(n²) a O(n) usando un HashMap
    public int[] solve(int[] nums, int objetivo) {
        HashMap<Integer, Integer> visto = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complemento = objetivo - nums[i];
            if (visto.containsKey(complemento)) {
                return new int[]{visto.get(complemento), i};
            }
            visto.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSumPrincipiante programa = new TwoSumPrincipiante();

        // Datos de prueba
        int[] misNumeros = {2, 7, 11, 15};
        int objetivo = 9;

        // Llamamos al método y guardamos el resultado
        int[] resultado = programa.solve(misNumeros, objetivo);

        // Imprimimos el resultado en la consola
        if (resultado.length == 2) {
            System.out.println("Pareja encontrada!");
            System.out.println("Indice 1: " + resultado[0]);
            System.out.println("Indice 2: " + resultado[1]);
            System.out.println("Valores: (" + misNumeros[resultado[0]] + " + " + misNumeros[resultado[1]] + " = " + objetivo + ")");
        } else {
            System.out.println("No se encontro ninguna pareja que sume " + objetivo);
        }
    }
}
