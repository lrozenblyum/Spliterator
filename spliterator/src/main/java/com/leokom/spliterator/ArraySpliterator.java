package com.leokom.spliterator;

import java.util.Spliterator;
import java.util.function.Consumer;

public class ArraySpliterator<T> implements Spliterator<T> {
	private T[] array;
	private int index = 0;

	// trying a generic array while it can cause
	//covariance problems
	public ArraySpliterator( T[] array ) {
		this.array = array;
	}

	@Override
	public boolean tryAdvance( Consumer< ? super T > action ) {
		if ( index == array.length ) {
			return false;
		}

		action.accept( array[ index++ ] );
		return true;
	}

	@Override
	public Spliterator<T> trySplit() {
		//simple yet valid if we don't want to split
		return null;
	}

	@Override
	public long estimateSize() {
		//super-simple, should be replaced by real size
		return 0;
	}

	@Override
	public int characteristics() {
		//important to collect them for optimizations
		return 0;
	}
}