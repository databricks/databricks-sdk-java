// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aifunctions;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A single page that failed to parse while the overall request succeeded. */
@Generated
public class AiParseDocumentPageError {
  /** Message describing why the page failed. */
  @JsonProperty("error_message")
  private String errorMessage;

  /** 0-based index of the page that failed. */
  @JsonProperty("page_id")
  private Long pageId;

  public AiParseDocumentPageError setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public AiParseDocumentPageError setPageId(Long pageId) {
    this.pageId = pageId;
    return this;
  }

  public Long getPageId() {
    return pageId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AiParseDocumentPageError that = (AiParseDocumentPageError) o;
    return Objects.equals(errorMessage, that.errorMessage) && Objects.equals(pageId, that.pageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMessage, pageId);
  }

  @Override
  public String toString() {
    return new ToStringer(AiParseDocumentPageError.class)
        .add("errorMessage", errorMessage)
        .add("pageId", pageId)
        .toString();
  }
}
