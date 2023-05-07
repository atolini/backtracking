import java.util.ArrayList;
import java.util.Arrays;

public class Program {
    public static int l = 0;
    public static int r = 1;
    public static int counter = 0;

    public static void main(String[] args) {
        System.out.println("Calculando troco com algoritmo Guloso" + " " + Guloso.troco(28, Arrays.asList(2, 1, 5)));
        System.out.println("Permutações com backtracking" + " " + Backtracking.permute(new int[]{1, 2, 3}));

    }
}
