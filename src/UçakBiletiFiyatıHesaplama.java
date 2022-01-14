import java.util.Scanner;

public class UçakBiletiFiyatıHesaplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double ücret=0.10;
        double yaşİndirimi=0;
        double indirimliTutar=0;
        double çiftYönİndirim=0;
        double toplamTutar=0;
        System.out.println("Mesafeyi Km cinsinden giriniz: ");
        int mesafe=input.nextInt();
        System.out.println("Yaşınızı giriniz: ");
        int yaş=input.nextInt();
        System.out.println("Yolculuk tipini giriniz (1=> Tek Yön , 2=> Gidiş-Dönüş) : ");
        int yolculukTipi=input.nextInt();

        double normalTutar=ücret*mesafe;
        if(mesafe<0||yaş<0||yolculukTipi>2||yolculukTipi<1){
            System.out.println("Hatalı veri girdiniz!");

        }else {
            if(yaş<12){
                yaşİndirimi=normalTutar*0.50;
            }

            else if(yaş>=12&&yaş<=24){
                yaşİndirimi=normalTutar*0.10;
            }

            else if(yaş>65){
                yaşİndirimi=normalTutar*0.30;
            }else {
                toplamTutar=normalTutar;//
            }


            indirimliTutar=normalTutar-yaşİndirimi;

            if(yolculukTipi==2){
                çiftYönİndirim=indirimliTutar*0.20;
                toplamTutar=(indirimliTutar-çiftYönİndirim)*2;
                System.out.println("Toplam tutar: "+toplamTutar);

            }else{
                System.out.println("Toplam tutar: "+indirimliTutar);
            }


        }
    }
}
