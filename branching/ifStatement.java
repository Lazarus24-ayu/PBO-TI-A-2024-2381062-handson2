package branching;

import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nomor hari (1 - 7) : ");
        int nomorhari = input.nextInt();

        String namaHari = "";

          if (nomorhari == 1) {
            namaHari = "Minggu";
          if (nomorhari == 2) {
            namaHari = "Senin";
          if (nomorhari == 3) {
            namaHari = "Selasa";
          if (nomorhari == 4) {
            namaHari = "Rabu";
            if (nomorhari == 5) {
                namaHari = "Kamis";
                  if (nomorhari == 6) {
                    namaHari = "Jumat";
                      if (nomorhari == 7) {
                        namaHari = "Sabtu";
                    }
                }
            }
        }
        }
        }
        }

    }
}
