package comkeypack;

import java.io.Serializable;
import javax.persistence.Embeddable;
@Embeddable
public class Comkey implements Serializable{
	private int invid;
	private int itemid;
	public int getInvid() {
		return invid;
	}
	public void setInvid(int invid) {
		this.invid = invid;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	
}