import java.util.Scanner;

public class DoWhileCuti02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("jatah cuti: ");
        jatahCuti = sc.nextInt();

        do {
            System.out.println("Apakah Anda ingin meengambil cuti (y/t)? ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("jumlah hari: ");
                jumlahHari = sc.nextInt();
            
                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti Anda tidak mencukupi");
                    break;
                }
            }
        }while (jatahCuti > 0);
    }
}