// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class ComputeSpec {
  /**
   * The kind of compute described by this compute specification.
   */
  @JsonProperty("kind")
  private ComputeSpecKind kind;
  
  public ComputeSpec setKind(ComputeSpecKind kind) {
    this.kind = kind;
    return this;
  }

  public ComputeSpecKind getKind() {
    return kind;
  }
  

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ComputeSpec that = (ComputeSpec) o;
    return Objects.equals(kind, that.kind)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind);
  }

  @Override
  public String toString() {
    return new ToStringer(ComputeSpec.class)
      .add("kind", kind).toString();
  }
}
