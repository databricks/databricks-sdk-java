package com.databricks.sdk.core.http;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

class FormRequestTest {
  @Test
  public void itWorks() {
    Map<String, String> data = new LinkedHashMap<>();
    data.put("foo", "bar");
    data.put("new", "foo");
    FormRequest request = new FormRequest("/foo", data);
    assertEquals("POST", request.getMethod());
    assertEquals("foo=bar&new=foo", request.getBody());
    assertEquals("application/x-www-form-urlencoded", request.getHeaders().get("Content-Type"));
  }
}
