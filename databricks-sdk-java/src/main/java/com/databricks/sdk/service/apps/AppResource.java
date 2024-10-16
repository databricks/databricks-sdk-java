// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AppResource {
  /** Description of the App Resource. */
  @JsonProperty("description")
  private String description;

  /** */
  @JsonProperty("job")
  private AppResourceJob job;

  /** Name of the App Resource. */
  @JsonProperty("name")
  private String name;

  /** */
  @JsonProperty("secret")
  private AppResourceSecret secret;

  /** */
  @JsonProperty("serving_endpoint")
  private AppResourceServingEndpoint servingEndpoint;

  /** */
  @JsonProperty("sql_warehouse")
  private AppResourceSqlWarehouse sqlWarehouse;

  public AppResource setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public AppResource setJob(AppResourceJob job) {
    this.job = job;
    return this;
  }

  public AppResourceJob getJob() {
    return job;
  }

  public AppResource setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public AppResource setSecret(AppResourceSecret secret) {
    this.secret = secret;
    return this;
  }

  public AppResourceSecret getSecret() {
    return secret;
  }

  public AppResource setServingEndpoint(AppResourceServingEndpoint servingEndpoint) {
    this.servingEndpoint = servingEndpoint;
    return this;
  }

  public AppResourceServingEndpoint getServingEndpoint() {
    return servingEndpoint;
  }

  public AppResource setSqlWarehouse(AppResourceSqlWarehouse sqlWarehouse) {
    this.sqlWarehouse = sqlWarehouse;
    return this;
  }

  public AppResourceSqlWarehouse getSqlWarehouse() {
    return sqlWarehouse;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppResource that = (AppResource) o;
    return Objects.equals(description, that.description)
        && Objects.equals(job, that.job)
        && Objects.equals(name, that.name)
        && Objects.equals(secret, that.secret)
        && Objects.equals(servingEndpoint, that.servingEndpoint)
        && Objects.equals(sqlWarehouse, that.sqlWarehouse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, job, name, secret, servingEndpoint, sqlWarehouse);
  }

  @Override
  public String toString() {
    return new ToStringer(AppResource.class)
        .add("description", description)
        .add("job", job)
        .add("name", name)
        .add("secret", secret)
        .add("servingEndpoint", servingEndpoint)
        .add("sqlWarehouse", sqlWarehouse)
        .toString();
  }
}
