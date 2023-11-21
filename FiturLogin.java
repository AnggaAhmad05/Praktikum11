import java.util.Scanner;

public class FiturLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username[]= {"ADMIN", "DOSEN", "MAHASISWA"}; 
        String pw[]= {"123", "456", "789"};
        int login, menu;
        String nama, pin;
        boolean Logindosen = false, loginadmin = false, loginmahasiswa = false;

        System.out.println("SISTEM AKADEMIK");
        System.out.println("----------------");

        System.out.println("LOGIN SEBAGAI: ");
        System.out.println("1. ADMIN");
        System.out.println("2. DOSEN");
        System.out.println("3. MAHASISWA");
        System.out.println("");
        login = sc.nextInt();
        sc.nextLine();

        if (login == 1) {
            System.out.println("Masukkan Nama: ");
            nama = sc.nextLine();
            System.out.println("Masukkan Password: ");
            pin = sc.nextLine();

            for (int i = 0; i < username.length; i++) {
                if (username[i].equals(nama) && pw[i].equals(pin)) {
                    System.out.println("");
                    System.out.println("Login Berhasil");
                    loginadmin = true;
                    break;
                    
                } else {
                    System.out.println("Username atau password invalid silahkan coba lagi");
                    break;
                }
            }
            
            while (loginadmin) {
                System.out.println("MENU ADMIN");
                System.out.println("-------------");
                System.out.println("1. INPUT DATA MAHASISWA");
                System.out.println("2. INPUT DATA MATA KULIAH");
                System.out.println("3. UPDATE DATA MAHASISWA");
                System.out.println("4. INPUT NILAI");
                System.out.println("5. CETAK KHS");
                System.out.println("6. REKAP NILAI SEMUA MAHASISWA");
                System.out.println("7. PENCARIAN");
                System.out.println("8. LOGOUT");
                menu = sc.nextInt();

            }

        }   else if (login == 2){
            System.out.println("Masukkan Nama: ");
            nama = sc.nextLine();
            System.out.println("Masukkan Password: ");
            pin = sc.nextLine();

            for (int i = 0; i < username.length; i++) {
                if (username[i].equals(nama) && pw[i].equals(pin)) {
                    System.out.println("");
                    System.out.println("Login Berhasil");
                    Logindosen = true;
                    break;
                } else {
                    System.out.println("Username atau password invalid silahkan coba lagi");
                    break;
                }
            }
            while (Logindosen) {
                System.out.println("MENU DOSEN");
                System.out.println("-------------");
                System.out.println("1. INPUT NILAI");
                System.out.println("2. CETAK KHS MAHASISWA");
                System.out.println("3. PENCARIAN");
                System.out.println("4. LOGOUT");
                menu = sc.nextInt();
            }
        } else if (login == 3) {
            System.out.println("Masukkan Nama: ");
            nama = sc.nextLine();
            System.out.println("Masukkan Password: ");
            pin = sc.nextLine();

            for (int i = 0; i < username.length; i++) {
                if(username[i].equals(nama) && pw[i].equals(pin)) {
                    System.out.println("");
                    System.out.println("Login Berhasil");
                    loginmahasiswa = true;
                    break;
                } else {
                    System.out.println("Username atau password invalid silahkan coba lagi");
                    break;
                }
            }
            while (loginmahasiswa) {
                System.out.println("MENU MAHASISWA");
                System.out.println("-------------");
                System.out.println("1. INPUT DATA MAHASISWA");
                System.out.println("2. INPUT DATA MATA KULIAH");
                System.out.println("3. INPUT NILAI MAHASISWA");
                System.out.println("4. CETAK KHS");
                System.out.println("5. REKAP NILAI SEMUA MAHASISWA");
                System.out.println("6. PENCARIAN");
                menu = sc.nextInt();

            }
        }
    }
}

    

