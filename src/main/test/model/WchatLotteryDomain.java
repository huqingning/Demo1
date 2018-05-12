package model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/5/12 0012.
 */
public class WchatLotteryDomain implements Serializable {

    private Integer id;
    //中奖金额
    private String value;
    //中奖率
    private Integer v;

    public WchatLotteryDomain(Integer id, String value, Integer v) {
        this.id = id;
        this.value = value;
        this.v = v;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "WchatLotteryDomain{" +
                "id=" + id +
                ", value='" + value + '\'' +
                ", v=" + v +
                '}';
    }
}
