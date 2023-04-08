// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class ExportResponse {
  /**
   * The base64-encoded content. If the limit (10MB) is exceeded, exception with error code
   * **MAX_NOTEBOOK_SIZE_EXCEEDED** will be thrown.
   */
  @JsonProperty("content")
  private String content;

  public ExportResponse setContent(String content) {
    this.content = content;
    return this;
  }

  public String getContent() {
    return content;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExportResponse that = (ExportResponse) o;
    return Objects.equals(content, that.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content);
  }

  @Override
  public String toString() {
    return new ToStringer(ExportResponse.class).add("content", content).toString();
  }
}
