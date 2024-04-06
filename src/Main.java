    import java.util.Scanner;
    public class Main {
        public static Scanner scan = new Scanner(System.in);
        public static int minim(int arr[] , int n){ // complexity O(n)
            if (n==1) return arr[0];
            return Math.min(arr[n-1] , minim(arr, n-1));
        }
        public static void task1(){
            int n = scan.nextInt();
            int arr[] = new int[n];
            for (int i=0;i<n;i++) {
                arr[i] = scan.nextInt();
            }
            System.out.println(minim(arr,n));
        }
        public static double avera1(int arr[] , int n , int amount){ // complexity O(n)
            double a = sumavera(arr,n,n)/n;
            return a;
        }
        public static double sumavera(int arr[] , int n , int amount){ // complexity O(n)
            if (n==1) return arr[0];
            return (arr[n-1] + sumavera(arr, n-1, amount));
        }
        public static void task2(){
            int n = scan.nextInt();
            int arr[] = new int[n];
            for (int i=0;i<n;i++) {
                arr[i] = scan.nextInt();
            }
            System.out.println(avera1(arr,n,n));
        }
        public static String prime(int n) {
            if (n < 2) return "Composite";
            return isPrime(n, 2) ? "Prime" : "Composite";
        }

        private static boolean isPrime(int n, int i) {  // complexity O(sqrt(n))
            if (i <= Math.sqrt(n)) {
                if (n % i == 0) return false;
                return isPrime(n, i + 1);
            }
            return true;
        }
        public static void task3(){
            int n = scan.nextInt();
            System.out.println(prime(n));
        }
        public static int  factorial(int n){ // complexity O(n!)
            if(n<=1) return n;
            return factorial(n-1)* n ;
        }
        public static void task4(){
            int n = scan.nextInt();
            System.out.println(factorial(n));
        }
        public static int Fibon (int n){ // complexity O(n!)
            if(n<=1) return n;
            return Fibon(n-1) + Fibon(n-2);
        }
        public static void task5(){
            int n = scan.nextInt();
            System.out.println(Fibon(n));
        }
        public static int degree (int a,int n){ // complexity O(2^n)
            if(n==0) return 1;
            return a * degree(a,n-1);
        }
        public static void task6(){
            int a = scan.nextInt();
            int n = scan.nextInt();
            System.out.println(degree(a,n));
        }
        public static boolean Digit(String a) {
            for(char b : a.toCharArray()){
                if(!Character.isDigit(b)) return false;
            }
            return true;
        }

        public static void task8() {
            String a = scan.next();
            if(Digit(a)) System.out.println("Yes");
            else System.out.println("No");
        }

        public static int binomial(int n ,  int k) { //complexity O(2^n)
            if(k == 0 || k == n){
                return 1;
            }
            return binomial(n-1, k-1) + binomial(n-1, k);
        }
        public static void task9(){
            int n = scan.nextInt();
            int k = scan.nextInt();
            System.out.println(binomial(n,k));
        }
        public static int Euclidean_Algorithm_gcd(int a , int b){ //complexity O(log n)
            while(b!=0){
                int temp = b;
                b = a%b;
                a = temp;
            }
            return a;
        }
        public static void task10(){
            int a = scan.nextInt();
            int n = scan.nextInt();
            System.out.println(Euclidean_Algorithm_gcd(a,n));
        }
        public static void main(String[] args) {
            task9();
        }
    }
