package orhan_deneme;

import java.util.Scanner;

public class Deneme2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir gun ismi giriniz");

        String gunIsmi = input.next();

        if (gunIsmi.equals("Cumartesi")|| gunIsmi.equals("Pazar")){
            System.out.println("haftasonu");
        } else if (gunIsmi.equals("Pazartesi")||
                gunIsmi.equals("Sali")||
                gunIsmi.equals("Carsamba")||
                gunIsmi.equals("Persembe")||
                gunIsmi.equals("Cuma")){
            System.out.println("hafta ici");
        }else{
            System.out.println("HATA \ngecerli bir gun giriniz");
        }

    }
}
