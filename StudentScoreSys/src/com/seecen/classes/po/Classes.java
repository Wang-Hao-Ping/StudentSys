package com.seecen.classes.po;

public class Classes {
	private int id;// �༶���
	private String name;// �༶����
	private int year;// �༶��ѧ���
	
	//дһ�����췽��
	public Classes(String name, int year, String subject, String statu) {
		super();
		this.name = name;
		this.year = year;
		this.subject = subject;
		this.statu = statu;
	}

	private String subject;// �༶רҵ
	private String statu;//״̬�Ƿ��ҵ

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getStatu() {
		return statu;
	}

	public void setStatu(String statu) {
		this.statu = statu;
	}

}
