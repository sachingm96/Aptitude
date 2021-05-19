class ArraysExample{
public static void main(String[] args) {
int [] age={ 5,10,15,20,25};
int[] marks= new int[4];

System.out.println(age[2]);
age[2]=1;
System.out.println(age[2]);

System.out.println(marks[3]);


System.out.println("length of marks are " +marks.length);
System.out.println(age);
System.out.println(marks);

for (int i=0; i<age.length; i++)
{
System.out.println( " age are "+age[i]);
}
for (int i=0; i<marks.length; i++)
{
System.out.println( " marks are "+marks[i]);
}
}
}