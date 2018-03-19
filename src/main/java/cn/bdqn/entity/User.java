package cn.bdqn.entity;

/**
 * 用户类
 * Created by wenzhichao on 2018/3/19.
 */
public class User {
    /**
     * id
     * userName 用户名
     * password 密码
     * phone 电话号
     * nickName 昵称
     * verificationCode  验证码
     */

    private Integer id,verificationCode;
    private String userName,password,phone, nickName;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", verificationCode=" + verificationCode +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(Integer verificationCode) {
        this.verificationCode = verificationCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
