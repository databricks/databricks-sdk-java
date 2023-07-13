// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CleanRoomAssetInfo {
  /** Time at which this asset was added, in epoch milliseconds. */
  @JsonProperty("added_at")
  private Long addedAt;

  /** Details about the notebook asset. */
  @JsonProperty("notebook_info")
  private CleanRoomNotebookInfo notebookInfo;

  /** The collaborator who owns the asset. */
  @JsonProperty("owner")
  private CleanRoomCollaboratorInfo owner;

  /** Details about the table asset. */
  @JsonProperty("table_info")
  private CleanRoomTableInfo tableInfo;

  /** Time at which this asset was updated, in epoch milliseconds. */
  @JsonProperty("updated_at")
  private Long updatedAt;

  public CleanRoomAssetInfo setAddedAt(Long addedAt) {
    this.addedAt = addedAt;
    return this;
  }

  public Long getAddedAt() {
    return addedAt;
  }

  public CleanRoomAssetInfo setNotebookInfo(CleanRoomNotebookInfo notebookInfo) {
    this.notebookInfo = notebookInfo;
    return this;
  }

  public CleanRoomNotebookInfo getNotebookInfo() {
    return notebookInfo;
  }

  public CleanRoomAssetInfo setOwner(CleanRoomCollaboratorInfo owner) {
    this.owner = owner;
    return this;
  }

  public CleanRoomCollaboratorInfo getOwner() {
    return owner;
  }

  public CleanRoomAssetInfo setTableInfo(CleanRoomTableInfo tableInfo) {
    this.tableInfo = tableInfo;
    return this;
  }

  public CleanRoomTableInfo getTableInfo() {
    return tableInfo;
  }

  public CleanRoomAssetInfo setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CleanRoomAssetInfo that = (CleanRoomAssetInfo) o;
    return Objects.equals(addedAt, that.addedAt)
        && Objects.equals(notebookInfo, that.notebookInfo)
        && Objects.equals(owner, that.owner)
        && Objects.equals(tableInfo, that.tableInfo)
        && Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addedAt, notebookInfo, owner, tableInfo, updatedAt);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomAssetInfo.class)
        .add("addedAt", addedAt)
        .add("notebookInfo", notebookInfo)
        .add("owner", owner)
        .add("tableInfo", tableInfo)
        .add("updatedAt", updatedAt)
        .toString();
  }
}
