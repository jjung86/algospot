import java.io.BufferedReader;
import java.util.Scanner;

/**
 * Created by JJungHyun on 2017-06-18.
 */
public class Tutorial1 {

    public static void main(String[] args) {

        //TODO init Scanner, will input values on console...
        Scanner scanner = new Scanner(System.in);

        //TODO input couter, this will number
        int t= scanner.nextInt();

        //TODO input total wats by t, this will also number
        int[] totalWats = new int[t];

        //TODO input values per building with time array, this will String... (ex: 1 2 3 4 5 6 7 8 9)
        String[] values = new String[t];

        /* Input Area */
        for (int i = 0; i < t; i++) {
            totalWats[i] = scanner.nextInt();
            scanner.nextLine();
            values[i] = scanner.nextLine();
        }

        //TODO check totalWats
        /* Output Area */
        for (int i = 0; i < t; i++) {
            System.out.println(totalWats[i]);
            System.out.println(values[i]);
        }
    }
}
