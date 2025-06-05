// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List transition requests */
@Generated
class ListTransitionRequestsRequestPb {
  @JsonIgnore
  @QueryParam("name")
  private String name;

  @JsonIgnore
  @QueryParam("version")
  private String version;

  public ListTransitionRequestsRequestPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ListTransitionRequestsRequestPb setVersion(String version) {
    this.version = version;
    return this;
  }

  public String getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListTransitionRequestsRequestPb that = (ListTransitionRequestsRequestPb) o;
    return Objects.equals(name, that.name) && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version);
  }

  @Override
  public String toString() {
    return new ToStringer(ListTransitionRequestsRequestPb.class)
        .add("name", name)
        .add("version", version)
        .toString();
  }
}
