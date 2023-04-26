// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Test webhook response object.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class TestRegistryWebhook {
  /** Body of the response from the webhook URL */
  @JsonProperty("body")
  private String body;

  /** Status code returned by the webhook URL */
  @JsonProperty("status_code")
  private Long statusCode;

  /**
   * <p>Setter for the field <code>body</code>.</p>
   *
   * @param body a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.TestRegistryWebhook} object
   */
  public TestRegistryWebhook setBody(String body) {
    this.body = body;
    return this;
  }

  /**
   * <p>Getter for the field <code>body</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getBody() {
    return body;
  }

  /**
   * <p>Setter for the field <code>statusCode</code>.</p>
   *
   * @param statusCode a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.ml.TestRegistryWebhook} object
   */
  public TestRegistryWebhook setStatusCode(Long statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * <p>Getter for the field <code>statusCode</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getStatusCode() {
    return statusCode;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TestRegistryWebhook that = (TestRegistryWebhook) o;
    return Objects.equals(body, that.body) && Objects.equals(statusCode, that.statusCode);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(body, statusCode);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(TestRegistryWebhook.class)
        .add("body", body)
        .add("statusCode", statusCode)
        .toString();
  }
}
