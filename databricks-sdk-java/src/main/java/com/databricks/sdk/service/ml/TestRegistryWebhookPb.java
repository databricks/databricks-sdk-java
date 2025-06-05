// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Test webhook response object. */
@Generated
class TestRegistryWebhookPb {
  @JsonProperty("body")
  private String body;

  @JsonProperty("status_code")
  private Long statusCode;

  public TestRegistryWebhookPb setBody(String body) {
    this.body = body;
    return this;
  }

  public String getBody() {
    return body;
  }

  public TestRegistryWebhookPb setStatusCode(Long statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  public Long getStatusCode() {
    return statusCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TestRegistryWebhookPb that = (TestRegistryWebhookPb) o;
    return Objects.equals(body, that.body) && Objects.equals(statusCode, that.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, statusCode);
  }

  @Override
  public String toString() {
    return new ToStringer(TestRegistryWebhookPb.class)
        .add("body", body)
        .add("statusCode", statusCode)
        .toString();
  }
}
