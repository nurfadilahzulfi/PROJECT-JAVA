import javax.swing.JOptionPane;
public class GetInputFromKeyboard1
{
public static void main( String[] args ){
    
    String name = "";
    
    name = JoptionPane.showInputDialog("Please enter your name");
    
    String msg = "Hello " + name + "!";
    JOptionPane.showMessageDialog(null, msg);
}
}