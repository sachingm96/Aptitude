import java.util.Scanner;
class TriangleNum1{

public static void main (String []a) {
Scanner s=new Scanner(System.in);
System.out.print( "enter the row ");
int row=s.nextInt();
for (int i=1; i<=row; i++){
for (int j=1; j<=row; j++){
if (i<=j){
System.out.print(i);
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
}
}