package member.dao;

import java.sql.Date;

public class MemberDto {
	
	private String Member_number;
	private String Member_name;
	private String Member_id;
	private String Member_password;
	private String Member_type;
	private int Member_point;
	private Date Member_reg_date;
	
	public String getMember_number() {
		return Member_number;
	}
	public void setMember_number(String member_number) {
		Member_number = member_number;
	}
	public String getMember_name() {
		return Member_name;
	}
	public void setMember_name(String member_name) {
		Member_name = member_name;
	}
	public String getMember_id() {
		return Member_id;
	}
	public void setMember_id(String member_id) {
		Member_id = member_id;
	}
	public String getMember_password() {
		return Member_password;
	}
	public void setMember_password(String member_password) {
		Member_password = member_password;
	}
	public String getMember_type() {
		return Member_type;
	}
	public void setMember_type(String member_type) {
		Member_type = member_type;
	}
	public int getMember_point() {
		return Member_point;
	}
	public void setMember_point(int member_point) {
		Member_point = member_point;
	}
	public Date getMember_reg_date() {
		return Member_reg_date;
	}
	public void setMember_reg_date(Date member_reg_date) {
		Member_reg_date = member_reg_date;
	}
	
	
	
}
