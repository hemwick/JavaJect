package day04;

public class HelloWorld {
	String userName;
	private String secret;
	private int passwd;
	
	public Integer getPasswd() {
		return passwd;
	}
	public void setPasswd(Integer passwd) {
		this.passwd = passwd;
	}
	public void setSecret(String secret) {
		this.secret =secret;
	}
	public String getSecret() {
		return secret;
	}
	public void sayHello() {
		System.out.println("你好，中国！");
	}

	@Override
	public String toString() {
		return "userName:"+userName+"---------";
		
	}

	}

