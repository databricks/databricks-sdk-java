package com.databricks.sdk.client.http;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;

class FormRequestTest {
  @Test
  public void itWorks() {
    Map<String, String> data = new TreeMap<>();
    data.put("foo", "bar");
    data.put("new", "foo");
    FormRequest request = new FormRequest("/foo", data);
    assertEquals("POST", request.getMethod());
    assertEquals("foo=bar&new=foo", request.getBody());
    assertEquals("application/x-www-form-urlencoded", request.getHeaders().get("Content-Type"));
  }
}
