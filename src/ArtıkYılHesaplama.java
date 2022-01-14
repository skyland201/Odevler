import java.util.Scanner;

public class ArtıkYılHesaplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Yıl giriniz: ");

         int yıl=input.nextInt();
        if(yıl%4==0){
            if(yıl%100==0){
                if(yıl%400==0)
                    System.out.println(yıl+" artık yıldır.");
                else
                    System.out.println(yıl+" artık yıl değildir.");
            }else{
                System.out.println(yıl+" artık yıldır.");
            }
        }else{
            System.out.println(yıl+" artık yıl değildir.");
        }


    }
}
