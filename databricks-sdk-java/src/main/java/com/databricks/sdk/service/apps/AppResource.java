// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AppResource {
  /** Another app in the workspace that this app is granted access to. */
  @JsonProperty("app")
  private AppResourceApp app;

  /** Lakebase Provisioned database the app is granted access to. */
  @JsonProperty("database")
  private AppResourceDatabase database;

  /** Description of the App Resource. */
  @JsonProperty("description")
  private String description;

  /** MLflow experiment the app is granted access to. */
  @JsonProperty("experiment")
  private AppResourceExperiment experiment;

  /** Genie space the app is granted access to. */
  @JsonProperty("genie_space")
  private AppResourceGenieSpace genieSpace;

  /** Lakeflow job the app is granted access to. */
  @JsonProperty("job")
  private AppResourceJob job;

  /**
   * Key that identifies the resource within the app. The app configuration (app.yaml) references
   * the resource by this key.
   */
  @JsonProperty("name")
  private String name;

  /** Lakebase Autoscaling Postgres database the app is granted access to. */
  @JsonProperty("postgres")
  private AppResourcePostgres postgres;

  /** Secret the app is granted access to. */
  @JsonProperty("secret")
  private AppResourceSecret secret;

  /** Model serving endpoint the app is granted access to. */
  @JsonProperty("serving_endpoint")
  private AppResourceServingEndpoint servingEndpoint;

  /** SQL warehouse the app is granted access to. */
  @JsonProperty("sql_warehouse")
  private AppResourceSqlWarehouse sqlWarehouse;

  /**
   * Unity Catalog securable (volume, table, function, connection or model service) the app is
   * granted a privilege on.
   */
  @JsonProperty("uc_securable")
  private AppResourceUcSecurable ucSecurable;

  public AppResource setApp(AppResourceApp app) {
    this.app = app;
    return this;
  }

  public AppResourceApp getApp() {
    return app;
  }

  public AppResource setDatabase(AppResourceDatabase database) {
    this.database = database;
    return this;
  }

  public AppResourceDatabase getDatabase() {
    return database;
  }

  public AppResource setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public AppResource setExperiment(AppResourceExperiment experiment) {
    this.experiment = experiment;
    return this;
  }

  public AppResourceExperiment getExperiment() {
    return experiment;
  }

  public AppResource setGenieSpace(AppResourceGenieSpace genieSpace) {
    this.genieSpace = genieSpace;
    return this;
  }

  public AppResourceGenieSpace getGenieSpace() {
    return genieSpace;
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

  public AppResource setPostgres(AppResourcePostgres postgres) {
    this.postgres = postgres;
    return this;
  }

  public AppResourcePostgres getPostgres() {
    return postgres;
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

  public AppResource setUcSecurable(AppResourceUcSecurable ucSecurable) {
    this.ucSecurable = ucSecurable;
    return this;
  }

  public AppResourceUcSecurable getUcSecurable() {
    return ucSecurable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppResource that = (AppResource) o;
    return Objects.equals(app, that.app)
        && Objects.equals(database, that.database)
        && Objects.equals(description, that.description)
        && Objects.equals(experiment, that.experiment)
        && Objects.equals(genieSpace, that.genieSpace)
        && Objects.equals(job, that.job)
        && Objects.equals(name, that.name)
        && Objects.equals(postgres, that.postgres)
        && Objects.equals(secret, that.secret)
        && Objects.equals(servingEndpoint, that.servingEndpoint)
        && Objects.equals(sqlWarehouse, that.sqlWarehouse)
        && Objects.equals(ucSecurable, that.ucSecurable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        app,
        database,
        description,
        experiment,
        genieSpace,
        job,
        name,
        postgres,
        secret,
        servingEndpoint,
        sqlWarehouse,
        ucSecurable);
  }

  @Override
  public String toString() {
    return new ToStringer(AppResource.class)
        .add("app", app)
        .add("database", database)
        .add("description", description)
        .add("experiment", experiment)
        .add("genieSpace", genieSpace)
        .add("job", job)
        .add("name", name)
        .add("postgres", postgres)
        .add("secret", secret)
        .add("servingEndpoint", servingEndpoint)
        .add("sqlWarehouse", sqlWarehouse)
        .add("ucSecurable", ucSecurable)
        .toString();
  }
}
