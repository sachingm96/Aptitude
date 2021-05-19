class Calendar{
public static void main(String []a) {

for (int num=1; num<=7; num++){
System.out.print( "  "+num);
}
System.out.println();

for (int num=8; num<=9; num++){
System.out.print( "  "+num);
}

for (int num=10; num<=14; num++){
System.out.print( " "+num);
}
System.out.println();

for (int num=15; num<=30; num++){
System.out.print( " "+num);
if(num==21){
System.out.println(" ");
}
if(num==28){
System.out.println(" ");
}

}
}
}