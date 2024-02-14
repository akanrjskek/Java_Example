package project.departmentstore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Management<Customer> customerManagement = new Management("일반 고객");
        Management<Vip> vipManagement = new Management("VIP 고객");
        Management<Worker> workerManagement = new Management("직원");

        StoreSystem ss = new StoreSystem();

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("고객인가요? 직원인가요?(종료 입력 시 프로그램 종료) ");
            String person = sc.next();
            if(person.equals("고객")){
                System.out.print("고객의 작년 사용 금액을 입력해주세요. ");
                long consumption = sc.nextLong();
                if(consumption >= 100000000){
                    System.out.print("이름을 입력해주세요. ");
                    String vip = sc.next();
                    Person v = new Customer(vip,consumption);
                    ss.register(vipManagement,v);
                }
                else {
                    System.out.print("이름을 입력해주세요. ");
                    String customer = sc.next();
                    Person c = new Customer(customer,consumption);
                    ss.register(customerManagement, c);
                }
            }
            else if(person.equals("직원")){
                System.out.print("이름을 입력해주세요. ");
                String worker = sc.next();
                Person w = new Worker(worker);
                ss.register(workerManagement,w);
            }
            else if(person.equals("종료")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else{
                System.out.println("잘못 입력하셨습니다. 프로그램을 다시 실행해주세요.");
                break;
            }
        }
        StoreSystem.printManagementPeople(workerManagement);
        StoreSystem.printManagementPeople(customerManagement);
        StoreSystem.printManagementPeople(vipManagement);
    }
}
