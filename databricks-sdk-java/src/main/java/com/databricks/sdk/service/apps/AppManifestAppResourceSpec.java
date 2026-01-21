// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * AppResource related fields are copied from app.proto but excludes resource identifiers (e.g.
 * name, id, key, scope, etc.)
 */
@Generated
public class AppManifestAppResourceSpec {
  /** Description of the App Resource. */
  @JsonProperty("description")
  private String description;

  /** */
  @JsonProperty("experiment_spec")
  private AppManifestAppResourceExperimentSpec experimentSpec;

  /** */
  @JsonProperty("job_spec")
  private AppManifestAppResourceJobSpec jobSpec;

  /** Name of the App Resource. */
  @JsonProperty("name")
  private String name;

  /** */
  @JsonProperty("secret_spec")
  private AppManifestAppResourceSecretSpec secretSpec;

  /** */
  @JsonProperty("serving_endpoint_spec")
  private AppManifestAppResourceServingEndpointSpec servingEndpointSpec;

  /** */
  @JsonProperty("sql_warehouse_spec")
  private AppManifestAppResourceSqlWarehouseSpec sqlWarehouseSpec;

  /** */
  @JsonProperty("uc_securable_spec")
  private AppManifestAppResourceUcSecurableSpec ucSecurableSpec;

  public AppManifestAppResourceSpec setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public AppManifestAppResourceSpec setExperimentSpec(
      AppManifestAppResourceExperimentSpec experimentSpec) {
    this.experimentSpec = experimentSpec;
    return this;
  }

  public AppManifestAppResourceExperimentSpec getExperimentSpec() {
    return experimentSpec;
  }

  public AppManifestAppResourceSpec setJobSpec(AppManifestAppResourceJobSpec jobSpec) {
    this.jobSpec = jobSpec;
    return this;
  }

  public AppManifestAppResourceJobSpec getJobSpec() {
    return jobSpec;
  }

  public AppManifestAppResourceSpec setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public AppManifestAppResourceSpec setSecretSpec(AppManifestAppResourceSecretSpec secretSpec) {
    this.secretSpec = secretSpec;
    return this;
  }

  public AppManifestAppResourceSecretSpec getSecretSpec() {
    return secretSpec;
  }

  public AppManifestAppResourceSpec setServingEndpointSpec(
      AppManifestAppResourceServingEndpointSpec servingEndpointSpec) {
    this.servingEndpointSpec = servingEndpointSpec;
    return this;
  }

  public AppManifestAppResourceServingEndpointSpec getServingEndpointSpec() {
    return servingEndpointSpec;
  }

  public AppManifestAppResourceSpec setSqlWarehouseSpec(
      AppManifestAppResourceSqlWarehouseSpec sqlWarehouseSpec) {
    this.sqlWarehouseSpec = sqlWarehouseSpec;
    return this;
  }

  public AppManifestAppResourceSqlWarehouseSpec getSqlWarehouseSpec() {
    return sqlWarehouseSpec;
  }

  public AppManifestAppResourceSpec setUcSecurableSpec(
      AppManifestAppResourceUcSecurableSpec ucSecurableSpec) {
    this.ucSecurableSpec = ucSecurableSpec;
    return this;
  }

  public AppManifestAppResourceUcSecurableSpec getUcSecurableSpec() {
    return ucSecurableSpec;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppManifestAppResourceSpec that = (AppManifestAppResourceSpec) o;
    return Objects.equals(description, that.description)
        && Objects.equals(experimentSpec, that.experimentSpec)
        && Objects.equals(jobSpec, that.jobSpec)
        && Objects.equals(name, that.name)
        && Objects.equals(secretSpec, that.secretSpec)
        && Objects.equals(servingEndpointSpec, that.servingEndpointSpec)
        && Objects.equals(sqlWarehouseSpec, that.sqlWarehouseSpec)
        && Objects.equals(ucSecurableSpec, that.ucSecurableSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description,
        experimentSpec,
        jobSpec,
        name,
        secretSpec,
        servingEndpointSpec,
        sqlWarehouseSpec,
        ucSecurableSpec);
  }

  @Override
  public String toString() {
    return new ToStringer(AppManifestAppResourceSpec.class)
        .add("description", description)
        .add("experimentSpec", experimentSpec)
        .add("jobSpec", jobSpec)
        .add("name", name)
        .add("secretSpec", secretSpec)
        .add("servingEndpointSpec", servingEndpointSpec)
        .add("sqlWarehouseSpec", sqlWarehouseSpec)
        .add("ucSecurableSpec", ucSecurableSpec)
        .toString();
  }
}
