package practice.Num1003;

import java.util.ArrayList;
import java.util.Scanner;

public class num1003 {
    /**
     * <pre>
     *      다음 소스는 N번째 피보나치 수를 구하는 C++ 함수이다.
     *      <code>
     *          int fibonacci(int n) {
     *              if (n == 0) {
     *                  printf("0");
     *                  return 0;
     *              } else if (n == 1) {
     *                  printf("1");
     *                  return 1;
     *              } else {
     *                  return fibonacci(n‐1) + fibonacci(n‐2);
     *              }
     *          }
     *      </code>
     *
     *      fibonacci(3)을 호출하면 다음과 같은 일이 일어난다.
     *
     *          ● fibonacci(3)은 fibonacci(2)와 fibonacci(1) (첫 번째 호출)을 호출한다.
     *          ● fibonacci(2)는 fibonacci(1) (두 번째 호출)과 fibonacci(0)을 호출한다.
     *          ● 두 번째 호출한 fibonacci(1)은 1을 출력하고 1을 리턴한다.
     *          ● fibonacci(0)은 0을 출력하고, 0을 리턴한다.
     *          ● fibonacci(2)는 fibonacci(1)과 fibonacci(0)의 결과를 얻고, 1을 리턴한다.
     *          ● 첫 번째 호출한 fibonacci(1)은 1을 출력하고, 1을 리턴한다.
     *          ● fibonacci(3)은 fibonacci(2)와 fibonacci(1)의 결과를 얻고, 2를 리턴한다.
     *      1은 2번 출력되고, 0은 1번 출력된다. N이 주어졌을 때, fibonacci(N)을 호출했을 때, 0과 1이 각각 몇 번 출력되는지 구하는 프로그램을 작성하시오.
     *
     *      input : 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
     *              각 테스트 케이스는 한 줄로 이루어져 있고, N이 주어진다. N은 40보다 작거나 같은 자연수 또는 0이다.
     *      output : 각 테스트 케이스마다 0이 출력되는 횟수와 1이 출력되는 횟수를 공백으로 구분해서 출력한다.
     * </pre>
     * @URL https://www.acmicpc.net/problem/1003
     * @RETURN 0, 1의 출력 횟수 (memory: 14452KB, time: 116ms)
     * @AUTHOR thewayhj
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        ArrayList<Integer> numberArray = new ArrayList<>();
        ArrayList<int[]> resultArray = new ArrayList<>();

        int i;
        for (i=0; i<size; i++)
            numberArray.add(scanner.nextInt());

        int[] tmp = {1, 0};
        int[] tmp2 = {0, 1};
        resultArray.add(tmp);
        resultArray.add(tmp2);

        for (i=2;i<41;i++) {
            int[] tmp3 = {resultArray.get(i-1)[0]+resultArray.get(i-2)[0], resultArray.get(i-1)[1]+resultArray.get(i-2)[1]};
            resultArray.add(tmp3);
        }

        for (int j:numberArray)
            System.out.println(resultArray.get(j)[0]+" "+ resultArray.get(j)[1]);
    }
}
