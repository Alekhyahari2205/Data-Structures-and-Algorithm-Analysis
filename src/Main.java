public class Main {
    public static void main(String[] args) {
        Mystack s = new Mystack(5);
        s.push(5);
        s.push(6);
        s.push(45);
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.isEmpty());

        arrayliststack d = new arrayliststack();
        d.push(5);
        d.push(6);
        d.push(45);
        System.out.println(d.pop());
        System.out.println(d.size());
        System.out.println(d.isEmpty());
    }
}