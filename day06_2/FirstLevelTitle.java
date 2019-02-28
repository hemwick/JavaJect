package day06_2;

import java.util.*;

public class FirstLevelTitle {
	private int id;
	private String titleName;
	private String creater;
	private Date createTime;
	public FirstLevelTitle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FirstLevelTitle(int id, String titleName, String creater, Date createTime) {
		super();
		this.id = id;
		this.titleName = titleName;
		this.creater = creater;
		this.createTime = createTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitleName() {
		return titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}
	public String getCreater() {
		return creater;
	}
	public void setCreater(String creater) {
		this.creater = creater;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "FirstLevelTitle [id=" + id + ", titleName=" + titleName + ", creater=" + creater + ", createTime="
				+ createTime + "]";
	}
}
