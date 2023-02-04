package hastaneprojesi4;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class Hastane {

    static Scanner scan = new Scanner(System.in);
    public static void anaMenü() {
        String secim = "";
        do {
            System.out.println("\n\t === QA04 HASTANESI ===\t\n" +
                    "1-ID ILE DURUM BILGISI\n" +
                    "2-ISIM VE SOYISIM ILE HASTA BULMA\n" +
                    "3-HASTA LISTESI\n" +
                    "4-DOKTOR LISTESI \n" +
                    "5-UNVAN ILE DOKTOR BULMA\n" +
                    "6-HASTA EKLEME\n" +
                    "7-HASTAYI ID ILE SILME\n" +
                    "Q-CIKIS");
            System.out.print("Yapmak istediginiz islemi seciniz : ");
            secim = scan.nextLine();
            switch (secim) {
                case "1":
                    Hasta.idIleDurumBilgisiBul();
                    break;
                case "2":
                    Hasta.isimSoyisimHastaBul();
                    System.out.println(Hasta.acilHastaliklar());
                    break;
                case "3":
                    Hasta.hastaListele();
                    break;
                case "4":
                    Doktor.doktorListele();
                    break;
                case "5":
                    Doktor.unvanIleDoktorBul();
                    break;
                case "6":
                    Hasta.hastaEkle();
                    break;
                case "7":
                    Hasta.hastaSil();
                    break;

                case "q":
                case "Q":
                    cikisYap1();
                    break;
            }
        } while (!secim.equalsIgnoreCase("Q"));
    }
    private static void cikisYap1() {
        slowPrint("===QA04 HASTANESINI TERCIH ETTIGINIZ ICIN TESEKKÜR EDERIZ===",50);
        //System.exit(0); --> Kullanilabilir
    }
    public static void slowPrint(String text, int delay) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
        }