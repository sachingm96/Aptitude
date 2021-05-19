import java.util.Scanner;
class TriangleNum{

public static void main (String []a) {
Scanner s=new Scanner(System.in);
System.out.print( "enter the row ");
int row=s.nextInt();
for (int i=1; i<=row; i++){
for (int j=row; j>=i; j--){
System.out.print(" "+i );
}
System.out.println( );
}
}
}