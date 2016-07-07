//Write MyBook Class
class MyBook extends Book {
    int price;
    public MyBook(String t,String a, int p){
        super(t, a);
        this.price = p;
    }
    
    void display(){
        System.out.format("Title: %s\nAuthor: %s\nPrice: %d\n", this.title, this.author, this.price);
    }
}
