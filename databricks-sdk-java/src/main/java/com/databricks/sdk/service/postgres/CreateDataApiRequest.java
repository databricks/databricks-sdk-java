// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateDataApiRequest {
  /** The Data API configuration to create. */
  @JsonProperty("data_api")
  private DataApi dataApi;

  /** Parent database: projects/{project_id}/branches/{branch_id}/databases/{database_id} */
  @JsonIgnore private String parent;

  public CreateDataApiRequest setDataApi(DataApi dataApi) {
    this.dataApi = dataApi;
    return this;
  }

  public DataApi getDataApi() {
    return dataApi;
  }

  public CreateDataApiRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateDataApiRequest that = (CreateDataApiRequest) o;
    return Objects.equals(dataApi, that.dataApi) && Objects.equals(parent, that.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataApi, parent);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateDataApiRequest.class)
        .add("dataApi", dataApi)
        .add("parent", parent)
        .toString();
  }
}
