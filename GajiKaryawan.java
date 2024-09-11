import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        double bonuss = 0.10;
        double pajakk = 0.05;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah jam kerja karyawan dalam sebulan: ");
        double jamKerja = input.nextDouble();
        System.out.print("Masukkan upah per jam kerja: ");
        double upahPerJam = input.nextDouble();

        double gajiSebelumPajak = jamKerja * upahPerJam;
        double bonus = gajiSebelumPajak * bonuss;
        double totalGajiSebelumPajak = gajiSebelumPajak + bonus;
        double pajak = totalGajiSebelumPajak * pajakk;
        double gajiBersih = totalGajiSebelumPajak - pajak;

        System.out.println("Gaji sebelum pajak: " + gajiSebelumPajak);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total gaji sebelum pajak: " + totalGajiSebelumPajak);
        System.out.println("Pajak yang dikenakan: " + pajak);
        System.out.println("Gaji bersih setelah pajak: " + gajiBersih);
    }
}