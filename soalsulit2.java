import java.util.Scanner;
public class soalsulit2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = input.nextInt();

        int[][] A = new int[baris][kolom];
        int[][] B = new int[baris][kolom];
        int[][] C = new int[baris][kolom];

        System.out.println("\nInput elemen matriks A:");
        for (int a = 0; a < baris; a++) {
            for (int x = 0; x < kolom; x++) {
                System.out.print("A[" + a + "][" + x + "] = ");
                A[a][x] = input.nextInt();
            }
        }

        System.out.println("\nInput elemen matriks B:");
        for (int a = 0; a < baris; a++) {
            for (int x = 0; x < kolom; x++) {
                System.out.print("B[" + a + "][" + x + "] = ");
                B[a][x] = input.nextInt();
            }
        }
        for (int a = 0; a < baris; a++) {
            for (int x = 0; x < kolom; x++) {
                C[a][x] = A[a][x] + B[a][x];
            }
        }
        System.out.println("\nHasil penjumlahan matriks:");
        for (int a = 0; a < baris; a++) {
            for (int x = 0; x < kolom; x++) {
                System.out.print(C[a][x] + " ");
            }
        }
    }
}