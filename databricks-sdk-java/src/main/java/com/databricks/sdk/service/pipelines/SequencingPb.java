// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class SequencingPb {
  @JsonProperty("control_plane_seq_no")
  private Long controlPlaneSeqNo;

  @JsonProperty("data_plane_id")
  private DataPlaneId dataPlaneId;

  public SequencingPb setControlPlaneSeqNo(Long controlPlaneSeqNo) {
    this.controlPlaneSeqNo = controlPlaneSeqNo;
    return this;
  }

  public Long getControlPlaneSeqNo() {
    return controlPlaneSeqNo;
  }

  public SequencingPb setDataPlaneId(DataPlaneId dataPlaneId) {
    this.dataPlaneId = dataPlaneId;
    return this;
  }

  public DataPlaneId getDataPlaneId() {
    return dataPlaneId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SequencingPb that = (SequencingPb) o;
    return Objects.equals(controlPlaneSeqNo, that.controlPlaneSeqNo)
        && Objects.equals(dataPlaneId, that.dataPlaneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controlPlaneSeqNo, dataPlaneId);
  }

  @Override
  public String toString() {
    return new ToStringer(SequencingPb.class)
        .add("controlPlaneSeqNo", controlPlaneSeqNo)
        .add("dataPlaneId", dataPlaneId)
        .toString();
  }
}
