// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class UpdateModelRequestPb {
  @JsonProperty("description")
  private String description;

  @JsonProperty("name")
  private String name;

  public UpdateModelRequestPb setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public UpdateModelRequestPb setName(String name) {
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
    UpdateModelRequestPb that = (UpdateModelRequestPb) o;
    return Objects.equals(description, that.description) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateModelRequestPb.class)
        .add("description", description)
        .add("name", name)
        .toString();
  }
}
