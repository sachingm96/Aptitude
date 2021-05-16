import java.util.Scanner;
class Diamond{

public static void main (String []args) {
Scanner s=new Scanner(System.in);
System.out.print( "enter the row ");
int row=s.nextInt();
int num=row/2;

for (int i=1; i<=row; i++){
for (int j=1; j<=row; j++){
if((j<=num)!=false ||j>row-num){
System.out.print("@"+" ");
}
else
{
System.out.print("*"+" ");
}
}
System.out.println();
if(i<=row/2)
num--;
else
num++;
}
}
}