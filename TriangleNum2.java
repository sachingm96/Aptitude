
import java.util.Scanner;
class TriangleNum2{

public static void main (String []a) {
Scanner s=new Scanner(System.in);
System.out.print( "enter the row ");
int row=s.nextInt();
int num=4;
for (int i=row; i>=1; i--){
for (int j=1; j<=row; j++){
if(i<=j)
{
System.out.print(j);
}
else
{
System.out.print(" ");
}
}
System.out.println( );
}
}
}