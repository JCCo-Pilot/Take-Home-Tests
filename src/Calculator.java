import java.util.Scanner;
public class Calculator {
    private Scanner s;
    public Calculator(){
        s = new Scanner(System.in);
    }
    //addition
    public void add(double a, double b){
        System.out.println(a+b);
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void addManyInt(){
        int num = 0;
        int result =0;
        System.out.println("how many numbers do you want to add?");
        num = s.nextInt();
        for (int i = 0; i<num;i++){
            System.out.println("whats the "+(i+1)+" number?");
            int temp = s.nextInt();
            result +=temp;
        }
        System.out.println("your total is "+result);
    }
    public void addManyDouble(){
        int num = 0;
        double result = 0.0;
        System.out.println("how many numbers do you want to add?");
        num = s.nextInt();
        for (int i = 0; i<num;i++){
            System.out.println("whats the "+(i+1)+" number?");
            double temp = s.nextDouble();
            result +=temp;
        }
        System.out.println("your total is "+result);
    }
    //returnables
    public double adder(double a, double b){
        return a+b;
    }
    public int adder(int a, int b){
        return a+b;
    }
    public int addManyInter(){
        int num = 0; 
        int result = 0;
        System.out.println("how many numbers do you want to add?");
        num = s.nextInt();
        for (int i = 0; i<num;i++){
            System.out.println("whats the "+(i+1)+" number?");
            int temp = s.nextInt();
            result +=temp;
        }
        return result;
    }
    public double addManyDoubler(){
        int num = 0;
        double result = 0.0;
        System.out.println("how many numbers do you want to add?");
        num = s.nextInt();
        for (int i = 0; i<num;i++){
            System.out.println("whats the "+(i+1)+" number?");
            double temp = s.nextDouble();
            result +=temp;
        }
        return result;
    }
    //subtraction
    public void subtract(double a, double b){
        System.out.println(a-b);
    }
    public void subtract(int a, int b){
        System.out.println(a-b);
    }
    //returnables
    public double subtracter(double a, double b){
        return a-b;
    }
    public int subtracter(int a, int b){
        return a-b;
    }
    //multiplication
    public void multiple(int a, int b){
        System.out.println(a*b);
    }
    public void multiple(double a, double b){
        System.out.println(a*b);
    }
    public void multipleThree(int a, int b, int c){
        System.out.println(a*b*c);
    }
    public void multipleThree(double a, double b, double c){
        System.out.println(a*b*c);
    }
    public void multipleManyInt(){
        int num =0;
        int result = 1;
        System.out.println("how many numbers do you want to multiple?");
        num = s.nextInt();
        for (int i = 0; i<num;i++){
            System.out.println("whats the "+(i+1)+" number?");
            int temp = s.nextInt();
            result = result*temp;
        }
        System.out.println("your total is "+result);
    }
    public void multipleManyDouble(){
        int num = 0;
        double result = 1.0;
        System.out.println("how many numbers do you want to multiple?");
        num = s.nextInt();
        for (int i = 0; i<num;i++){
            System.out.println("whats the "+(i+1)+" number?");
            double temp = s.nextDouble();
            result = result*temp;
        }
        System.out.println("your total is "+result);
    }
    //returnables
    public int multipler(int a, int b){
        return a*b;
    }
    public double multipler(double a, double b){
        return a*b;
    }
    public int multipleThreer(int a, int b, int c){
        return a*b*c;
    }
    public double multipleThreer(double a, double b, double c){
        return a*b*c;
    }
    public int multipleManyInter(){
        int num =0;
        int result = 1;
        System.out.println("how many numbers do you want to multiple?");
        num = s.nextInt();
        for (int i = 0; i<num;i++){
            System.out.println("whats the "+(i+1)+" number?");
            int temp = s.nextInt();
            result = result*temp;
        }
        return result;
    }
    public double multipleManyDoubler(){
        int num = 0;
        double result = 1.0;
        System.out.println("how many numbers do you want to multiple?");
        num = s.nextInt();
        for (int i = 0; i<num;i++){
            System.out.println("whats the "+(i+1)+" number?");
            double temp = s.nextDouble();
            result = result*temp;
        }
        return result;
    }
    //division
    public void divide(int a, int b){
        System.out.println(a/b);
    }
    public void divide(double a, double b){
        System.out.println(a/b);
    }
    //returnables
    public int divider(int a, int b){
        return a/b;
    }
    public double divider(double a, double b){
        return a/b;
    }
    //exponenets
    public void exponenets(int intial, int toPower){
        int total = 1;
        if (toPower == 0){
            System.out.println("Your total is "+1);
        }
        for (int i = 0; i<toPower; i++){
            total = total*intial;
        }
        System.out.println(total);
    }
    //returnables
    public int exponeneter(int intial, int toPower){
        int total = 1;
        if (toPower == 0){
            return 1;
        }
        for (int i = 0; i<toPower; i++){
            total = total*intial;
        }
        return total;
    }
    //factorial
    //this code is broken
    public void factorial(int n){
        int result = 1;
        for (int i = n;i>0;i--){
            result = result* n;
        }
        System.out.println(result);
    }
    //returnables
    public int factorialer(int i){
        if ( i == 1){
            return 1;
        }
        return i*factorialer(i-1);
    }
    //permutation
    public void permutations(int n, int r){
        int top =factorialer(n);
        int bottom = factorialer(n-r);
        System.out.println(top/bottom);
    }
    //returnables
    public int permutationer(int n, int r){
        int top = factorialer(n);
        int bottom = factorialer(n-r);
        return top/bottom;
    }
    //combination
    public void combination(int n, int r){
        int top = factorialer(n);
        int bottom = factorialer(r)*factorialer(n-r);
        System.out.println(top/bottom);
    }
    //returnables
}
