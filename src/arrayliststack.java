import java.util.ArrayList;

public class arrayliststack {
    ArrayList<Integer> arr = new ArrayList<>();
     void push(int x){
         arr.add(x);
     }
     int pop(){
         int res = arr.get(arr.size()-1);
         arr.remove(arr.size()-1);
         return res;

     }
     int peek(){
         return arr.get(arr.size()-1);
     }
     boolean isEmpty(){
         return arr.isEmpty();
     }
     int size(){
         return arr.size() - 1;
     }
}
