public class OddSum{
    static int OddSum(int n, int b, int c){
        // 1 to 20 between sum of odd number
        if(b>19){
            System.out.println(c);
            return 1;
        
        }
        else{
            b=2*n-1;
            c+=b;
            return OddSum((n+1),b,c);

        }
    }
    public static void main(String[] args){
        OddSum k = new OddSum();
        k.OddSum(0,1,1);
    }
}