// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>UpdateAutoMaintenance class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class UpdateAutoMaintenance {
  /** Whether to enable auto maintenance on the metastore. */
  @JsonProperty("enable")
  private Boolean enable;

  /** Unique identifier of metastore. */
  @JsonProperty("metastore_id")
  private String metastoreId;

  /**
   * <p>Setter for the field <code>enable</code>.</p>
   *
   * @param enable a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.catalog.UpdateAutoMaintenance} object
   */
  public UpdateAutoMaintenance setEnable(Boolean enable) {
    this.enable = enable;
    return this;
  }

  /**
   * <p>Getter for the field <code>enable</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getEnable() {
    return enable;
  }

  /**
   * <p>Setter for the field <code>metastoreId</code>.</p>
   *
   * @param metastoreId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.UpdateAutoMaintenance} object
   */
  public UpdateAutoMaintenance setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  /**
   * <p>Getter for the field <code>metastoreId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getMetastoreId() {
    return metastoreId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateAutoMaintenance that = (UpdateAutoMaintenance) o;
    return Objects.equals(enable, that.enable) && Objects.equals(metastoreId, that.metastoreId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(enable, metastoreId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(UpdateAutoMaintenance.class)
        .add("enable", enable)
        .add("metastoreId", metastoreId)
        .toString();
  }
}
