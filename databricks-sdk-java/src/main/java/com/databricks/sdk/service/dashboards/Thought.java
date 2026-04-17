// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A single thought in the AI's reasoning process for a query. */
@Generated
public class Thought {
  /** The md formatted content for this thought. */
  @JsonProperty("content")
  private String content;

  /** The category of this thought. */
  @JsonProperty("thought_type")
  private ThoughtType thoughtType;

  public Thought setContent(String content) {
    this.content = content;
    return this;
  }

  public String getContent() {
    return content;
  }

  public Thought setThoughtType(ThoughtType thoughtType) {
    this.thoughtType = thoughtType;
    return this;
  }

  public ThoughtType getThoughtType() {
    return thoughtType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Thought that = (Thought) o;
    return Objects.equals(content, that.content) && Objects.equals(thoughtType, that.thoughtType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, thoughtType);
  }

  @Override
  public String toString() {
    return new ToStringer(Thought.class)
        .add("content", content)
        .add("thoughtType", thoughtType)
        .toString();
  }
}
