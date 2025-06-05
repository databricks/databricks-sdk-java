// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class SharedDataObjectPb {
  @JsonProperty("data_object_type")
  private String dataObjectType;

  @JsonProperty("name")
  private String name;

  public SharedDataObjectPb setDataObjectType(String dataObjectType) {
    this.dataObjectType = dataObjectType;
    return this;
  }

  public String getDataObjectType() {
    return dataObjectType;
  }

  public SharedDataObjectPb setName(String name) {
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
    SharedDataObjectPb that = (SharedDataObjectPb) o;
    return Objects.equals(dataObjectType, that.dataObjectType) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataObjectType, name);
  }

  @Override
  public String toString() {
    return new ToStringer(SharedDataObjectPb.class)
        .add("dataObjectType", dataObjectType)
        .add("name", name)
        .toString();
  }
}
