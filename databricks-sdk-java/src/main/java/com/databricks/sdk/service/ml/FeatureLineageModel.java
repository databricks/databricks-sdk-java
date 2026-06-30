// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class FeatureLineageModel {
  /** The full name of the model in Unity Catalog. */
  @JsonProperty("name")
  private String name;

  /** The version of the model. */
  @JsonProperty("version")
  private Long version;

  public FeatureLineageModel setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public FeatureLineageModel setVersion(Long version) {
    this.version = version;
    return this;
  }

  public Long getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FeatureLineageModel that = (FeatureLineageModel) o;
    return Objects.equals(name, that.name) && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version);
  }

  @Override
  public String toString() {
    return new ToStringer(FeatureLineageModel.class)
        .add("name", name)
        .add("version", version)
        .toString();
  }
}
