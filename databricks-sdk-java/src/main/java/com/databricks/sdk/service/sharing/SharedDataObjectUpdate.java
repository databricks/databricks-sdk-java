// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class SharedDataObjectUpdate {
  /** One of: **ADD**, **REMOVE**, **UPDATE**. */
  @JsonProperty("action")
  private SharedDataObjectUpdateAction action;

  /** The data object that is being added, removed, or updated. */
  @JsonProperty("data_object")
  private SharedDataObject dataObject;

  public SharedDataObjectUpdate setAction(SharedDataObjectUpdateAction action) {
    this.action = action;
    return this;
  }

  public SharedDataObjectUpdateAction getAction() {
    return action;
  }

  public SharedDataObjectUpdate setDataObject(SharedDataObject dataObject) {
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
    SharedDataObjectUpdate that = (SharedDataObjectUpdate) o;
    return Objects.equals(action, that.action) && Objects.equals(dataObject, that.dataObject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, dataObject);
  }

  @Override
  public String toString() {
    return new ToStringer(SharedDataObjectUpdate.class)
        .add("action", action)
        .add("dataObject", dataObject)
        .toString();
  }
}
