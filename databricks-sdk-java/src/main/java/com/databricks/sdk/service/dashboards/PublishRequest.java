// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class PublishRequest {
  /** UUID identifying the dashboard to be published. */
  private String dashboardId;

  /**
   * Flag to indicate if the publisher's credentials should be embedded in the published dashboard.
   * These embedded credentials will be used to execute the published dashboard's queries.
   */
  @JsonProperty("embed_credentials")
  private Boolean embedCredentials;

  /**
   * The ID of the warehouse that can be used to override the warehouse which was set in the draft.
   */
  @JsonProperty("warehouse_id")
  private String warehouseId;

  public PublishRequest setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public PublishRequest setEmbedCredentials(Boolean embedCredentials) {
    this.embedCredentials = embedCredentials;
    return this;
  }

  public Boolean getEmbedCredentials() {
    return embedCredentials;
  }

  public PublishRequest setWarehouseId(String warehouseId) {
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
    PublishRequest that = (PublishRequest) o;
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
    return new ToStringer(PublishRequest.class)
        .add("dashboardId", dashboardId)
        .add("embedCredentials", embedCredentials)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
