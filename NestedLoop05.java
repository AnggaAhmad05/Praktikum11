import java.util.Scanner;
public class NestedLoop05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double rata = 0;
        double[][] suhu = new double[2][4];

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
        // for (int i = 0; i < suhu.length; i++) {
        //     System.out.print("Rata-rata suhu: " + (i+1));
        //     double total = 0;

        //     for (int j = 0; j < suhu[i].length; j++) {
        //         total += suhu[i][j];
        //     }
        //     rata =(double)total / suhu[i].length;
        //     System.out.println(rata);

        //     System.out.println();
        // }
    }
}
