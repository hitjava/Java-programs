package comkeypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class Client {
	public static void main(String[] args)throws Exception {
		Configuration cfg=new Configuration().configure("hibernate.anno.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		
		Comkey ck=new Comkey();
		ck.setInvid(101);
		ck.setItemid(220);
		
		InvTransaction invt=new InvTransaction();
		invt.setKeyid(ck);
		invt.setQty(100);
		
		session.save(invt);
		
		session.beginTransaction().commit();
	}
}