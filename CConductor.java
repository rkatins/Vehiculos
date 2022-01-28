package Vehiculov2;

public class CConductor {
	private String sNombreConductor;
	private int iEdadConductor;
	private int iNumPuntosConductor;
	
	public CConductor(String isNombreConductor, int iiEdadConductor, int iiNumPuntosConductor) {
		this.sNombreConductor = isNombreConductor;
		this.iEdadConductor = iiEdadConductor;
		this.iNumPuntosConductor = iiNumPuntosConductor;
	}

	public String getsNombreConductor() {
		return sNombreConductor;
	}

	public void setsNombreConductor(String isNombreConductor) {
		this.sNombreConductor = isNombreConductor;
	}

	public int getiEdadConductor() {
		return iEdadConductor;
	}

	public void setiEdadConductor(int iiEdadConductor) {
		this.iEdadConductor = iiEdadConductor;
	}

	public int getiNumPuntosConductor() {
		return iNumPuntosConductor;
	}

	public void setiNumPuntosConductor(int iiNumPuntosConductor) {
		this.iNumPuntosConductor = iiNumPuntosConductor;
	}

	@Override
	public String toString() {
		return "Conductor [NombreConductor=" + sNombreConductor + ", EdadConductor=" + iEdadConductor
				+ ", NumPuntosConductor=" + iNumPuntosConductor + "]";
	}
}
