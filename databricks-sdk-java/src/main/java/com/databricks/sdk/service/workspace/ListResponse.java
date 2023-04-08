// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class ListResponse {
  /** List of objects. */
  @JsonProperty("objects")
  private Collection<ObjectInfo> objects;

  public ListResponse setObjects(Collection<ObjectInfo> objects) {
    this.objects = objects;
    return this;
  }

  public Collection<ObjectInfo> getObjects() {
    return objects;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListResponse that = (ListResponse) o;
    return Objects.equals(objects, that.objects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objects);
  }

  @Override
  public String toString() {
    return new ToStringer(ListResponse.class).add("objects", objects).toString();
  }
}
