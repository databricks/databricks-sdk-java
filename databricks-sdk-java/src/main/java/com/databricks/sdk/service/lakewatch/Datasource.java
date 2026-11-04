// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/**
 * A Lakewatch datasource: a pipeline that ingests security data and writes it to Unity Catalog
 * tables.
 *
 * <p>What a datasource ingests is defined by its ingestion method (`autoloader`,
 * `unity_catalog_connection`, or `existing_table`), which sets how the data arrives, together with
 * its `parsers`, which define the schemas that the arriving data is matched against and written as.
 */
@Generated
public class Datasource {
  /** Free-form key-value annotations on the datasource, managed by the client. */
  @JsonProperty("annotations")
  private Map<String, String> annotations;

  /** */
  @JsonProperty("autoloader")
  private AutoLoader autoloader;

  /**
   * Name of the Unity Catalog catalog that contains the datasource. Required on create and cannot
   * be changed afterward. Reads return the value as supplied; the catalog's current name is
   * reported in `effective_catalog_name`.
   */
  @JsonProperty("catalog_name")
  private String catalogName;

  /**
   * Compute mode for the datasource's ingestion job. If unset, the `default_compute_mode` of the
   * catalog's datasource configuration applies, or `DS_COMPUTE_PERFORMANCE_OPTIMIZED` if the
   * catalog has none.
   */
  @JsonProperty("compute_mode")
  private DatasourceComputeMode computeMode;

  /**
   * ID of the workspace whose compute runs this datasource's ingestion job and owns its associated
   * resources, such as the storage the ingested data lands in. Server-assigned.
   */
  @JsonProperty("compute_workspace_id")
  private String computeWorkspaceId;

  /** */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** */
  @JsonProperty("created_by")
  private Principal createdBy;

  /**
   * Unity Catalog securable ID (a UUID) of the datasource. It never changes, including when the
   * datasource is renamed in Unity Catalog, and is the final segment of `name`.
   */
  @JsonProperty("datasource_id")
  private String datasourceId;

  /**
   * Name of the datasource in Unity Catalog, unique within its schema. Required on create and
   * cannot be changed afterward. Reads return the value as supplied; the datasource's current Unity
   * Catalog name, which reflects renames, is reported in `effective_datasource_name`.
   */
  @JsonProperty("datasource_name")
  private String datasourceName;

  /** Free-form description of the datasource. */
  @JsonProperty("description")
  private String description;

  /**
   * Current name of the Unity Catalog catalog that contains the datasource, which reflects catalog
   * renames without a change to `catalog_name`. Populated on get, create, and update responses;
   * list responses omit it.
   */
  @JsonProperty("effective_catalog_name")
  private String effectiveCatalogName;

  /**
   * Current UC leaf name of the datasource (server-owned). Tracks UC renames so callers can observe
   * the live name without having to update the client-owned `datasource_name`; unset until
   * resolved.
   */
  @JsonProperty("effective_datasource_name")
  private String effectiveDatasourceName;

  /**
   * The identity the datasource runs as: the resolved `run_as_principal`, or the requester's
   * identity if `run_as_principal` was omitted on create or cleared on update. Given as a user
   * email or service principal application ID, or as the numeric principal ID if the identity can
   * no longer be resolved. Populated on get, create, and update responses; list responses omit it.
   */
  @JsonProperty("effective_run_as_principal")
  private String effectiveRunAsPrincipal;

  /**
   * Current name of the Unity Catalog schema that contains the datasource, which reflects schema
   * renames without a change to `schema_name`. Populated on get, create, and update responses; list
   * responses omit it.
   */
  @JsonProperty("effective_schema_name")
  private String effectiveSchemaName;

  /**
   * Opaque entity tag for optimistic concurrency control. Returned by get, create, and update
   * responses and by list responses in the `DATASOURCE_VIEW_FULL` view. To make an update
   * conditional on the datasource not having changed since it was read, pass this value as the
   * update request's `etag`. Changes to `status` do not change the etag.
   */
  @JsonProperty("etag")
  private String etag;

  /** */
  @JsonProperty("existing_table")
  private ExistingTable existingTable;

  /**
   * Resource name of the datasource, in the format `datasources/{datasource_id}`. Unlike the
   * datasource's Unity Catalog location (`catalog_name`, `schema_name`, and `datasource_name`), the
   * name does not change when the datasource or its catalog or schema is renamed in Unity Catalog.
   */
  @JsonProperty("name")
  private String name;

  /** Unity Catalog owner of the datasource, assigned by the server. Create responses omit it. */
  @JsonProperty("owner")
  private Principal owner;

