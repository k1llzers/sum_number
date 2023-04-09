import java.util.ArrayList;


public class Main{
    public static void main(String[] args) {
        System.out.println(sumNumber());
    }

    public static int sumNumber(){
        ArrayList<Integer> list = new ArrayList();
        for (int i = 1; i <= 8888; i++) {
            if((i%3 == 0 || i%5 == 0 || i%7 == 0) && i%15 != 0 && i%21 != 0 && i%35 != 0 && i%105 != 0) list.add(i);
        }
        int res = 0;
        for (int i = 0; i < list.size(); i++) {
            res = res + list.get(i);
        }
        return res;
    }
}