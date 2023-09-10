import java.util.Scanner;
public class CorrectChange {
    public static void main (String [] args){
        Scanner kbd = new Scanner(System.in);
        int money = kbd.nextInt();
        int dollars = 0;
        int quarters = 0;
        int dimes = 0; 
        int nickels = 0;
        int pennies = 0;
        while (money>=100){
            dollars++;
            money-=100;
        }
        while (money>=25){
            quarters++;
            money-=25;
        }
        while (money>=10){
            dimes++;
            money-=10;
        }
        while (money>=5){
            nickels++;
            money-=5;
        }
        while (money>0){
            pennies++;
            money--;
        }
        System.out.println("Your change is : "+dollars+" dollar, " +quarters+" quarters, "+dimes+ " dimes, and "+pennies+" cents.");
    }
    /*public CorrectChange(int money){
        
    }*/
}
