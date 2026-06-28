// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lrotesting;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Test resource for LRO operations */
@Generated
public class TestResource {
  /** Unique identifier for the resource */
  @JsonProperty("id")
  private String id;

  /** Name of the resource */
  @JsonProperty("name")
  private String name;

  public TestResource setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public TestResource setName(String name) {
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
    TestResource that = (TestResource) o;
    return Objects.equals(id, that.id) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    return new ToStringer(TestResource.class).add("id", id).add("name", name).toString();
  }
}
