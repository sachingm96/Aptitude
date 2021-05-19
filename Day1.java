class Day1{
static public void main(String [] a){

int day= -14;

if(day ==1 | day==8 | day==15 | day==22 | day==29) {
System.out.println("monday");
}
else if(day ==2 | day==9 | day==16 | day==23 | day==30) {
System.out.println("tuesday");
}
else if(day ==3 | day==10 | day==17 | day==24 | day==31) {
System.out.println("wednesday");
}
else if(day ==4 | day==11 | day==18 | day==25) {
System.out.println("thursday");
}
else if(day ==5 | day==12 | day==19 | day==26 ) {
System.out.println("friday");
}
else if(day ==1 | day==13 | day==20 | day==27 ) {
System.out.println("saturday");
}
else if(day ==1 | day==14 | day==21 | day==28 ) {
System.out.println("sunday");
}
else {
System.out.println("invalid date");
}
}
}