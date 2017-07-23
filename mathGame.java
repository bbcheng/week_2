/**
 * Created by dell on 2017/7/22.
 */
import java.util.*;

public class mathGame {

    /* getMath函数用来产生一个500以内的整形随机数 */
    private int  getMath() {
        Random r = new Random();
        return r.nextInt(500);
    }
    /* setMath函数用来键盘输入整形数值 */
     private int setMath(){
        Scanner number = new Scanner(System.in);
        System.out.print("please input an integer number: ");
        return number.nextInt();
    }
    /* compare函数用来比较随机数和键盘输入的数值，并返回比较次数 */
    public int compare() {
        int num1 = getMath();   //System.out.println(num1);打印随机数
        int num2 = setMath();
        int sum = 0;
        while (num1 != num2) {
            if (num2 > num1) {
                System.out.println("too big");
                num2 = setMath();
                sum++;
            } else {
                System.out.println("too small");
                num2 = setMath();
                sum++;
            }
        }
        return sum + 1;
    }
}