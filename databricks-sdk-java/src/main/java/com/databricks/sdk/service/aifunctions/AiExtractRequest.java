// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aifunctions;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Objects;

@Generated
public class AiExtractRequest {
  /**
   * The text to extract from. It accepts a plain string or the response object of
   * [ai_parse_document](:method:AiFunctions/AiParseDocument).
   */
  @JsonProperty("content")
  private JsonNode content;

  /** Function options. Omitted fields fall back to their documented defaults. */
  @JsonProperty("options")
  private AiExtractOptions options;

  /**
   * The extraction schema defining the fields to extract. Either a JSON array of field names,
   * assumed to be strings (e.g. ["company", "valuation"]), or a JSON object mapping each field to
   * its type/description/nullability (e.g. {"company": {"type": "string", "description": "the
   * company name"}}). Accepts up to 256 fields, 12 levels of nesting, and 500 enum values.
   * Supported field types are string, integer, number, boolean, and enum.
   */
  @JsonProperty("schema")
  private JsonNode schema;

  public AiExtractRequest setContent(JsonNode content) {
    this.content = content;
    return this;
  }

  public JsonNode getContent() {
    return content;
  }

  public AiExtractRequest setOptions(AiExtractOptions options) {
    this.options = options;
    return this;
  }

  public AiExtractOptions getOptions() {
    return options;
  }

  public AiExtractRequest setSchema(JsonNode schema) {
    this.schema = schema;
    return this;
  }

  public JsonNode getSchema() {
    return schema;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AiExtractRequest that = (AiExtractRequest) o;
    return Objects.equals(content, that.content)
        && Objects.equals(options, that.options)
        && Objects.equals(schema, that.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, options, schema);
  }

  @Override
  public String toString() {
    return new ToStringer(AiExtractRequest.class)
        .add("content", content)
        .add("options", options)
        .add("schema", schema)
        .toString();
  }
}
