package com.databricks.sdk.support;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;

public class PaginatorTest {

  /** A page returned by the fake backend: its items plus the request token for the next page. */
  static class Page {
    final List<Integer> items;
    final Integer next; // request token for the following page, or null when there are no more

    Page(List<Integer> items, Integer next) {
      this.items = items;
      this.next = next;
    }
  }

  /**
   * In-memory token-style backend. Each page is addressed by an integer token (its index in the
   * list) and points at the next page's token, or null for the last page. The first request uses
   * token 0. Counts requestFn / nextPageFn invocations so tests can assert the loop makes forward
   * progress without redundant or runaway fetches.
   */
  static class FakeBackend {
    final List<Page> pages;
    int requestCalls = 0;
    int nextPageCalls = 0;

    FakeBackend(Page... pages) {
      this.pages = Arrays.asList(pages);
    }

    Paginator<Integer, Page, Integer> paginator() {
      return new Paginator<>(
          0,
          token -> {
            requestCalls++;
            return pages.get(token);
          },
          page -> page.items,
          page -> {
            nextPageCalls++;
            return page.next;
          });
    }
  }

  /** Page with items that points at the next token. */
  private static Page page(Integer next, Integer... items) {
    return new Page(Arrays.asList(items), next);
  }

  /** Terminal page (no next token). */
  private static Page lastPage(Integer... items) {
    return new Page(Arrays.asList(items), null);
  }

  /** Empty page that still advertises a next token. */
  private static Page emptyPage(Integer next) {
    return new Page(Collections.emptyList(), next);
  }

  private static List<Integer> drain(Iterable<Integer> it) {
    List<Integer> out = new ArrayList<>();
    for (Integer i : it) {
      out.add(i);
    }
    return out;
  }

  // ---------------------------------------------------------------------------
  // Result correctness across page shapes
  // ---------------------------------------------------------------------------

  @Test
  public void emptyLeadingPagesWithTokensAreTraversed() {
    // Regression test for DECO-27280: leading empty pages carry valid tokens and must not stop
    // iteration. The real rows live on a later page.
    FakeBackend b = new FakeBackend(emptyPage(1), emptyPage(2), emptyPage(3), lastPage(10, 20));
    assertEquals(Arrays.asList(10, 20), drain(b.paginator()));
  }

  @Test
  public void interleavedEmptyPagesAreTraversed() {
    FakeBackend b = new FakeBackend(page(1, 1), emptyPage(2), page(3, 2), emptyPage(4), lastPage());
    assertEquals(Arrays.asList(1, 2), drain(b.paginator()));
  }

  @Test
  public void trailingEmptyPageThenNullTokenTerminates() {
    FakeBackend b = new FakeBackend(page(1, 1, 2), lastPage());
    assertEquals(Arrays.asList(1, 2), drain(b.paginator()));
  }

  @Test
  public void multiPagePaginationPreservesOrder() {
    FakeBackend b = new FakeBackend(page(1, 1, 2), page(2, 3, 4), lastPage(5));
    assertEquals(Arrays.asList(1, 2, 3, 4, 5), drain(b.paginator()));
  }

  @Test
  public void singlePageTerminates() {
    FakeBackend b = new FakeBackend(lastPage(7, 8, 9));
    assertEquals(Arrays.asList(7, 8, 9), drain(b.paginator()));
  }

  @Test
  public void allEmptyPagesYieldNothing() {
    FakeBackend b = new FakeBackend(emptyPage(1), emptyPage(2), lastPage());
    assertTrue(drain(b.paginator()).isEmpty());
  }

  @Test
  public void nullItemsCollectionIsTreatedAsEmpty() {
    // A page whose items getter returns null must be handled as an empty page, not throw.
    Paginator<Integer, Page, Integer> p =
        new Paginator<>(
            0,
            token -> token == 0 ? new Page(null, 1) : lastPage(42),
            page -> page.items,
            page -> page.next);
    assertEquals(Arrays.asList(42), drain(p));
  }

  @Test
  public void nullResponseTerminates() {
    Paginator<Integer, Page, Integer> p =
        new Paginator<>(0, token -> null, page -> page.items, page -> page.next);
    assertTrue(drain(p).isEmpty());
  }

