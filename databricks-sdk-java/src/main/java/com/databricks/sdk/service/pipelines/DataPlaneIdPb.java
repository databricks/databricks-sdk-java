// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class DataPlaneIdPb {
  @JsonProperty("instance")
  private String instance;

  @JsonProperty("seq_no")
  private Long seqNo;

  public DataPlaneIdPb setInstance(String instance) {
    this.instance = instance;
    return this;
  }

  public String getInstance() {
    return instance;
  }

  public DataPlaneIdPb setSeqNo(Long seqNo) {
    this.seqNo = seqNo;
    return this;
  }

  public Long getSeqNo() {
    return seqNo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DataPlaneIdPb that = (DataPlaneIdPb) o;
    return Objects.equals(instance, that.instance) && Objects.equals(seqNo, that.seqNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instance, seqNo);
  }

  @Override
  public String toString() {
    return new ToStringer(DataPlaneIdPb.class)
        .add("instance", instance)
        .add("seqNo", seqNo)
        .toString();
  }
}
