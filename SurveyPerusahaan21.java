import java.util.Scanner;

public class SurveyPerusahaan21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] survey = new int[10][6]; // Array 2D untuk menyimpan nilai survei dari 10 responden dan 6 pertanyaan

        // 1. Menginput hasil survei dari 10 responden dan 6 pertanyaan
        System.out.println("Masukkan nilai survei (1-5) untuk setiap responden dan pertanyaan:");
        for (int i = 0; i < 10; i++) { // Loop untuk setiap responden
            for (int j = 0; j < 6; j++) { // Loop untuk setiap pertanyaan
                System.out.print("Responden " + (i + 1) + ", Pertanyaan " + (j + 1) + ": ");
                survey[i][j] = scanner.nextInt();
            }
        }

        // 2. Menampilkan nilai rata-rata untuk setiap responden
        System.out.println("\nRata-rata untuk setiap responden:");
        for (int i = 0; i < 10; i++) {
            int totalResponden = 0;
            for (int j = 0; j < 6; j++) {
                totalResponden += survey[i][j];
            }
            double rataRataResponden = (double) totalResponden / 6;
            System.out.println("Rata-rata Responden " + (i + 1) + ": " + rataRataResponden);
        }

        // 3. Menampilkan nilai rata-rata untuk setiap pertanyaan
        System.out.println("\nRata-rata untuk setiap pertanyaan:");
        for (int j = 0; j < 6; j++) {
            int totalPertanyaan = 0;
            for (int i = 0; i < 10; i++) {
                totalPertanyaan += survey[i][j];
            }
            double rataRataPertanyaan = (double) totalPertanyaan / 10;
            System.out.println("Rata-rata Pertanyaan " + (j + 1) + ": " + rataRataPertanyaan);
        }

        // 4. Menampilkan nilai rata-rata keseluruhan
        int totalKeseluruhan = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalKeseluruhan += survey[i][j];
            }
        }
        double rataRataKeseluruhan = (double) totalKeseluruhan / (10 * 6);
        System.out.println("\nRata-rata keseluruhan: " + rataRataKeseluruhan);

        scanner.close();
    }
}