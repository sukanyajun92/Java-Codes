import java.util.Arrays;

public class Trial 
{

	public int recursiveFunction(int n)
	{
		if((n == 1) || (n == 0))
			return -1;
		return recursiveFunction(n-1) + recursiveFunction(n-1);
	}
	public void tryM()
	{
		String s1 = new String("abc");
		String s2 = new String ("abc");
		
		if(s1.equals(s2))
			System.out.println("treue");
		
		else
			System.out.println("false");
		
		if(s1 == s2)
		{
			System.out.println("T");
		}
		
		else
			System.out.println("F");
	}
	public void matrixConcatenation()
	{
		int m1[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int m2[][] = {{10, 11, 12}, {13, 14, 15}};
		
		//int [][] concatenatedMatrix =(int [] []) ArrayUtils.addAll(m1 , m2);
	}
	
	public void add(String s1, String s2)
	{
		String s3 = new String();
		s3 = s1.concat(s2);
		
		System.out.println("Concatenated strings = " + s3);
	}
	
	public void add(int a, int b)
	{
		System.out.println("Sum of integers = " +(a + b));
	}
	
	public float add(float a, float b)
	{
		return a + b;
	}
	
	public float add(float a)
	{
		return (a + 10);
	}
	
	public void exceptionTrial()
	{
		try 
		{ 
		    int x = 0; 
		    int y = 5 / x; 
		} 
		catch (Exception e) 
		{
		    System.out.println("Exception"); 
		} 
		/*catch (ArithmeticException ae) 
		{
		    System.out.println(" Arithmetic Exception"); 
		} */
		System.out.println("finished");
	}
	
	public void anotherTrial()
	{
		 try 
	        {
	            badMethod();  
	            System.out.print("A"); 
	        }  
	        catch (Exception ex) 
	        {
	            System.out.print("B");  
	        } 
	        finally 
	        {
	            System.out.print("C"); 
	        } 
	        System.out.print("D"); 
	}
	
	public static void badMethod() 
	{
		throw new Error(); /* Line 22 */
	} 
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*int i = 1;
		i = i++ + ++i;
		
		System.out.println("i = " + i);*/
		Trial t = new Trial();
		t.add("Hello", " World!!!");
		t.add(5,6);
		
		System.out.println("Sum of float data types = " + t.add(5.6f,4.5f));
		System.out.println(" Another float add function " + t.add(10.12f));
	}
}
