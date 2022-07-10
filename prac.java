class prac{
    Node head;
    private int size = 0;
    prac(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
        
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void addFirst(String data )
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }
    public void addLast(String data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null)
        {
            currNode = currNode.next;

        }
        currNode.next = newNode;

    }
    public void printList(){
        Node currNode = head;
        if(head == null){
            System.out.println("List is empty ");
        }
        while(currNode!= null)
        {
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.print("NULL");
        System.out.println("");
    }
    public void deleteFirst(){
        
        if(head==null){
            System.out.println("list is empty");

        }
        size--;
        head = head.next;

    }
    public void deleteLast(){
        if(head == null){
            System.out.println("list is empty");
        }
        size--;
        if(head.next==null){
            head = null;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next!=null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next= null;
    }
    public int getSize()
    {
        return size;
    }
    public void reverseIterate(){
        if(head==null || head.next == null){
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while(currNode!=null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;

        }
        head.next = null;
        head = prevNode;

    }
    public Node reverseRecursive(Node head){
        if(head == null||head.next == null)
        {
            return head;
        }

        Node newHead = reverseRecursive(head.next);
        head.next.next= head;
        head.next = null;
        return newHead;
    }
    public static void main(String[] args) {
        prac list = new prac();
      //
       //
        System.out.println(list.getSize());  
        list.reverseIterate();
        list.printList();
        list.head =  list.reverseRecursive(list.head);
        list.printList();
    }

    
}