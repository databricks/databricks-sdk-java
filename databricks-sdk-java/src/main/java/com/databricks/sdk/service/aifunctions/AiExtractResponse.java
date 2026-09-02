// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aifunctions;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Objects;

@Generated
public class AiExtractResponse {
  /** Additional metadata returned by AI Extract. */
  @JsonProperty("metadata")
  private AiExtractResponseMetadata metadata;

  /**
   * The function result as a JSON value. When `enable_confidence_scores` and `enable_citations` are
   * true, `confidence` and `citation_ids` are included in each response field, respectively.
   */
  @JsonProperty("response")
  private JsonNode response;

  public AiExtractResponse setMetadata(AiExtractResponseMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  public AiExtractResponseMetadata getMetadata() {
    return metadata;
  }

  public AiExtractResponse setResponse(JsonNode response) {
    this.response = response;
    return this;
  }

  public JsonNode getResponse() {
    return response;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AiExtractResponse that = (AiExtractResponse) o;
    return Objects.equals(metadata, that.metadata) && Objects.equals(response, that.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, response);
  }

  @Override
  public String toString() {
    return new ToStringer(AiExtractResponse.class)
        .add("metadata", metadata)
        .add("response", response)
        .toString();
  }
}
