/**
 * Created by dell on 2017/7/22.
 */
import java.util.*;
public class user {
    public static void main(String[] args){
        person one = new person();
        one.setUser();
        one.play();
        show(one);
     /*
      person two = new person();
        two.setUser();
        two.play();
        show(two);
      */
    }
    public static void show(person p){
        ArrayList al = new ArrayList();
        ArrayList all = new ArrayList();
        al.add(p.name);
        all.add(p.mark);
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+"\t"+all.get(i));
        }
    }

}

