package vetorArraylist2905;
import java.util.ArrayList;

public class CincoNum {

	public static void main(String[] args) {
		ArrayList<Integer> cinco = new ArrayList<>();
		int soma=0;

		cinco.add(20);
		cinco.add(5);
		cinco.add(10);
		cinco.add(5);
		cinco.add(10);

		for (int i : cinco) {
			soma += i;
		}
		System.out.println("O resultado da soma é: " + soma);
	}

}
