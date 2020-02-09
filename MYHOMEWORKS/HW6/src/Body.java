
public class Body {
	private String bodyType;
	private String bodyProtect;
	
	public Body(String bodyType, String bodyProtect) {
		this.bodyType = bodyType;
		this.bodyProtect = bodyProtect;
	}
	
	public void paintBody() {
		System.out.println("paint body");
	}
	
	public String getBodyType() {
		return bodyType;
	}
	
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
	
	public String getBodyProtect() {
		return bodyProtect;
	}
	
	public void setBodyProtect(String bodyProtect) {
		this.bodyProtect = bodyProtect;
	}
	
	@Override
	public String toString() {
		return "Body [bodyType=" + bodyType + ", bodyProtect=" + bodyProtect + "]";
	}
	
	
}
