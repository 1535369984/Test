package reflect;

import java.util.Scanner;

/**
 * @Description :
 * Created by WL on 2018/9/28
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            if (a == 0) {
                return;
            } else {
                System.err.println(a + (a >> 1));
            }
        }
    }
}
