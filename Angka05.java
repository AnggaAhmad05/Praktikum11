import java.util.Scanner;
public class Angka05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Angka : ");
        int n = sc.nextInt();


        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
                
            }
            for (int j = 0; j < i; j++) {
                int angka = j + 1;
                System.out.print(angka);
                
            }
            System.out.println();
        }
        
    }
    
}
    

