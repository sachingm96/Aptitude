import java.util.Scanner;
class ABCD{

public static void main (String []args) {
Scanner s=new Scanner(System.in);
System.out.print( "enter the no of alphabet ");
int row=s.nextInt();
for (int i=0; i<=row-1; i++){
System.out.println((char)(i+65));
}
System.out.println();
}
}