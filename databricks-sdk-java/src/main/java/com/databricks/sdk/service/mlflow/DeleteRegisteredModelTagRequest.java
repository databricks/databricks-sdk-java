// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.annotation.QueryParam;
import com.databricks.sdk.mixin.ToStringer;
import java.util.Objects;

/** Delete a model tag */
public class DeleteRegisteredModelTagRequest {
  /**
   * Name of the tag. The name must be an exact match; wild-card deletion is not supported. Maximum
   * size is 250 bytes.
   */
  @QueryParam("key")
  private String key;

  /** Name of the registered model that the tag was logged under. */
  @QueryParam("name")
  private String name;

  public DeleteRegisteredModelTagRequest setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public DeleteRegisteredModelTagRequest setName(String name) {
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
    DeleteRegisteredModelTagRequest that = (DeleteRegisteredModelTagRequest) o;
    return Objects.equals(key, that.key) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteRegisteredModelTagRequest.class)
        .add("key", key)
        .add("name", name)
        .toString();
  }
}
