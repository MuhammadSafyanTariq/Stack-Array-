class Stack{
  int stack[]=new int[100];
  int top=-1;

public boolean isEmpty () {
  return top==-1;
}
  

    public void push(int data){
      
stack[++top]=data;
      
    }

  public void display () {
    int i=top;
    while(i>-1){
System.out.println(stack[i]);
      i--;
    }
  }
public int peek() {
  return stack[top];
}
public int pop() {
  int c=stack[top];
  top--;
  return c;
}
}


class Main {
  public static void main(String[] args) {
    Stack st=new Stack() ;
    st. push(1) ;
    st. push(2) ;
    st. push(1) ;
    st. push(4) ;
    st. display () ;
  }
}