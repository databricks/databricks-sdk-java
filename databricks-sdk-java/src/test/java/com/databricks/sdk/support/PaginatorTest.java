package com.databricks.sdk.support;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class PaginatorTest {

  /** Mutable request, mirroring the generated request types (setters return {@code this}). */
  private static class Req {
    String token;
    int offset;

    Req() {}

    Req(String token) {
      this.token = token;
    }

    Req setToken(String token) {
      this.token = token;
      return this;
    }

    Req setOffset(int offset) {
      this.offset = offset;
      return this;
    }
  }

  private static class Resp {
    final List<String> items;
    final String nextToken;

    Resp(List<String> items, String nextToken) {
      this.items = items;
      this.nextToken = nextToken;
    }
  }

  private static List<String> drain(Iterable<String> it) {
    List<String> out = new ArrayList<>();
    for (String s : it) {
      out.add(s);
    }
    return out;
  }

  /** Regression test for DECO-27280: empty leading pages with a token must not end iteration. */
  @Test
  public void tokenPaginationWalksPastEmptyLeadingPages() {
    Map<String, Resp> pages = new HashMap<>();
    pages.put(null, new Resp(Collections.emptyList(), "t1"));
    pages.put("t1", new Resp(Collections.emptyList(), "t2"));
    pages.put("t2", new Resp(Arrays.asList("A", "B"), null));

    Paginator<Req, Resp, String> p =
        Paginator.newTokenPagination(
            new Req(),
            req -> pages.get(req.token),
            resp -> resp.items,
            resp -> resp.nextToken == null ? null : new Req(resp.nextToken));

    assertEquals(Arrays.asList("A", "B"), drain(p));
  }

  /** Empty pages interleaved between non-empty pages must not truncate the results. */
  @Test
  public void tokenPaginationWalksPastEmptyIntermediatePages() {
    Map<String, Resp> pages = new HashMap<>();
    pages.put(null, new Resp(Collections.singletonList("A"), "t1"));
    pages.put("t1", new Resp(Collections.emptyList(), "t2"));
    pages.put("t2", new Resp(Collections.singletonList("B"), null));

    Paginator<Req, Resp, String> p =
        Paginator.newTokenPagination(
            new Req(),
            req -> pages.get(req.token),
            resp -> resp.items,
            resp -> resp.nextToken == null ? null : new Req(resp.nextToken));

    assertEquals(Arrays.asList("A", "B"), drain(p));
  }

  /**
   * Offset pagination must still stop at the first empty page, even though its nextPageFn never
   * returns null. Otherwise it would loop forever re-requesting incremented offsets.
   */
  @Test
  public void offsetPaginationStopsOnEmptyPage() {
    Map<Integer, Resp> pages = new HashMap<>();
    pages.put(0, new Resp(Arrays.asList("A", "B"), null));
    pages.put(2, new Resp(Collections.singletonList("C"), null));
    pages.put(3, new Resp(Collections.emptyList(), null));

    Req request = new Req();
    Paginator<Req, Resp, String> p =
        Paginator.newOffsetPagination(
            request,
            req -> pages.get(req.offset),
            resp -> resp.items,
            resp -> request.setOffset(request.offset + resp.items.size()));

    assertEquals(Arrays.asList("A", "B", "C"), drain(p));
  }
}
