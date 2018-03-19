package cn.bdqn.entity;

/**
<<<<<<< HEAD
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
=======
 * Created by zhang on 2018/3/19.
 * plane_id          int(11)      (NULL)     NO      PRI     (NULL)   auto_increment  select,insert,update,references  主键
 plane_way         varchar(30)  utf8_bin   YES             (NULL)                   select,insert,update,references  单程
 plane_goto        varchar(30)  utf8_bin   YES             (NULL)                   select,insert,update,references  往返
 plane_price       double       (NULL)     YES             (NULL)                   select,insert,update,references  价格
 plane_make_price  varchar(30)  utf8_bin   YES             (NULL)                   select,insert,update,references  预约时间
 plane_goto_time   varchar(30)  utf8_bin   YES             (NULL)                   select,insert,update,references  往返时间
 plane_origin      varchar(30)  utf8_bin   YES             (NULL)                   select,insert,update,references  上机地点
 plane_goal        varchar(30)  utf8_bin   YES             (NULL)                   select,insert,update,references  下机地点

 */
public class PlaneTicket {
    private Integer planeId;
    private String planeWay,planeGoto,planeGotoTime,planeOrigin,planGoal;
    private double planePrice;
>>>>>>> origin/master

    public Integer getPlaneId() {
        return planeId;
    }

    public void setPlaneId(Integer planeId) {
        this.planeId = planeId;
    }

<<<<<<< HEAD
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
=======
    public String getPlaneWay() {
        return planeWay;
    }

    public void setPlaneWay(String planeWay) {
        this.planeWay = planeWay;
>>>>>>> origin/master
    }

    public String getPlaneGoto() {
        return planeGoto;
    }

    public void setPlaneGoto(String planeGoto) {
        this.planeGoto = planeGoto;
    }

<<<<<<< HEAD
    public String getPlaneMalePrice() {
        return planeMalePrice;
    }

    public void setPlaneMalePrice(String planeMalePrice) {
        this.planeMalePrice = planeMalePrice;
    }

=======
>>>>>>> origin/master
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

<<<<<<< HEAD
    public String getPlaneGoal() {
        return planeGoal;
    }

    public void setPlaneGoal(String planeGoal) {
        this.planeGoal = planeGoal;
=======
    public String getPlanGoal() {
        return planGoal;
    }

    public void setPlanGoal(String planGoal) {
        this.planGoal = planGoal;
    }

    public double getPlanePrice() {
        return planePrice;
    }

    public void setPlanePrice(double planePrice) {
        this.planePrice = planePrice;
    }

    @Override
    public String toString() {
        return "PlaneTicket{" +
                "planeId=" + planeId +
                ", planeWay='" + planeWay + '\'' +
                ", planeGoto='" + planeGoto + '\'' +
                ", planeGotoTime='" + planeGotoTime + '\'' +
                ", planeOrigin='" + planeOrigin + '\'' +
                ", planGoal='" + planGoal + '\'' +
                ", planePrice=" + planePrice +
                '}';
>>>>>>> origin/master
    }
}
