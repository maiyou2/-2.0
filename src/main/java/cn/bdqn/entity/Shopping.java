package cn.bdqn.entity;

/**
 * 购物类
 * Created by wenzhichao on 2018/3/19.
 */
public class Shopping {


    /**
     * shoppingId 主键
     * shoppingIoc   L商场位置
     * shoppingType商城类型
     */

    private Integer shoppingId;
    private String shoppingIoc, shoppingType;

    @Override
    public String toString() {
        return "Shopping{" +
                "shoppingId=" + shoppingId +
                ", shoppingIoc='" + shoppingIoc + '\'' +
                ", shoppingType='" + shoppingType + '\'' +
                '}';
    }

    public Integer getShoppingId() {
        return shoppingId;
    }

    public void setShoppingId(Integer shoppingId) {
        this.shoppingId = shoppingId;
    }

    public String getShoppingIoc() {
        return shoppingIoc;
    }

    public void setShoppingIoc(String shoppingIoc) {
        this.shoppingIoc = shoppingIoc;
    }

    public String getShoppingType() {
        return shoppingType;
    }

    public void setShoppingType(String shoppingType) {
        this.shoppingType = shoppingType;
    }
}
