// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class PublishedDashboard {
  /** The display name of the published dashboard. */
  @JsonProperty("display_name")
  private String displayName;

  /**
   * Whether the publisher's credentials are embedded in the published dashboard. When true, viewers
   * run the dashboard's queries with the publisher's data permissions (shared data permissions);
   * when false, each viewer runs them with their own data permissions.
   */
  @JsonProperty("embed_credentials")
  private Boolean embedCredentials;

  /**
   * The timestamp of when the current published version was created, that is, when the dashboard
   * was last published.
   */
  @JsonProperty("revision_create_time")
  private String revisionCreateTime;

  /**
   * The ID of the SQL warehouse that runs the published dashboard's queries. It is the warehouse
   * given when the dashboard was published, or the draft's warehouse if none was given.
   */
  @JsonProperty("warehouse_id")
  private String warehouseId;

  public PublishedDashboard setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public PublishedDashboard setEmbedCredentials(Boolean embedCredentials) {
    this.embedCredentials = embedCredentials;
    return this;
  }

  public Boolean getEmbedCredentials() {
    return embedCredentials;
  }

  public PublishedDashboard setRevisionCreateTime(String revisionCreateTime) {
    this.revisionCreateTime = revisionCreateTime;
    return this;
  }

  public String getRevisionCreateTime() {
    return revisionCreateTime;
  }

  public PublishedDashboard setWarehouseId(String warehouseId) {
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
    PublishedDashboard that = (PublishedDashboard) o;
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
    return new ToStringer(PublishedDashboard.class)
        .add("displayName", displayName)
        .add("embedCredentials", embedCredentials)
        .add("revisionCreateTime", revisionCreateTime)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
