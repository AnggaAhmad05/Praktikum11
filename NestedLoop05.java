import java.util.Scanner;
public class NestedLoop05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        double rata = 0;
        System.out.println(" Masukkan Jumlah Kota: ");
         int Jumlahkota = sc.nextInt();
        double[][] suhu = new double[Jumlahkota][4];

        for (int i = 0; i < suhu.length; i++) {
            System.out.println("KOTA KE- " + (i+1));

            for (int j = 0; j < suhu[i].length; j++) {
                System.out.print("    suhu ke- " + (j+1) + ": ");
                suhu[i][j] = sc.nextInt();
            
            }
    
        }
        for (int i = 0; i < suhu.length; i++) {
            System.out.print("KOTA KE-: " + (i+1) + ": ");
            double total = 0;
        
        for (double Suhu  : suhu[i]) {
            System.out.print(Suhu + " ");
            total += Suhu;
            
        }    
            System.out.println();
            rata = total / suhu[i].length;
            System.out.println("RATA RATA SUHU ADALAH "+rata);

        }
    }
}
