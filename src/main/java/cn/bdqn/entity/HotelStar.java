package cn.bdqn.entity;

/**
 * 酒店星级表
 * Created by Administrator on 2018/3/19.
 */
public class HotelStar {
    /**
     *
     FieldTypeComment
     hotel_staid int(11) NOT NULL
     hotel_star varchar(10) NOT NULL酒店星级
     */
    private int hotelStaId;
    private String hotelStar;

    @Override
    public String toString() {
        return "HotelStar{" +
                "hotelStaId=" + hotelStaId +
                ", hotelStar='" + hotelStar + '\'' +
                '}';
    }

    public int getHotelStaId() {
        return hotelStaId;
    }

    public void setHotelStaId(int hotelStaId) {
        this.hotelStaId = hotelStaId;
    }

    public String getHotelStar() {
        return hotelStar;
    }

    public void setHotelStar(String hotelStar) {
        this.hotelStar = hotelStar;
    }
}
