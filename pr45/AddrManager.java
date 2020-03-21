//컴퓨터학과 박세라 20180969 AddrManager.jsp
package jspbook.pr45;

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
   public AddrBean getAddrGroup(String group) {
      for(AddrBean ab : addrlist) {
         if(ab.getGroup().equals(group))
            return ab;
      }
      return null;
   }
}
   