import java.util.Scanner;

public class segitiga19 {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);
        int sisiA, sisiB, sisiC;

        do {
            System.out.print("Masukkan Panjang Sisi A: ");
            sisiA = input19.nextInt();

            System.out.print("Masukkan Panjang Sisi B: ");
            sisiB = input19.nextInt();

            System.out.print("Masukkan Panjang Sisi C: ");
            sisiC = input19.nextInt();

            if (sisiA <= 0 || sisiB <= 0 || sisiC <= 0) {
                System.out.println("Panjang sisi harus lebih besar dari 0, coba lagi.");
            }
        } while (sisiA <= 0 || sisiB <= 0 || sisiC <= 0);

        if (sisiA == sisiB && sisiB == sisiC) {
            System.out.println("SEGITIGA SAMA SISI");
        } else if (sisiA == sisiB || sisiA == sisiC || sisiB == sisiC) {
            System.out.println("SEGITIGA SAMA KAKI");
        } else {
            System.out.println("SEGITIGA SEMBARANG");
        }
    }
}
