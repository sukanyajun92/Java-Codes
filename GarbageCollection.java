
public class GarbageCollection 
{
	static int objCount = 0;
	
	GarbageCollection()
	{
		System.out.println(objCount + " Object constructed");
		objCount++;
	}
	
	GarbageCollection go(GarbageCollection obj)
	{
		obj = null;
		return obj;
	}
	
	public void trial()
	{
		int arr[][] = new int[5][5];

        int[]arr1[] = new int[5][5];

	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		GarbageCollection coll1 = new GarbageCollection();
		GarbageCollection coll2 = new GarbageCollection();
		GarbageCollection coll3 = coll1.go(coll2);
	}
}
