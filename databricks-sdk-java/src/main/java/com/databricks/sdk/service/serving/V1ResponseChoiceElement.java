// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class V1ResponseChoiceElement {
  /** The finish reason returned by the endpoint. */
  @JsonProperty("finishReason")
  private String finishReason;

  /** The index of the choice in the __chat or completions__ response. */
  @JsonProperty("index")
  private Long index;

  /** The logprobs returned only by the __completions__ endpoint. */
  @JsonProperty("logprobs")
  private Long logprobs;

  /** The message response from the __chat__ endpoint. */
  @JsonProperty("message")
  private ChatMessage message;

  /** The text response from the __completions__ endpoint. */
  @JsonProperty("text")
  private String text;

  public V1ResponseChoiceElement setFinishReason(String finishReason) {
    this.finishReason = finishReason;
    return this;
  }

  public String getFinishReason() {
    return finishReason;
  }

  public V1ResponseChoiceElement setIndex(Long index) {
    this.index = index;
    return this;
  }

  public Long getIndex() {
    return index;
  }

  public V1ResponseChoiceElement setLogprobs(Long logprobs) {
    this.logprobs = logprobs;
    return this;
  }

  public Long getLogprobs() {
    return logprobs;
  }

  public V1ResponseChoiceElement setMessage(ChatMessage message) {
    this.message = message;
    return this;
  }

  public ChatMessage getMessage() {
    return message;
  }

  public V1ResponseChoiceElement setText(String text) {
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
    V1ResponseChoiceElement that = (V1ResponseChoiceElement) o;
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
    return new ToStringer(V1ResponseChoiceElement.class)
        .add("finishReason", finishReason)
        .add("index", index)
        .add("logprobs", logprobs)
        .add("message", message)
        .add("text", text)
        .toString();
  }
}
