package hjj.domian;

import java.io.Serializable;

public class Emp implements Serializable{

	
	private static final long serialVersionUID = -3411565881519535669L;
	private Integer eno;
	private String ename;
	private Integer dno;
	private String job;
	
	private Dept dept;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(Integer eno, String ename, Integer dno, String job, Dept dept) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.dno = dno;
		this.job = job;
		this.dept = dept;
	}

	public Integer getEno() {
		return eno;
	}

	public void setEno(Integer eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Integer getDno() {
		return dno;
	}

	public void setDno(Integer dno) {
		this.dno = dno;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}
	
	
	
	
	
}
