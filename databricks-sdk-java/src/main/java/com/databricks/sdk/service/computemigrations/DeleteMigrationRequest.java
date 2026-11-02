// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.computemigrations;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeleteMigrationRequest {
  /** If nonempty, must match the current resource etag or the request fails with ABORTED. */
  @JsonIgnore
  @QueryParam("etag")
  private String etag;

  /** The ID of the migration to cancel. */
  @JsonIgnore private String migrationId;

  public DeleteMigrationRequest setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public DeleteMigrationRequest setMigrationId(String migrationId) {
    this.migrationId = migrationId;
    return this;
  }

  public String getMigrationId() {
    return migrationId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteMigrationRequest that = (DeleteMigrationRequest) o;
    return Objects.equals(etag, that.etag) && Objects.equals(migrationId, that.migrationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, migrationId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteMigrationRequest.class)
        .add("etag", etag)
        .add("migrationId", migrationId)
        .toString();
  }
}
