public class sedang {
    public static void main(String[] args) {
        int sum = 0;
        int current = 0;
        for(int i=1;i<=24;i++) {
            current = 50000 + (50000 * i);
            sum += current;
            System.out.println("Tabungan bulan ke-" + i + ": Rp" + current);
        }
        System.out.println("\nTotal tabungan bulan selama 12 bulan: Rp" + sum);
    }
}
