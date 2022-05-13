class Student
{
 private int rollno;
 private String name;
 Student(int x,String str)
 {
  rollno=x;
  name=str;
 }
 int putrollno()
 {
  return rollno;
 }
 String putname()
 {
  return name;
 }
}
class Marks extends Student
{
 private int phy,che,maths;
 Marks(int r,String s,int p,int c,int m)
 {
  super(r,s);
  phy=p;
  che=c;
  maths=m;
 }
 void display()
 {
  System.out.println("rollno:-"+putrollno());
  System.out.println("name:-"+putname());
  System.out.println("physics:-"+phy);
  System.out.println("chemistry:-"+che);
  System.out.println("mathematics:-"+maths);
 }
}
class SingleLevelInheriConstructor
{
 public static void main(String args[]) 
 {
  Marks k=new Marks(123,"raj",56,43,78);
  k.display();
 }
}