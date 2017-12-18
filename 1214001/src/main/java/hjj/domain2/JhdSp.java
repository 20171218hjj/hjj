package hjj.domain2;

import java.io.Serializable;

public class JhdSp implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer djbh;
	private Integer spbh;
	private Integer sl;
	
	private Jhd jhd ;
	private Sp sp ;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getDjbh() {
		return djbh;
	}
	public void setDjbh(Integer djbh) {
		this.djbh = djbh;
	}
	public Integer getSpbh() {
		return spbh;
	}
	public void setSpbh(Integer spbh) {
		this.spbh = spbh;
	}
	public Integer getSl() {
		return sl;
	}
	public void setSl(Integer sl) {
		this.sl = sl;
	}
	public Jhd getJhd() {
		return jhd;
	}
	public void setJhd(Jhd jhd) {
		this.jhd = jhd;
	}
	public Sp getSp() {
		return sp;
	}
	public void setSp(Sp sp) {
		this.sp = sp;
	}
	public JhdSp(Integer id, Integer djbh, Integer spbh, Integer sl, Jhd jhd, Sp sp) {
		super();
		this.id = id;
		this.djbh = djbh;
		this.spbh = spbh;
		this.sl = sl;
		this.jhd = jhd;
		this.sp = sp;
	}
	public JhdSp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
