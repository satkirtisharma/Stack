public class StackLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static class Stack{
        public static Node head;
        public void push(int data){
            Node n=new Node(data);
            if(head==null){
                head=n;
                return;
            }
         n.next=head;
            head=n;
        }
        public static boolean isempty(){
            return head==null;
        }
        public static int pop(){
            if (head==null){
                System.out.println("stack underflow");
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        public static int peek(){
            if (isempty()){
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        while (!s.isempty()){
            System.out.println(s.peek());
            s.pop();
        }
    }

}
