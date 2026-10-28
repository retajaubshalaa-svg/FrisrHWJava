package lowerbound;
public class Lowerbound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    frutis<Number> f1=new frutis<>("apple",10);
    show.showprice(f1);
    }
    
}
class frutis<t>{
    String name;
    t price;

    public frutis() {}

    public frutis(String name, t price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public t getPrice() {
        return price;
    }

    public void setPrice(t price) {
        this.price = price;
    }

    public void display() {
        System.out.println( "frutis{" + "name=" + name + ", price=" + price + '}');
    }
    
}class show{
public static void showprice(frutis<? super Number>c){
c.display();
}}
