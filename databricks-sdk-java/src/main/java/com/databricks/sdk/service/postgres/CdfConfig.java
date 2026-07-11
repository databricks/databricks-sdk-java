// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/**
 * A Lakebase CDF configuration (CdfConfig): one per Postgres schema per database, replicating that
 * schema's tables into a Unity Catalog schema. Immutable once created.
 */
@Generated
public class CdfConfig {
  /**
   * The Unity Catalog catalog that replicated tables are written into. Set at creation; the
   * CdfConfig is immutable.
   */
  @JsonProperty("catalog")
  private String catalog;

  /**
   * The user-specified id; equals the final segment of `name`. Defaults to the Postgres schema name
   * for configs without an explicit id.
   */
  @JsonProperty("cdf_config_id")
  private String cdfConfigId;

  /** When the CdfConfig was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /**
   * Output only. The full resource name of the CdfConfig. Format:
   * projects/{project}/branches/{branch}/databases/{database}/cdf-configs/{cdf_config}
   */
  @JsonProperty("name")
  private String name;

  /**
   * The Postgres schema this CdfConfig replicates from. Unique within the parent database. Set at
   * creation; the CdfConfig is immutable.
   */
  @JsonProperty("postgres_schema")
  private String postgresSchema;

  /**
   * The Unity Catalog schema that replicated tables are written into. Set at creation; the
   * CdfConfig is immutable.
   */
  @JsonProperty("schema")
  private String schema;

  public CdfConfig setCatalog(String catalog) {
    this.catalog = catalog;
    return this;
  }

  public String getCatalog() {
    return catalog;
  }

  public CdfConfig setCdfConfigId(String cdfConfigId) {
    this.cdfConfigId = cdfConfigId;
    return this;
  }

  public String getCdfConfigId() {
    return cdfConfigId;
  }

  public CdfConfig setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public CdfConfig setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CdfConfig setPostgresSchema(String postgresSchema) {
    this.postgresSchema = postgresSchema;
    return this;
  }

  public String getPostgresSchema() {
    return postgresSchema;
  }

  public CdfConfig setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CdfConfig that = (CdfConfig) o;
    return Objects.equals(catalog, that.catalog)
        && Objects.equals(cdfConfigId, that.cdfConfigId)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(name, that.name)
        && Objects.equals(postgresSchema, that.postgresSchema)
        && Objects.equals(schema, that.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalog, cdfConfigId, createTime, name, postgresSchema, schema);
  }

  @Override
  public String toString() {
    return new ToStringer(CdfConfig.class)
        .add("catalog", catalog)
        .add("cdfConfigId", cdfConfigId)
        .add("createTime", createTime)
        .add("name", name)
        .add("postgresSchema", postgresSchema)
        .add("schema", schema)
        .toString();
  }
}
