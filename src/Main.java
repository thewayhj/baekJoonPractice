import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arrLocation[] = new int[size];
        int x1, x2, y1, y2, r1, r2, i;
        double radis;

        for (i =0; i <size; i++) {
            x1 = scanner.nextInt();
            y1 = scanner.nextInt();
            r1 = scanner.nextInt();
            x2 = scanner.nextInt();
            y2 = scanner.nextInt();
            r2 = scanner.nextInt();

            radis = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));

            // 두 원의 크기가 똑같을 때
            if (x1 == x2 && y1 == y2 && r1==r2)
                arrLocation[i] = -1;
            // 두 원이 멀 때, 하나의 원이 다른 하늬 원 안에 있고 중점이 같지만 두 원이 만나지 않을 때
            else if (radis > r1 + r2 || x1 == x2 && y1 == y2 && r1 != r2 ||  radis < Math.abs(r1-r2))
                arrLocation[i] = 0;
            // 두 원이 한점에서 만남 (외접), 두 원이 한점에서 만남(내접)
            else if (radis == r1 + r2 || Math.abs(r1-r2) == radis)
                arrLocation[i] = 1;
            //
            else
                arrLocation[i] = 2;
        }
        for (i=0; i<size; i++)
            System.out.println(arrLocation[i]);
    }
}
