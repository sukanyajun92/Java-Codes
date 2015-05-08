public class Mergesort 
{
	static int array[] = {10,2,5,7,51,8,6};
	
	public void mergeSort(int p, int r)
	{
		int mid = (p + r) /2;
		
		mergeSort(p,mid);
		mergeSort(mid + 1, r);
		merge(p, mid, r);
	}
	
	public void merge(int p , int mid, int r)
	{
		int B[] = new int[array.length];
		int ip = p, iq = mid+1, i = 0;
		
		if((ip <= mid) && ((iq > r ) || (array[ip] <= array[iq])))
		{
			B[i] = array[ip];
			i++;
			ip++;
		}
		
		else
		{
			B[i] = array[iq];
			i++;
			iq++;
		}
		
		System.arraycopy(B, 0, array, 0, array.length);
		printArray(array);
	}
	
	public void printArray(int array[])
	{
		System.out.println("Elements in the array are ");
		for (int i = 0 ; i < array.length ; i ++)
		{
			System.out.print(array[i] + " ");
		}
	}
	
	public static void main(String[] args)
	{
		Mergesort me = new Mergesort();
		me.mergeSort(0, array.length);
	}
}
