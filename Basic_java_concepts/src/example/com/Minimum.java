package example.com;

/* 
Minimum of four numbers

*/
public class Minimum {
    static int Minimum;
    public static int min(int a, int b, int c, int d) {
        //write your code here
  /*       
    if (a < b && a < c && a < d)
        Minimum= a;
    if (b < a && b < c && b < d)
        Minimum = b;
    if (c < a && c < b && c < d)
        Minimum = c;
    if (d < b && d < c && d < a)
        Minimum =d;
   */
    	
    	if((min(a,b)) <min(c,d))
    		Minimum=min(a,b);
    	else if((min(a,b)) > min(c,d))
    		Minimum=min(c,d);
        
    	return Minimum;
    }

    public static int min(int a, int b) {
        //write your code here
        if (a > b )
        return b;
        else
        return a;

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
        System.out.println(min(-40, -10, -30, 40));
    }
}
