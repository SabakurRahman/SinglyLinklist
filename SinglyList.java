public class SinglyList{
    
    Node head;
    public class Node{
          int data;
          Node next;
        Node(int data){
            this.data=data;
            this.next=null;

        }
    }




    public void addFrist(int data){
        Node newNode = new Node(data);
        if(head==null){
         head= newNode;
         return;
        }

        newNode.next=head;
        head=newNode;


    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currentNode=head;
        while(currentNode.next !=null){
            currentNode=currentNode.next;
        }
         currentNode.next=newNode;


    }

    public void sprintList(){
        Node currentNode = head;
        if(head==null){
            System.out.println("List is empty");
        }
      
        while(currentNode !=null){
            System.out.print(currentNode.data+"->");
            currentNode = currentNode.next;

        }
        System.out.println("Null");

    }

    public static void main(String[] args) {
      
        SinglyList list = new SinglyList();
          list.addFrist(2);
          list.addFrist(1);
          list.sprintList();
          list.addLast(3);
          list.sprintList();

          list.addFrist(0);
          list.sprintList();
        
        
    }

}