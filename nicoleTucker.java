import java.util.Stack;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;


public class nicoleTucker 
{
	public int solution(String S)
	{
		Stack stack = new Stack();
		int Stacksize = 200000;
		
		for (int i = 0; i < S.length(); i++)
		{
			char ch = S.charAt(i);
			System.out.println("the character is " + ch);
			
			if(Character.isDigit(ch))
			{
				if(stack.size() <= Stacksize) 
				{
					System.out.println("pushing int " + ch);
					stack.push((Object)ch);
				}
				
				else
				{
					return -1;
				}
				
			}
			
			else if (ch == '+')
			{
				int operand1 = -1, operand2 = -1;
				if(!stack.isEmpty())
				{
					//System.out.println("size of stack = " + stack.size());
					try
					{
						if(stack.peek() instanceof Character)
						{
							operand1 = Character.getNumericValue((Character)stack.pop());
							if(stack.peek() instanceof Character)
							{
								operand2 = Character.getNumericValue((Character)stack.pop());
							}
								
						}
						
						else
						{
							operand1 = (Integer)stack.pop();
							if(stack.peek() instanceof Character)
							{
								operand2 = Character.getNumericValue((Character)stack.pop());
							}
						}
					}
					
					catch(Exception e)
					{
						e.printStackTrace();
						return -1;
					}
				}
				
				int result = 0;
				
				if(operand1>0 && operand2>0)
				{
					result = operand1 + operand2;
					try
					{
						System.out.println("Pushing value = " + result);
						stack.push((Object)result);
					}
					
					catch (Exception e)
					{
						e.printStackTrace();
						return -1;
					}
				}
			}
			
			else if (ch == '*')
			{
				int operand1 = -1, operand2 = -1;
				if(!stack.isEmpty())
				{
					try
					{
						operand1 = Character.getNumericValue((Character) stack.pop());
						operand2 = Character.getNumericValue((Character) stack.pop());
					}
					
					catch(Exception e)
					{
						e.printStackTrace();
						return -1;
					}
				}
				
				int result = 0;
				
				if(operand1>0 && operand2>0)
				{
					result = operand1 * operand2;
					try
					{
						System.out.println("Pushing value = " + result);
						stack.push((Object)result);
					}
					
					catch (Exception e)
					{
						return -1;
					}
				}
			}
		}
		
		if(stack.isEmpty())
		{
			return -1;
		}
		return (Integer) stack.peek();
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String string = "13+62*7+*";
		nicoleTucker nicole = new nicoleTucker();
		
		System.out.println("Result = " + nicole.solution(string));
	}
}


