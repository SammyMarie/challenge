package challenge.code;

import java.util.Comparator;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;


public class InstructionQueue {
	
	private Queue<InstructionMessage> messages = insertInstructionMessages();


	private PriorityBlockingQueue<InstructionMessage> insertInstructionMessages() {
		
		return new PriorityBlockingQueue<InstructionMessage>(1000, new Comparator<InstructionMessage>(){
			
			public int compare(InstructionMessage message1, InstructionMessage message2) {
						
				if(message1.getInstructionType() > message2.getInstructionType()){
					
		            return 1;
		        }
				
				if(message1.getInstructionType() < message2.getInstructionType()){
					
		            return -1;
		        }
				return 0;
			}
		});
	}
	

	public void addInstructionMessage(InstructionMessage message) throws InvalidMessageException {
		
		if(message.getInstructionType() < 0  || message.getInstructionType() > 100)
				throw new InvalidMessageException("Invalid Instruction Type");
		
		if(message.getUom() <= 0 || message.getUom() > 256)
			throw new InvalidMessageException("Invalid UOM value");
		
		if(message.getProductCode() < 0)
			throw new InvalidMessageException("Invalid Product Code");
		
		if(message.getQuantity() < 0)
			throw new InvalidMessageException("Invalid Quantity");
		
		if(message.getTimeStamp() < 0)
			throw new InvalidMessageException("Invalid Time Stamp");
		
		messages.offer(message);
	}

	public int countInstructionMessages() {
		
		return messages.size();
	}


	public InstructionMessage retrieveInstructionMessages() {
		
		return messages.peek();
	}


	public boolean isEmptyInstructionQueue() {
		
		return messages.isEmpty();
	}


	public InstructionMessage removeInstructionMessages() {
		
		return messages.poll();
	}

}
