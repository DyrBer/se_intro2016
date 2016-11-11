public class Main {
    public static void main(String[] arg) {
        System.out.println(pal("salgas"));
}
 
public static boolean pal(String n1) {
	boolean b = true;
    int i = 0;
    int k = 0; 
    for (i = 0 ; i < (n1.length()-1) ; i++)
 
        if ( (n1.charAt(i)) != (n1.charAt( (n1.length()-1-i) )) ) {
        k : k++;
    }
 
    b = ( k==0 ) ? true : false;
    return b;
}
}
