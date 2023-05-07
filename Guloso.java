import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Guloso {
    public static List<Integer> troco(int valor, List<Integer> moedas) {
        int counter = 0;

        List<Integer> result = new ArrayList<>();

        Collections.sort(moedas, Collections.reverseOrder());

        while (counter < valor) {
            int index = 0;
            while (index < moedas.size()) {
                if (counter + moedas.get(index) <= valor) {
                    counter = counter + moedas.get(index);
                    result.add(moedas.get(index));
                    break;
                }
                index = index + 1;
            }
        }

        return result;
    }
}
