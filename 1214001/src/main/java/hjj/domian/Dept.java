package hjj.domian;

import java.io.Serializable;
import java.util.Set;

public class Dept implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6296259565243566561L;
	private Integer dno;
	private String dname;
	private String loc;
	
	private Set<Emp> emps;

	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dept(Integer dno, String dname, String loc, Set<Emp> emps) {
		super();
		this.dno = dno;
		this.dname = dname;
		this.loc = loc;
		this.emps = emps;
	}

	public Integer getDno() {
		return dno;
	}

	public void setDno(Integer dno) {
		this.dno = dno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public Set<Emp> getEmps() {
		return emps;
	}

	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}
	
	
	
}
