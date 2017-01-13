package com.leokom.spliterator;

import java.util.Spliterator;
import java.util.function.Consumer;

public class ArraySpliterator<T> implements Spliterator<T> {
	// trying a generic array while it can cause
	//covariance problems
	public ArraySpliterator(T[] array) {
	}

	@Override
	public boolean tryAdvance(Consumer<? super T> action) {
		return false;
	}

	@Override
	public Spliterator<T> trySplit() {
		return null;
	}

	@Override
	public long estimateSize() {
		return 0;
	}

	@Override
	public int characteristics() {
		return 0;
	}
}