import java.util.Map;
import java.util.Scanner;

/**
 * Created by JJungHyun on 2017-06-17.
 */
public class MapVsHashMap {
    public static void main(String[] args) {
       // String name = null;
//        Integer number = 0;
        //스캐너의 값을 받는다
        Scanner scanner = new Scanner(System.in);

       //스캐너의 값이 정현일때
                String name = scanner.nextLine();
        if ("정현!".equals(name) ) {
            System.out.println("156.4");
        } else if("종훈!".equals(name)){
            System.out.println("거인");
        }
    }
}