

public class App {
    public static void main(String[] args) throws Exception {
        CorrectChange correct = new CorrectChange(163);
        /*Calculator c = new Calculator();
        c.exponenets(2, 2);
        //c.factorial() is broken
        c.permutations(12, 3);
        c.combination(10, 4);
        //Calc ca = new Calc();
        System.out.println(changePi("xpix"));*/
    }
    public static String changePi(String str) {
        int index = str.indexOf("pi");
        if (index > -1) {
            str = str.substring(0, index) + "3.14" + str.substring(index + 2);
            return changePi(str);
        }
        return str;
    }
}
