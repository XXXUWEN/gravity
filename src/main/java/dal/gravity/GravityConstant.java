package dal.gravity;

public abstract class GravityConstant implements GravityModel{
	
	public static final double EARTH_GRAVITY = 9.80665;
	public static final double JUPITER_GRAVITY = 29.79;
	
	private double gravity;

	public double getGravitationalField(){
		return gravity;
	}
}
