package x01_Learning;

public class x01_ImplementStackUsingArray {
   
	int[] arr ;
	int top;
	int capacity;
	
	public x01_ImplementStackUsingArray(int size) {
		// TODO Auto-generated constructor stub
		capacity= size;
		arr = new int[capacity];
		top=-1;
	}
	
	
    void  push(int a) {
	   if(isFull()) {
		   System.out.println("Size fulll");
		   
	   }
	   else {
		   top++;
		   arr[top]=a;
		   
	   }
   }
    void pop() {
	   if(isEmpty()) {
		   System.out.println("stack is empty");
	   }
	   else {
		   top--;
	   }
   }
    int  top() {
	   if(isEmpty()) {
		   System.out.println("stack is empty");
		   return 0;
	   }
	   
		   return arr[top];
	   
   }
   int size() {
	   return top+1;
   }
   
   boolean isEmpty() {
	   return top==-1;
   }
   boolean isFull() {
	   return top ==capacity-1;
   }
   void display() {
	   for(int i=0;i<=top;i++) {
		   System.out.print(arr[i]+" ");
	   }
	   System.out.println();
   }
	
   public static void main(String[] args) {
	  x01_ImplementStackUsingArray stack = new x01_ImplementStackUsingArray(5);
	   stack.push(6);
	   stack.push(7);
	   stack.push(8);
	   stack.push(9);
	   stack.push(0);
	   stack.push(1);
	   stack.display();
	   stack.pop();
	   stack.pop();
	  
	 
	   System.out.println(stack.top());
	   stack.display();
	   
	
}
}
