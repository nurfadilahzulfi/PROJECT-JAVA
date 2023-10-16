import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GetInputFromKeyboard {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String name = "";
        String umur = "";
        String alamat = "";

        System.out.println("Please Enter Your Name: ");
        System.out.println("Please Enter Your Umur: ");
        System.out.println("Please Enter Your Alamat: ");
        try {
            name = dataIn.readLine();
            umur = dataIn.readLine();
            alamat = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Error!");
        }

        System.out.println("Hello " + name + "!");
    }
}
