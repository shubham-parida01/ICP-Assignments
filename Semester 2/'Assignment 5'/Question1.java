import java.util.Scanner;

class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;
    protected Node prev;
}

public class DLinkedList {

    public static Node create(Node start, Node end) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter registration number: ");
        int regd = sc.nextInt();
        System.out.print("Enter mark: ");
        float mark = sc.nextFloat();
        Node newNode = new Node();
        newNode.regd_no = regd;
        newNode.mark = mark;
        newNode.next = null;
        newNode.prev = end;
        if (start == null) {
            start = newNode;
        } else {
            end.next = newNode;
        }
        return newNode; // return updated end
    }

    public static void display(Node start, Node end) {
        if (start == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = start;
        System.out.println("Student List:");
        while (temp != null) {
            System.out.println("Regd No: " + temp.regd_no + ", Mark: " + temp.mark);
            temp = temp.next;
        }
    }

    public static Node insBeg(Node start, Node end) {
        Scanner sc = new Scanner(System.in);
        Node newNode = new Node();
        System.out.print("Enter registration number: ");
        newNode.regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        newNode.mark = sc.nextFloat();
        newNode.next = start;
        newNode.prev = null;
        if (start != null) {
            start.prev = newNode;
        } else {
            end = newNode;
        }
        return newNode;
    }

    public static Node insEnd(Node start, Node end) {
        return create(start, end); // same as create
    }

    public static Node insAny(Node start, Node end) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter position to insert: ");
        int pos = sc.nextInt();
        if (pos <= 1 || start == null) {
            return insBeg(start, end);
        }

        Node temp = start;
        for (int i = 1; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        Node newNode = new Node();
        System.out.print("Enter registration number: ");
        newNode.regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        newNode.mark = sc.nextFloat();

        newNode.next = temp.next;
        newNode.prev = temp;
        if (temp.next != null) {
            temp.next.prev = newNode;
        } else {
            end = newNode;
        }
        temp.next = newNode;
        return start;
    }

    public static Node delBeg(Node start, Node end) {
        if (start == null) {
            System.out.println("List is empty.");
            return null;
        }
        Node temp = start;
        start = start.next;
        if (start != null) {
            start.prev = null;
        } else {
            end = null;
        }
        temp = null;
        return start;
    }

    public static Node delEnd(Node start, Node end) {
        if (end == null) {
            System.out.println("List is empty.");
            return null;
        }
        if (end.prev != null) {
            end.prev.next = null;
            end = end.prev;
        } else {
            start = end = null;
        }
        return start;
    }

    public static Node delAny(Node start, Node end) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter position to delete: ");
        int pos = sc.nextInt();

        if (pos <= 1) {
            return delBeg(start, end);
        }

        Node temp = start;
        for (int i = 1; i < pos && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position not found.");
            return start;
        }

        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        } else {
            end = temp.prev;
        }
        if (temp == start) {
            start = temp.next;
        }
        temp = null;
        return start;
    }

    public static void search(Node start) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter regd_no to search: ");
        int regd = sc.nextInt();
        Node temp = start;
        while (temp != null) {
            if (temp.regd_no == regd) {
                System.out.println("Record found. Current mark: " + temp.mark);
                System.out.print("Enter new mark: ");
                temp.mark = sc.nextFloat();
                return;
            }
            temp = temp.next;
        }
        System.out.println("Record not found.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node start = null, end = null;
        while (true) {
            System.out.println("\n****MENU*****");
            System.out.println("0: Exit");
            System.out.println("1: Creation");
            System.out.println("2: Display");
            System.out.println("3: Insert at Beginning");
            System.out.println("4: Insert at End");
            System.out.println("5: Insert at Any Position");
            System.out.println("6: Delete from Beginning");
            System.out.println("7: Delete from End");
            System.out.println("8: Delete from Any Position");
            System.out.println("9: Search and Update");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    end = create(start, end);
                    if (start == null) start = end;
                    break;
                case 2:
                    display(start, end);
                    break;
                case 3:
                    start = insBeg(start, end);
                    if (end == null) end = start;
                    break;
                case 4:
                    end = create(start, end);
                    if (start == null) start = end;
                    break;
                case 5:
                    start = insAny(start, end);
                    break;
                case 6:
                    start = delBeg(start, end);
                    break;
                case 7:
                    start = delEnd(start, end);
                    break;
                case 8:
                    start = delAny(start, end);
                    break;
                case 9:
                    search(start);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}