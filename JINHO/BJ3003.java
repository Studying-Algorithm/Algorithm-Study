import java.util.Scanner;
public class BJ3003 {
    public static void main(String[] args) {
        int[] hap = new int[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < hap.length; i++) {
            hap[i] = scanner.nextInt();
        }
        int king = 1 - hap[0];
        int queen = 1 - hap[1];
        int rook = 2 - hap[2];
        int bishop = 2 - hap[3];
        int knight = 2 - hap[4];
        int pawn = 8 - hap[5];
        System.out.println(king+" "+queen+" "+rook+" "+bishop+" "+knight+" "+pawn);
    }
}
