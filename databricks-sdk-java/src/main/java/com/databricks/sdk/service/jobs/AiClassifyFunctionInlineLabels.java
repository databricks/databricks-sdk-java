// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** A label set listed inline. */
@Generated
public class AiClassifyFunctionInlineLabels {
  /**
   * The labels an input can be classified as. At least two labels are required unless `multilabel`
   * is true, which also accepts a single label.
   */
  @JsonProperty("labels")
  private Collection<AiClassifyFunctionLabel> labels;

  public AiClassifyFunctionInlineLabels setLabels(Collection<AiClassifyFunctionLabel> labels) {
    this.labels = labels;
    return this;
  }

  public Collection<AiClassifyFunctionLabel> getLabels() {
    return labels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AiClassifyFunctionInlineLabels that = (AiClassifyFunctionInlineLabels) o;
    return Objects.equals(labels, that.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels);
  }

  @Override
  public String toString() {
    return new ToStringer(AiClassifyFunctionInlineLabels.class).add("labels", labels).toString();
  }
}
