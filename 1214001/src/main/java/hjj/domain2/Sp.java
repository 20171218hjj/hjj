package hjj.domain2;

import java.io.Serializable;
import java.util.Set;

public class Sp implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer spbh;
	private String spmc;
	
	private Set<JhdSp> js;

	public Sp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sp(Integer spbh, String spmc, Set<JhdSp> js) {
		super();
		this.spbh = spbh;
		this.spmc = spmc;
		this.js = js;
	}

	public Integer getSpbh() {
		return spbh;
	}

	public void setSpbh(Integer spbh) {
		this.spbh = spbh;
	}

	public String getSpmc() {
		return spmc;
	}

	public void setSpmc(String spmc) {
		this.spmc = spmc;
	}

	public Set<JhdSp> getJs() {
		return js;
	}

	public void setJs(Set<JhdSp> js) {
		this.js = js;
	}

	
}
