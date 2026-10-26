// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetMaterializationSetRequest {
  /** The ID of the materialization set. */
  @JsonIgnore private String materializationSetId;

  public GetMaterializationSetRequest setMaterializationSetId(String materializationSetId) {
    this.materializationSetId = materializationSetId;
    return this;
  }

  public String getMaterializationSetId() {
    return materializationSetId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetMaterializationSetRequest that = (GetMaterializationSetRequest) o;
    return Objects.equals(materializationSetId, that.materializationSetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(materializationSetId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetMaterializationSetRequest.class)
        .add("materializationSetId", materializationSetId)
        .toString();
  }
}
