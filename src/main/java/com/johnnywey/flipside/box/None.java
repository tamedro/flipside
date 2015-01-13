package com.johnnywey.flipside.box;

import java.io.Serializable;

/**
 * An empty Box.
 * 
 * Calling .get() will throw an exception.
 */
public class None<T> implements Box<T>, Serializable {
	private static final long serialVersionUID = 1L;

    @Override
    public T get() {
        throw new UnsupportedOperationException("Cannot resolve value on None");
    }

    @Override
    public Boolean isEmpty() {
        return true;
    }
}
