package com.mockito.Unittestbymockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class U2 {

	@Test
	public void getbiggernumber() {
		 Businesservice businesservicemock = mock(Businesservice.class);
		// businesservicemock.retrivealldata() =>new int[] {12,23,45};
		 when(businesservicemock.retrivealldata()).thenReturn(new int[] {12,23,45});
		BusinessImpl b=new BusinessImpl(businesservicemock);
		int result = b.getbiggernumber();
		assertEquals(45,result);
	}


//class Dataservice implements Businesservice
//{
//	public  int[] retrivealldata() {
//		
//		return new int[] {12,24,34};
//	}
//}
@Test
public void getbiggernumber1() {
	 Businesservice businesservicemock = mock(Businesservice.class);
	// businesservicemock.retrivealldata() =>new int[] {12,23,45};
	 when(businesservicemock.retrivealldata()).thenReturn(new int[] {12});
	BusinessImpl b=new BusinessImpl(businesservicemock);
	int result = b.getbiggernumber();
	assertEquals(23,result);
}

}
