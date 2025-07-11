// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeleteModelTagRequest {
  /**
   * Name of the tag. The name must be an exact match; wild-card deletion is not supported. Maximum
   * size is 250 bytes.
   */
  @JsonIgnore
  @QueryParam("key")
  private String key;

  /** Name of the registered model that the tag was logged under. */
  @JsonIgnore
  @QueryParam("name")
  private String name;

  public DeleteModelTagRequest setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public DeleteModelTagRequest setName(String name) {
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
    DeleteModelTagRequest that = (DeleteModelTagRequest) o;
    return Objects.equals(key, that.key) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteModelTagRequest.class).add("key", key).add("name", name).toString();
  }
}
