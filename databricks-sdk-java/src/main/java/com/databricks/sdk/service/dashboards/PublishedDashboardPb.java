// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class PublishedDashboardPb {
  @JsonProperty("display_name")
  private String displayName;

  @JsonProperty("embed_credentials")
  private Boolean embedCredentials;

  @JsonProperty("revision_create_time")
  private String revisionCreateTime;

  @JsonProperty("warehouse_id")
  private String warehouseId;

  public PublishedDashboardPb setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public PublishedDashboardPb setEmbedCredentials(Boolean embedCredentials) {
    this.embedCredentials = embedCredentials;
    return this;
  }

  public Boolean getEmbedCredentials() {
    return embedCredentials;
  }

  public PublishedDashboardPb setRevisionCreateTime(String revisionCreateTime) {
    this.revisionCreateTime = revisionCreateTime;
    return this;
  }

  public String getRevisionCreateTime() {
    return revisionCreateTime;
  }

  public PublishedDashboardPb setWarehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  public String getWarehouseId() {
    return warehouseId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PublishedDashboardPb that = (PublishedDashboardPb) o;
    return Objects.equals(displayName, that.displayName)
        && Objects.equals(embedCredentials, that.embedCredentials)
        && Objects.equals(revisionCreateTime, that.revisionCreateTime)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, embedCredentials, revisionCreateTime, warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(PublishedDashboardPb.class)
        .add("displayName", displayName)
        .add("embedCredentials", embedCredentials)
        .add("revisionCreateTime", revisionCreateTime)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
