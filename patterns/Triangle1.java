import java.util.Scanner;
class Triangle1{

public static void main (String []a) {
Scanner s=new Scanner(System.in);
System.out.print( "enter the row ");
int row=s.nextInt();

for (int i=1; i<=row; i++){
for (int j=row; j>=1; j--){
System.out.print("* " );
}
System.out.println( );
}
}
}