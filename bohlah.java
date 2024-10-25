import java.util.Scanner;

public class bohlah {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);

        double uangAwal, totalBelanja, totalBayar, potongan, uangBalik;
        String hari, jenis;
        double diskon = 0;
        double cashback = 0;
     
        System.out.print("Uang yang Anda Miliki: ");
        uangAwal = input19.nextDouble();

        System.out.print("Total pembelanjaan: ");
        totalBelanja = input19.nextDouble();

        System.out.print("Masukkan Hari: ");
        hari = input19.next();

        do {
            System.out.print("Jenis Dompet Digital yang digunakan (GoPay/Ovo): ");
            jenis = input19.next();
            
            if (!jenis.equalsIgnoreCase("GoPay") && !jenis.equalsIgnoreCase("Ovo")) {
                System.out.println("jenis dompet digital tersebut tidak kami miliki. Silakan masukkan GoPay atau Ovo.");
            }
        } while (!jenis.equalsIgnoreCase("GoPay") && !jenis.equalsIgnoreCase("Ovo"));

        switch (hari.toLowerCase()) {
            case "senin":
                if (jenis.equalsIgnoreCase("GoPay")) {
                    cashback = 0.10;
                } else if (jenis.equalsIgnoreCase("Ovo")) {
                    diskon = 0.10;
                }
                break;
            case "selasa":
                if (jenis.equalsIgnoreCase("GoPay")) {
                    diskon = 0.10;
                } else if (jenis.equalsIgnoreCase("Ovo")) {
                    cashback = 0.15;
                }
                break;
            case "rabu":
                if (jenis.equalsIgnoreCase("GoPay")) {
                    diskon = 0.15;
                } else if (jenis.equalsIgnoreCase("Ovo")) {
                    diskon = 0.15;
                }
                break;
            case "kamis":
                if (jenis.equalsIgnoreCase("GoPay")) {
                    cashback = 0.10;
                } else if (jenis.equalsIgnoreCase("Ovo")) {
                    diskon = 0.10;
                }
                break;
            case "jumat":
                if (jenis.equalsIgnoreCase("GoPay")) {
                    diskon = 0.10;
                } else if (jenis.equalsIgnoreCase("Ovo")) {
                    diskon = 0.15;
                }
                break;
            case "sabtu":
                if (jenis.equalsIgnoreCase("GoPay")) {
                    diskon = 0.15;
                } else if (jenis.equalsIgnoreCase("Ovo")) {
                    cashback = 0.10;
                }
                break;
            case "minggu":
                if (jenis.equalsIgnoreCase("GoPay")) {
                    diskon = 0.20;
                } else if (jenis.equalsIgnoreCase("Ovo")) {
                    diskon = 0.15;
                }
                break;
            default:
                System.out.println("Hari tidak valid.");
                return;
        }

        System.out.println("--------------------------------------------------------------");

        totalBayar = totalBelanja;
        if (diskon > 0) {
            potongan = totalBelanja * diskon;
            totalBayar = totalBelanja - potongan;
            System.out.println("Jenis Promo yang Anda Dapatkan : Diskon " + (diskon * 100) + "%");
        } else if (cashback > 0) {
            uangBalik = totalBelanja * cashback;
            uangAwal += uangBalik;
            System.out.println("Jenis Promo yang Anda Dapatkan : Cashback " + (cashback * 100) + "%");
        }

        
        uangAwal -= totalBayar;
        
        System.out.println("Uang yang Harus Dibayarkan : " + totalBayar);
        System.out.println("Sisa Uang Anda : " + uangAwal);
    }
}
