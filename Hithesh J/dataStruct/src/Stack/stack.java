package Stack;

public class stack {
    int stack[]=new int[5];
    int top=-1;
    int max=2;
    public void push(int el){
        if(top>max){
            System.out.println("overflow");
        }
        else {
            top = top + 1;
            stack[top] = el;
        }
    }
    public void pop(){if(top==-1){
        System.out.println("underflow");
    }
    else {
        int d = stack[top];
        System.out.println(d);
        top = top - 1;
    }
    }
    public void display(){
        if(top==-1){
            System.out.println("stack is empty");
        }
        else {
            System.out.println("the entered elements are:");
            for (int i = 0; i <= top; i++) {
                System.out.println(stack[i]);
            }
        }
    }
}
