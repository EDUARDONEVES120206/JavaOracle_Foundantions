import java.util.ArrayList;

public class ordenarLista {
	private static void ordenarLista(ArrayList<Integer> lista) {
		int n = lista.size();
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (lista.get(j) > lista.get(j + 1)) {
					int temp = lista.get(j);
					lista.set(j, lista.get(j + 1));
					lista.set(j + 1, temp);
				}
			}
		}
	}
}
