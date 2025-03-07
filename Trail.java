import java.util.*;

public class Trail {

    public void f1(int x) {
        System.out.println("Hello, Everyone! i am function");
    }
    public void f2(int x) {
        System.out.println("Hello, Everyone! i am function");
    }
    Trail(){
        System.out.println("hey everyone i am contructor");
    }

    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc=new Scanner(System.in);
        int x =sc.nextInt();

        Trail ob=new Trail();
        ob.f1(x);
        ob.f2(x);
        


    
        System.out.println("Hello, Everyone!");
        System.out.println("Hello Guys !");
        System.out.println("Hello I am sahil");
    }
}
