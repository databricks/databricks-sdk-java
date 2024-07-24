package com.databricks.sdk.core.http;

import java.util.*;

public class FormRequest extends Request {
  public FormRequest(String url, Map<String, String> form) {
    this(POST, url, form);
  }

  public FormRequest(String method, String url, Map<String, String> form) {
    super(method, url, mapToQuery(wrapValuesInList(form)));
    withHeader("Content-Type", "application/x-www-form-urlencoded");
    withHeader("Accept", "application/json");
  }

  static Map<String, List<String>> wrapValuesInList(Map<String, String> map) {
    Map<String, List<String>> m = new LinkedHashMap<>();
    for (Map.Entry<String, String> entry : map.entrySet()) {
      m.put(entry.getKey(), Collections.singletonList(entry.getValue()));
    }
    return m;
  }
}
