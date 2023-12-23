package Chapter2_Variable;

public class Variable_ex4 {
    public static void main(String[] args) {
        byte max_b = 127;
        short max_s = 32767;
        char max_c = 65535;
        int max_i = 2147483647;
        byte min_b = -128;
        short min_s = -32768;
        char min_c = 0;
        int min_i = -2147483648;
        System.out.println((byte)(max_b + 1));
        System.out.println((short)(max_s + 1));
        System.out.println((char)(max_c + 1) + 0);
        System.out.println(max_i + 1);
        System.out.println((byte)(min_b - 1));
        System.out.println((short)(min_s - 1));
        System.out.println((char)(min_c - 1) + 0);
        System.out.println(min_i - 1);
    }
}
