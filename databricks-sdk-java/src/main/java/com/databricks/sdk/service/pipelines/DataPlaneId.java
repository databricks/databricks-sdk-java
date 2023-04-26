// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>DataPlaneId class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DataPlaneId {
  /** The instance name of the data plane emitting an event. */
  @JsonProperty("instance")
  private String instance;

  /** A sequence number, unique and increasing within the data plane instance. */
  @JsonProperty("seq_no")
  private Object /* MISSING TYPE */ seqNo;

  /**
   * <p>Setter for the field <code>instance</code>.</p>
   *
   * @param instance a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.DataPlaneId} object
   */
  public DataPlaneId setInstance(String instance) {
    this.instance = instance;
    return this;
  }

  /**
   * <p>Getter for the field <code>instance</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getInstance() {
    return instance;
  }

  /**
   * <p>Setter for the field <code>seqNo</code>.</p>
   *
   * @param seqNo a {@link java.lang.Object} object
   * @return a {@link com.databricks.sdk.service.pipelines.DataPlaneId} object
   */
  public DataPlaneId setSeqNo(Object /* MISSING TYPE */ seqNo) {
    this.seqNo = seqNo;
    return this;
  }

  /**
   * <p>Getter for the field <code>seqNo</code>.</p>
   *
   * @return a {@link java.lang.Object} object
   */
  public Object /* MISSING TYPE */ getSeqNo() {
    return seqNo;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DataPlaneId that = (DataPlaneId) o;
    return Objects.equals(instance, that.instance) && Objects.equals(seqNo, that.seqNo);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(instance, seqNo);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(DataPlaneId.class)
        .add("instance", instance)
        .add("seqNo", seqNo)
        .toString();
  }
}
