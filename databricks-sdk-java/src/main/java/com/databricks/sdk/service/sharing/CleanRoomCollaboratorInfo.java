// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CleanRoomCollaboratorInfo {
  /**
   * The global Unity Catalog metastore id of the collaborator. Also known as the sharing
   * identifier. The identifier is of format __cloud__:__region__:__metastore-uuid__.
   */
  @JsonProperty("global_metastore_id")
  private String globalMetastoreId;

  /**
   * The organization name of the collaborator. This is configured in the metastore for Delta
   * Sharing and is used to identify the organization to other collaborators.
   */
  @JsonProperty("organization_name")
  private String organizationName;

  public CleanRoomCollaboratorInfo setGlobalMetastoreId(String globalMetastoreId) {
    this.globalMetastoreId = globalMetastoreId;
    return this;
  }

  public String getGlobalMetastoreId() {
    return globalMetastoreId;
  }

  public CleanRoomCollaboratorInfo setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
    return this;
  }

  public String getOrganizationName() {
    return organizationName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CleanRoomCollaboratorInfo that = (CleanRoomCollaboratorInfo) o;
    return Objects.equals(globalMetastoreId, that.globalMetastoreId)
        && Objects.equals(organizationName, that.organizationName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(globalMetastoreId, organizationName);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomCollaboratorInfo.class)
        .add("globalMetastoreId", globalMetastoreId)
        .add("organizationName", organizationName)
        .toString();
  }
}
