package challenge.code;

public class InstructionMessage {
	
	private int instructionType, productCode, quauntity, uom, timeStamp;
	
	
	public InstructionMessage(int instructionType, int productCode, int quauntity, int uom, int timeStamp) {
		
		this.instructionType = instructionType;
		this.productCode = productCode;
		this.quauntity = quauntity;
		this.uom = uom;
		this.timeStamp = timeStamp;
	}

	public int getInstructionType() {
		
		return instructionType;
	}
	
	public int getProductCode() {
		
		return productCode;
	}
	
	public int getQuantity() {
		
		return quauntity;
	}

	public int getUom() {
	
		return uom;
	}
	
	public int getTimeStamp() {
		
		return timeStamp;
	}


}
