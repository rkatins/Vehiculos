package Vehiculov2;

public class CMoto extends CVehiculo {
	public CMoto(String sMatriculaVehiculo, int iVelocidad, CConductor cConductor) {
		super(sMatriculaVehiculo, iVelocidad, cConductor);
	}

	@Override
	public void mAcelerar() {
		super.mAcelerar();
	}
	
	@Override
	public void mFrenar() {
		super.mFrenar();
	}

	@Override
	public String toString() {
		return "Moto [Matricula=" + getsMatriculaVehiculo() + ", Velocidad=" + getiVelocidad()
				+ ", Conductor=" + getcConductor() + "]";
	}
}
