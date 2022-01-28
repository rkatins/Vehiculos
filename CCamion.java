package Vehiculov2;

public class CCamion extends CVehiculo {
	public CCamion(String sMatriculaVehiculo, int iVelocidad, CConductor cConductor) {
		super(sMatriculaVehiculo, iVelocidad, cConductor);
	}

	@Override
	public void mAcelerar() {
		super.mAcelerar();
		this.setiVelocidad((getiVelocidad() / 2));
	}
	
	@Override
	public void mFrenar() {
		super.mFrenar();
	}

	@Override
	public String toString() {
		return "Camion [Matricula=" + getsMatriculaVehiculo() + ", Velocidad=" + getiVelocidad()
				+ ", Conductor=" + getcConductor() + "]";
	}
}
