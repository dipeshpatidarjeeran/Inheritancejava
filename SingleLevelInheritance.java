class Student
{
 int rollno;
 String name;
 void getData(int x,String str)
 {
  rollno=x;
  name=str;
 }
}
class Marks extends Student
{
 int phy,che,maths;
 void getMarks(int p,int c,int m)
 {
  phy=p;
  che=c;
  maths=m;
 }
 void display()
 {
  System.out.println("rollno:-"+rollno);
  System.out.println("name:-"+name);
  System.out.println("physics:-"+phy);
  System.out.println("chemistry:-"+che);
  System.out.println("mathematics:-"+maths);
 }
}
class SingleLevelInheritance
{
 public static void main(String args[]) 
 {
  Marks k=new Marks();
  k.getData(123,"dipesh");
  k.getMarks(78,65,89);
  k.display();
 }
}