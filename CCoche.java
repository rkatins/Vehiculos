package Vehiculov2;

public class CCoche extends CVehiculo {
	public CCoche(String sMatriculaVehiculo, int iVelocidad, CConductor cConductor) {
		super(sMatriculaVehiculo, iVelocidad, cConductor);
	}
	
	@Override
	public void mAcelerar() {
		super.mAcelerar();
		this.setiVelocidad((getiVelocidad() * 2) + 2);
	}
	
	@Override
	public void mFrenar() {
		super.mFrenar();
	}

	@Override
	public String toString() {
		return "Coche [Matricula=" + getsMatriculaVehiculo() + ", Velocidad()=" + getiVelocidad()
				+ ", Conductor=" + getcConductor() + "]";
	}	
}
