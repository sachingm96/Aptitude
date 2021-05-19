class Day{
static public void main(String [] a){

int day= 28;

if(day ==1 | day==8 | day==15 | day==22 | day==29) {
System.out.println("monday");
}
if(day ==2 | day==9 | day==16 | day==23 | day==30) {
System.out.println("tuesday");
}
if(day ==3 | day==10 | day==17 | day==24 | day==31) {
System.out.println("wednesday");
}
if(day ==4 | day==11 | day==18 | day==25) {
System.out.println("thursday");
}
if(day ==5 | day==12 | day==19 | day==26 ) {
System.out.println("friday");
}
if(day ==1 | day==13 | day==20 | day==27 ) {
System.out.println("saturday");
}
if(day ==1 | day==14 | day==21 | day==28 ) {
System.out.println("sunday");
}
if(day >=32 | day<=0) {
System.out.println("invalid date");
}
}
}