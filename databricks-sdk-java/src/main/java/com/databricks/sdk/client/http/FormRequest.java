package com.databricks.sdk.client.http;

import java.util.Map;

/**
 * <p>FormRequest class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class FormRequest extends Request {
  /**
   * <p>Constructor for FormRequest.</p>
   *
   * @param url a {@link java.lang.String} object
   * @param form a {@link java.util.Map} object
   */
  public FormRequest(String url, Map<String, String> form) {
    this(POST, url, form);
  }

  /**
   * <p>Constructor for FormRequest.</p>
   *
   * @param method a {@link java.lang.String} object
   * @param url a {@link java.lang.String} object
   * @param form a {@link java.util.Map} object
   */
  public FormRequest(String method, String url, Map<String, String> form) {
    super(method, url, mapToQuery(form));
    withHeader("Content-Type", "application/x-www-form-urlencoded");
  }
}
