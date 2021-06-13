package app.main;

import app.main.kubus;
import app.main.balok;
import app.main.bola;
import java.util.Scanner;

public class bangunruang {

    public static void main(String[] args) {
        char yn = 'n';

        Scanner nilai = new Scanner(System.in);
        do {
            System.out.println("Program untuk menghitung Rumus Bangun Ruang");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. bola");
            System.out.println("pilihan ?");
            int p = nilai.nextShort();
            
            if (p == 1) {
                System.out.println("Program untuk menghitung Luas dan Volume Kubus");
                kubus kubus = new kubus();
                System.out.println("sisi : ");
                int s = nilai.nextInt();
                
                kubus.SetSisi(s);
        
                System.out.println("Sisi : " + kubus.GetSisi());
                System.out.println("Luas Permukaan Kubus : " + kubus.LuasKubus());
                System.out.println("Volume Kubus : " + kubus.VolumeKubus());
            }
            
            else if (p == 2) {
                balok balok = new balok();
                System.out.println("panjang : ");
                int panjang = nilai.nextInt();
                System.out.println("lebar : ");
                int lebar = nilai.nextInt();
                System.out.println("tinggi : ");
                int tinggi = nilai.nextInt();

                balok.SetPanjang(panjang);
                balok.SetLebar(lebar);
                balok.SetTinggi(tinggi);

                System.out.println("Program untuk menghitung Luas dan Volume Balok");
                System.out.println("Panjang : " + balok.GetPanjang());
                System.out.println("Lebar : " + balok.GetLebar());
                System.out.println("Tinggi : " + balok.GetTinggi());
                System.out.println("Luas Permukaan Balok : " + balok.LuasBalok());
                System.out.println("Volume Balok : " + balok.VolumeBalok());
            }
            
            else if (p == 3) {
                System.out.println("Program untuk menghitung Luas dan Volume Bola");
                bola bola = new bola();
                System.out.println("rusuk : ");
                int r = nilai.nextInt();

                bola.SetJari(r);
        
                System.out.println("Jari - Jari : " + bola.GetJari());
                System.out.println("Luas Permukaan bola : " + bola.Luasbola());
                System.out.println("Volume Bola : " + bola.Volumebola());
            }

            else {
                System.out.println("Pilihan hanya [ 1 - 3 ]");
            }

            System.out.println("Repeat This Program ? [y / n] :"); 
            nilai.nextLine();
            String yesno = nilai.nextLine();
            yn = yesno.charAt(0);
        }while(yn == 'y' || yn == 'Y');
            
        nilai.close();

        }
}