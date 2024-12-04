import java.util.Scanner;

public class sulit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();
        int[] jumlahKehadiran = new int[jumlahSiswa];
        double totalKehadiran = 0;

        for(int i=0;i<jumlahKehadiran.length;i++) {
            System.out.print("Masukkan jumlah hari hadir siswa ke-" + (i + 1) + ": ");
            int kehadiran = input.nextInt();
            jumlahKehadiran[i] = kehadiran;
            totalKehadiran += jumlahKehadiran[i];
        }

        System.out.println("\nRekap Kehadiran Siswa Selama 1 Bulan (Jumlah Hari Kerja : 24 Hari): ");
        for(int i=0;i<jumlahKehadiran.length;i++) {
            System.out.println("Siswa ke-" + (i+1) + ": " + jumlahKehadiran[i] + " hari hadir");
        }

        double rerata = totalKehadiran / (jumlahKehadiran.length);
        System.out.println("\nRata-rata kehadiran siswa: " + rerata + " hari");

        System.out.println("\nSiswa yang kehadirannya di atas rata-rata:");
        for(int i=0;i<jumlahKehadiran.length;i++) {
            if(jumlahKehadiran[i] > rerata) {
                System.out.println("Siswa ke-" + (i + 1) + ": " + jumlahKehadiran[i] + " hari");
            }
        }

        System.out.println("\nSiswa yang kehadirannya di bawah rata-rata:");
        for(int i=0;i<jumlahKehadiran.length;i++) {
            if(jumlahKehadiran[i] < rerata) {
                System.out.println("Siswa ke-" + (i + 1) + ": " + jumlahKehadiran[i] + " hari");
            }
        }
    }
}
