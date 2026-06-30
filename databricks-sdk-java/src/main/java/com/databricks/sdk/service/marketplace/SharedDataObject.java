// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class SharedDataObject {
  /** The type of the data object. Could be one of: TABLE, SCHEMA, NOTEBOOK_FILE, MODEL, VOLUME */
  @JsonProperty("data_object_type")
  private String dataObjectType;

  /** Name of the shared object */
  @JsonProperty("name")
  private String name;

  public SharedDataObject setDataObjectType(String dataObjectType) {
    this.dataObjectType = dataObjectType;
    return this;
  }

  public String getDataObjectType() {
    return dataObjectType;
  }

  public SharedDataObject setName(String name) {
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
    SharedDataObject that = (SharedDataObject) o;
    return Objects.equals(dataObjectType, that.dataObjectType) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataObjectType, name);
  }

  @Override
  public String toString() {
    return new ToStringer(SharedDataObject.class)
        .add("dataObjectType", dataObjectType)
        .add("name", name)
        .toString();
  }
}
