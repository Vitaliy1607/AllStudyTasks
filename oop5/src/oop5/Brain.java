package oop5;

public class Brain {
         private int iq;

		

		public Brain(int iq) {
			super();
			this.iq = iq;
		}
		
		public void think() {
			System.out.println("thinking...");
		}

		public int getIq() {
			return iq;
		}

		public void setIq(int iq) {
			this.iq = iq;
		}
}
