import java.util.Scanner;
class Fibonacci{

public static void main (String []args) {
Scanner s=new Scanner(System.in);
System.out.print( "enter the num ");
int num=s.nextInt();
int a=0;
int b=1;

for (int i=0; i<num; i++){
System.out.print(" "+a);
int c=a+b;
a=b;
b=c;
}
}
}