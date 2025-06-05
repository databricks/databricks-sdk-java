// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ExternalModelUsageElementPb {
  @JsonProperty("completion_tokens")
  private Long completionTokens;

  @JsonProperty("prompt_tokens")
  private Long promptTokens;

  @JsonProperty("total_tokens")
  private Long totalTokens;

  public ExternalModelUsageElementPb setCompletionTokens(Long completionTokens) {
    this.completionTokens = completionTokens;
    return this;
  }

  public Long getCompletionTokens() {
    return completionTokens;
  }

  public ExternalModelUsageElementPb setPromptTokens(Long promptTokens) {
    this.promptTokens = promptTokens;
    return this;
  }

  public Long getPromptTokens() {
    return promptTokens;
  }

  public ExternalModelUsageElementPb setTotalTokens(Long totalTokens) {
    this.totalTokens = totalTokens;
    return this;
  }

  public Long getTotalTokens() {
    return totalTokens;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExternalModelUsageElementPb that = (ExternalModelUsageElementPb) o;
    return Objects.equals(completionTokens, that.completionTokens)
        && Objects.equals(promptTokens, that.promptTokens)
        && Objects.equals(totalTokens, that.totalTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionTokens, promptTokens, totalTokens);
  }

  @Override
  public String toString() {
    return new ToStringer(ExternalModelUsageElementPb.class)
        .add("completionTokens", completionTokens)
        .add("promptTokens", promptTokens)
        .add("totalTokens", totalTokens)
        .toString();
  }
}
