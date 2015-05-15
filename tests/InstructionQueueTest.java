package challenge.tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import challenge.code.InstructionMessage;
import challenge.code.InstructionQueue;
import challenge.code.InvalidMessageException;


public class InstructionQueueTest {
	
	private InstructionQueue instructQueue = new InstructionQueue();
	private InstructionMessage message = new InstructionMessage(90, 5, 5, 5, 5);
	private InstructionMessage message1 = new InstructionMessage(11, 3, 7, 245, 5);
	private InstructionMessage message2 = new InstructionMessage(-1, 4, 6, 1, 3);
	
	@Before
	public void fillInstructionQueue() throws Exception{
		
		instructQueue.addInstructionMessage(message);
		instructQueue.addInstructionMessage(message1);
		instructQueue.addInstructionMessage(message);
	}

	@Test
	public void addInstructionMessages() throws Exception{
		
		assertEquals(3, instructQueue.countInstructionMessages());
	}
	
	@Test
	public void retrieveInstructionMessages() throws Exception{
		
		assertEquals(message1, instructQueue.retrieveInstructionMessages());//retrieves based on the priority of insertion the Instruction Message at the head of the queue
	}
	
	@Test
	public void EnptyInstructionQueue() throws Exception{
		
		assertEquals(false, instructQueue.isEmptyInstructionQueue());
	}
	
	@Test
	public void removesInstructionMessages() throws Exception{
		
		assertEquals(message1, instructQueue.removeInstructionMessages());//removes the Instruction message at the head of the queue
	}
	
	@Test(expected = InvalidMessageException.class)
	public void validateInstructionMessages() throws Exception{
	
		instructQueue.addInstructionMessage(message2);
	}

}
