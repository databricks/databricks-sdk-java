package com.databricks.sdk.support;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Function;

/**
 * Consistent pagination support for all APIs
 *
 * <p>Databricks APIs use two pagination strategies. Token-based APIs may return an empty page that
 * still carries a {@code next_page_token}, so iteration must continue until {@code nextPageFn}
 * returns null ({@link #newTokenPagination}). Offset/limit APIs (SCIM, legacy SQL) carry no token
 * and stop on the first empty page ({@link #newOffsetPagination}).
 *
 * @param <RQ> request type
 * @param <RS> response type
 * @param <T> item type
 */
public class Paginator<RQ, RS, T> implements Iterable<T> {
  private final Function<RQ, RS> requestFn;
  private final Function<RS, Collection<T>> itemsFn;
  private final Function<RS, RQ> nextPageFn;
  private final boolean tokenBasedPagination;
  private RS response;
  private Iterator<T> currentPage;
  private Iterator<T> all;

  /**
   * Creates a paginator for token-based APIs, which continue past empty pages until {@code
   * nextPageFn} returns null.
   *
   * <p>Example: <code>
   *   return Paginator.newTokenPagination(request, impl::list, ListTablesResponse::getTables,
   *       response -> {
   *         String token = response.getNextPageToken();
   *         if (token == null || token.isEmpty()) {
   *           return null;
   *         }
   *         return request.setPageToken(token);
   *       });
   * </code>
   *
   * @param request initial request to `requestFn` implementation, possibly with filters.
   * @param requestFn implementation of request, that takes modified `request` and returns some
   *     results.
   * @param itemsFn reference to the getter method, that returns `Collection<T>` of results.
   * @param nextPageFn return non-null request in case we need to fetch another page of results,
   *     null once the page token is absent.
   */
  public static <RQ, RS, T> Paginator<RQ, RS, T> newTokenPagination(
      RQ request,
      Function<RQ, RS> requestFn,
      Function<RS, Collection<T>> itemsFn,
      Function<RS, RQ> nextPageFn) {
    return new Paginator<>(request, requestFn, itemsFn, nextPageFn, true);
  }

  /**
   * Creates a paginator for offset/limit-based APIs, which stop on the first empty page.
   *
   * <p>Example: <code>
   *   return Paginator.newOffsetPagination(request, impl::listRuns, ListRunsResponse::getRuns,
   *       response -> {
   *         Long offset = request.getOffset();
   *         if (offset == null) {
   *           offset = 0L;
   *         }
   *         offset += response.getRuns().size();
   *         return request.setOffset(offset);
   *       }).withDedupe(BaseRun::getRunId);
   * </code>
   *
   * @param request initial request to `requestFn` implementation, possibly with filters.
   * @param requestFn implementation of request, that takes modified `request` and returns some
   *     results.
   * @param itemsFn reference to the getter method, that returns `Collection<T>` of results.
   * @param nextPageFn return non-null request in case we need to fetch another page of results.
   */
  public static <RQ, RS, T> Paginator<RQ, RS, T> newOffsetPagination(
      RQ request,
      Function<RQ, RS> requestFn,
      Function<RS, Collection<T>> itemsFn,
      Function<RS, RQ> nextPageFn) {
    return new Paginator<>(request, requestFn, itemsFn, nextPageFn, false);
  }

  /**
   * Repeatedly call `requestFn` until `nextPageFn` returns a null result. Uses offset/limit
   * semantics: iteration stops on the first empty page.
   *
   * @deprecated Use {@link #newTokenPagination} or {@link #newOffsetPagination} instead, which make
   *     the pagination strategy explicit. Token-based APIs must use {@link #newTokenPagination} to
   *     avoid stopping early on an empty page that still carries a next-page token.
   * @param request initial request to `requestFn` implementation, possibly with filters.
   * @param requestFn implementation of request, that takes modified `request` and returns some
   *     results.
   * @param itemsFn reference to the getter method, that returns `Collection<T>` of results.
   * @param nextPageFn return non-null request in case we need to fetch another page of results.
   */
  @Deprecated
  public Paginator(
      RQ request,
      Function<RQ, RS> requestFn,
      Function<RS, Collection<T>> itemsFn,
      Function<RS, RQ> nextPageFn) {
    this(request, requestFn, itemsFn, nextPageFn, false);
  }

  private Paginator(
      RQ request,
      Function<RQ, RS> requestFn,
      Function<RS, Collection<T>> itemsFn,
      Function<RS, RQ> nextPageFn,
      boolean tokenBasedPagination) {
    this.requestFn = requestFn;
    this.itemsFn = itemsFn;
    this.nextPageFn = nextPageFn;
    this.tokenBasedPagination = tokenBasedPagination;
    all = outerIterator();
    flipNextPage(request, true);
  }

  private boolean flipNextPage(RQ request, boolean firstRequest) {
    if (!firstRequest && request == null) {
      return false;
    }
    response = requestFn.apply(request);
    if (response == null) {
      return false;
    }
    Collection<T> results = itemsFn.apply(response);
    if (results == null) {
      return false;
    }
    currentPage = results.iterator();
    // Token-based pagination may return an empty page that still carries a next_page_token, so
    // advance to the next page (nextPageFn returns null once the token is absent) rather than
    // treating an empty page as the end of results.
    if (tokenBasedPagination && !currentPage.hasNext()) {
      return flipNextPage(nextPageFn.apply(response), false);
    }
    return currentPage.hasNext();
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
