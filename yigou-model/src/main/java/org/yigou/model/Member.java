package org.yigou.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="t_member")
public class Member {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int _id;
	private int userId; //用户ID与t_user表关联
	private String memberName; //会员名
	private String realName; //真实姓名
	private String cardId; //身份证号
	private int sex; //性别 0为女性，1为男性
	private String qq;
	private String phone;
	private String emial;
	private String photoPath;
	private double accountMoney;
	private float  integral; //积分
	private int     memberLevel;
	private int     memberType;
	private String  address;
	private String  zipCode;//邮编
	private Date    birthday;
	private int      role;
	private String   publicItem;//公开项
	@Transient
	private String selfInvalideCode; //网站内部验证码，不参加持久化
	@Transient
	private String phoneInvalideCode; //手机验证码，不参加持久化
	@Transient
	private String password; //密码，不参加持久化
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSelfInvalideCode() {
		return selfInvalideCode;
	}
	public void setSelfInvalideCode(String selfInvalideCode) {
		this.selfInvalideCode = selfInvalideCode;
	}
	public String getPhoneInvalideCode() {
		return phoneInvalideCode;
	}
	public void setPhoneInvalideCode(String phoneInvalideCode) {
		this.phoneInvalideCode = phoneInvalideCode;
	}
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmial() {
		return emial;
	}
	public void setEmial(String emial) {
		this.emial = emial;
	}
	public String getPhotoPath() {
		return photoPath;
	}
	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}
	public double getAccountMoney() {
		return accountMoney;
	}
	public void setAccountMoney(double accountMoney) {
		this.accountMoney = accountMoney;
	}
	public float getIntegral() {
		return integral;
	}
	public void setIntegral(float integral) {
		this.integral = integral;
	}
	public int getMemberLevel() {
		return memberLevel;
	}
	public void setMemberLevel(int memberLevel) {
		this.memberLevel = memberLevel;
	}
	public int getMemberType() {
		return memberType;
	}
	public void setMemberType(int memberType) {
		this.memberType = memberType;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public String getPublicItem() {
		return publicItem;
	}
	public void setPublicItem(String publicItem) {
		this.publicItem = publicItem;
	}
	
}
