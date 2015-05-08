import java.awt.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class Codility 
{
	public int solution(int[] A)
    {
        // write your code in Java SE 8
		int equilibriumIndex = 0;
		int size = A.length;
		int sumFromFirst = 0, sumFromLast = 0;
		
		for (equilibriumIndex =0 ;equilibriumIndex < size ; equilibriumIndex++)
		{
			sumFromFirst = sumFromFirst + A[equilibriumIndex];
			sumFromLast = sumFromLast + A[size-1-equilibriumIndex];
			if(sumFromFirst == sumFromLast)
			{
				return equilibriumIndex;
			}
		}
		return -1;
    }
	
	public int solution1(int [] A, int [] B)
	{
		Set<Integer> intersection = new HashSet();
		int k = 0, min;
		
		for (int i = 1 ; i < A.length ; i++)
		{
			for (int j = 1; j<B.length ; j++)
			{
				if(A[i] == B[j])
				{
					intersection.add(A[i]);
				}
			}
		}
		
		if(intersection.isEmpty())
			return -1;
		
		return (Collections.min(intersection));
	}
	
	public int solution2(int[] A) 
	{
        int n = A.length;
        int i = n - 1;
        int result = -1;
        int k = 0, maximal = 0;
        
        while (i > 0) 
        {
            if (A[i] == 1) 
            {
                k = k + 1;
                if (k >= maximal) 
                {
                    maximal = k;
                    result = i;
                }
            }
            
            else
                k = 0;
            i = i - 1;
        }
        
        if (A[i] == 1 && k + 1 >= maximal)
            result = 0;
        
        return result;
    }
	
	public String solution3(String S)
	{
		String [] parts = S.split(" ");
		StringBuilder sbr =  new StringBuilder();
		
		for (String string : parts)
		{
			int length = string.length()-1;
			StringBuilder newString =  new StringBuilder();
			
			for (int i = length; i>=0; i--)
			{
				if((Character.isLowerCase(string.charAt(i))) || (Character.isWhitespace(string.charAt(i))))
					newString.append(string.charAt(i));
			}
			
			sbr.append(newString.toString() + " ");
		}
		
		String reversedString = sbr.toString().trim();
		
		return reversedString;
	}
	
	public int solution4(int [] A)
	{
		int n = A.length;
        int i = n - 1;
        int result = -1;
        int k = 0, maximal = 0;
        
        while (i > 0) 
        {
            if (A[i] == 1) 
            {
                k = k + 1;
                if (k >= maximal) 
                {
                    maximal = k;
                    result = i;
                }
            }
            
            else
                k = 0;
            i = i - 1;
        }
        
        if (A[i] == 1 && k + 1 >= maximal)
            result = 0;
		return 0;
	}
	
	public static void main(String[] args)
	{
		Codility challenge =  new Codility();
		
		int [] A = new int [1000];
		int [] B = new int [1000];
		int [] C = {1,1,1,1,1,0,0,0,0,0,1,1,1,1,0,0,0,0,1,1,1,1,1,0,0,0,1,1,1,0,1,1,1,1,1,1};
		String string = "we test coders contributed by stephen law of electrum";
		
		for (int i = 0; i < 1000; i ++)
		{
			A[i] = (2*i) + 1;
			B[i] = (3*i) - 2;
		}
		
		System.out.println("The reversed string is " + challenge.solution3(string));
		//System.out.println("The index of longest sequence of 1s = "+ challenge.solution2(C));
		//System.out.println("The minimum element in the array = " + challenge.solution1(A, B));
		//System.out.println("the equilibrium index = " + challenge.solution(A));
	}
}
