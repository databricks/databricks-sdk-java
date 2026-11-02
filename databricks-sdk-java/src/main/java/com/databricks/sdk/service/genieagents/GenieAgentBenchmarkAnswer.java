// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.genieagents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The expected answer to a benchmark question. */
@Generated
public class GenieAgentBenchmarkAnswer {
  /** The answer. */
  @JsonProperty("content")
  private String content;

  /** The format of the answer. */
  @JsonProperty("format")
  private GenieAgentBenchmarkAnswerFormat format;

  public GenieAgentBenchmarkAnswer setContent(String content) {
    this.content = content;
    return this;
  }

  public String getContent() {
    return content;
  }

  public GenieAgentBenchmarkAnswer setFormat(GenieAgentBenchmarkAnswerFormat format) {
    this.format = format;
    return this;
  }

  public GenieAgentBenchmarkAnswerFormat getFormat() {
    return format;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieAgentBenchmarkAnswer that = (GenieAgentBenchmarkAnswer) o;
    return Objects.equals(content, that.content) && Objects.equals(format, that.format);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, format);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieAgentBenchmarkAnswer.class)
        .add("content", content)
        .add("format", format)
        .toString();
  }
}
