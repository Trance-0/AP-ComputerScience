package info;

import java.util.Calendar;
import java.util.Date;
//unfinished project!!
public class Persondata {

	private String name;
	private boolean sex;
	private int age;
	private int year;
	private int month;
	private int day;
	private String relationship;
	private String etc;

	public void Birthdate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public void Birthdate() {
		this.year = 0;
		this.month = 0;
		this.day = 0;
	}

	public void age() {
		Calendar cl = Calendar.getInstance();
		int tyear = cl.get(Calendar.YEAR);
		this.age = tyear - year;
	}

	public Persondata() {
		this.name = "";
		this.sex = false;
		this.age = -1;
		this.relationship = "";
		this.etc = "";
	}

	public Persondata(String name, boolean sex, int birthyear, String relationship, String etc) {
		this.name = name;
		this.sex = sex;
		Calendar cl = Calendar.getInstance();
		int tyear = cl.get(Calendar.YEAR);
		this.age = tyear - year;
		this.relationship = relationship;
		this.etc = etc;

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public boolean getSex() {
		return sex;
	}
	
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	
	public String getrelationship() {
		return relationship;
	}
	public void setEtc(String etc) {
		this.etc = etc;
	}
	
	public String getEtc() {
		return etc;
	}

	public String toString() {
		return null;

	}

}
