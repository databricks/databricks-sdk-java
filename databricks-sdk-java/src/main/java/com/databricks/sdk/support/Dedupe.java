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
@DeveloperApi
class Dedupe<IT, ID> implements Iterator<IT> {
  private final Iterator<IT> inner;
  private final Function<IT, ID> idGetter;
  private IT current;
  private final Set<ID> seen = new HashSet<>();

  public Dedupe(Iterator<IT> inner, Function<IT, ID> idGetter) {
    this.inner = inner;
    this.idGetter = idGetter;
  }

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

  @Override
  public IT next() {
    return current;
  }
}
