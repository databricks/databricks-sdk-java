// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateCdfConfigRequest {
  /**
   * The CdfConfig to create. The catalog, schema, and postgres_schema fields are required; all
   * other fields are output only and ignored on input.
   */
  @JsonProperty("cdf_config")
  private CdfConfig cdfConfig;

  /**
   * The user-specified id for the CdfConfig, forming the final segment of its resource name. Must
   * match the pattern `[a-z][a-z0-9_]{0,62}`. Defaults to the Postgres schema name when omitted.
   */
  @JsonIgnore
  @QueryParam("cdf_config_id")
  private String cdfConfigId;

  /**
   * The parent database under which to create the CdfConfig. Format:
   * projects/{project}/branches/{branch}/databases/{database}
   */
  @JsonIgnore private String parent;

  public CreateCdfConfigRequest setCdfConfig(CdfConfig cdfConfig) {
    this.cdfConfig = cdfConfig;
    return this;
  }

  public CdfConfig getCdfConfig() {
    return cdfConfig;
  }

  public CreateCdfConfigRequest setCdfConfigId(String cdfConfigId) {
    this.cdfConfigId = cdfConfigId;
    return this;
  }

  public String getCdfConfigId() {
    return cdfConfigId;
  }

  public CreateCdfConfigRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateCdfConfigRequest that = (CreateCdfConfigRequest) o;
    return Objects.equals(cdfConfig, that.cdfConfig)
        && Objects.equals(cdfConfigId, that.cdfConfigId)
        && Objects.equals(parent, that.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cdfConfig, cdfConfigId, parent);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCdfConfigRequest.class)
        .add("cdfConfig", cdfConfig)
        .add("cdfConfigId", cdfConfigId)
        .add("parent", parent)
        .toString();
  }
}
