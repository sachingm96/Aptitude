import java.util.Scanner;
class SandTriangle{

public static void main (String []a) {
Scanner s=new Scanner(System.in);
System.out.print( "enter the row ");
int row=s.nextInt();

for (int i=1; i<=row; i++){
for (int j=1; j<=row; j++){
if((i>=j && i+j<=row+1)|| (i<=j && i+j>=row+1)){
System.out.print(i+""+j+" ");
}
else
{
System.out.print("   ");
}
}
System.out.println( );
}
}
}