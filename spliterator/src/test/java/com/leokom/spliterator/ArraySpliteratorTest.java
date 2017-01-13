package com.leokom.spliterator;

import static org.junit.Assert.*;

import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.junit.Test;

public class ArraySpliteratorTest {
	@Test
	public void spliteratorExists() {
		String [] array = {};
		
		assertTrue( new ArraySpliterator<String>( array ) instanceof Spliterator );
	}
	
	@Test
	public void sequentialStreamOfSpliterator() {
		Integer [] array = { 1, 2, 3 };
		
		ArraySpliterator<Integer> spliterator = new ArraySpliterator<Integer>( array );
		
		Stream<Integer> stream = StreamSupport.stream( spliterator, false );
		
		assertEquals( 6, stream.mapToInt(Integer::intValue ).sum() );
	}
}