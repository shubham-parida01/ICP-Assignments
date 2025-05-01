class Node{
    protected int regn_no;
    protected float marks;
    protected Node next;

    public Node(int regn_no, float marks) {
        this.regn_no = regn_no;
        this.marks = marks;
        this.next = null;
    }
}   

class LinkedList{
    static Node head;
    public static void create(Node node){
        head = node;
    }
    public static Node InsBeg(Node node){
        node.next = head;
        head = node;
        return head;
    }
    public static Node InsEnd(Node node){
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = node;
        return head;
    }
    public static Node InsAny(Node node , int position){
        if (position == 0) {
            return InsBeg(node);
        }
        Node current = head;
        int count = 0;
        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }
        if (current != null) {
            node.next = current.next;
            current.next = node;
        }
        return head;
    }
    public static Node DelBeg(Node start) {
        if (start == null) {
            System.out.println("List is empty. Cannot delete.");
            return null;
        }
        return start.next;
    }

    public static Node DelEnd(Node start) {
        if (start == null) {
            System.out.println("List is empty. Cannot delete.");
            return null;
        }
        if (start.next == null) {
            return null;
        }
        Node current = start;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        return start;
    }

    public static Node DelAny(Node start, int position) {
        if (start == null) {
            System.out.println("List is empty. Cannot delete.");
            return null;
        }
        if (position == 0) {
            return DelBeg(start);
        }
        Node current = start;
        int count = 0;
        while (current.next != null && count < position - 1) {
            current = current.next;
            count++;
        }
        if (current.next == null) {
            System.out.println("Position out of bounds. Cannot delete.");
            return start;
        }
        current.next = current.next.next;
        return start;
    }

    public static Node DelByRegNo(Node start, int regn_no) {
        if (start == null) {
            System.out.println("List is empty. Cannot delete.");
            return null;
        }
        if (start.regn_no == regn_no) {
            return start.next;
        }
        Node current = start;
        while (current.next != null && current.next.regn_no != regn_no) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Node with registration number " + regn_no + " not found.");
            return start;
        }
        current.next = current.next.next;
        return start;
    }
    public static void search(Node start, int regn_no, float newMarks) {
        Node current = start;
        while (current != null) {
            if (current.regn_no == regn_no) {
                current.marks = newMarks;
                System.out.println("Marks updated for registration number " + regn_no);
                return;
            }
            current = current.next;
        }
        System.out.println("Node with registration number " + regn_no + " not found.");
    }

    public static void sort(Node start) {
        if (start == null || start.next == null) {
            return;
        }
        Node current, index;
        for (current = start; current != null; current = current.next) {
            for (index = current.next; index != null; index = index.next) {
                if (current.marks < index.marks) {
                    int tempRegnNo = current.regn_no;
                    float tempMarks = current.marks;
                    current.regn_no = index.regn_no;
                    current.marks = index.marks;
                    index.regn_no = tempRegnNo;
                    index.marks = tempMarks;
                }
            }
        }
    }

    public static int count(Node start) {
        int count = 0;
        Node current = start;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static Node reverse(Node start) {
        Node prev = null;
        Node current = start;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void display(Node start) {
        Node current = start;
        while (current != null) {
            System.out.println("Regn No: " + current.regn_no + ", Marks: " + current.marks);
            current = current.next;
        }
    }
}

public class Question1 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        Node start = null;
    
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create a new list");
            System.out.println("2. Insert at beginning");
            System.out.println("3. Insert at end");
            System.out.println("4. Insert at specific position");
            System.out.println("5. Delete from beginning");
            System.out.println("6. Delete from end");
            System.out.println("7. Delete from specific position");
            System.out.println("8. Delete by registration number");
            System.out.println("9. Search and update marks");
            System.out.println("10. Sort the list by marks");
            System.out.println("11. Count the nodes");
            System.out.println("12. Reverse the list");
            System.out.println("13. Display the list");
            System.out.println("14. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
    
            switch (choice) {
                case 1:
                    System.out.print("Enter registration number: ");
                    int regn_no = scanner.nextInt();
                    System.out.print("Enter marks: ");
                    float marks = scanner.nextFloat();
                    start = new Node(regn_no, marks);
                    LinkedList.create(start);
                    break;
                case 2:
                    System.out.print("Enter registration number: ");
                    regn_no = scanner.nextInt();
                    System.out.print("Enter marks: ");
                    marks = scanner.nextFloat();
                    start = LinkedList.InsBeg(new Node(regn_no, marks));
                    break;
                case 3:
                    System.out.print("Enter registration number: ");
                    regn_no = scanner.nextInt();
                    System.out.print("Enter marks: ");
                    marks = scanner.nextFloat();
                    start = LinkedList.InsEnd(new Node(regn_no, marks));
                    break;
                case 4:
                    System.out.print("Enter registration number: ");
                    regn_no = scanner.nextInt();
                    System.out.print("Enter marks: ");
                    marks = scanner.nextFloat();
                    System.out.print("Enter position: ");
                    int position = scanner.nextInt();
                    start = LinkedList.InsAny(new Node(regn_no, marks), position);
                    break;
                case 5:
                    start = LinkedList.DelBeg(start);
                    break;
                case 6:
                    start = LinkedList.DelEnd(start);
                    break;
                case 7:
                    System.out.print("Enter position: ");
                    position = scanner.nextInt();
                    start = LinkedList.DelAny(start, position);
                    break;
                case 8:
                    System.out.print("Enter registration number to delete: ");
                    regn_no = scanner.nextInt();
                    start = LinkedList.DelByRegNo(start, regn_no);
                    break;
                case 9:
                    System.out.print("Enter registration number to search: ");
                    regn_no = scanner.nextInt();
                    System.out.print("Enter new marks: ");
                    marks = scanner.nextFloat();
                    LinkedList.search(start, regn_no, marks);
                    break;
                case 10:
                    LinkedList.sort(start);
                    break;
                case 11:
                    System.out.println("Number of nodes: " + LinkedList.count(start));
                    break;
                case 12:
                    start = LinkedList.reverse(start);
                    break;
                case 13:
                    LinkedList.display(start);
                    break;
                case 14:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
}
