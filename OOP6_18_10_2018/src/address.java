
public class address {
	 private String caty;
	    private String street;
	    
	    
	    
	    
	    public address(String caty, String street) {
	        super();
	        this.caty = caty;
	        this.street = street;
	    }
	    
	    
	    @Override
	    public String toString() {
	        return "address [caty=" + caty + ", street=" + street + "]";
	    }
	    
	    
	    public String getCaty() {
	        return caty;
	    }
	    public void setCaty(String caty) {
	        this.caty = caty;
	    }
	    public String getStreet() {
	        return street;
	    }
	    public void setStreet(String street) {
	        this.street = street;
	    }
	    
	    
	    
	    
	}

