package com.databricks.sdk.support;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;

/**
 * De-duplicating iterator decorator
 *
 * <p>Based on internal set of identifiers, decide either or not to propagate the item to the
 * iteration loop.
 *
 * @param <IT> item of iteration
 * @param <ID> identifier
 */
class Dedupe<IT, ID> implements Iterator<IT> {
  private final Iterator<IT> inner;
  private final Function<IT, ID> idGetter;
  private IT current;
  private final Set<ID> seen = new HashSet<>();

  /**
   * <p>Constructor for Dedupe.</p>
   *
   * @param inner a {@link java.util.Iterator} object
   * @param idGetter a {@link java.util.function.Function} object
   */
  public Dedupe(Iterator<IT> inner, Function<IT, ID> idGetter) {
    this.inner = inner;
    this.idGetter = idGetter;
  }

  /** {@inheritDoc} */
  @Override
  public boolean hasNext() {
    IT tmp;
    while (inner.hasNext()) {
      tmp = inner.next();
      ID id = idGetter.apply(tmp);
      if (seen.contains(id)) {
        continue;
      }
      seen.add(id);
      current = tmp;
      return true;
    }
    return false;
  }

  /** {@inheritDoc} */
  @Override
  public IT next() {
    return current;
  }
}
