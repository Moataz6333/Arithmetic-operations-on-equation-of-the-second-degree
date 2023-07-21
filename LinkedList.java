 class LinkedList {
Node head;
int size;
public LinkedList(){
    head=null;
    size =0;
}
public boolean isEmpty(){
    return size==0;
}
public void add(int cofficient , int power){
    Node newNode = new Node(cofficient,power);
    if(isEmpty()){
        head=newNode;
    }else{
        Node current =head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }
    size++;
}
public void removeFirst(){
    if(isEmpty()){
        System.out.println("its Empty");
    }else {
        head=head.next;
        size--;
    }
}
public void removeLast(){
    if(isEmpty()){
        System.out.println("its Empty");
    } else if (head.next == null) {
        head=null;

    }else {
        Node pointer = head;
        while (pointer.next.next != null){
            pointer=pointer.next;
        }
        pointer.next=null;
    }
}

public boolean removeAt(int pos){
    if(pos<0 || pos >size-1 || head==null){
        return false;
    } else if (pos ==0) {
        head=head.next;
        return true;

    }else {
        Node tmp = head;
        for (int i =0 ; i < pos -1 ;i++){
            tmp =tmp.next;
        }
        if(tmp!= null){
            if(tmp.next!= null){
                tmp.next=tmp.next.next;
                return true;
            }else {
                removeLast();
                return true;
            }
        }
        return false;
    }

}
public int getPos(Node n){
    int e=0;
    Node curr = head;

        while (curr != n){
            curr=curr.next;
        e++;
    }
        return e;
}
public void Display() {
    for (Node i = head; i != null; i = i.next) {  //2X2-3x+4

        if(i.coff==0)
            return;
        else {
            switch (i.pow) {
                case 0:
                    if (i == head || i.coff < 0)
                        System.out.print(i.coff);
                    else
                        System.out.print("+" + i.coff);
                    break;

                case 1:
                    if (i == head || i.coff < 0)
                        System.out.print(i.coff + "X");
                    else
                        System.out.print("+" + i.coff + "X");
                    break;
                default:
                    if (i == head || i.coff < 0)
                        System.out.print(i.coff + "X"+i.pow);
                    else
                        System.out.print("+" + i.coff + "X"+i.pow);
                    break;

            }
        }

    }System.out.println();


}
}
