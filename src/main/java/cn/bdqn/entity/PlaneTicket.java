package cn.bdqn.entity;

/**
 * 飞机票类
 * Created by wenzhichao on 2018/3/19.
 */
public class PlaneTicket {

    /**
     * plane_id   int(11) NOT NULL主键
     * palneWay   varchar(30) NULL单程
     * planeGoto   varchar(30) NULL往返
     * palnePrice   double NULL价格
     * planeMalePrice   varchar(30) NULL预约时间
     * planeGotoTime    varchar(30) NULL往返时间
     * planeOrigin    varchar(30) NULL上机地点
     * planeGoall      varchar(30) NULL下机地点
     */

    private Integer planeId;
    private double palnePrice;
    private String palneWay,planeGoto,planeMalePrice, planeGotoTime,planeOrigin, planeGoal;

    @Override
    public String toString() {
        return "PlaneTicket{" +
                "planeId=" + planeId +
                ", palnePrice=" + palnePrice +
                ", palneWay='" + palneWay + '\'' +
                ", planeGoto='" + planeGoto + '\'' +
                ", planeMalePrice='" + planeMalePrice + '\'' +
                ", planeGotoTime='" + planeGotoTime + '\'' +
                ", planeOrigin='" + planeOrigin + '\'' +
                ", planeGoal='" + planeGoal + '\'' +
                '}';
    }

    public Integer getPlaneId() {
        return planeId;
    }

    public void setPlaneId(Integer planeId) {
        this.planeId = planeId;
    }

    public double getPalnePrice() {
        return palnePrice;
    }

    public void setPalnePrice(double palnePrice) {
        this.palnePrice = palnePrice;
    }

    public String getPalneWay() {
        return palneWay;
    }

    public void setPalneWay(String palneWay) {
        this.palneWay = palneWay;
    }

    public String getPlaneGoto() {
        return planeGoto;
    }

    public void setPlaneGoto(String planeGoto) {
        this.planeGoto = planeGoto;
    }

    public String getPlaneMalePrice() {
        return planeMalePrice;
    }

    public void setPlaneMalePrice(String planeMalePrice) {
        this.planeMalePrice = planeMalePrice;
    }

    public String getPlaneGotoTime() {
        return planeGotoTime;
    }

    public void setPlaneGotoTime(String planeGotoTime) {
        this.planeGotoTime = planeGotoTime;
    }

    public String getPlaneOrigin() {
        return planeOrigin;
    }

    public void setPlaneOrigin(String planeOrigin) {
        this.planeOrigin = planeOrigin;
    }

    public String getPlaneGoal() {
        return planeGoal;
    }

    public void setPlaneGoal(String planeGoal) {
        this.planeGoal = planeGoal;
    }
}
