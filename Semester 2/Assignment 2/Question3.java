import java.util.Scanner;

class Book{
    int bookId;
    float price;
    int quantity;
    static float totalAmount = 0;

    public Book(int bookId , float price , int quantity){
        this.bookId = bookId;
        this.price = price;
        this.quantity = quantity;
    }

    void displayDetails(){
        System.out.println("Book ID is :" + this.bookId);
        System.out.println("Price is :" + this.price);
        System.out.println("Quantity is :" + this.quantity);
    }

    float totalCost(){
        return this.price * this.quantity;
    }
}

public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book[] books = new Book[5];
        for (int i = 0 ; i < 5; i++){
            System.out.print("Enter Book ID :");
            int id = input.nextInt();
            System.out.print("Enter Book price :");
            float price = input.nextFloat();
            System.out.print("Enter Book quantity :");
            int quantity = input.nextInt();
            Book book = new Book(id, price, quantity);
            Book.totalAmount += book.totalCost();
            books[i] = book;
        }

        for (Book i : books){
            i.displayDetails();
            System.out.println();
        }

        System.out.println("Total Amount for all the above books is : " + Book.totalAmount);
    }
}
