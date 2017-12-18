package hjj.domain2;

import java.io.Serializable;
import java.util.Set;

public class Jhd implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer djbh;
	private Integer zj;
	
	
	private Set<JhdSp> js;


	public Jhd() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Jhd(Integer djbh, Integer zj, Set<JhdSp> js) {
		super();
		this.djbh = djbh;
		this.zj = zj;
		this.js = js;
	}


	public Integer getDjbh() {
		return djbh;
	}


	public void setDjbh(Integer djbh) {
		this.djbh = djbh;
	}


	public Integer getZj() {
		return zj;
	}


	public void setZj(Integer zj) {
		this.zj = zj;
	}


	public Set<JhdSp> getJs() {
		return js;
	}


	public void setJs(Set<JhdSp> js) {
		this.js = js;
	}


	
}
