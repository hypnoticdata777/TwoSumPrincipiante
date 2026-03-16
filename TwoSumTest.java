import java.util.Arrays;

public class TwoSumTest {

    static int passed = 0;
    static int failed = 0;

    public static void main(String[] args) {
        TwoSumPrincipiante solver = new TwoSumPrincipiante();

        // Caso normal: pareja encontrada
        check("Par encontrado",
            solver.solve(new int[]{2, 7, 11, 15}, 9),
            new int[]{0, 1});

        // Pareja al final del arreglo
        check("Pareja al final",
            solver.solve(new int[]{3, 2, 4}, 6),
            new int[]{1, 2});

        // Sin solucion
        check("Sin solucion",
            solver.solve(new int[]{1, 2, 3}, 100),
            new int[]{});

        // Arreglo vacio
        check("Arreglo vacio",
            solver.solve(new int[]{}, 5),
            new int[]{});

        // Numeros negativos
        check("Numeros negativos",
            solver.solve(new int[]{-3, 4, 3, 90}, 0),
            new int[]{0, 2});

        // Valores duplicados
        check("Valores duplicados",
            solver.solve(new int[]{3, 3}, 6),
            new int[]{0, 1});

        System.out.println("\nResultado: " + passed + " pasaron, " + failed + " fallaron.");
    }

    static void check(String nombre, int[] resultado, int[] esperado) {
        if (Arrays.equals(resultado, esperado)) {
            System.out.println("  PASO: " + nombre);
            passed++;
        } else {
            System.out.println("  FALLO: " + nombre
                + " -> esperado " + Arrays.toString(esperado)
                + ", obtenido " + Arrays.toString(resultado));
            failed++;
        }
    }
}
