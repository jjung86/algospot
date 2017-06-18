import java.io.*;
import java.util.Scanner;

/**
 * Created by JJungHyun on 2017-06-11.
 */
public class HelloWorld {

    public static void main(String[] args) throws IOException {

        //스캐너 선언
        Scanner scanner = new Scanner(System.in); // System.in ==> 콘솔로 입력하기

        // 어레이 선언하고 그안에 담기 그리고 다시 찍기
        //30은 사이즈
        String[] names = new String[5];
        //d어레이는 0부터자나요 근데 5개라고했었는데 저기 5가죠?
        //음 저도 몰라요 ㅋㅋ 그러니 확인해보죠
        // 그럼 문제에서 몇개까지 넣을
        // 네임에 우선 5개 넣어봐요 ㅋㅋ



//        names[0] = scanner.next();
//        names[1] = scanner.next();얼
//        names[2] = scanner.next();
//        names[3] = scanner.next();
//        names[4] = scanner.next();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //컴파일 시간은 위에게 더 빠르네
        for(int i=0;i<names.length;i++){
             // 0, 1, 2, 3, ....
            names[i]="Hello ,"+scanner.next()+"!";
        }
        for (String name : names) {
            System.out.println(name);
        }

    }
}
