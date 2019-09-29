package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        ArrayList<Integer> numberArray = new ArrayList<>();
        ArrayList<int[]> resultArray = new ArrayList<>();

        int i;
        for (i=0; i<size; i++) {
            numberArray.add(scanner.nextInt());
        }
        int[] tmp = {1, 0};
        int[] tmp2 = {0, 1};
        resultArray.add(tmp);
        resultArray.add(tmp2);

        for (i=2;i<41;i++) {
            int[] tmp3 = {resultArray.get(i-1)[0]+resultArray.get(i-2)[0], resultArray.get(i-1)[1]+resultArray.get(i-2)[1]};
            resultArray.add(tmp3);
        }

        for (int j:numberArray) {
            System.out.println(resultArray.get(j)[0]+" "+ resultArray.get(j)[1]);
        }
    }
}