  // ---------------------------------------------------------------------------
  // Loop mechanics: forward progress, fetch counts, no redundant/runaway calls
  // ---------------------------------------------------------------------------

  @Test
  public void eachPageIsFetchedExactlyOnce() {
    FakeBackend b = new FakeBackend(page(1, 1, 2), page(2, 3, 4), lastPage(5));
    assertEquals(Arrays.asList(1, 2, 3, 4, 5), drain(b.paginator()));
    // One request per page, no re-fetching.
    assertEquals(3, b.requestCalls);
  }

  @Test
  public void leadingEmptyPagesAreEachFetchedExactlyOnce() {
    FakeBackend b = new FakeBackend(emptyPage(1), emptyPage(2), emptyPage(3), lastPage(10));
    assertEquals(Arrays.asList(10), drain(b.paginator()));
    assertEquals(4, b.requestCalls); // 3 empty + 1 data, each once
  }

  @Test
  public void constructorEagerlyFetchesFirstPage() {
    FakeBackend b = new FakeBackend(page(1, 1), lastPage(2));
    Paginator<Integer, Page, Integer> p = b.paginator();
    // The first request happens during construction, before any iteration.
    assertEquals(1, b.requestCalls);
    assertEquals(Arrays.asList(1, 2), drain(p));
  }

  @Test
  public void constructorWalksAllLeadingEmptyPagesBeforeIteration() {
    FakeBackend b =
        new FakeBackend(emptyPage(1), emptyPage(2), emptyPage(3), emptyPage(4), lastPage(99));
    Paginator<Integer, Page, Integer> p = b.paginator();
    // Eager first fetch walks every empty leading page up to the first non-empty one.
    assertEquals(5, b.requestCalls);
    assertEquals(Arrays.asList(99), drain(p));
  }

  @Test
  public void manyEmptyPagesDoNotStopIteration() {
    // Stress the loop: a long run of empty-but-tokened pages must be traversed to reach the data.
    int emptyCount = 1000;
    Page[] pages = new Page[emptyCount + 1];
    for (int i = 0; i < emptyCount; i++) {
      pages[i] = emptyPage(i + 1);
    }
    pages[emptyCount] = lastPage(7);
    FakeBackend b = new FakeBackend(pages);
    assertEquals(Arrays.asList(7), drain(b.paginator()));
    assertEquals(emptyCount + 1, b.requestCalls);
  }

  @Test
  public void hasNextIsStableAfterExhaustionAndDoesNotRefetch() {
    FakeBackend b = new FakeBackend(page(1, 1), lastPage(2));
    Iterator<Integer> it = b.paginator().iterator();
    assertEquals(Arrays.asList(1, 2), drain(() -> it));
    int callsAtExhaustion = b.requestCalls;
    // Repeated hasNext() after exhaustion stays false and triggers no additional page fetches.
    for (int i = 0; i < 5; i++) {
      assertFalse(it.hasNext());
    }
    assertEquals(callsAtExhaustion, b.requestCalls);
  }

