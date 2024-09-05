package branching;

import java.util.Scanner;

public class SwictStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan nomor hari (1 - 7) : ");
        int nomorhari = input.nextInt();

        String namahari = " ";

        switch (nomorhari) {
            case 1:
                namahari = "Minggu";
                break;
            case 2:
                namahari = "Senin";
                break;
            case 3:
                namahari = "Selasa";
                break;
            case 4:
                namahari = "Rabu";
                break;
            case 5:
                namahari = "Kamis";
                break;
            case 6:
                namahari = "Jumat";
                break;
            case 7:
                namahari = "Sabtu";
                break;

            default :
                System.out.println("Masukan nomor antara 1 - 7 : ");
                System.exit(0);
        }
        System.out.println(namahari);
    }
}
