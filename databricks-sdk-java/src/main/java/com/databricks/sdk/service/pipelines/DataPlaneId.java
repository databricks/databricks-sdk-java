// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class DataPlaneId {
  /** The instance name of the data plane emitting an event. */
  @JsonProperty("instance")
  private String instance;

  /** A sequence number, unique and increasing within the data plane instance. */
  @JsonProperty("seq_no")
  private Object /* MISSING TYPE */ seqNo;

  public DataPlaneId setInstance(String instance) {
    this.instance = instance;
    return this;
  }

  public String getInstance() {
    return instance;
  }

  public DataPlaneId setSeqNo(Object /* MISSING TYPE */ seqNo) {
    this.seqNo = seqNo;
    return this;
  }

  public Object /* MISSING TYPE */ getSeqNo() {
    return seqNo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DataPlaneId that = (DataPlaneId) o;
    return Objects.equals(instance, that.instance) && Objects.equals(seqNo, that.seqNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instance, seqNo);
  }

  @Override
  public String toString() {
    return new ToStringer(DataPlaneId.class)
        .add("instance", instance)
        .add("seqNo", seqNo)
        .toString();
  }
}
