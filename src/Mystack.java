public class Mystack {
    int arr[];
    int cap; //capacity
    int top; // top item
    Mystack(int c){ // we can not resize the array size
        // introduce arraylist cause we can use dynamic size
        top = -1;
        cap = c;
        arr = new int[cap];
    }

    void push(int x)
    {
        if (top == cap -1 ) throw new RuntimeException("underflow");
       top ++;
       arr[top] = x;

    }
    int pop(){

        int res = arr[top];
        top --;
        return res;
    }
    int peek(){
        return arr[top];
    }
    int size(){
        return top ++;
    }
    boolean isEmpty(){
        return (top == -1);
    }
}
