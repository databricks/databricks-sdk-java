// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** One label the input can be classified as. */
@Generated
public class AiClassifyFunctionLabel {
  /** Guidance describing what belongs under this label. */
  @JsonProperty("description")
  private String description;

  /** The name returned when an input is classified as this label. */
  @JsonProperty("name")
  private String name;

  public AiClassifyFunctionLabel setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public AiClassifyFunctionLabel setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AiClassifyFunctionLabel that = (AiClassifyFunctionLabel) o;
    return Objects.equals(description, that.description) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name);
  }

  @Override
  public String toString() {
    return new ToStringer(AiClassifyFunctionLabel.class)
        .add("description", description)
        .add("name", name)
        .toString();
  }
}
