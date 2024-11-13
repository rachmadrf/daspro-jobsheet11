import java.util.Scanner;

public class BioskopWithScanner21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    // Meminta input baris dan kolom dengan validasi hingga kursi kosong dipilih
                    while (true) {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        // Validasi input baris dan kolom
                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Posisi tidak valid! Baris harus antara 1-4 dan kolom harus antara 1-2.");
                        } else if (penonton[baris - 1][kolom - 1] != null) {
                            // Jika kursi sudah terisi, tampilkan warning dan minta input ulang
                            System.out.println("Kursi sudah terisi oleh penonton lain! Silakan pilih kursi lain.");
                        } else {
                            // Jika kursi valid dan kosong, keluar dari loop
                            break;
                        }
                    }

                    // Memasukkan data penonton ke array jika kursi valid dan kosong
                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Data penonton berhasil ditambahkan.");
                    break;
                case 2:
                    System.out.println("\nDaftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            String namaPenonton = (penonton[i][j] == null) ? "***" : penonton[i][j];
                            System.out.println("Baris " + (i + 1) + " Kolom " + (j + 1) + ": " + namaPenonton);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih! Program selesai.");
                    return; // Keluar dari program
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih menu 1, 2, atau 3.");
            }
        }
    }
}