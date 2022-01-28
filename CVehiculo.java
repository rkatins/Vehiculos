package Vehiculov2;

public class CVehiculo {
	private String sMatriculaVehiculo;
	private int iVelocidad;
	private CConductor cConductor;
	
	public CVehiculo(String sMatriculaVehiculo, int iVelocidad, CConductor cConductor) {
		this.sMatriculaVehiculo = sMatriculaVehiculo;
		this.iVelocidad = iVelocidad;
		this.cConductor = cConductor;
	}

	public String getsMatriculaVehiculo() {
		return sMatriculaVehiculo;
	}

	public void setsMatriculaVehiculo(String isMatriculaVehiculo) {
		this.sMatriculaVehiculo = isMatriculaVehiculo;
	}

	public int getiVelocidad() {
		return iVelocidad;
	}

	public void setiVelocidad(int iiVelocidad) {
		this.iVelocidad = iiVelocidad;
	}

	public CConductor getcConductor() {
		return cConductor;
	}

	public void setcConductor(CConductor icConductor) {
		this.cConductor = icConductor;
	}
	
	public void mAcelerar() {
		this.iVelocidad += 20;
	}
	
	public void mFrenar() {
		this.iVelocidad -= 10;
	}

	@Override
	public String toString() {
		return "Vehiculo [MatriculaVehiculo=" + sMatriculaVehiculo + ", Velocidad=" + iVelocidad + ", Conductor="
				+ cConductor + "]";
	}
}
