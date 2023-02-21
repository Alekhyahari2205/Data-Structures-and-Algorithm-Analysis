// Linkedlist implementation of stacks
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
class Linkedliststack {

    Node top;
    int siz ;
    Linkedliststack(){
        head = null;
        siz = 0;
    }
    int size(){
        return siz;
    }
    boolean isEmpty(){
        return (head == null);

    }
    public void push(int x){
        Node temp = new Node(x);
        if (temp == null){
            System.out.println("\n heap overflow");
            return;
        }
        temp.next = head;
        head = temp;
        siz ++;


    }
        // Utility function to return top element in a stack
     public int peek()
     {
            // check for empty stack
           if(head == null){
               return Integer.MAX_VALUE;
           }
           return head.data;
     }
        int pop() // remove at the beginning
        {
            // check for stack underflow
            if (head == null) {
                System.out.print("\nStack Underflow");
            }
            int res = head.data;
            head = head.next;
            siz --;
            return res;

        }




    Node head;
    int s;


}
