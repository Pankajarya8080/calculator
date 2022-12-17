import java.util.Scanner;
class Armstrong{
  static boolean Armstrong(int n, int copy, int count){
  
   
    if( n == 0){
      if(count==copy){

        return true;
      }
        return false;
    }
  
  
   int num = n % 10 ;
   count = count + num*num*num;
   return Armstrong(n/10,count,copy );
  }
  public static void main(String[] args) {
  Scanner k= new Scanner(System.in);
    System.out.println("Enter a number: ");
     int n = k.nextInt();
    boolean result = Armstrong(n,0,n);
  System.out.println(result? "ArmStrong Number": "Not ArmStrong Number");
  }
  
}

  
