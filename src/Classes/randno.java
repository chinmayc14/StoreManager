
package Classes;
import java.util.*;
public class randno {
    public static int randnoo(int n ){
        int m = (int) Math.pow(10, n-1);
        return m + new Random().nextInt(9*m);
    }
//    public String getOTP(){
//        
//    }
    
}
