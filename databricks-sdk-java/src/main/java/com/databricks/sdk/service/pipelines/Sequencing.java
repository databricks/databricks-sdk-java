// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sequencing {
  /** A sequence number, unique and increasing within the control plane. */
  @JsonProperty("control_plane_seq_no")
  private Long controlPlaneSeqNo;

  /** the ID assigned by the data plane. */
  @JsonProperty("data_plane_id")
  private DataPlaneId dataPlaneId;

  public Sequencing setControlPlaneSeqNo(Long controlPlaneSeqNo) {
    this.controlPlaneSeqNo = controlPlaneSeqNo;
    return this;
  }

  public Long getControlPlaneSeqNo() {
    return controlPlaneSeqNo;
  }

  public Sequencing setDataPlaneId(DataPlaneId dataPlaneId) {
    this.dataPlaneId = dataPlaneId;
    return this;
  }

  public DataPlaneId getDataPlaneId() {
    return dataPlaneId;
  }
}
