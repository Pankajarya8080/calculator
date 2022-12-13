import java.util.Scanner;
public class Enhanceforloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();
    System.out.println(name);
    String nameArr[] = name.split(" ");
    String fullName ="";
    
    for(String word : nameArr)
    {
    String n = String.valueOf(word.charAt( 0)).toUpperCase() + word.substring(1).toLowerCase();
    fullName = fullName + n + " ";   
        
    }    
    System.out.println(fullName);
    scanner.close();
    }
    
}
