package com.databricks.sdk.support;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.function.Function;

/**
 * Consistent pagination support for all APIs
 *
 * @param <RQ> request type
 * @param <RS> response type
 * @param <T> item type
 */
public class Paginator<RQ, RS, T> implements Iterable<T> {
  private final Function<RQ, RS> requestFn;
  private final Function<RS, Collection<T>> itemsFn;
  private final Function<RS, RQ> nextPageFn;
  private RS response;
  private Iterator<T> currentPage;
  private Iterator<T> all;

  /**
   * Repeatedly call `requestFn` until `nextPageFn` returns non-null result.
   *
   * <p>Example: <code>
   *   return new Paginator<>(request, impl::listRuns, ListRunsResponse::getRuns, response -> {
   *     Long offset = request.getOffset();
   *     if (offset == null) {
   *       offset = 0L;
   *     }
   *     offset += response.getRuns().size();
   *     return request.setOffset(offset);
   *   }).withDedupe(BaseRun::getRunId);
   * </code>
   *
   * @param request initial request to `requestFn` implementation, possibly with filters.
   * @param requestFn implementation of request, that takes modified `request` and returns some
   *     results.
   * @param itemsFn reference to the getter method, that returns `Collection<T>` of results.
   * @param nextPageFn return non-null request in case we need to fetch another page of results.
   */
  public Paginator(
      RQ request,
      Function<RQ, RS> requestFn,
      Function<RS, Collection<T>> itemsFn,
      Function<RS, RQ> nextPageFn) {
    this.requestFn = requestFn;
    this.itemsFn = itemsFn;
    this.nextPageFn = nextPageFn;
    all = outerIterator();
    flipNextPage(request, true);
  }

  private boolean flipNextPage(RQ request, boolean firstRequest) {
    // A page may be empty while still carrying a next-page token (e.g. when
    // leading items are filtered out server-side), so an empty page must not
    // stop iteration on its own. Termination is governed solely by nextPageFn
    // returning null, which signals that no further pages exist.
    while (firstRequest || request != null) {
      response = requestFn.apply(request);
      if (response == null) {
        return false;
      }
      Collection<T> results = itemsFn.apply(response);
      if (results == null) {
        results = Collections.emptyList();
      }
      currentPage = results.iterator();
      if (currentPage.hasNext()) {
        return true;
      }
      request = nextPageFn.apply(response);
      firstRequest = false;
    }
    return false;
  }

  private Iterator<T> outerIterator() {
    return new Iterator<T>() {
      @Override
      public boolean hasNext() {
        if (currentPage == null) {
          return false;
        }
        if (currentPage.hasNext()) {
          return true;
        }
        return flipNextPage(nextPageFn.apply(response), false);
      }

      @Override
      public T next() {
        return currentPage.next();
      }
    };
  }

  /**
   * De-duplicate results across all pages with an ID
   *
   * <p>This call is only necessary for offset/limit pagination, where additions/removals may get
   * inconsistent results across multiple page calls
   *
   * @param idGetter reference to ID getter
   * @return ID value, like 92384023984
   * @param <ID> ID type, like Long
   */
  public <ID> Iterable<T> withDedupe(Function<T, ID> idGetter) {
    all = new Dedupe<>(all, idGetter);
    return this;
  }

  @Override
  public Iterator<T> iterator() {
    return all;
  }
}
