package concept;
class Address {
	private String country;
	private String state;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
class Employee2 {
	private String name;
	private int empno;
	Address addr;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
}
public class AgregationEx {

	public static void main(String[] args) {
		Address add = new Address();
		add.setCountry("India");
		add.setState("AP");
		
		Employee2 e = new Employee2();
		e.setName("krishna");
		e.setEmpno(925);
		e.setAddr(add);
		
		System.out.println(e.getEmpno() + " " + e.getName());
		System.out.println(e.getAddr().getCountry() + " " + e.getAddr().getState());
	}

}