  /**
   * Parsers that schematize the ingested data. Each record is matched against the parsers in order
   * and written to the parsed table of the first parser that it matches. Existing-table and Unity
   * Catalog connection datasources require at least one parser; an Auto Loader datasource with no
   * parsers writes only its raw table.
   */
  @JsonProperty("parsers")
  private Collection<ParserRef> parsers;

  /**
   * The user or service principal that the datasource runs as, given as a user email or service
   * principal application ID. When it is supplied on create or update, the requester must be
   * authorized to run the datasource as that principal, or the request is rejected. When it is
   * omitted on create, the datasource runs as the requester. On update, a mask that includes
   * `run_as_principal` without a value clears it, so the datasource runs as the requester; a mask
   * that omits it keeps the current identity. Reads return the value as supplied; the identity the
   * datasource runs as is reported in `effective_run_as_principal`.
   */
  @JsonProperty("run_as_principal")
  private String runAsPrincipal;

  /**
   * Schedule on which the datasource's ingestion job runs. A datasource cannot be paused, so a
   * request that sets `schedule.enabled` to `false` is rejected. Continuous schedules are not
   * supported for Unity Catalog connection datasources.
   */
  @JsonProperty("schedule")
  private Schedule schedule;

  /**
   * Name of the Unity Catalog schema that contains the datasource. Required on create and cannot be
   * changed afterward. Reads return the value as supplied; the schema's current name is reported in
   * `effective_schema_name`.
   */
  @JsonProperty("schema_name")
  private String schemaName;

  /** Runtime status of the jobs and pipelines that run this datasource. */
  @JsonProperty("status")
  private DatasourceStatus status;

  /** */
  @JsonProperty("unity_catalog_connection")
  private UnityCatalogConnection unityCatalogConnection;

  /** */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  /** */
  @JsonProperty("updated_by")
  private Principal updatedBy;

  /**
   * Version number of the datasource, incremented on each update. Informational only; use `etag`
   * for optimistic concurrency control.
   */
  @JsonProperty("version")
  private Long version;

  /**
   * ID of the SQL warehouse that runs the checks Lakewatch performs to validate a create or update
   * request, such as source and destination access checks. Required and non-blank on every create
   * and update request; there is no default warehouse. The requester must be able to use the
   * warehouse. Used only for those checks: it is not stored, is not returned on reads, and does not
   * affect the compute that runs the ingestion job.
   */
  @JsonProperty("warehouse_id")
  private String warehouseId;

