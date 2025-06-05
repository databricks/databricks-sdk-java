// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class GetUpdateResponsePb {
  @JsonProperty("update")
  private UpdateInfo update;

  public GetUpdateResponsePb setUpdate(UpdateInfo update) {
    this.update = update;
    return this;
  }

  public UpdateInfo getUpdate() {
    return update;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetUpdateResponsePb that = (GetUpdateResponsePb) o;
    return Objects.equals(update, that.update);
  }

  @Override
  public int hashCode() {
    return Objects.hash(update);
  }

  @Override
  public String toString() {
    return new ToStringer(GetUpdateResponsePb.class).add("update", update).toString();
  }
}
