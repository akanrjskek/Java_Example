package Chapter12_Generics;

class Generics_Two_Parameter<T1,T2>{
    T1 t1;
    T2 t2;

    Generics_Two_Parameter(T1 t1, T2 t2){
        this.t1 = t1;
        this.t2 = t2;
    }

    public String toString(){
        return "T1 값: " + this.t1 + " T2 값: " + this.t2;
    }
}

public class Generics_Example5 {
    public static void main(String[] args) {
        Generics_Two_Parameter<String, Integer> gtp = new Generics_Two_Parameter<>("hello",100);
        System.out.println(gtp);
    }
}