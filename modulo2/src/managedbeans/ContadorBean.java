package managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean 
@SessionScoped 
public class ContadorBean { 
	
	private int count; 
	 
	 public void increment() {   count++;  } 
	 
	 public int getCount() {   return count;  } 
	 
	 public void setCount(int count) {   this.count = count;  } 
	 
}