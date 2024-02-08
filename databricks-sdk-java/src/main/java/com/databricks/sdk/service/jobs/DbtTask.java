// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
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
   * Path to the project directory. Optional for Git sourced tasks, in which case if no value is
   * provided, the root of the Git repository is used.
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
   * Optional location type of the project directory. When set to `WORKSPACE`, the project will be
   * retrieved from the local <Databricks> workspace. When set to `GIT`, the project will be
   * retrieved from a Git repository defined in `git_source`. If the value is empty, the task will
   * use `GIT` if `git_source` is defined and `WORKSPACE` otherwise.
   *
   * <p>* `WORKSPACE`: Project is located in <Databricks> workspace. * `GIT`: Project is located in
   * cloud Git provider.
   */
  @JsonProperty("source")
  private Source source;

  /**
   * ID of the SQL warehouse to connect to. If provided, we automatically generate and provide the
   * profile and connection details to dbt. It can be overridden on a per-command basis by using the
   * `--profiles-dir` command line argument.
   */
  @JsonProperty("warehouse_id")
  private String warehouseId;

  public DbtTask setCatalog(String catalog) {
    this.catalog = catalog;
    return this;
  }

  public String getCatalog() {
    return catalog;
  }

  public DbtTask setCommands(Collection<String> commands) {
    this.commands = commands;
    return this;
  }

  public Collection<String> getCommands() {
    return commands;
  }

  public DbtTask setProfilesDirectory(String profilesDirectory) {
    this.profilesDirectory = profilesDirectory;
    return this;
  }

  public String getProfilesDirectory() {
    return profilesDirectory;
  }

  public DbtTask setProjectDirectory(String projectDirectory) {
    this.projectDirectory = projectDirectory;
    return this;
  }

  public String getProjectDirectory() {
    return projectDirectory;
  }

  public DbtTask setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  public DbtTask setSource(Source source) {
    this.source = source;
    return this;
  }

  public Source getSource() {
    return source;
  }

  public DbtTask setWarehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  public String getWarehouseId() {
    return warehouseId;
  }

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
        && Objects.equals(source, that.source)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        catalog, commands, profilesDirectory, projectDirectory, schema, source, warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(DbtTask.class)
        .add("catalog", catalog)
        .add("commands", commands)
        .add("profilesDirectory", profilesDirectory)
        .add("projectDirectory", projectDirectory)
        .add("schema", schema)
        .add("source", source)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
