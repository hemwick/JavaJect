package day06_2;

public class Teacher {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id)throws IllegalArgumentException {
		if (id.length()==7) {
			this.id = id;
		}
		else {
			throw new IllegalArgumentException("参数长度要为7");
		}
		
		
	}
}
