// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.computemigrations;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetMigrationRequest {
  /** The ID of the migration to retrieve. */
  @JsonIgnore private String migrationId;

  public GetMigrationRequest setMigrationId(String migrationId) {
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
    GetMigrationRequest that = (GetMigrationRequest) o;
    return Objects.equals(migrationId, that.migrationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(migrationId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetMigrationRequest.class).add("migrationId", migrationId).toString();
  }
}
