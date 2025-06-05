// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class QueueDetailsPb {
  @JsonProperty("code")
  private QueueDetailsCodeCode code;

  @JsonProperty("message")
  private String message;

  public QueueDetailsPb setCode(QueueDetailsCodeCode code) {
    this.code = code;
    return this;
  }

  public QueueDetailsCodeCode getCode() {
    return code;
  }

  public QueueDetailsPb setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueueDetailsPb that = (QueueDetailsPb) o;
    return Objects.equals(code, that.code) && Objects.equals(message, that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }

  @Override
  public String toString() {
    return new ToStringer(QueueDetailsPb.class)
        .add("code", code)
        .add("message", message)
        .toString();
  }
}
