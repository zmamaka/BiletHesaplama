import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int kM, old, type;
        float dR1 = .50f, dR2 = .10f, dR3 = 0.30f, normalAmount = 0, perKM = .10f;
        boolean isError = false;

        System.out.print("Gidilecek mesafeyi KM cinsinden giriniz : ");
        kM = input.nextInt();

        System.out.print("Lütfen yaşınızı giriniz : ");
        old = input.nextInt();

        System.out.println("Tek Yön için 0");
        System.out.println("Gidiş dönüş için 1");
        System.out.print("=> ");
        type = input.nextInt();

        if ((kM > 0) && (old > 0) && (type == 0 || type == 1)) {

            normalAmount = kM * perKM;
            System.out.println("Normal tutar : " + normalAmount);

        } else {

            System.out.println("Yanlış veri girildi !!!");
            isError = true;

        }

        if (!isError){

            if (old < 12) {

                normalAmount -= normalAmount * dR1;
                System.out.println("İndirimli tutar : " + normalAmount);
                System.out.println("İndirim oranı : %50");

            } else if (old <= 24) {

                normalAmount -= normalAmount * dR2;
                System.out.println("İndirimli tutarı : " + normalAmount);
                System.out.println("İndirim oranı : %10");

            } else if (old > 65) {

                normalAmount -= normalAmount * dR3;
                System.out.println("İndirimli tutar : " + normalAmount);
                System.out.println("İndirim oranı : %30");

            }

            if (type == 1){

                normalAmount -= normalAmount * .20f ;
                System.out.println("Gidiş dönüş indirimi uygulanmıştır (%20) tutar : " + normalAmount * 2);

            }

        }

    }
}