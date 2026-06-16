// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateDataApiRequest {
  /** The Data API configuration to update. The data_api's `name` field identifies the resource. */
  @JsonProperty("data_api")
  private DataApi dataApi;

  /** Resource name: projects/{project_id}/branches/{branch_id}/databases/{database_id}/data-api */
  @JsonIgnore private String name;

  /** The list of fields to update. If unspecified, all fields will be updated when possible. */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateDataApiRequest setDataApi(DataApi dataApi) {
    this.dataApi = dataApi;
    return this;
  }

  public DataApi getDataApi() {
    return dataApi;
  }

  public UpdateDataApiRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateDataApiRequest setUpdateMask(FieldMask updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public FieldMask getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateDataApiRequest that = (UpdateDataApiRequest) o;
    return Objects.equals(dataApi, that.dataApi)
        && Objects.equals(name, that.name)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataApi, name, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateDataApiRequest.class)
        .add("dataApi", dataApi)
        .add("name", name)
        .add("updateMask", updateMask)
        .toString();
  }
}
