
public class LearningJava 
{
	static int x = 10;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a[] = { 1,2,3,4};
		System.out.println(a instanceof Object);
		
		int array[] = { 1,2,053,4};
		int b[][] = { {1,2,4} , {2,2,1},{0,43,2}};
		
		System.out.println(array[3]==b[0][2] );
		System.out.print(" " + (array[2]==b[2][1]));
		
		for (int x = 0; x < 5; x++)
		{
			//System.out.println("\n%%%%%" + x);
		}
		
		System.out.println("$$$$ " + x);
		
		System.out.println("\n************************************");
		Person p1 = new Person("John" , 10);
		
		LearningJava java = new LearningJava();
		Person p2 = java.change(p1);
		
		System.out.println("Person p2 " + p2.name + "$$$" + p2.age);
		System.out.println("Person p1 " + p1.name + "%%%" + p1.age);
		
		System.out.println("-----------------------------------------");
		
		String s = "Java"; 
		String str = s.concat("JE 6");
		
		System.out.println(s.concat("JE 6"));
		System.out.println(str.replace('6' , '7'));
		System.out.println("string = " + s);
	}
	
	private Person change(Object o)
	{
		Person p2 = (Person) o;
		p2.age = 25;
		
		return p2;
	}
}

class Person
{
	Person(String s, int i)
	{
		++pid;
		name = s;
		age = i;
	}
	
	static int pid;
	String name;
	int age;
}
