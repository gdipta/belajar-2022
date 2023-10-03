import java.util.Random;
import java.util.Scanner;

public class suitIndo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            String[] suit = {"gajah","orang","semut"};
            String lawan = suit[new Random().nextInt(suit.length)];
            String pemain;
            System.out.println("Selamat Datang di Permainan Suit Indonesia!");
            while(true){
                System.out.println("Pemain Silakan Pilih! (gajah/orang/semut): ");
                pemain = scanner.nextLine();
                if (pemain.equals("orang")||pemain.equals("gajah")||pemain.equals("semut")){
                    break;
                }
                System.out.println("Silakan Pilih Gajah/Orang/Semut!");
            }
            System.out.println("Lawan Memilih: "+ lawan);
            if (pemain.equals(lawan)){
                System.out.println("Permainan Seri!");
            } 
            else if (pemain.equals("gajah")){
                if (lawan.equals("semut")){
                    System.out.println("Yah Kamu Kalah :(");
                } 
                else if (lawan.equals("orang")){
                    System.out.println("Yay! Kamu Menang! B)");
                }
            } 
            else if (pemain.equals("semut")){
                if (lawan.equals("gajah")){
                    System.out.println("Yay! Kamu Menang! B)");
                } else if (lawan.equals("orang")){
                    System.out.println("Yah Kamu Kalah :(");
                }
            }
            else if (pemain.equals("orang")){
                if (lawan.equals("gajah")){
                    System.out.println("Yah Kamu Kalah :(");
                } else if (lawan.equals("semut")){
                    System.out.println("Yay! Kamu Menang! B)");
                }
            }
            System.out.println("Mau Main Lagi? (y/n): ");
            String cobalagi = scanner.nextLine();
            if (!cobalagi.equals("y")){
                break;
            }
        }
    }
}
