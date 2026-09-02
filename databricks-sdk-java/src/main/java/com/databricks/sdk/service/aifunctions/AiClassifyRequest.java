// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aifunctions;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Objects;

@Generated
public class AiClassifyRequest {
  /**
   * The content to classify. It accepts a plain string or the response object of
   * [ai_parse_document](:method:AiFunctions/AiParseDocument).
   */
  @JsonProperty("content")
  private JsonNode content;

  /**
   * The label set to classify as. Either a JSON array of label strings (e.g. ["spam", "not_spam"]),
   * or a JSON object mapping each label to a description (e.g. {"spam": "unsolicited bulk message",
   * "not_spam": "a legitimate message"}). Accepts 2 to 500 labels, each 1 to 100 characters.
   */
  @JsonProperty("labels")
  private JsonNode labels;

  /** Function options. Omitted fields fall back to their documented defaults. */
  @JsonProperty("options")
  private AiClassifyOptions options;

  public AiClassifyRequest setContent(JsonNode content) {
    this.content = content;
    return this;
  }

  public JsonNode getContent() {
    return content;
  }

  public AiClassifyRequest setLabels(JsonNode labels) {
    this.labels = labels;
    return this;
  }

  public JsonNode getLabels() {
    return labels;
  }

  public AiClassifyRequest setOptions(AiClassifyOptions options) {
    this.options = options;
    return this;
  }

  public AiClassifyOptions getOptions() {
    return options;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AiClassifyRequest that = (AiClassifyRequest) o;
    return Objects.equals(content, that.content)
        && Objects.equals(labels, that.labels)
        && Objects.equals(options, that.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, labels, options);
  }

  @Override
  public String toString() {
    return new ToStringer(AiClassifyRequest.class)
        .add("content", content)
        .add("labels", labels)
        .add("options", options)
        .toString();
  }
}
