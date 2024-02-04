package Chapter10_Package;

class Hash{
    int value;

    Hash(int value){
        this.value = value;
    }
}

public class HashCode_Example {
    public static void main(String[] args) {
        Hash h1 = new Hash(10);
        Hash h2 = new Hash(10);
        int v1 = h1.hashCode();
        int v2 = h2.hashCode();
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
    }
}
