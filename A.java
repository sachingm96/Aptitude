import java.util.Scanner;
class A {
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.print( "enter the no ");
int num=s.nextInt();
for(int i=1;i<=num;i++){
for(int j=1;j<=num;j++){
if(i==1|| j== 1 ||j==num||i==num/2+1)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}
}