package vn.com.vti.springexam.entity;

import java.util.Date;

public class MemberCustomized {
	private String memberId;
	private String lastName;
	private String firstName;
	private Date birthday;
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getJobTypeId() {
		return jobTypeId;
	}
	public void setJobTypeId(String jobTypeId) {
		this.jobTypeId = jobTypeId;
	}
	public String getJobTypeName() {
		return jobTypeName;
	}
	public void setJobTypeName(String jobTypeName) {
		this.jobTypeName = jobTypeName;
	}
	private String jobTypeId;
	private String jobTypeName;
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
}
