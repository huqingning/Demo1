package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/5/13 0013.
 */
public class BigWheelDrawUtil {

       private final static List<WchatLotteryDomain> initDrawList = new ArrayList<WchatLotteryDomain>() {
           {
                add(new WchatLotteryDomain(1, "200", 0));
                add(new WchatLotteryDomain(2, "100", 0));
                add(new WchatLotteryDomain(3, "50", 0));
                add(new WchatLotteryDomain(4, "30", 0));
                add(new WchatLotteryDomain(5, "20", 0));
                add(new WchatLotteryDomain(6, "10", 100));
           }
       };


    public static WchatLotteryDomain generateAward() {
        List<WchatLotteryDomain> initData = initDrawList;
        long result = randomnum(1, 100);
        int line = 0;
        int temp = 0;
        WchatLotteryDomain returnobj = null;
        int index = 0;
        for (int i = 0; i < initDrawList.size(); i++) {
            WchatLotteryDomain obj2 = initDrawList.get(i);
            int c = obj2.getV();
            temp = temp + c;
            line = 100 - temp;
            if (c != 0) {
                if (result > line && result <= (line + c)) {
                    returnobj = obj2;
                    break;
                }
            }
         }
         return returnobj;
    }

         // 获取2个值之间的随机数
    private static long randomnum(int smin, int smax){
         int range = smax - smin;
         double rand = Math.random();
         return (smin + Math.round(rand * range));
     }
}
