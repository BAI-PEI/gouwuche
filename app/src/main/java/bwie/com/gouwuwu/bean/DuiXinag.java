package bwie.com.gouwuwu.bean;

/**
 * Created by BAIPEI on 2017/12/19.
 */

public class DuiXinag {
    private int price;
    private int count;

    public DuiXinag(int price, int count) {
        this.price = price;
        this.count = count;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
