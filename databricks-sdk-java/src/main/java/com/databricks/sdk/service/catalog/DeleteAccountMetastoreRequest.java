// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Delete a metastore */
@Generated
public class DeleteAccountMetastoreRequest {
  /** Force deletion even if the metastore is not empty. Default is false. */
  @QueryParam("force")
  private Boolean force;

  /** Unity Catalog metastore ID */
  private String metastoreId;

  public DeleteAccountMetastoreRequest setForce(Boolean force) {
    this.force = force;
    return this;
  }

  public Boolean getForce() {
    return force;
  }

  public DeleteAccountMetastoreRequest setMetastoreId(String metastoreId) {
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
    DeleteAccountMetastoreRequest that = (DeleteAccountMetastoreRequest) o;
    return Objects.equals(force, that.force) && Objects.equals(metastoreId, that.metastoreId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(force, metastoreId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteAccountMetastoreRequest.class)
        .add("force", force)
        .add("metastoreId", metastoreId)
        .toString();
  }
}
