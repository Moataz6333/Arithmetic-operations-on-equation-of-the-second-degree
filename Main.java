// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
LinkedList l1 = new LinkedList();
LinkedList l2 = new LinkedList();
Scanner c = new Scanner(System.in);
Scanner n = new Scanner(System.in);
boolean flag= true;

System.out.println("Enter the first polly :");
String st = c.next();
String terms []= st.split("\\+");

for(String x: terms){
    if(isContainX(x)) {
        //x = 12X3
        String cof[] = x.split("X");
        if(cof.length==0){
            l1.add(1,1);
        }
       else if (cof.length == 1) {
            l1.add(Integer.parseInt(cof[0]), 1);
        } else if (cof.length == 2) {
            l1.add(Integer.parseInt(cof[0]), Integer.parseInt(cof[1]));
        }
    }else {
        l1.add(Integer.parseInt(x),0);

    }}

        System.out.println("Enter the second polly :");
        String st2 = c.next();
        String terms2 []= st2.split("\\+");
        for(String x: terms2){

            if(isContainX(x)) {
                //x = 12X3
                String cof2[] = x.split("X");
                if(cof2.length==0){
                    l2.add(1,1);
                }
                else if (cof2.length == 1) {
                    l2.add(Integer.parseInt(cof2[0]), 1);
                } else if (cof2.length == 2) {
                    l2.add(Integer.parseInt(cof2[0]), Integer.parseInt(cof2[1]));
                }
            }else {
                l2.add(Integer.parseInt(x),0);

            }}




        while (flag) {
            System.out.println("For evaluate a pollynomial press :1 \n For Multiplication  press : 2 \n For the sum  press :3 \n For the substract press :4 \n For end the programe press 5");
            int i = n.nextInt();
            switch (i) {
                case 1:
                    System.out.print("Enter the value of X  :  ");
                    int x = n.nextInt();
                    System.out.print("For evaluating the 1st polly press 1, for the 2nd press 2 ");
                    int l = n.nextInt();
                    if (l == 1) {
                        evaluate(l1, x);
                    } else if (l == 2) {
                        evaluate(l2, x);

                    }
                    System.out.println();
                    break;
                case 2:
                    multOfTwoPolly(l1, l2);
                    System.out.println();
                    break;
                case 3:
                    addition(l1, l2);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("if you want l1-l2 press 1  , if ypu want l2-l1 press 2");
                    int t = n.nextInt();
                    if(t== 1) {
                        substract(l1, l2);
                    } else if (t==2) {
                        substract(l2, l1);
                    }

                    System.out.println();
                    break;
                case 5 :
                    flag = false;
                    break;
                default:
                    break;
            }
        }
    }
    public static void evaluate(LinkedList y , double x){
        double n =0;
        Node curr = y.head;
        while (curr != null){
    n += curr.coff*(Math.pow(x, curr.pow));
    curr=curr.next;

        }
        System.out.println("the result is : "+ n);
    }


    public static void multOfTwoPolly(LinkedList l, LinkedList p){
        LinkedList N = new LinkedList();
        for (Node i = l.head ; i != null ; i=i.next){
            for(Node j = p.head ; j != null ; j=j.next){
                N.add((i.coff*j.coff),(i.pow+j.pow));
            }
        }
for(Node i = N.head ; i != null ; i=i.next){
   for (Node j = i.next ; j != null ; j =j.next){
       if(i.pow == j.pow){
           i.coff= i.coff+ j.coff;
           N.removeAt(N.getPos(j));
       }
   }
}

        N.Display();
    }
    public static void addition(LinkedList l, LinkedList p){
        LinkedList N = new LinkedList();
      for(Node i =l.head ; i!= null ; i= i.next ){
          N.add(i.coff,i.pow);
      }
        for(Node i =p.head ; i!= null ; i= i.next ){
            N.add(i.coff,i.pow);
        }
        for(Node i = N.head ; i!= null ; i=i.next){
            for (Node j = i.next ; j != null ; j =j.next){   //2x2 + 3X1 + 4X1 + 4x0
                if(i.pow == j.pow){
                    i.coff= i.coff+ j.coff;
                    N.removeAt(N.getPos(j));
                }
            }
        }
        N.Display();



    }

    public static void substract(LinkedList l,LinkedList p){
        LinkedList N = new LinkedList();
        for(Node i =l.head ; i!= null ; i= i.next ){
            N.add(i.coff,i.pow);
        }
        for(Node i =p.head ; i!= null ; i= i.next ){
            N.add(-i.coff,i.pow);
        }
        for(Node i = N.head ; i!= null ; i=i.next){
            for (Node j = i.next ; j != null ; j =j.next){
                if(i.pow == j.pow){
                    i.coff= i.coff+ j.coff;
                    N.removeAt(N.getPos(j));
                }
            }
        }
        N.Display();



    }
    public static boolean isContainX(String s){
        boolean flag= false;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='X'){
                flag=true;
                break;
            }

        }
        return flag;
    }
}

