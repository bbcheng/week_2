/**
 * Created by dell on 2017/7/22.
 */
import java.util.*;
public class person {
    protected String name ;
    protected   int mark;
    /* 用来创建游戏玩家 */
     public void setUser(){
         Scanner user1 = new Scanner(System.in);
         System.out.print("please input your username: ");
         //System.out.println(user1.next());
         name = user1.next();
         System.out.println("start");

     }

    /* 用来开始游戏 */
    public  void  play(){
        mathGame m = new mathGame();
        int sum =  m.compare();
        System.out.println("本轮成绩 "+sum+" 次");
        System.out.println("start   end   again ");
        mark = sum;
    }
}
