// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateAutoMaintenance {
  /** Whether to enable auto maintenance on the metastore. */
  @JsonProperty("enable")
  private Boolean enable;

  /** Unique identifier of metastore. */
  @JsonProperty("metastore_id")
  private String metastoreId;

  public UpdateAutoMaintenance setEnable(Boolean enable) {
    this.enable = enable;
    return this;
  }

  public Boolean getEnable() {
    return enable;
  }

  public UpdateAutoMaintenance setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateAutoMaintenance that = (UpdateAutoMaintenance) o;
    return Objects.equals(enable, that.enable) && Objects.equals(metastoreId, that.metastoreId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, metastoreId);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateAutoMaintenance.class)
        .add("enable", enable)
        .add("metastoreId", metastoreId)
        .toString();
  }
}
