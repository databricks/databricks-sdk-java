// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>ExportResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ExportResponse {
  /**
   * The base64-encoded content. If the limit (10MB) is exceeded, exception with error code
   * **MAX_NOTEBOOK_SIZE_EXCEEDED** will be thrown.
   */
  @JsonProperty("content")
  private String content;

  /**
   * <p>Setter for the field <code>content</code>.</p>
   *
   * @param content a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.workspace.ExportResponse} object
   */
  public ExportResponse setContent(String content) {
    this.content = content;
    return this;
  }

  /**
   * <p>Getter for the field <code>content</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getContent() {
    return content;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExportResponse that = (ExportResponse) o;
    return Objects.equals(content, that.content);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(content);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ExportResponse.class).add("content", content).toString();
  }
}
