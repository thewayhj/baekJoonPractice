package practice.Num1001;

import java.util.Scanner;

public class num1001 {
    /**
     * <pre>
     *      두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
     *
     *      input : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
     *      output : 첫째 줄에 A-B를 출력한다.
     * </pre>
     * @URL https://www.acmicpc.net/problem/1001
     * @RETURN A-B (memory : 14256KB, time: 108ms)
     * @AUTHOR thewayhj
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a - b);
    }
}
