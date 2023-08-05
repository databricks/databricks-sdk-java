package com.databricks.sdk.framework;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionUtils {
  public static <T> List<T> asList(Iterable<T> it) {
    List<T> all = new ArrayList<>();
    it.forEach(all::add);
    return all;
  }

  public static <T> void assertUnique(List<T> all) {
    Set<T> unique = new HashSet<>(all);
    assertEquals(unique.size(), all.size(), "Items are not unique");
  }
}
