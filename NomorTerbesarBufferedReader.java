import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class NomorTerbesarBufferedReader {
    public static void main(String args[]) {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
     
        try{
        int elemen = 10;
        int i = 0;
        int terbesar;
        int[] input = new int[elemen];
        
            while(i<elemen){
                System.out.print("Masukkan nilai ke-" + i + ": ");
                input[i] = Integer.parseInt(reader.readLine());
                i++;
            }
            System.out.print("Isi array :");
            for(i=0; i<elemen; i++){
                System.out.print(input[i]+" ");
            }
            terbesar = input[0];
            for(i=1; i<elemen; i++){
                if(input[i]>terbesar){
                    terbesar = input[i];
                }
            }
            System.out.print("\nNilai terbesar : "+terbesar);
        }catch(IOException e){
            System.out.println("Error");
        }
    }
}
