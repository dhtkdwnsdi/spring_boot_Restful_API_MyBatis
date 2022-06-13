package org.hdcd;

import org.hdcd.domain.Board;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevPorjectApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testNoArgsConstructor() {
		Board board = new Board();
		
		System.out.println(board);
	}

}
