import java.util.Scanner;
/**
 * Percobaan2Pertanyaan1
 */
public class Percobaan2Pertanyaan2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir-" + i + " : ");
            nilaiAkhir[i] = sc.nextInt();
        }
        
        for (int i = 0; i < 10; i++) {
        System.out.println("Nilai akhir ke-"+ i + " adalah " + nilaiAkhir[i]);
        }
        sc.close(); 
    }
}