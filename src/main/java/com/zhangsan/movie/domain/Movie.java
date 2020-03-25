package com.zhangsan.movie.domain;

public class Movie {

	private int id;
	
	private String name;
	
	private String daoyan;
	
	private int price;
	
	private String date;
	
	private int shi;
	
	private String classes;
	
	private int year;
	
	private String qu;
	
	private String zhuang;

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

	public String getDaoyan() {
		return daoyan;
	}

	public void setDaoyan(String daoyan) {
		this.daoyan = daoyan;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getShi() {
		return shi;
	}

	public void setShi(int shi) {
		this.shi = shi;
	}

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getQu() {
		return qu;
	}

	public void setQu(String qu) {
		this.qu = qu;
	}

	public String getZhuang() {
		return zhuang;
	}

	public void setZhuang(String zhuang) {
		this.zhuang = zhuang;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", daoyan=" + daoyan + ", price=" + price + ", date=" + date
				+ ", shi=" + shi + ", classes=" + classes + ", year=" + year + ", qu=" + qu + ", zhuang=" + zhuang
				+ "]";
	}
	
}
