import java.util.Scanner;
class student{
String usn;
String name;
void accept(){
Scanner sc= new Scanner(System.in);
System.out.print("emter usn:");
usn = sc.nextLine();
System.out.print("emter name:");
name = sc.nextLine();
}
void display(){
System.out.print("USN: " +usn);
System.out.print("Name: " +name);
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
student s1 = new student();
student s2 = new student();
System.out.println("enter details of the students:");
s1.accept();
System.out.println("enter details of the students:");
s2.accept();
System.out.println("student detalis:");
s1.display();
s2.display();
}
}


