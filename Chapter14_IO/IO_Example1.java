package Chapter14_IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IO_Example1 {
    public static void main(String[] args) {
        ByteArrayInputStream input;
        ByteArrayOutputStream output;

        byte[] materials = new byte[10];
        byte[] print;
        for(int i = 0; i < 10; ++i){
            materials[i] = (byte)i;
        }

        byte[] stream = new byte[materials.length];
        input = new ByteArrayInputStream(materials);
        output = new ByteArrayOutputStream();

        input.read(stream,0,stream.length);
        output.write(stream,0,stream.length);

        print = output.toByteArray();

        System.out.println(Arrays.toString(print));
    }
}