  public Datasource setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
    return this;
  }

  public Map<String, String> getAnnotations() {
    return annotations;
  }

  public Datasource setAutoloader(AutoLoader autoloader) {
    this.autoloader = autoloader;
    return this;
  }

  public AutoLoader getAutoloader() {
    return autoloader;
  }

  public Datasource setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public Datasource setComputeMode(DatasourceComputeMode computeMode) {
    this.computeMode = computeMode;
    return this;
  }

  public DatasourceComputeMode getComputeMode() {
    return computeMode;
  }

  public Datasource setComputeWorkspaceId(String computeWorkspaceId) {
    this.computeWorkspaceId = computeWorkspaceId;
    return this;
  }

  public String getComputeWorkspaceId() {
    return computeWorkspaceId;
  }

  public Datasource setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public Datasource setCreatedBy(Principal createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public Principal getCreatedBy() {
    return createdBy;
  }

  public Datasource setDatasourceId(String datasourceId) {
    this.datasourceId = datasourceId;
    return this;
  }

  public String getDatasourceId() {
    return datasourceId;
  }

  public Datasource setDatasourceName(String datasourceName) {
    this.datasourceName = datasourceName;
    return this;
  }

  public String getDatasourceName() {
    return datasourceName;
  }

  public Datasource setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public Datasource setEffectiveCatalogName(String effectiveCatalogName) {
    this.effectiveCatalogName = effectiveCatalogName;
    return this;
  }

  public String getEffectiveCatalogName() {
    return effectiveCatalogName;
  }

  public Datasource setEffectiveDatasourceName(String effectiveDatasourceName) {
    this.effectiveDatasourceName = effectiveDatasourceName;
    return this;
  }

  public String getEffectiveDatasourceName() {
    return effectiveDatasourceName;
  }

  public Datasource setEffectiveRunAsPrincipal(String effectiveRunAsPrincipal) {
    this.effectiveRunAsPrincipal = effectiveRunAsPrincipal;
    return this;
  }

  public String getEffectiveRunAsPrincipal() {
    return effectiveRunAsPrincipal;
  }

  public Datasource setEffectiveSchemaName(String effectiveSchemaName) {
    this.effectiveSchemaName = effectiveSchemaName;
    return this;
  }

  public String getEffectiveSchemaName() {
    return effectiveSchemaName;
  }

  public Datasource setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public Datasource setExistingTable(ExistingTable existingTable) {
    this.existingTable = existingTable;
    return this;
  }

  public ExistingTable getExistingTable() {
    return existingTable;
  }

  public Datasource setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Datasource setOwner(Principal owner) {
    this.owner = owner;
    return this;
  }

  public Principal getOwner() {
    return owner;
  }

  public Datasource setParsers(Collection<ParserRef> parsers) {
    this.parsers = parsers;
    return this;
  }

  public Collection<ParserRef> getParsers() {
    return parsers;
  }

  public Datasource setRunAsPrincipal(String runAsPrincipal) {
    this.runAsPrincipal = runAsPrincipal;
    return this;
  }

  public String getRunAsPrincipal() {
    return runAsPrincipal;
  }

  public Datasource setSchedule(Schedule schedule) {
    this.schedule = schedule;
    return this;
  }

  public Schedule getSchedule() {
    return schedule;
  }

  public Datasource setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public Datasource setStatus(DatasourceStatus status) {
    this.status = status;
    return this;
  }

  public DatasourceStatus getStatus() {
    return status;
  }

  public Datasource setUnityCatalogConnection(UnityCatalogConnection unityCatalogConnection) {
    this.unityCatalogConnection = unityCatalogConnection;
    return this;
  }

  public UnityCatalogConnection getUnityCatalogConnection() {
    return unityCatalogConnection;
  }

  public Datasource setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
  }

  public Datasource setUpdatedBy(Principal updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  public Principal getUpdatedBy() {
    return updatedBy;
  }

  public Datasource setVersion(Long version) {
    this.version = version;
    return this;
  }

  public Long getVersion() {
    return version;
  }

  public Datasource setWarehouseId(String warehouseId) {
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
    Datasource that = (Datasource) o;
    return Objects.equals(annotations, that.annotations)
        && Objects.equals(autoloader, that.autoloader)
        && Objects.equals(catalogName, that.catalogName)
        && Objects.equals(computeMode, that.computeMode)
        && Objects.equals(computeWorkspaceId, that.computeWorkspaceId)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(datasourceId, that.datasourceId)
        && Objects.equals(datasourceName, that.datasourceName)
        && Objects.equals(description, that.description)
        && Objects.equals(effectiveCatalogName, that.effectiveCatalogName)
        && Objects.equals(effectiveDatasourceName, that.effectiveDatasourceName)
        && Objects.equals(effectiveRunAsPrincipal, that.effectiveRunAsPrincipal)
        && Objects.equals(effectiveSchemaName, that.effectiveSchemaName)
        && Objects.equals(etag, that.etag)
        && Objects.equals(existingTable, that.existingTable)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
        && Objects.equals(parsers, that.parsers)
        && Objects.equals(runAsPrincipal, that.runAsPrincipal)
        && Objects.equals(schedule, that.schedule)
        && Objects.equals(schemaName, that.schemaName)
        && Objects.equals(status, that.status)
        && Objects.equals(unityCatalogConnection, that.unityCatalogConnection)
        && Objects.equals(updateTime, that.updateTime)
        && Objects.equals(updatedBy, that.updatedBy)
        && Objects.equals(version, that.version)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        annotations,
        autoloader,
        catalogName,
        computeMode,
        computeWorkspaceId,
        createTime,
        createdBy,
        datasourceId,
        datasourceName,
        description,
        effectiveCatalogName,
        effectiveDatasourceName,
        effectiveRunAsPrincipal,
        effectiveSchemaName,
        etag,
        existingTable,
        name,
        owner,
        parsers,
        runAsPrincipal,
        schedule,
        schemaName,
        status,
        unityCatalogConnection,
        updateTime,
        updatedBy,
        version,
        warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(Datasource.class)
        .add("annotations", annotations)
        .add("autoloader", autoloader)
        .add("catalogName", catalogName)
        .add("computeMode", computeMode)
        .add("computeWorkspaceId", computeWorkspaceId)
        .add("createTime", createTime)
        .add("createdBy", createdBy)
        .add("datasourceId", datasourceId)
        .add("datasourceName", datasourceName)
        .add("description", description)
        .add("effectiveCatalogName", effectiveCatalogName)
        .add("effectiveDatasourceName", effectiveDatasourceName)
        .add("effectiveRunAsPrincipal", effectiveRunAsPrincipal)
        .add("effectiveSchemaName", effectiveSchemaName)
        .add("etag", etag)
        .add("existingTable", existingTable)
        .add("name", name)
        .add("owner", owner)
        .add("parsers", parsers)
        .add("runAsPrincipal", runAsPrincipal)
        .add("schedule", schedule)
        .add("schemaName", schemaName)
        .add("status", status)
        .add("unityCatalogConnection", unityCatalogConnection)
        .add("updateTime", updateTime)
        .add("updatedBy", updatedBy)
        .add("version", version)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
