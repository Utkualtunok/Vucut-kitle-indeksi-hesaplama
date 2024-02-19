import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
          double boy, kilo, indeks;

          Scanner inp = new Scanner(System.in);
          System.out.print("Lütfen Boyunuzu (metre cinsinde) giriniz : ");
          boy = inp.nextDouble();
          System.out.print("Lütfen kilonuzu giriniz : ");
          kilo = inp.nextDouble();

          // İndeks için gerekli olan formüller ve ekrana yazdırma işlemi.
          boy = boy / 100;
          indeks = kilo / (boy * boy);
          System.out.println("Vücut Kitle İndeksiniz : " + indeks);

        }
    }
