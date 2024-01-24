package Chapter7_OOP2;

import java.util.Arrays;

class Product{
    int price;
    double per;

    Product(int price, double per){
        this.price = price;
        this.per = per;
    }
}

class Snack extends Product{
    Snack(int price, double per){
        super(price, per);
    }
    public String toString(){
        return "Snack";
    }
}

class IceCream extends Product{
    IceCream(int price, double per){
        super(price, per);
    }
    public String toString(){
        return "Icecream";
    }
}

class Fruit extends Product{
    Fruit(int price, double per){
        super(price, per);
    }
    public String toString(){
        return "Fruit";
    }
}

class Buyer{
    static Seller seller = new Seller(0);
    int balance;
    Product[] products = new Product[10]; // 상품을 10가지 종류만 가질 수 있다.
    int index = 0;

    Buyer(int balance){
        this.balance = balance;
    }

    void buy(Product p, int number){
        if(balance < p.price * number){
            System.out.println("돈이 없습니다..");
            return;
        }
        else if(index == 10){
            System.out.println("장바구니 공간이 부족합니다..");
            return;
        }

        balance -= p.price * number;
        products[index++] = p;
        System.out.println(p + " 구매 완료");
        System.out.println("잔액은 " + this.balance + "입니다.");
        seller.sell(p,number);
    }
}

class Seller{
    int balance;
    Product[] products = new Product[20]; // 상품을 20가지 종류만 판매한다.
    int index = 0;
    Seller(int balance){
        this.balance = balance;
    }

    void wholesale(Product p){
        if(index == 20){
            System.out.println("판매 공간이 부족합니다..");
            return;
        }
        products[index++] = p;
    }
    void sell(Product p, int number){
        if(Arrays.asList(this.products).indexOf(p) == -1){
            System.out.println("해당 상품은 없습니다..");
             return;
        }

        this.balance += p.price * number * p.per;
        System.out.println(p + " " + number + "개 판매 완료");
        System.out.println("총 수입은 " + this.balance + "입니다.");
    }
}

public class Polymorphism4 {
    public static void main(String[] args) {
        Snack snack = new Snack(1000,0.3);
        IceCream icecream = new IceCream(500, 0.2);
        Fruit fruit = new Fruit(3000, 0.4);
        Buyer b = new Buyer(10000);

        b.seller.wholesale(snack);
        b.seller.wholesale(icecream);
        b.seller.wholesale(fruit);
        b.buy(snack, 2);
        b.buy(icecream, 2);
        b.buy(fruit, 2);
    }
}
