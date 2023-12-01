package Chapter5_Reference_Type;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Refer_ex2 {
    public static void main(String[] args) {
        int student1_weight = 60;
        int student2_weight = 58;
        int student3_weight = 75;
        int student4_weight = 85;
        int student5_weight = 74;
        int sum = 0;
        int average = 0;
        sum += student1_weight;
        sum += student2_weight;
        sum += student3_weight;
        sum += student4_weight;
        sum += student5_weight;
        average = sum / 5;
        System.out.println(average);
    }
}
