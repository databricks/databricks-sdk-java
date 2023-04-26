// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>DbtTask class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DbtTask {
  /**
   * Optional name of the catalog to use. The value is the top level in the 3-level namespace of
   * Unity Catalog (catalog / schema / relation). The catalog value can only be specified if a
   * warehouse_id is specified. Requires dbt-databricks >= 1.1.1.
   */
  @JsonProperty("catalog")
  private String catalog;

  /**
   * A list of dbt commands to execute. All commands must start with `dbt`. This parameter must not
   * be empty. A maximum of up to 10 commands can be provided.
   */
  @JsonProperty("commands")
  private Collection<String> commands;

  /**
   * Optional (relative) path to the profiles directory. Can only be specified if no warehouse_id is
   * specified. If no warehouse_id is specified and this folder is unset, the root directory is
   * used.
   */
  @JsonProperty("profiles_directory")
  private String profilesDirectory;

  /**
   * Optional (relative) path to the project directory, if no value is provided, the root of the git
   * repository is used.
   */
  @JsonProperty("project_directory")
  private String projectDirectory;

  /**
   * Optional schema to write to. This parameter is only used when a warehouse_id is also provided.
   * If not provided, the `default` schema is used.
   */
  @JsonProperty("schema")
  private String schema;

  /**
   * ID of the SQL warehouse to connect to. If provided, we automatically generate and provide the
   * profile and connection details to dbt. It can be overridden on a per-command basis by using the
   * `--profiles-dir` command line argument.
   */
  @JsonProperty("warehouse_id")
  private String warehouseId;

  /**
   * <p>Setter for the field <code>catalog</code>.</p>
   *
   * @param catalog a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.DbtTask} object
   */
  public DbtTask setCatalog(String catalog) {
    this.catalog = catalog;
    return this;
  }

  /**
   * <p>Getter for the field <code>catalog</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCatalog() {
    return catalog;
  }

  /**
   * <p>Setter for the field <code>commands</code>.</p>
   *
   * @param commands a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.jobs.DbtTask} object
   */
  public DbtTask setCommands(Collection<String> commands) {
    this.commands = commands;
    return this;
  }

  /**
   * <p>Getter for the field <code>commands</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getCommands() {
    return commands;
  }

  /**
   * <p>Setter for the field <code>profilesDirectory</code>.</p>
   *
   * @param profilesDirectory a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.DbtTask} object
   */
  public DbtTask setProfilesDirectory(String profilesDirectory) {
    this.profilesDirectory = profilesDirectory;
    return this;
  }

  /**
   * <p>Getter for the field <code>profilesDirectory</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getProfilesDirectory() {
    return profilesDirectory;
  }

  /**
   * <p>Setter for the field <code>projectDirectory</code>.</p>
   *
   * @param projectDirectory a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.DbtTask} object
   */
  public DbtTask setProjectDirectory(String projectDirectory) {
    this.projectDirectory = projectDirectory;
    return this;
  }

  /**
   * <p>Getter for the field <code>projectDirectory</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getProjectDirectory() {
    return projectDirectory;
  }

  /**
   * <p>Setter for the field <code>schema</code>.</p>
   *
   * @param schema a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.DbtTask} object
   */
  public DbtTask setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  /**
   * <p>Getter for the field <code>schema</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getSchema() {
    return schema;
  }

  /**
   * <p>Setter for the field <code>warehouseId</code>.</p>
   *
   * @param warehouseId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.DbtTask} object
   */
  public DbtTask setWarehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  /**
   * <p>Getter for the field <code>warehouseId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getWarehouseId() {
    return warehouseId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DbtTask that = (DbtTask) o;
    return Objects.equals(catalog, that.catalog)
        && Objects.equals(commands, that.commands)
        && Objects.equals(profilesDirectory, that.profilesDirectory)
        && Objects.equals(projectDirectory, that.projectDirectory)
        && Objects.equals(schema, that.schema)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        catalog, commands, profilesDirectory, projectDirectory, schema, warehouseId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(DbtTask.class)
        .add("catalog", catalog)
        .add("commands", commands)
        .add("profilesDirectory", profilesDirectory)
        .add("projectDirectory", projectDirectory)
        .add("schema", schema)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
