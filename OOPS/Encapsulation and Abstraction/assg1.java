import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
 
class Author{
    private String name;
    private String email;
    private char gender;
    /*public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }*/
    public String getAuthorName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void setAuthorName(String name){
        this.name = name;
    }
    public char getGender(){
        return gender;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
}

class Book extends Author{
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;
    
    /*public Book(String name, Author author, double price, int qtyInStock){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }*/
    
    public String getBookName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQtyInStock(){
        return qtyInStock;
    }

    public void setBookName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setQtyInStock(int qtyInStock){
        this.qtyInStock = qtyInStock;
    } 
    public static void main(String args[]){
        Book obj[] = new Book[100];//array of objects
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner ip = new Scanner(System.in);
            
        String bookName,authorName,email;
        int qtyInStock,n;
        char gender;
        double price;
        
        System.out.println("Enter the number of Books:");
        n = ip.nextInt();
        
        try{
            for(int i=0;i<n;i++){
                System.out.println("Enter the details for book number " + (i+1));
                System.out.println();
                System.out.print("Name of the Book::");
                bookName = br.readLine();
                System.out.print("Name of the author::");
                authorName = br.readLine();
                System.out.print("Price of the Book::");
                price = ip.nextDouble();
                System.out.print("Quantity left in stock::");
                qtyInStock = ip.nextInt();
                System.out.print("Gender::");
                gender = ip.next().charAt(0);
                System.out.print("Email of Author::");
                email = br.readLine();
                System.out.println();
                
                obj[i] = new Book();
                obj[i].setBookName(bookName);
                obj[i].setAuthorName(authorName);
                obj[i].setPrice(price);
                obj[i].setQtyInStock(qtyInStock);
                obj[i].setGender(gender);
                obj[i].setEmail(email);
            }
                
        } catch(Exception e){
            e.printStackTrace();
        }
        
        System.out.println("############The details of the Books are:############");
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.println("Name of the Book:: " + obj[i].getBookName());
            System.out.println("Name of the author:: " + obj[i].getAuthorName());
            System.out.println("Price:: " + obj[i].getPrice());
            System.out.println("Quantity left in stock:: " + obj[i].getQtyInStock());
            System.out.println("Gender:: " + obj[i].getGender());
            System.out.println("Email:: " + obj[i].getEmail());
            System.out.println();
        }
    }
}
