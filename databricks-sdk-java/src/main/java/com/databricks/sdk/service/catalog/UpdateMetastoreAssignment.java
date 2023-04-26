// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>UpdateMetastoreAssignment class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class UpdateMetastoreAssignment {
  /** The name of the default catalog for the metastore. */
  @JsonProperty("default_catalog_name")
  private String defaultCatalogName;

  /** The unique ID of the metastore. */
  @JsonProperty("metastore_id")
  private String metastoreId;

  /** Workspace ID. */
  private Long workspaceId;

  /**
   * <p>Setter for the field <code>defaultCatalogName</code>.</p>
   *
   * @param defaultCatalogName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.UpdateMetastoreAssignment} object
   */
  public UpdateMetastoreAssignment setDefaultCatalogName(String defaultCatalogName) {
    this.defaultCatalogName = defaultCatalogName;
    return this;
  }

  /**
   * <p>Getter for the field <code>defaultCatalogName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDefaultCatalogName() {
    return defaultCatalogName;
  }

  /**
   * <p>Setter for the field <code>metastoreId</code>.</p>
   *
   * @param metastoreId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.UpdateMetastoreAssignment} object
   */
  public UpdateMetastoreAssignment setMetastoreId(String metastoreId) {
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

  /**
   * <p>Setter for the field <code>workspaceId</code>.</p>
   *
   * @param workspaceId a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.catalog.UpdateMetastoreAssignment} object
   */
  public UpdateMetastoreAssignment setWorkspaceId(Long workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  /**
   * <p>Getter for the field <code>workspaceId</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getWorkspaceId() {
    return workspaceId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateMetastoreAssignment that = (UpdateMetastoreAssignment) o;
    return Objects.equals(defaultCatalogName, that.defaultCatalogName)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(defaultCatalogName, metastoreId, workspaceId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(UpdateMetastoreAssignment.class)
        .add("defaultCatalogName", defaultCatalogName)
        .add("metastoreId", metastoreId)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
