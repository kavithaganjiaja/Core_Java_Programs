package ConstructorTasks;

public class Users {
	int uid;
	String uname;
	

	public int getUid() {
		return uid;
	}


	public void setUid(int uid) {
		this.uid = uid;
	}


	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}


	public Users(int uid, String uname) {
		super();
		this.uid = uid;
		this.uname = uname;
	}

public Users() {
	// TODO Auto-generated constructor stub
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Users u=new Users(100,"ramu");
System.out.println(u.getUid()+"\t"+u.getUname());
u.setUname("rani");
System.out.println(u.getUid()+"\t"+u.getUname());
	}

}
