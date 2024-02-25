package Deep_Deep_Cloning;

public class employee implements Cloneable
{
  private int eid;
  private String ename;
  private Double esal;
  private String edesg;
  private Department dept;


public Department getDept() {
	return dept;
}
public void setDept(Department dept) {
	this.dept = dept;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public Double getEsal() {
	return esal;
}
public void setEsal(Double esal) {
	this.esal = esal;
}
public String getEdesg() {
	return edesg;
}
public void setEdesg(String edesg) {
	this.edesg = edesg;
}


   @Override
public String toString() {
	return "employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", edesg=" + edesg + ", dept=" + dept + "]";
}
   public employee clone() 
{
    employee obj = null;
    try {
     obj = (employee)super.clone();
    Department d = new Department(obj.getDept().getDid(),obj.getDept().getDname(),obj.getDept().getStr()); 
    Store sto = new Store(d.getStr().getSid(),d.getStr().getSname());
    d.setStr(sto);
    obj.setDept(d);
    }
    catch(CloneNotSupportedException e)
    {
    	System.out.println(e);
    }
    return obj;
}


 
}

