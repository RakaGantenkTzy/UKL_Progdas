import java.util.Scanner;

public class mudah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total belanjaan anda: ");
        int total = input.nextInt();
        System.out.print("Apakah anda member? ya/tidak: ");
        String member = input.next();
        belanjaan(total, member);
    }

    public static void belanjaan(int total, String member) {
        if(member.equals("tidak")) {
            System.out.println("Anda tidak mendapatkan diskon");
            System.out.println("Total pembayaran anda adalah: " + total);
        } else {
            if(total >= 100000 && total <= 200000) {
                System.out.println("Anda mendapatkan diskon 10%");
                System.out.println("Total pembayaran anda adalah: " + (total * 0.9));
            } else if(total > 200000) {
                System.out.println("Anda mendapatkan diskon 20%");
                System.out.println("Total pembayaran anda adalah: " + (total * 0.8));
            }
        }
    }
}
