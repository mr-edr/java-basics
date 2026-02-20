
import java.util.Scanner;

class node{
    int data;
    node next=null;
    public node(int data,node next) {
        this.data=data;
        this.next=next;
    }

    public static node create(int n){
        node head=new node(n,null);
        System.out.println("Created Linked list");
        display(head);
        return head;
    }

    public static void insert(node head,int n){
        if (head == null) {
        System.out.println("List is empty. Create list first.");
        return;
        }
        node point=head;
        while (point.next != null)
            point=point.next;
        node t=new node(n,null);
        point.next=t;
        System.out.println("Updated Linked list");
        display(head);
    }

    public static void display(node head){
        if (head == null) {
        System.out.println("List is empty. Create list first.");
        return;
        }
        node p=head;
        System.out.println("Elements in the linked list : ");
        while (p !=null){
            System.out.println(p.data);
            p=p.next;
        }
        System.out.println();
    }

    public static node delete(node head,int s){
        if (head == null) {
        System.out.println("List is empty. Create list first.");
        return head;
        }
        node p=head;
        node t=null;
        while(p.data!=s && p.next!=null){
            t=p;
            p=p.next;
        }
        if (p.data!=s){
            System.out.println(s+ " is not present in the linked list");
        }
        else if(p==head){
            head=head.next;
            System.out.println(s+ " is deleted\nUpdated linked list");
            display(head);
        }
        else if (p.next==null){
            t.next=null;
            System.out.println(s+ " is deleted\nUpdated linked list");
            display(head);
        }
        else{
            while(t.next!=p)
                t=t.next;
            t.next=p.next;
            System.out.println(s+ " is deleted\nUpdated linked list");
            display(head);

        }
        return head;
    }

    public static void search(node head,int s){
        if (head == null) {
        System.out.println("List is empty. Create list first.");
        return;
        }
        node p=head;
        int pos=1;
         while(p.data!=s && p.next!=null){
            p=p.next;
            pos++;
        }
        if (p.data!=s){
            System.out.println(s+ " is not present in the linked list");
        }
        else{
            System.out.println(s +" is present in the linked list at position : "+pos);
        }
    }
}


public class llist {
    public static void main(String[] args) {
        System.out.println("Linked list implementation");
        System.out.print("Choose your operation:\n\t1.Create\n\t2.Insert\n\t3.Delete,\n\t4.Search,\n\t5.Display\n\t6.Exit\n\nChoice : ");
        Scanner s=new Scanner(System.in);
        int ch=s.nextInt();
        node head=null;
        int n;
        while (ch!=6){
            switch (ch) {
                case 1:
                    System.out.print("Enter the first number : ");
                    n=s.nextInt();
                    head = node.create(n);
                    break;
                case 2:
                    System.out.print("Enter the number to be inserted : ");
                    n=s.nextInt();
                    node.insert(head, n);
                    break;
                case 3:
                    System.out.print("Enter the number to be deleted : ");
                    n=s.nextInt();
                    head = node.delete(head, n);
                    break;
                case 4:
                    System.out.print("Enter the number to be searched : ");
                    n=s.nextInt();
                    node.search(head, n);
                    break;
                case 5:
                    node.display(head);
                    break;
                default:
                    System.out.println("Enter a valid choice");
            }
            System.out.print("Choose your nextoperation:\n\t1.Create\n\t2.Insert\n\t3.Delete,\n\t4.Search,\n\t5.Display\n\t6.Exit\n\nChoice : ");
            ch=s.nextInt();
        }
     System.out.println("Goodbye!");
    }
}
