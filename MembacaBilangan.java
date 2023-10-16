import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Ambil Sebuah angka sebagai input dari user, dan outputnya berupa kata yang
 * dengan angka. angka yang dimasukkan antara 1-10. jika user memasukkan nilai tidak
 * sesuai berikan output "invalid number"
 * 1. Gunakan statement if-else untuk menyelesaikan
 * 2. Gunakan statement switch untuk menyelesaikan
 */
public class MembacaBilangan {
    public static void main(String args[]) {
        int input;
        
        BufferedReader dataIn = new BufferedReader (new InputStreamReader(System.in));
        
        
        try{
            System.out.print("Input your number : ");
            input = Integer.parseInt(dataIn.readLine());
            
            if(input==1){
                System.out.println("Satu");
            }
            else if(input==2){
                System.out.println("Dua");
            }
            else if(input==3){
                System.out.println("Tiga");
            }
            else if(input==4){
                System.out.println("Empat");
            }
            else if(input==5){
                System.out.println("Lima");
            }
            else if(input==6){
                System.out.println("Enam");
            }
            else if(input==7){
                System.out.println("Tujuh");
            }
            else if(input==8){
                System.out.println("Delapan");
            }
            else if(input==9){
                System.out.println("Sembilan");
            }
            else if(input==10){
                System.out.println("Sepuluh");
            }
            else{
                System.out.println("Invalid Number!");
            }
        }catch( IOException e){
                System.out.println("Error");
        }
    }
}
