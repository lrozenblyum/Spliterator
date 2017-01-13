package com.leokom.spliterator;

import static org.junit.Assert.*;

import java.util.Spliterator;

import org.junit.Test;

public class ArraySpliteratorTest {
	@Test
	public void spliteratorExists() {
		String [] array = {};
		
		assertTrue( new ArraySpliterator<String>( array ) instanceof Spliterator );
	}
}