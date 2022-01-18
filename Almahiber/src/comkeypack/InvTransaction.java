package comkeypack;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
@Entity
public class InvTransaction {
	
	@EmbeddedId
	private Comkey keyid;
	
	private int qty;
	public Comkey getKeyid() {
		return keyid;
	}
	public void setKeyid(Comkey keyid) {
		this.keyid = keyid;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
}