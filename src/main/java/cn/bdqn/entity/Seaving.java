package cn.bdqn.entity;

/**
 * 储蓄目标分类
 * Created by wenzhichao on 2018/3/19.
 */
public class Seaving {

    /**
     * FieldTypeComment
     * areaId 主键
     * areaName  名称
     * areaForid 编号
     */

    private Integer areaId,areaForid;

    private String areaName;

    @Override
    public String toString() {
        return "Seaving{" +
                "areaId=" + areaId +
                ", areaForid=" + areaForid +
                ", areaName='" + areaName + '\'' +
                '}';
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getAreaForid() {
        return areaForid;
    }

    public void setAreaForid(Integer areaForid) {
        this.areaForid = areaForid;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }
}
