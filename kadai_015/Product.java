package kadai_015;

	//フィールド
	public class Product{
		private int gear = 0; 
		//private int speed = 0;
		
		
		public Product(int gear) {
			this.gear = gear;
	}
		public void gearChange(int afterGear) {
			System.out.println("ギア"+ this.gear + "から" + afterGear + "に切り替えました");

		}
		public void run(int speed) {
			System.out.println("速度は時速" + speed + "kmです");
			
		}
}




	
