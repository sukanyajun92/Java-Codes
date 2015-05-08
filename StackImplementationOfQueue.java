/*
 * Implement Queue using stack.
 * Approach: In this method, in en-queue operation, the new element is entered at the top
 * of stack1. In de-queue operation, if stack2 is empty then all the elements are moved to
 * stack2 and finally top of stack2 is returned.

enQueue(q,  x)
  1) Push x to stack1 (assuming size of stacks is unlimited).

deQueue(q)
  1) If both stacks are empty then error.
  2) If stack2 is empty
       While stack1 is not empty, push everything from satck1 to stack2.
  3) Pop the element from stack2 and return it.
Method 2 is definitely better than method 1. Method 1 moves all the elements twice in enQueue
operation, while method 2 (in deQueue operation) moves the elements once and moves elements only
if stack2 empty.
 * Author: Sukanya Subramaniyan
 */

public class StackImplementationOfQueue 
{
	public static void main(String []  args)
	{
		
	}
	
	public void enQueue(Queue q, int data)
	{
		push(q.firstStack, data);
	}
	
	public int deQueue()
	{
		
		return 0;
	}
	
	public void push(Stack topReference, int data)
	{
		Stack newNode = new Stack();
		newNode.node = data;
		newNode.next = topReference;
		
		topReference = newNode;
	}
	
	public int pop(Stack topReference)
	{
		
		return 0;
	}
}

class Stack
{
	int node;
	Stack next;
}

class Queue
{
	Stack firstStack, secondStack;
}