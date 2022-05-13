class Student
{
 private int rollno;
 private String name;
 void getData(int x,String str)
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
 void getMarks(int p,int c,int m)
 {
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
class SingleLevelInheritPrivate
{
 public static void main(String args[]) 
 {
  Marks k=new Marks();
  k.getData(123,"dipesh");
  k.getMarks(78,65,89);
  k.display();
 }
}