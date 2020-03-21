/* <!--컴퓨터학과 20180981 안태연 (크롬최적화)--> */
package jspbook.pr44;

import java.util.ArrayList;
import java.util.List;

public class AddrManager {
	List<AddrBean> addrlist = new ArrayList<AddrBean>();
	
	public void add(AddrBean ab) {
		addrlist.add(ab);
	}
	
	public List<AddrBean> getAddrList(){
		return addrlist;
	}
	
	public AddrBean getAddr(String username) {
		for(AddrBean ab : addrlist) {
			if(ab.getUsername().equals(username))
				return ab;
		}
		return null;
	}
}
