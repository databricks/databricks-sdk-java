// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Collection;
import java.util.Objects;

/** A managed migration of PostgreSQL databases into a Lakebase branch. */
@Generated
public class Migration {
  /** Output-only. The time when the migration was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** Required. Mappings from source databases to target databases. */
  @JsonProperty("database_mappings")
  private Collection<DatabaseMapping> databaseMappings;

  /**
   * Output-only. The time when the migration was soft-deleted. Empty if the migration is active.
   */
  @JsonProperty("delete_time")
  private Timestamp deleteTime;

  /** Output-only. The current error preventing migration progress, if any. */
  @JsonProperty("error")
  private MigrationError error;

  /** Required. Immutable. The intended migration mode, selected when the migration is created. */
  @JsonProperty("migration_type")
  private MigrationType migrationType;

  /** The migration resource name, in the format `migrations/{migration}`. */
  @JsonProperty("name")
  private String name;

  /**
   * Output-only. The time when the soft-deleted migration is scheduled for permanent deletion.
   * Empty if the migration is active or permanent deletion is not scheduled.
   */
  @JsonProperty("purge_time")
  private Timestamp purgeTime;

  /**
   * Required. The name of the Unity Catalog connection (a UC securable name, such as
   * `my_postgres_connection`) used to connect to the source PostgreSQL server.
   */
  @JsonProperty("source_connection")
  private String sourceConnection;

  /** Output-only. The authoritative migration lifecycle state. */
  @JsonProperty("state")
  private MigrationState state;

  /**
   * The Lakebase branch receiving the migrated databases, in the format
   * `projects/{project_id}/branches/{branch_id}`. May be omitted during assessment, but must be set
   * before the migration starts, and may be changed until then.
   */
  @JsonProperty("target_branch")
  private String targetBranch;

  /** Output-only. The time when the migration was last updated. */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  public Migration setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public Migration setDatabaseMappings(Collection<DatabaseMapping> databaseMappings) {
    this.databaseMappings = databaseMappings;
    return this;
  }

  public Collection<DatabaseMapping> getDatabaseMappings() {
    return databaseMappings;
  }

  public Migration setDeleteTime(Timestamp deleteTime) {
    this.deleteTime = deleteTime;
    return this;
  }

  public Timestamp getDeleteTime() {
    return deleteTime;
  }

  public Migration setError(MigrationError error) {
    this.error = error;
    return this;
  }

  public MigrationError getError() {
    return error;
  }

  public Migration setMigrationType(MigrationType migrationType) {
    this.migrationType = migrationType;
    return this;
  }

  public MigrationType getMigrationType() {
    return migrationType;
  }

  public Migration setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Migration setPurgeTime(Timestamp purgeTime) {
    this.purgeTime = purgeTime;
    return this;
  }

  public Timestamp getPurgeTime() {
    return purgeTime;
  }

  public Migration setSourceConnection(String sourceConnection) {
    this.sourceConnection = sourceConnection;
    return this;
  }

  public String getSourceConnection() {
    return sourceConnection;
  }

  public Migration setState(MigrationState state) {
    this.state = state;
    return this;
  }

  public MigrationState getState() {
    return state;
  }

  public Migration setTargetBranch(String targetBranch) {
    this.targetBranch = targetBranch;
    return this;
  }

  public String getTargetBranch() {
    return targetBranch;
  }

  public Migration setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Migration that = (Migration) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(databaseMappings, that.databaseMappings)
        && Objects.equals(deleteTime, that.deleteTime)
        && Objects.equals(error, that.error)
        && Objects.equals(migrationType, that.migrationType)
        && Objects.equals(name, that.name)
        && Objects.equals(purgeTime, that.purgeTime)
        && Objects.equals(sourceConnection, that.sourceConnection)
        && Objects.equals(state, that.state)
        && Objects.equals(targetBranch, that.targetBranch)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createTime,
        databaseMappings,
        deleteTime,
        error,
        migrationType,
        name,
        purgeTime,
        sourceConnection,
        state,
        targetBranch,
        updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(Migration.class)
        .add("createTime", createTime)
        .add("databaseMappings", databaseMappings)
        .add("deleteTime", deleteTime)
        .add("error", error)
        .add("migrationType", migrationType)
        .add("name", name)
        .add("purgeTime", purgeTime)
        .add("sourceConnection", sourceConnection)
        .add("state", state)
        .add("targetBranch", targetBranch)
        .add("updateTime", updateTime)
        .toString();
  }
}
