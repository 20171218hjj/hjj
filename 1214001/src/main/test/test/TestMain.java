package test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;

import hjj.domain2.Jhd;
import hjj.domain2.JhdSp;
import hjj.domain2.Sp;
import hjj.domian.Dept;
import hjj.domian.Emp;
import hjj.util.HibernateUtil;

public class TestMain {
  @Test
	public void t1(){
		Session session = HibernateUtil.getSession();	
		String hql = "from Dept where dno = 1";	
		Query query = session.createQuery(hql);
		List<Dept> ls = query.list();
		for(Dept d :ls){			
			System.out.println(d.getDname());			
			for(Emp emp :d.getEmps()){
				System.out.println(emp.getEname());
			}
		}
	}
  @Test
  public void save(){
	  Session session = HibernateUtil.getSession();
	  Dept p = new Dept(null,"采购部","哈尔滨",null);
	  
	  //顺道保存员工
	  Emp e1 = new Emp(null,"hjj1",null,"会计",null);
	  Emp e2 = new Emp(null,"hjj2",null,"会计",null);
	  Emp e3 = new Emp(null,"hjj3",null,"会计",null);
	  
	  Set<Emp> emps = new  HashSet<Emp>();
	  
	 emps.add(e1);
	 emps.add(e2);
	 emps.add(e3);
	
	 p.setEmps(emps);
	 
	 session.beginTransaction();
	 session.save(p);
	 session.getTransaction().commit();
	 
	 
  }
  @Test
 	public void lazy(){
 		Session session = HibernateUtil.getSession();	
 		String hql = "from Emp e , Dept d where e.dno = d.dno";	
 		Query query = session.createQuery(hql);
		List<Dept> ls = query.list();
		for(Dept d :ls){			
			System.out.println(d.getDname());	
			
			
		} 	
 	}
  @Test
   public void mtom(){
	  Session session = HibernateUtil.getSession();	  	
	  	
	  	
	  	Jhd j = new Jhd(null,100,null);
	  	Jhd j2 = new Jhd(null,100,null);
	  	
	  	Sp s = new Sp(null,"哇哈哈",null);
	  	Sp s2 = new Sp(null,"爽歪歪",null);

	  	JhdSp sp = new JhdSp(null,null,null,100,null,null);
	  	JhdSp sp2 = new JhdSp(null,null,null,200,null,null);
	  	JhdSp sp3 = new JhdSp(null,null,null,2000,null,null);
	  	JhdSp sp4= new JhdSp(null,null,null,20000,null,null);
	  	
	  	sp.setJhd(j);
	  	sp.setSp(s);
	  	
	  	sp2.setJhd(j);
	  	sp2.setSp(s2);
	  	
	  	sp3.setJhd(j2);
	  	sp3.setSp(s);
	  	
	  	sp4.setJhd(j2);
	  	sp4.setSp(s2);
	  	
	  	session.beginTransaction();
	  	session.save(sp);
	  	session.save(sp4);
	  	session.save(sp2);
	  	session.save(sp3);
	  	
	  	session.getTransaction().commit();
	  	
  }
}
