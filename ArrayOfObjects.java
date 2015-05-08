
public class ArrayOfObjects 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Object array[] = new Object[3];
        
        array[0] = new Integer(100);
        array[1] = new String("ABV");
        array[2] = new Float(3.55f);
        
       System.out.println("Elements in the array are ");
       for (int i = 0 ; i < array.length; i ++ )
       {
           System.out.println(array[i]);
       }
	}
}
