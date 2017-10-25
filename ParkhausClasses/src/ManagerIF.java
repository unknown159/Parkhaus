
public interface ManagerIF {

	public void setPreis(double Preis);

	public double getPreis();

    public void setZeiten(int[] Zeiten);//Format [Einlass Stunde, Einlass Minute, Ende Stunde, Ende Minute]

    public int[] getZeiten();
	
}
