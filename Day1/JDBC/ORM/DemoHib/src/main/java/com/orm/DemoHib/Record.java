package com.orm.DemoHib;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Record {
	@Id
	private int sno;
	private String name;
	private int score;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
}
