// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>Sequencing class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class Sequencing {
  /** A sequence number, unique and increasing within the control plane. */
  @JsonProperty("control_plane_seq_no")
  private Long controlPlaneSeqNo;

  /** the ID assigned by the data plane. */
  @JsonProperty("data_plane_id")
  private DataPlaneId dataPlaneId;

  /**
   * <p>Setter for the field <code>controlPlaneSeqNo</code>.</p>
   *
   * @param controlPlaneSeqNo a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.pipelines.Sequencing} object
   */
  public Sequencing setControlPlaneSeqNo(Long controlPlaneSeqNo) {
    this.controlPlaneSeqNo = controlPlaneSeqNo;
    return this;
  }

  /**
   * <p>Getter for the field <code>controlPlaneSeqNo</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getControlPlaneSeqNo() {
    return controlPlaneSeqNo;
  }

  /**
   * <p>Setter for the field <code>dataPlaneId</code>.</p>
   *
   * @param dataPlaneId a {@link com.databricks.sdk.service.pipelines.DataPlaneId} object
   * @return a {@link com.databricks.sdk.service.pipelines.Sequencing} object
   */
  public Sequencing setDataPlaneId(DataPlaneId dataPlaneId) {
    this.dataPlaneId = dataPlaneId;
    return this;
  }

  /**
   * <p>Getter for the field <code>dataPlaneId</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.pipelines.DataPlaneId} object
   */
  public DataPlaneId getDataPlaneId() {
    return dataPlaneId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Sequencing that = (Sequencing) o;
    return Objects.equals(controlPlaneSeqNo, that.controlPlaneSeqNo)
        && Objects.equals(dataPlaneId, that.dataPlaneId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(controlPlaneSeqNo, dataPlaneId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(Sequencing.class)
        .add("controlPlaneSeqNo", controlPlaneSeqNo)
        .add("dataPlaneId", dataPlaneId)
        .toString();
  }
}
