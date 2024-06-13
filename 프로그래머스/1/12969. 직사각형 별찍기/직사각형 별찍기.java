import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Scanner를 사용하여 표준 입력으로부터 값을 읽습니다.
        Scanner scanner = new Scanner(System.in);
        
        // 두 개의 정수 n과 m을 입력받습니다.
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        // 세로 길이 m만큼 반복합니다.
        for (int i = 0; i < m; i++) {
            // 가로 길이 n만큼 별 문자를 출력합니다.
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            // 한 줄을 출력한 후 줄바꿈을 합니다.
            System.out.println();
        }
        
        // Scanner를 닫습니다.
        scanner.close();
    }
}