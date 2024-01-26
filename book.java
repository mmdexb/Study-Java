public class book {
    public String name;
    public String author;
    public String isbn;
    public int page;
    public double prise;

 

    public static void main(String[] args){
       book book1=new book();
        
       book1.name="what can i say";
       book1.author="manba";
       book1.isbn="out";
       book1.page=24;
       book1.prise=8.0;
       System.out.printf("i bought a book named %s by %s .the isbn is %s.it has %d pages,its prize is %.2f",book1.name,book1.author,book1.isbn,book1.page,book1.prise);

    }


}
