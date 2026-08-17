package com.databricks.sdk.core.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

/**
 * Verifies that int64 ({@code Long}) fields deserialize from both JSON numbers ({@code 123}) and
 * decimal strings ({@code "123"}), which Databricks services use interchangeably. The behavior is
 * pinned in {@link SerDeUtils#createMapper()}; this mirrors the Go SDK's {@code
 * marshal/int64_test.go}.
 */
public class SerDeUtilsInt64Test {
  private final ObjectMapper mapper = SerDeUtils.createMapper();

  public static class LongHolder {
    public Long value;
  }

  public static class Inner {
    public Long id;
  }

  public static class Outer {
    public Inner inner;
  }

  public static class ListHolder {
    public List<Long> values;
  }

  public static class MapHolder {
    public Map<String, Long> counts;
  }

  public static class Mixed {
    public Long id;
    public String name;
  }

  public static class UntypedHolder {
    public Object payload;
  }

  @Test
  public void topLevelLongFromNumberAndString() throws JsonProcessingException {
    assertEquals(Long.valueOf(123L), mapper.readValue("123", Long.class));
    assertEquals(Long.valueOf(123L), mapper.readValue("\"123\"", Long.class));
  }

  @Test
  public void longFieldFromNumberAndString() throws JsonProcessingException {
    assertEquals(Long.valueOf(123L), mapper.readValue("{\"value\":123}", LongHolder.class).value);
    assertEquals(
        Long.valueOf(123L), mapper.readValue("{\"value\":\"123\"}", LongHolder.class).value);
  }

  @Test
  public void nestedLongFromString() throws JsonProcessingException {
    Outer out = mapper.readValue("{\"inner\":{\"id\":\"456\"}}", Outer.class);
    assertEquals(Long.valueOf(456L), out.inner.id);
  }

  @Test
  public void listOfLongAcceptsMixedForms() throws JsonProcessingException {
    ListHolder h = mapper.readValue("{\"values\":[\"1\",2,\"3\"]}", ListHolder.class);
    assertEquals(Arrays.asList(1L, 2L, 3L), h.values);
  }

  @Test
  public void mapOfLongAcceptsMixedForms() throws JsonProcessingException {
    MapHolder h = mapper.readValue("{\"counts\":{\"a\":\"1\",\"b\":2}}", MapHolder.class);
    assertEquals(Long.valueOf(1L), h.counts.get("a"));
    assertEquals(Long.valueOf(2L), h.counts.get("b"));
  }

  @Test
  public void boundaryValuesFromNumberAndString() throws JsonProcessingException {
    assertEquals(
        Long.valueOf(Long.MAX_VALUE),
        mapper.readValue("{\"value\":9223372036854775807}", LongHolder.class).value);
    assertEquals(
        Long.valueOf(Long.MAX_VALUE),
        mapper.readValue("{\"value\":\"9223372036854775807\"}", LongHolder.class).value);
    assertEquals(
        Long.valueOf(Long.MIN_VALUE),
        mapper.readValue("{\"value\":-9223372036854775808}", LongHolder.class).value);
    assertEquals(
        Long.valueOf(Long.MIN_VALUE),
        mapper.readValue("{\"value\":\"-9223372036854775808\"}", LongHolder.class).value);
  }

  @Test
  public void invalidNumericStringFails() {
    assertThrows(
        JsonProcessingException.class,
        () -> mapper.readValue("{\"value\":\"not-an-int\"}", LongHolder.class));
  }

  @Test
  public void overflowStringFails() {
    // 20 nines: larger than Long.MAX_VALUE.
    assertThrows(
        JsonProcessingException.class,
        () -> mapper.readValue("{\"value\":\"99999999999999999999\"}", LongHolder.class));
  }

  @Test
  public void stringFieldIsNotCoercedToNumber() throws JsonProcessingException {
    Mixed m = mapper.readValue("{\"id\":\"5\",\"name\":\"5\"}", Mixed.class);
    assertEquals(Long.valueOf(5L), m.id);
    assertEquals("5", m.name);
  }

  @Test
  public void untypedFieldPreservesJsonForm() throws JsonProcessingException {
    // Coercion only targets integer-typed fields, so an untyped field keeps its JSON form.
    UntypedHolder asString = mapper.readValue("{\"payload\":\"123\"}", UntypedHolder.class);
    assertInstanceOf(String.class, asString.payload);
    assertEquals("123", asString.payload);

    UntypedHolder asNumber = mapper.readValue("{\"payload\":123}", UntypedHolder.class);
    assertInstanceOf(Number.class, asNumber.payload);
  }
}
