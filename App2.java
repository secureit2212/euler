public class App2 {
    public static void main(String[] args) {
        System.out.println("hello world 2");
        int a = 1;
        int b = 1;
        int sum=0;

        while (b < 4000000) {
            int c = a + b;
            a = b;
            b = c;
           // System.out.println(a);
            if(a%2==0){
               sum=sum+a; 
            }

        }System.out.println(sum);
    }

}
