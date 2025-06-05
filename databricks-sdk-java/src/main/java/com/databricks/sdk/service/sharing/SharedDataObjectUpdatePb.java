// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class SharedDataObjectUpdatePb {
  @JsonProperty("action")
  private SharedDataObjectUpdateAction action;

  @JsonProperty("data_object")
  private SharedDataObject dataObject;

  public SharedDataObjectUpdatePb setAction(SharedDataObjectUpdateAction action) {
    this.action = action;
    return this;
  }

  public SharedDataObjectUpdateAction getAction() {
    return action;
  }

  public SharedDataObjectUpdatePb setDataObject(SharedDataObject dataObject) {
    this.dataObject = dataObject;
    return this;
  }

  public SharedDataObject getDataObject() {
    return dataObject;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SharedDataObjectUpdatePb that = (SharedDataObjectUpdatePb) o;
    return Objects.equals(action, that.action) && Objects.equals(dataObject, that.dataObject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, dataObject);
  }

  @Override
  public String toString() {
    return new ToStringer(SharedDataObjectUpdatePb.class)
        .add("action", action)
        .add("dataObject", dataObject)
        .toString();
  }
}
