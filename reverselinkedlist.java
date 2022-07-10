class reverselinkedlist {
    
        Node head;
        private int size = 0;
        reverselinkedlist(){
            this.size =0;
        }
       class Node{
           int data;
           Node next;
   
           Node(int data)
           {
               this.data = data;
               //by default the next pointer will be null 
               this.next = null;
               size++;
           }
       }
       // add first function
       public void addFirst(int data)
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
       public void addLast(int data){
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
       public void reverseIterate(){
           Node prevNode = head;
           Node currNode = head.next;
           while(currNode!=null){
               if(head ==null&&head.next==null){
                   return;

               }

               Node nextNode = currNode.next;
               currNode.next = prevNode;
               //
               prevNode = currNode;
               currNode = nextNode;
           }
           head.next = null;
           head = prevNode;


       }
       public static void main(String[] args) {
           reverselinkedlist list = new reverselinkedlist();
           list.addFirst(1);
           list.addFirst(2);
           list.addFirst(3);
           list.addFirst(4);
           list.reverseIterate();
           list.printList();
   
           
       }
   
       
   }
   

