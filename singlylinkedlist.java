 class singlylinkedlist {
     Node head;
     private int size = 0;
     singlylinkedlist(){
         this.size =0;
     }
    class Node{
        String data;
        Node next;

        Node(String data)
        {
            this.data = data;
            //by default the next pointer will be null 
            this.next = null;
            size++;
        }
    }
    // add first function
    public void addFirst(String data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
            return; 
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
        
    }
    public void printList(){
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data+"-->");
            currNode = currNode.next;
            
        }
        System.out.print("NULL");
       
    }
    // delete first
    public void deleteFirst(){
        if(head==null){
            System.out.println("the given list is empty");
            return;
        }
        size--;
        head = head.next;

    }
    // delete last
    public void deleteLast(){
        if(head == null){
            System.out.println("the given list is empty");
            return;
        }
        size--;
        if(head.next==null)
        {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next !=null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next =null;
    }
    public int getSize()
    {
        return size;
    }
    public static void main(String[] args) {
        singlylinkedlist list = new singlylinkedlist();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.addLast("linked list");
        list.deleteFirst();
        list.deleteLast();
        list.addFirst("this");
        list.addLast("list");
        System.out.println(list.getSize());
        list.printList();

        
    }

    
}
