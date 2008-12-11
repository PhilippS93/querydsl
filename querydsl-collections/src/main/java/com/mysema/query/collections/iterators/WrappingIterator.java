/**
 * 
 */
package com.mysema.query.collections.iterators;

import java.util.Iterator;

/**
 * WrappingIt provides
 *
 * @author tiwe
 * @version $Id$
 */
public abstract class WrappingIterator<RT> extends IteratorBase<RT>{
    private Iterator<?> it;  
    public WrappingIterator(Iterator<?> it) {
        this.it = it;
    }
    public boolean hasNext() {
        return it.hasNext();
    }
    protected Object nextFromOrig() {
        return it.next();
    }
    
}