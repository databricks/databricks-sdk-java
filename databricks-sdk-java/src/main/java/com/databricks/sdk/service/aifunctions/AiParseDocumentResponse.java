// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aifunctions;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Collection;
import java.util.Objects;

@Generated
public class AiParseDocumentResponse {
  /** The parsed document as a JSON value, containing the extracted pages and elements. */
  @JsonProperty("document")
  private JsonNode document;

  /**
   * Per-page partial-failure details; present when the request succeeds (2xx) but individual pages
   * fail.
   */
  @JsonProperty("error_status")
  private Collection<AiParseDocumentPageError> errorStatus;

  /** Additional metadata returned by AI Parse Document. */
  @JsonProperty("metadata")
  private AiParseDocumentResponseMetadata metadata;

  public AiParseDocumentResponse setDocument(JsonNode document) {
    this.document = document;
    return this;
  }

  public JsonNode getDocument() {
    return document;
  }

  public AiParseDocumentResponse setErrorStatus(Collection<AiParseDocumentPageError> errorStatus) {
    this.errorStatus = errorStatus;
    return this;
  }

  public Collection<AiParseDocumentPageError> getErrorStatus() {
    return errorStatus;
  }

  public AiParseDocumentResponse setMetadata(AiParseDocumentResponseMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  public AiParseDocumentResponseMetadata getMetadata() {
    return metadata;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AiParseDocumentResponse that = (AiParseDocumentResponse) o;
    return Objects.equals(document, that.document)
        && Objects.equals(errorStatus, that.errorStatus)
        && Objects.equals(metadata, that.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(document, errorStatus, metadata);
  }

  @Override
  public String toString() {
    return new ToStringer(AiParseDocumentResponse.class)
        .add("document", document)
        .add("errorStatus", errorStatus)
        .add("metadata", metadata)
        .toString();
  }
}
