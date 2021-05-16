import java.util.Scanner;
class TriangleNum3{

public static void main (String []a) {
Scanner s=new Scanner(System.in);
System.out.print( "enter the row ");
int row=s.nextInt();
int num=2;
for (int i=1; i<=row; i++){
for (int j=1; j<=row; j++){
if (j==3 || i==j || i+j==row+1)
{
System.out.print(num+"   ");
num=num+2;
}
else
{
System.out.print("    ");
}
}
System.out.println( );
}
}
}