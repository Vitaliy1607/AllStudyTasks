
public class Helm {
      private String size;
      private String form;
	
      public Helm(String size, String form) {
		this.size = size;
		this.form = form;
	}
      
    public void turnHelm() {
     System.out.println("Turn in right direction");
     }

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	@Override
	public String toString() {
		return "Helm [size=" + size + ", form=" + form + "]";
	}
      
      
      
      
}