  @Test
  public void offsetStylePaginationTerminatesOnEmptyPage() {
    // Mirrors the generated offset lambda: nextPageFn returns null once a page is empty, so an
    // empty final page terminates iteration instead of re-fetching the same offset forever.
    List<List<Integer>> pages =
        Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Collections.emptyList());
    int[] requestCalls = {0};
    Paginator<Integer, List<Integer>, Integer> p =
        new Paginator<>(
            0,
            offset -> {
              requestCalls[0]++;
              return pages.get(Math.min(offset, pages.size() - 1));
            },
            items -> items,
            items -> (items == null || items.isEmpty()) ? null : pages.indexOf(items) + 1);
    assertEquals(Arrays.asList(1, 2, 3, 4), drain(p));
    // Two data pages plus exactly one fetch of the empty terminating page.
    assertEquals(3, requestCalls[0]);
  }

  @Test
  public void loopHasNoBuiltInGuardAndDependsOnNextPageFnReturningNull() {
    // The loop's only termination signal is nextPageFn returning null. A lambda that returns a
    // non-null request for an empty page (the offset bug this fix guards against) loops forever.
    // Cap the backend to prove the loop keeps fetching and never self-terminates; the runaway is
    // hit eagerly during construction, which is where leading pages are walked.
    int[] calls = {0};
    assertThrows(
        IllegalStateException.class,
        () ->
            new Paginator<Integer, List<Integer>, Integer>(
                0,
                token -> {
                  if (++calls[0] > 100) {
                    throw new IllegalStateException("runaway pagination: loop never terminated");
                  }
                  return Collections.emptyList(); // every page is empty
                },
                items -> items,
                items -> 0)); // never null -> models the un-fixed offset lambda
  }

  // ---------------------------------------------------------------------------
  // Iterator contract and error propagation
  // ---------------------------------------------------------------------------

  @Test
  public void exceptionFromRequestFnPropagatesDuringIteration() {
    RuntimeException boom = new RuntimeException("page 2 failed");
    Paginator<Integer, Page, Integer> p =
        new Paginator<>(
            0,
            token -> {
              if (token == 1) {
                throw boom;
              }
              return token == 0 ? page(1, 1) : lastPage(2);
            },
            page -> page.items,
            page -> page.next);
    Iterator<Integer> it = p.iterator();
    assertEquals(1, it.next()); // first page fetched in constructor
    RuntimeException thrown = assertThrows(RuntimeException.class, it::hasNext);
    assertSame(boom, thrown);
  }

  @Test
  public void exceptionFromNextPageFnPropagatesDuringIteration() {
    RuntimeException boom = new RuntimeException("nextPage failed");
    Paginator<Integer, Page, Integer> p =
        new Paginator<>(
            0,
            token -> token == 0 ? page(1, 1) : lastPage(2),
            page -> page.items,
            page -> {
              throw boom;
            });
    Iterator<Integer> it = p.iterator();
    assertEquals(1, it.next());
    RuntimeException thrown = assertThrows(RuntimeException.class, it::hasNext);
    assertSame(boom, thrown);
  }

  @Test
  public void nullInitialRequestIsAllowedOnFirstFetch() {
    // Legacy "empty request" APIs construct the Paginator with a null initial request; the
    // firstRequest flag must let that first call through rather than treating null as "no pages".
    int[] calls = {0};
    Paginator<Void, List<Integer>, Integer> p =
        new Paginator<>(
            null,
            v -> {
              calls[0]++;
              return Arrays.asList(1, 2, 3);
            },
            items -> items,
            items -> null);
    assertEquals(Arrays.asList(1, 2, 3), drain(p));
    assertEquals(1, calls[0]);
  }

  @Test
  public void nextDoesNotAdvancePagesWithoutHasNext() {
    // Documents current behavior: page advancement happens only in hasNext(). Callers must use
    // hasNext()/for-each; calling next() past the current page does not roll over to the next one.
    FakeBackend b = new FakeBackend(page(1, 1), lastPage(2));
    Iterator<Integer> it = b.paginator().iterator();
    assertEquals(1, it.next());
    assertThrows(NoSuchElementException.class, it::next);
  }

  @Test
  public void secondIterationYieldsNothing() {
    // The Paginator is single-use: it eagerly consumes from one underlying iterator.
    FakeBackend b = new FakeBackend(page(1, 1, 2), lastPage(3));
    Paginator<Integer, Page, Integer> p = b.paginator();
    assertEquals(Arrays.asList(1, 2, 3), drain(p));
    assertTrue(drain(p).isEmpty());
  }

  // ---------------------------------------------------------------------------
  // Dedupe
  // ---------------------------------------------------------------------------

  @Test
  public void withDedupeRemovesDuplicatesAcrossPages() {
    FakeBackend b = new FakeBackend(page(1, 1, 2), page(2, 2, 3), lastPage(3, 4));
    assertEquals(Arrays.asList(1, 2, 3, 4), drain(b.paginator().withDedupe(i -> i)));
  }

  @Test
  public void withDedupeTraversesEmptyPages() {
    FakeBackend b = new FakeBackend(page(1, 1), emptyPage(2), page(3, 1, 2), lastPage());
    assertEquals(Arrays.asList(1, 2), drain(b.paginator().withDedupe(i -> i)));
  }
}
