import java.util.Scanner;

public class WhileGaji02 {
    public static void main(String[] argss) {
        Scanner input02 =new Scanner(System.in);

            int jumlahKaryawan;
            int jumlahJamLembur;
            double gajiLembur = 0;
            double totalGajiLembur = 0;
            String jabatan;

            System.out.print("Masukkan jumlah karyawan: ");
            jumlahKaryawan = input02.nextInt();

            int i = 0;
            
            while (i < jumlahKaryawan) {
                System.out.println("Pilihan jabatan - Direktur, Manager, Karyawan");
                System.out.println("Masukkan jabatan karyawan ke-" + (i+1) + ": ");
                jabatan = input02.next();
                System.out.println("Masukkan jumlah jam lembur: ");
                jumlahJamLembur = input02.nextInt();
                i++;

                if (jabatan.equalsIgnoreCase("direktur")) {
                    continue;
                } else if (jabatan.equalsIgnoreCase("manager")) {
                    gajiLembur = jumlahJamLembur * 100000;
                }
                else if (jabatan.equalsIgnoreCase("karyawan")) {
                    gajiLembur = jumlahJamLembur * 75000;
                }

                totalGajiLembur += gajiLembur;
            }
                System.out.println("Total gaji lembur: " + totalGajiLembur);
    }
}