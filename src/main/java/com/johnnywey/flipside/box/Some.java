package com.johnnywey.flipside.box;

import java.io.Serializable;

/**
 * A Full box.
 *
 * Call .get() will return the value.
 */
public class Some<T> implements Box<T>, Serializable {
    private static final long serialVersionUID = 1L;

    private final T result;

    public Some(T resultIn) {
        result = resultIn;
    }

    @Override
    public T get() {
        return result;
    }

    @Override
    public Boolean isEmpty() {
        return false;
    }
}
