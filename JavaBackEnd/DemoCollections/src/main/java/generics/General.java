package generics;

public class General {

	class RaceCar{
	//	private static final String Logs = "Logs";
		private String name;
		private float speed;
		
		@Override
		public String toString() {
			return "RaceCar [name=" + name + ", speed=" + speed + "]";
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public float getSpeed() {
			return speed;
		}
		public void setSpeed(float speed) {
			this.speed = speed;
		}
	//	@Idea(value = "Logs")
		public void race()
		{
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
