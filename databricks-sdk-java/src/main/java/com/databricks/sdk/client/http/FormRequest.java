package com.databricks.sdk.client.http;

import java.util.Map;

public class FormRequest extends Request {
  public FormRequest(String url, Map<String, String> form) {
    this(POST, url, form);
  }

  public FormRequest(String method, String url, Map<String, String> form) {
    super(method, url, mapToQuery(form));
    withHeader("Content-Type", "application/x-www-form-urlencoded");
  }
}
