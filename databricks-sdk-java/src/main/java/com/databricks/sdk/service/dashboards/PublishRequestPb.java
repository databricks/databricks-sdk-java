// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class PublishRequestPb {
  @JsonIgnore private String dashboardId;

  @JsonProperty("embed_credentials")
  private Boolean embedCredentials;

  @JsonProperty("warehouse_id")
  private String warehouseId;

  public PublishRequestPb setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public PublishRequestPb setEmbedCredentials(Boolean embedCredentials) {
    this.embedCredentials = embedCredentials;
    return this;
  }

  public Boolean getEmbedCredentials() {
    return embedCredentials;
  }

  public PublishRequestPb setWarehouseId(String warehouseId) {
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
    PublishRequestPb that = (PublishRequestPb) o;
    return Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(embedCredentials, that.embedCredentials)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, embedCredentials, warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(PublishRequestPb.class)
        .add("dashboardId", dashboardId)
        .add("embedCredentials", embedCredentials)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
