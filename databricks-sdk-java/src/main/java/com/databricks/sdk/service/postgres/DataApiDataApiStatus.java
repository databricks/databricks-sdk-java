// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Duration;
import java.util.Collection;
import java.util.Objects;

/** Observed state (output-only). */
@Generated
public class DataApiDataApiStatus {
  /** Schemas available in the database (for reference when configuring db_schemas). */
  @JsonProperty("available_schemas")
  private Collection<String> availableSchemas;

  /** Actual aggregate function setting read from the database. */
  @JsonProperty("db_aggregates_enabled")
  private Boolean dbAggregatesEnabled;

  /** Actual extra search path schemas read from the database. */
  @JsonProperty("db_extra_search_path")
  private Collection<String> dbExtraSearchPath;

  /** Actual max rows setting read from the database. */
  @JsonProperty("db_max_rows")
  private Long dbMaxRows;

  /** Actual exposed schemas read from the database. */
  @JsonProperty("db_schemas")
  private Collection<String> dbSchemas;

  /** Actual JWT cache max lifetime read from the database. */
  @JsonProperty("jwt_cache_max_lifetime")
  private Duration jwtCacheMaxLifetime;

  /** Actual JWT role claim key read from the database. */
  @JsonProperty("jwt_role_claim_key")
  private String jwtRoleClaimKey;

  /** Actual OpenAPI mode read from the database. */
  @JsonProperty("openapi_mode")
  private OpenApiMode openapiMode;

  /** Actual CORS allowed origins read from the database. */
  @JsonProperty("server_cors_allowed_origins")
  private Collection<String> serverCorsAllowedOrigins;

  /** Actual Server-Timing header setting read from the database. */
  @JsonProperty("server_timing_enabled")
  private Boolean serverTimingEnabled;

  /** Data API endpoint URL. */
  @JsonProperty("url")
  private String url;

  public DataApiDataApiStatus setAvailableSchemas(Collection<String> availableSchemas) {
    this.availableSchemas = availableSchemas;
    return this;
  }

  public Collection<String> getAvailableSchemas() {
    return availableSchemas;
  }

  public DataApiDataApiStatus setDbAggregatesEnabled(Boolean dbAggregatesEnabled) {
    this.dbAggregatesEnabled = dbAggregatesEnabled;
    return this;
  }

  public Boolean getDbAggregatesEnabled() {
    return dbAggregatesEnabled;
  }

  public DataApiDataApiStatus setDbExtraSearchPath(Collection<String> dbExtraSearchPath) {
    this.dbExtraSearchPath = dbExtraSearchPath;
    return this;
  }

  public Collection<String> getDbExtraSearchPath() {
    return dbExtraSearchPath;
  }

  public DataApiDataApiStatus setDbMaxRows(Long dbMaxRows) {
    this.dbMaxRows = dbMaxRows;
    return this;
  }

  public Long getDbMaxRows() {
    return dbMaxRows;
  }

  public DataApiDataApiStatus setDbSchemas(Collection<String> dbSchemas) {
    this.dbSchemas = dbSchemas;
    return this;
  }

  public Collection<String> getDbSchemas() {
    return dbSchemas;
  }

  public DataApiDataApiStatus setJwtCacheMaxLifetime(Duration jwtCacheMaxLifetime) {
    this.jwtCacheMaxLifetime = jwtCacheMaxLifetime;
    return this;
  }

  public Duration getJwtCacheMaxLifetime() {
    return jwtCacheMaxLifetime;
  }

  public DataApiDataApiStatus setJwtRoleClaimKey(String jwtRoleClaimKey) {
    this.jwtRoleClaimKey = jwtRoleClaimKey;
    return this;
  }

  public String getJwtRoleClaimKey() {
    return jwtRoleClaimKey;
  }

  public DataApiDataApiStatus setOpenapiMode(OpenApiMode openapiMode) {
    this.openapiMode = openapiMode;
    return this;
  }

  public OpenApiMode getOpenapiMode() {
    return openapiMode;
  }

  public DataApiDataApiStatus setServerCorsAllowedOrigins(
      Collection<String> serverCorsAllowedOrigins) {
    this.serverCorsAllowedOrigins = serverCorsAllowedOrigins;
    return this;
  }

  public Collection<String> getServerCorsAllowedOrigins() {
    return serverCorsAllowedOrigins;
  }

  public DataApiDataApiStatus setServerTimingEnabled(Boolean serverTimingEnabled) {
    this.serverTimingEnabled = serverTimingEnabled;
    return this;
  }

  public Boolean getServerTimingEnabled() {
    return serverTimingEnabled;
  }

  public DataApiDataApiStatus setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getUrl() {
    return url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DataApiDataApiStatus that = (DataApiDataApiStatus) o;
    return Objects.equals(availableSchemas, that.availableSchemas)
        && Objects.equals(dbAggregatesEnabled, that.dbAggregatesEnabled)
        && Objects.equals(dbExtraSearchPath, that.dbExtraSearchPath)
        && Objects.equals(dbMaxRows, that.dbMaxRows)
        && Objects.equals(dbSchemas, that.dbSchemas)
        && Objects.equals(jwtCacheMaxLifetime, that.jwtCacheMaxLifetime)
        && Objects.equals(jwtRoleClaimKey, that.jwtRoleClaimKey)
        && Objects.equals(openapiMode, that.openapiMode)
        && Objects.equals(serverCorsAllowedOrigins, that.serverCorsAllowedOrigins)
        && Objects.equals(serverTimingEnabled, that.serverTimingEnabled)
        && Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        availableSchemas,
        dbAggregatesEnabled,
        dbExtraSearchPath,
        dbMaxRows,
        dbSchemas,
        jwtCacheMaxLifetime,
        jwtRoleClaimKey,
        openapiMode,
        serverCorsAllowedOrigins,
        serverTimingEnabled,
        url);
  }

  @Override
  public String toString() {
    return new ToStringer(DataApiDataApiStatus.class)
        .add("availableSchemas", availableSchemas)
        .add("dbAggregatesEnabled", dbAggregatesEnabled)
        .add("dbExtraSearchPath", dbExtraSearchPath)
        .add("dbMaxRows", dbMaxRows)
        .add("dbSchemas", dbSchemas)
        .add("jwtCacheMaxLifetime", jwtCacheMaxLifetime)
        .add("jwtRoleClaimKey", jwtRoleClaimKey)
        .add("openapiMode", openapiMode)
        .add("serverCorsAllowedOrigins", serverCorsAllowedOrigins)
        .add("serverTimingEnabled", serverTimingEnabled)
        .add("url", url)
        .toString();
  }
}
