// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class V1ResponseChoiceElementPb {
  @JsonProperty("finishReason")
  private String finishReason;

  @JsonProperty("index")
  private Long index;

  @JsonProperty("logprobs")
  private Long logprobs;

  @JsonProperty("message")
  private ChatMessage message;

  @JsonProperty("text")
  private String text;

  public V1ResponseChoiceElementPb setFinishReason(String finishReason) {
    this.finishReason = finishReason;
    return this;
  }

  public String getFinishReason() {
    return finishReason;
  }

  public V1ResponseChoiceElementPb setIndex(Long index) {
    this.index = index;
    return this;
  }

  public Long getIndex() {
    return index;
  }

  public V1ResponseChoiceElementPb setLogprobs(Long logprobs) {
    this.logprobs = logprobs;
    return this;
  }

  public Long getLogprobs() {
    return logprobs;
  }

  public V1ResponseChoiceElementPb setMessage(ChatMessage message) {
    this.message = message;
    return this;
  }

  public ChatMessage getMessage() {
    return message;
  }

  public V1ResponseChoiceElementPb setText(String text) {
    this.text = text;
    return this;
  }

  public String getText() {
    return text;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ResponseChoiceElementPb that = (V1ResponseChoiceElementPb) o;
    return Objects.equals(finishReason, that.finishReason)
        && Objects.equals(index, that.index)
        && Objects.equals(logprobs, that.logprobs)
        && Objects.equals(message, that.message)
        && Objects.equals(text, that.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finishReason, index, logprobs, message, text);
  }

  @Override
  public String toString() {
    return new ToStringer(V1ResponseChoiceElementPb.class)
        .add("finishReason", finishReason)
        .add("index", index)
        .add("logprobs", logprobs)
        .add("message", message)
        .add("text", text)
        .toString();
  }
}
