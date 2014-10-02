import TerminalIO.*;
public class MakeEmployees {

    public static void main(String[] args) {
        KeyboardReader kr = new KeyboardReader();
        String name = kr.readLine("Enter employee name: ");
        System.out.println("Employee's name is: "+name);
        
    }
    
}
