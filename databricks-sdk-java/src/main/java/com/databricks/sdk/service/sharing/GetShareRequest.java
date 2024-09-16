// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get a share */
@Generated
public class GetShareRequest {
  /** Query for data to include in the share. */
  @JsonIgnore
  @QueryParam("include_shared_data")
  private Boolean includeSharedData;

  /** The name of the share. */
  @JsonIgnore private String name;

  public GetShareRequest setIncludeSharedData(Boolean includeSharedData) {
    this.includeSharedData = includeSharedData;
    return this;
  }

  public Boolean getIncludeSharedData() {
    return includeSharedData;
  }

  public GetShareRequest setName(String name) {
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
    GetShareRequest that = (GetShareRequest) o;
    return Objects.equals(includeSharedData, that.includeSharedData)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeSharedData, name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetShareRequest.class)
        .add("includeSharedData", includeSharedData)
        .add("name", name)
        .toString();
  }
}
