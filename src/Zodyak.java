import java.util.Scanner;

public class Zodyak {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Doğum yılınızı giriniz: ");
        int doğumyılı=input.nextInt();

        switch (doğumyılı%12){
            case 0:
                String burc="Maymun";
                System.out.println("Çin Zodyağı Burcunuz: "+burc);
                break;
            case 1:
                String burc1="Horoz";
                System.out.println("Çin Zodyağı Burcunuz: "+burc1);
                break;
            case 2:
                String burc3="Köpek";
                System.out.println("Çin Zodyağı Burcunuz: "+burc3);
                break;
            case 3:
                String burc4="Domuz";
                System.out.println("Çin Zodyağı Burcunuz: "+burc4);
                break;
            case 4:
                String burc5="Fare";
                System.out.println("Çin Zodyağı Burcunuz: "+burc5);
                break;
            case 5:
                String burc6="Öküz";
                System.out.println("Çin Zodyağı Burcunuz: "+burc6);
                break;
            case 6:
                String burc7="kaplan";
                System.out.println("Çin Zodyağı Burcunuz: "+burc7);
                break;
            case 7:
                String burc8="Tavşan";
                System.out.println("Çin Zodyağı Burcunuz: "+burc8);
                break;
            case 8:
                String burc9="Ejderha";
                System.out.println("Çin Zodyağı Burcunuz: "+burc9);
                break;
            case 9:
                String burc10="Yılan";
                System.out.println("Çin Zodyağı Burcunuz: "+burc10);
                break;
            case 10:
                String burc11="At";
                System.out.println("Çin Zodyağı Burcunuz: "+burc11);
                break;
            default:
                String burc12="Koyun";
                System.out.println("Çin Zodyağı Burcunuz: "+burc12);


        }

    }
}
