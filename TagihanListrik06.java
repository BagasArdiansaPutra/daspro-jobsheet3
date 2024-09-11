import java.util.Scanner;

public class TagihanListrik06 {
    public static void main(String[] args) {
        int TARIF_PER_KWH = 1500;
        int BATAS_KWH = 500;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah penggunaan listrik (kWh)");
        int penggunaanKwh = input.nextInt();
        boolean melebihiBatas = penggunaanKwh > BATAS_KWH;

        int totalTagihan = penggunaanKwh * TARIF_PER_KWH;

        System.out.println("Total tagihan listrik: Rp " + totalTagihan);
        System.out.println(melebihiBatas);


    }
}