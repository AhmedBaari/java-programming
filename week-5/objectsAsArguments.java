class Ball {
	int size;
	String shape = "sphere";
	String color;

	Ball () {
		size = 50;
		shape = "round";
		color = "blue";
	}

	Ball (int size, String shape, String color){
        	this.size = size;
        	this.shape = shape;
        	this.color = color;
	}

	Ball throwBall (Ball myBall) {
		System.out.println("Ball with size " + myBall.size + " was thrown");
		return this;
	}
}
	


public class objectsAsArguments {
	public static void main ( String[] Args) {
		Ball oneBall = new Ball();
		Ball twoBall = new Ball(34,"Square", "red");
		Ball threeBall = twoBall.throwBall(oneBall);
	}
}