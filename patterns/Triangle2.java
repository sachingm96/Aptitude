import java.util.Scanner;
class Triangle2{

public static void main (String []args) {
Scanner s=new Scanner(System.in);
System.out.print( "enter the row ");
int row=s.nextInt();
for (int i=0; i<=row-1; i++){
for (int j=0; j<=i; j++){
System.out.print(" ");
}
for (int k=0; k<=row-1-i; k++){
System.out.print("*"+" ");
}

System.out.println( );
}
}
}