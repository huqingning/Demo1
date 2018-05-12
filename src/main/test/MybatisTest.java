import model.BigWheelDrawUtil;
import model.WchatLotteryDomain;
import org.junit.Test;

/**
 * Created by Administrator on 2017/12/5 0005.
 */
public class MybatisTest {


    @Test
    public void test(){
        for (int i =0 ; i < 100;i++){
            WchatLotteryDomain wchatLotteryDomain = BigWheelDrawUtil.generateAward();

            System.out.println(wchatLotteryDomain.getValue());
        }

    }


}
