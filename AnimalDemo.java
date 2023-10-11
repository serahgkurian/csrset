import java.util.*;
class Animal
{
    int age,nolegs;
    String name;
    Animal(int age,int nolegs,String name)
    {
        this.age=age;
        this.nolegs=nolegs;
        this.name=name;
    }
    void getData()
    {
        System.out.println("name: "+name+"no. of legs: "+nolegs+"age: "+age);
    }
    void move()
    {
        System.out.println("moving");
    }
}
class Mammal extends Animal
{
    String type;
    int gest;
    Mammal(String type,int gest,int age,int nolegs,String name)
    {
        super(age,nolegs,name);
        this.type=type;
        this.gest=gest;
    }
    void getData()
    {
        super.getData();
        System.out.println("type: "+type+"gest: "+gest);
    }
    void giveBirth()
    {
        System.out.println("Giving birth");
    }
    void hi() 
    {
        System.out.println(super.name+" says hi!");
    }
}
class Nonmammal extends Animal
{
    int inc;
    Nonmammal(int inc,int age,int nolegs,String name)
    {
        super(age,nolegs,name);
        this.inc=inc;
    }
    void getData()
    {
        super.getData();
        System.out.println("incubation period: "+inc);
        
    }
    void layeggs()
    {
        System.out.println("laying eggs");
    }
    void hi() 
    {
        System.out.println(super.name+" says hi!");
    }
}

class AnimalDemo
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int age,nolegs;String name,type;int gest,inc;
		System.out.println("enter the following details: 1.age 2.no of legs 3.name 4.type 5.gestationperiod of your Mammal");
		age=scan.nextInt();
		nolegs=scan.nextInt();
		scan.nextLine();
		name=scan.nextLine();
		type=scan.nextLine();
		gest=scan.nextInt();
		Mammal m=new Mammal(type,gest,age,nolegs,name);
		m.getData();
		m.giveBirth();
		m.hi();
		System.out.println("enter the following details: 1.age 2.no of legs 3.name 4.incubation period of your NonMammal");
		age=scan.nextInt();
		nolegs=scan.nextInt();
		scan.nextLine();
		name=scan.nextLine();
		inc=scan.nextInt();
		Nonmammal n=new Nonmammal(inc,age,nolegs,name);
		n.getData();
		n.layeggs();
		n.hi();
	}
}
