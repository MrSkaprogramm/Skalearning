public class Codes {
	private int nuclearCode;
	
	public Codes() {
		this.nuclearCode = 0;
	}
	
	public int getCode(){
		return nuclearCode;
	}
	
	public void setCode(int nuclearCode) throws ArmageddonException {
		if(nuclearCode <= 0) {
			throw new ArmageddonException();
		}
		this.nuclearCode = nuclearCode;
	}
}
