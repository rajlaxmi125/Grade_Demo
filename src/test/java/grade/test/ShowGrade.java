package grade.test;

import static org.junit.Assert.*;

import org.junit.Test;

import grade.logic.Grade;

public class ShowGrade {
		Grade grade=new Grade();
	@Test
	public void fiftyninereturnF() {
		assertEquals('F',grade.showgrade(59));
	}
	@Test
	public void sixtyninereturnD() {
		assertEquals('D',grade.showgrade(69));
	}
	@Test
	public void seventyninereturnC() {
		assertEquals('C',grade.showgrade(79));
	}
	@Test
	public void eightyninereturnB() {
		assertEquals('B',grade.showgrade(89));
	}
	@Test
	public void ninetyninereturnA() {
		assertEquals('A',grade.showgrade(99));
	}



}
