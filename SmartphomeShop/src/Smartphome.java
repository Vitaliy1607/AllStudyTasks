
public class Smartphome {
       private String brandName;
       private boolean isNew;   // true- new telephone  false- byOwned
       private double price;
       // КОНСТРУКТОР за замовчуванням
      Smartphome() {
			this.brandName = "- not entered";
		}
      
      String getBrandName() {
    	  return brandName;
      }
      void setBrandName(String newBrandName) {
    	  this.brandName = newBrandName;
      }
	boolean isNew() {
		return isNew;
	}
	void setNew(boolean isNew) {
		this.isNew = isNew;
	}
	double getPrice() {
		return price;
	}
	void setPrice(double price) {
		if(price<0) {
			this.price = 0;
		}else {
		     this.price = price;
		}
	}
}
