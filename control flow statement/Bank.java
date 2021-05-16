class Bank{
static public void main(String [] a){
System.out.println("Started main method");
String accountType="saving";
if(accountType == "zero balance") {
System.out.println("required min balance=0");
}
else if(accountType=="saving") {
System.out.println("required min balance= 1000");
}
else if(accountType=="current") {
System.out.println("Required min balance= 2000");
}
else {
System.out.println("please enter valid accounType");
}
}
}