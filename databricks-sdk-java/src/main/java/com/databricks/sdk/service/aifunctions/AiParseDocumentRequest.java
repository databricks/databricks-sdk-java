// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aifunctions;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AiParseDocumentRequest {
  /**
   * The document to parse, given as a Unity Catalog volume path to the source file (the REST API
   * accepts only a UC volume path, not inline binary data). Supported formats: PDF, DOCX, DOC,
   * PPTX, PPT, JPG, JPEG, PNG, TIFF. Accepts up to 100 pages and 100 MB per document.
   */
  @JsonProperty("content")
  private String content;

  /** Function options. Omitted fields fall back to their documented defaults. */
  @JsonProperty("options")
  private AiParseDocumentOptions options;

  public AiParseDocumentRequest setContent(String content) {
    this.content = content;
    return this;
  }

  public String getContent() {
    return content;
  }

  public AiParseDocumentRequest setOptions(AiParseDocumentOptions options) {
    this.options = options;
    return this;
  }

  public AiParseDocumentOptions getOptions() {
    return options;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AiParseDocumentRequest that = (AiParseDocumentRequest) o;
    return Objects.equals(content, that.content) && Objects.equals(options, that.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, options);
  }

  @Override
  public String toString() {
    return new ToStringer(AiParseDocumentRequest.class)
        .add("content", content)
        .add("options", options)
        .toString();
  }
}
