// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Duration;
import java.util.Collection;
import java.util.Objects;

/** Desired PostgREST configuration (input). */
@Generated
public class DataApiDataApiSpec {
  /** Enable aggregate functions (count, sum, avg, etc.) in Data API responses. Default: true. */
  @JsonProperty("db_aggregates_enabled")
  private Boolean dbAggregatesEnabled;

  /**
   * Additional schemas to include in the PostgreSQL search path. Each entry must be a valid
   * PostgreSQL schema name.
   */
  @JsonProperty("db_extra_search_path")
  private Collection<String> dbExtraSearchPath;

  /** Maximum number of rows returned in a single Data API response. Must be a positive integer. */
  @JsonProperty("db_max_rows")
  private Long dbMaxRows;

  /**
   * Database schemas exposed through the Data API. Each entry must be a valid PostgreSQL schema
   * name (1-63 chars, [a-zA-Z_][a-zA-Z0-9_$]*). Maximum 100 entries. Default: ["public"].
   */
  @JsonProperty("db_schemas")
  private Collection<String> dbSchemas;

  /** Maximum lifetime for cached JWT tokens. Zero duration disables caching. */
  @JsonProperty("jwt_cache_max_lifetime")
  private Duration jwtCacheMaxLifetime;

  /** JSON path to the role claim in JWT tokens (e.g., ".sub"). Default: ".sub". */
  @JsonProperty("jwt_role_claim_key")
  private String jwtRoleClaimKey;

  /** OpenAPI documentation mode for the Data API endpoint. */
  @JsonProperty("openapi_mode")
  private OpenApiMode openapiMode;

  /**
   * Allowed origins for CORS requests. Each entry should be a valid origin URL, or use "*" to allow
   * all origins.
   */
  @JsonProperty("server_cors_allowed_origins")
  private Collection<String> serverCorsAllowedOrigins;

  /** Enable the Server-Timing header in Data API responses. */
  @JsonProperty("server_timing_enabled")
  private Boolean serverTimingEnabled;

  public DataApiDataApiSpec setDbAggregatesEnabled(Boolean dbAggregatesEnabled) {
    this.dbAggregatesEnabled = dbAggregatesEnabled;
    return this;
  }

  public Boolean getDbAggregatesEnabled() {
    return dbAggregatesEnabled;
  }

  public DataApiDataApiSpec setDbExtraSearchPath(Collection<String> dbExtraSearchPath) {
    this.dbExtraSearchPath = dbExtraSearchPath;
    return this;
  }

  public Collection<String> getDbExtraSearchPath() {
    return dbExtraSearchPath;
  }

  public DataApiDataApiSpec setDbMaxRows(Long dbMaxRows) {
    this.dbMaxRows = dbMaxRows;
    return this;
  }

  public Long getDbMaxRows() {
    return dbMaxRows;
  }

  public DataApiDataApiSpec setDbSchemas(Collection<String> dbSchemas) {
    this.dbSchemas = dbSchemas;
    return this;
  }

  public Collection<String> getDbSchemas() {
    return dbSchemas;
  }

  public DataApiDataApiSpec setJwtCacheMaxLifetime(Duration jwtCacheMaxLifetime) {
    this.jwtCacheMaxLifetime = jwtCacheMaxLifetime;
    return this;
  }

  public Duration getJwtCacheMaxLifetime() {
    return jwtCacheMaxLifetime;
  }

  public DataApiDataApiSpec setJwtRoleClaimKey(String jwtRoleClaimKey) {
    this.jwtRoleClaimKey = jwtRoleClaimKey;
    return this;
  }

  public String getJwtRoleClaimKey() {
    return jwtRoleClaimKey;
  }

  public DataApiDataApiSpec setOpenapiMode(OpenApiMode openapiMode) {
    this.openapiMode = openapiMode;
    return this;
  }

  public OpenApiMode getOpenapiMode() {
    return openapiMode;
  }

  public DataApiDataApiSpec setServerCorsAllowedOrigins(
      Collection<String> serverCorsAllowedOrigins) {
    this.serverCorsAllowedOrigins = serverCorsAllowedOrigins;
    return this;
  }

  public Collection<String> getServerCorsAllowedOrigins() {
    return serverCorsAllowedOrigins;
  }

  public DataApiDataApiSpec setServerTimingEnabled(Boolean serverTimingEnabled) {
    this.serverTimingEnabled = serverTimingEnabled;
    return this;
  }

  public Boolean getServerTimingEnabled() {
    return serverTimingEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DataApiDataApiSpec that = (DataApiDataApiSpec) o;
    return Objects.equals(dbAggregatesEnabled, that.dbAggregatesEnabled)
        && Objects.equals(dbExtraSearchPath, that.dbExtraSearchPath)
        && Objects.equals(dbMaxRows, that.dbMaxRows)
        && Objects.equals(dbSchemas, that.dbSchemas)
        && Objects.equals(jwtCacheMaxLifetime, that.jwtCacheMaxLifetime)
        && Objects.equals(jwtRoleClaimKey, that.jwtRoleClaimKey)
        && Objects.equals(openapiMode, that.openapiMode)
        && Objects.equals(serverCorsAllowedOrigins, that.serverCorsAllowedOrigins)
        && Objects.equals(serverTimingEnabled, that.serverTimingEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dbAggregatesEnabled,
        dbExtraSearchPath,
        dbMaxRows,
        dbSchemas,
        jwtCacheMaxLifetime,
        jwtRoleClaimKey,
        openapiMode,
        serverCorsAllowedOrigins,
        serverTimingEnabled);
  }

  @Override
  public String toString() {
    return new ToStringer(DataApiDataApiSpec.class)
        .add("dbAggregatesEnabled", dbAggregatesEnabled)
        .add("dbExtraSearchPath", dbExtraSearchPath)
        .add("dbMaxRows", dbMaxRows)
        .add("dbSchemas", dbSchemas)
        .add("jwtCacheMaxLifetime", jwtCacheMaxLifetime)
        .add("jwtRoleClaimKey", jwtRoleClaimKey)
        .add("openapiMode", openapiMode)
        .add("serverCorsAllowedOrigins", serverCorsAllowedOrigins)
        .add("serverTimingEnabled", serverTimingEnabled)
        .toString();
  }
}
