
public interface Schranke {
	
	int[] Oeffnungszeiten = new int[2];
		
	public boolean TicketBezahlt(Auto a);
	
	public int freieParkplaetze();
	
	public void UpdateOeffnungszeiten();
}
