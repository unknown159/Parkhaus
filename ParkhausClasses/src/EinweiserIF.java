
public interface EinweiserIF {

	public static int getNextFreeSpace(Auto[] PP){
		for(int i = 0; i<PP.length; i++){
			if(PP[i]==null){
				return i;
			}
		}
		return -1;//VOLL!
	}
	
}
