/*
 * design and implement a calculator that can calculate expressions like: 
+ 2 4 
* 8 ( + 7 12) 
( + 7 ( * 8 12 ) ( * 2 (+ 9 4) 7 ) 3 ) 
 */
public class GoogleCodingChallenge 
{
	public void Calculator(String expression)
	{
		StackImpl stack = new StackImpl(expression.length());
		StringBuilder sbr = new StringBuilder();
		
		for (int i = 0 ; i < expression.length() ; i ++)
		{
			char ch = expression.charAt(i);
			if(!Character.isDigit(ch))
			{
				if(stack.getSize() != expression.length())
				{
					stack.push(ch);
				}
			}
			
			else
			{
				sbr.append(ch);
			}
		}
	}
}

class StackImpl
{
	Node top;
	int size;
	
	StackImpl()
	{
		top= new Node();
	}
	
	StackImpl(int size)
	{
		this.size = size;
	}
	
	public void push(char character)
	{
			Node newNode = new Node(character);
			top.next = newNode;
			top = newNode;
	}
	
	public char pop()
	{
		if(top != null)
		{
			size--;
			char charac = top.ch;
			top = top.next;
			
			return charac;
		}
		
		return '\0';
	}
	
	public char peek()
	{
		if(top != null)
		{
			return top.ch;
		}
		
		return '\0';
	}
	
	public int getSize()
	{
		return this.size;
	}
}

class Node
{
	char ch;
	Node next;
	
	Node()
	{
		this.ch = '\0';
		next = null;
	}
	
	Node(char ch)
	{
		this.ch = ch;
		this.next = null;
	}
	
	Node(char ch , Node next)
	{
		this.ch = ch;
		this.next = next;
	}
}