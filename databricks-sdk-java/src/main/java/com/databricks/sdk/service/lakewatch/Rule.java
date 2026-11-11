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
 * A Lakewatch detection rule: a query that evaluates ingested data and generates a signal for each
 * match. Each rule is a securable in a Unity Catalog schema.
 */
@Generated
public class Rule {
  /** Free-form client-managed key/value annotations. */
  @JsonProperty("annotations")
  private Map<String, String> annotations;

  /** Batch SQL rule input. */
  @JsonProperty("batch")
  private RuleInputBatch batch;

  /**
   * Name of the Unity Catalog catalog that contains the rule. Required. Cannot be changed after
   * creation. Reads return the value as supplied; the catalog's current name is reported in
   * `effective_catalog_name`.
   */
  @JsonProperty("catalog_name")
  private String catalogName;

  /** Free-form rule category. */
  @JsonProperty("category")
  private String category;

  /**
   * ID of the workspace whose compute runs this rule's jobs and owns its associated resources, such
   * as the SQL warehouse a scheduled rule runs on. Server-assigned; a rule's warehouse can only be
   * changed from this workspace.
   */
  @JsonProperty("compute_workspace_id")
  private String computeWorkspaceId;

  /** Immutable UUIDv4 identifying the authored content resource installed as this rule. */
  @JsonProperty("content_resource_id")
  private String contentResourceId;

  /** Time the rule was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** Principal that created the rule. */
  @JsonProperty("created_by")
  private Principal createdBy;

  /** Signal deduplication mode. */
  @JsonProperty("deduplication")
  private RuleDeduplication deduplication;

  /** Time window for deduplication, such as `1h`, `24h`, `7d`, or `automatic`. */
  @JsonProperty("deduplication_time_window")
  private String deduplicationTimeWindow;

  /** Free-form description. */
  @JsonProperty("description")
  private String description;

  /**
   * Current name of the Unity Catalog catalog that contains the rule. Reflects catalog renames,
   * which do not change `catalog_name`. Unset until resolved.
   */
  @JsonProperty("effective_catalog_name")
  private String effectiveCatalogName;

  /**
   * Current UC leaf name of the rule (server-owned). Tracks UC renames so callers can observe the
   * live name without having to update the client-owned `rule_name`; unset until resolved.
   */
  @JsonProperty("effective_rule_name")
  private String effectiveRuleName;

  /**
   * The identity this rule's job runs as: the resolved `run_as_principal`, or the requester's
   * identity when it was omitted on create or cleared on update. The value is a user email or
   * service-principal application ID, falling back to the numeric principal ID if that identity can
   * no longer be resolved. Populated on single-rule reads (get/create/update); list responses omit
   * it.
   */
  @JsonProperty("effective_run_as_principal")
  private String effectiveRunAsPrincipal;

  /**
   * Current name of the Unity Catalog schema that contains the rule. Reflects schema renames, which
   * do not change `schema_name`. Unset until resolved.
   */
  @JsonProperty("effective_schema_name")
  private String effectiveSchemaName;

  /**
   * Opaque entity tag for optimistic concurrency. Content-version ETags change on user edits and
   * remain stable across runtime status updates.
   */
  @JsonProperty("etag")
  private String etag;

  /** Signal quality for this rule. */
  @JsonProperty("fidelity")
  private RuleFidelity fidelity;

  /** Up to 64 MITRE ATT&CK mappings, producing at most 192 flattened alert tags. */
  @JsonProperty("mitre")
  private Collection<RuleMitreMapping> mitre;

  /**
   * Resource name, in the form `rules/{rule_id}`. Assigned by the server on create; required on
   * update.
   */
  @JsonProperty("name")
  private String name;

  /** Long-form description of what this rule detects. */
  @JsonProperty("objective")
  private String objective;

  /** Reference to the content pack this rule was originally installed from. */
  @JsonProperty("original_content_pack")
  private ContentPackReference originalContentPack;

  /** What to record in each signal. */
  @JsonProperty("output")
  private RuleOutput output;

  /** Unity Catalog owner of the rule. Assigned by the server. Populated by `GetRule`. */
  @JsonProperty("owner")
  private Principal owner;

  /**
   * Ordered reference URLs carried from the authored rule metadata. A maximum of three references
   * of up to 512 characters each is supported. Requests exceeding these limits are rejected.
   */
  @JsonProperty("references")
  private Collection<String> references;

  /**
   * Unity Catalog securable UUID of the rule, and the last segment of `name`. Never changes,
   * including when the rule's catalog or schema is renamed.
   */
  @JsonProperty("rule_id")
  private String ruleId;

  /**
   * Name of the rule within its Unity Catalog schema. Required on create; can be updated within the
   * same catalog and schema. Get synchronizes this field with the current Unity Catalog name, also
   * reported in `effective_rule_name`.
   */
  @JsonProperty("rule_name")
  private String ruleName;

  /**
   * The principal whose identity this rule's job runs as, given as a user email or
   * service-principal application ID. When supplied on create/update, Lakewatch resolves the
   * principal, records it on the rule, and creates the delegation to run as that principal — the
   * requester must be authorized to delegate to it, or the request is rejected. When omitted on
   * create, the requester's own identity is used. An update whose mask does not include
   * `run_as_principal` keeps the current identity, and the requester must still be authorized to
   * delegate to it; an editor who is not must supply a run_as_principal they can delegate to (for
   * example, their own identity), or clear it, either of which reassigns the rule. An update whose
   * mask includes `run_as_principal` but supplies no value clears it: the rule then runs as the
   * requester, exactly as when it is omitted on create. Reads return the value as supplied; the
   * identity the rule runs as is reported in `effective_run_as_principal`.
   */
  @JsonProperty("run_as_principal")
  private String runAsPrincipal;

  /**
   * Long-form operational guidance carried from the authored rule metadata. Supports up to 4096
   * characters. Requests exceeding this limit are rejected. Supports Markdown; analysts and the
   * investigation agent follow it when triaging this rule's alerts.
   */
  @JsonProperty("runbook")
  private String runbook;

  /** When the rule executes. */
  @JsonProperty("schedule")
  private RuleSchedule schedule;

  /**
   * Name of the Unity Catalog schema that contains the rule. Required. Cannot be changed after
   * creation. Reads return the value as supplied; the schema's current name is reported in
   * `effective_schema_name`.
   */
  @JsonProperty("schema_name")
  private String schemaName;

  /** Free-form severity label, such as `Informational`, `Medium`, `High`, or `Critical`. */
  @JsonProperty("severity")
  private String severity;

  /** Read-only lifecycle status. */
  @JsonProperty("status")
  private ResourceStatus status;

  /** If set, this rule's signals do not open new alerts until the given time. */
  @JsonProperty("suppress_until_time")
  private Timestamp suppressUntilTime;

  /**
   * Time-range configuration for batch rules. If unset, the execution time range is extended by a
   * fixed `15m` lookback.
   */
  @JsonProperty("timerange")
  private RuleTimeRange timerange;

  /** Time the rule was last updated. */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  /** Principal that last updated the rule. */
  @JsonProperty("updated_by")
  private Principal updatedBy;

  /**
   * Monotonic version, bumped on each update. Informational; use `etag` for optimistic concurrency.
   */
  @JsonProperty("version")
  private Long version;

  public Rule setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
    return this;
  }

  public Map<String, String> getAnnotations() {
    return annotations;
  }

  public Rule setBatch(RuleInputBatch batch) {
    this.batch = batch;
    return this;
  }

  public RuleInputBatch getBatch() {
    return batch;
  }

  public Rule setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public Rule setCategory(String category) {
    this.category = category;
    return this;
  }

  public String getCategory() {
    return category;
  }

  public Rule setComputeWorkspaceId(String computeWorkspaceId) {
    this.computeWorkspaceId = computeWorkspaceId;
    return this;
  }

  public String getComputeWorkspaceId() {
    return computeWorkspaceId;
  }

  public Rule setContentResourceId(String contentResourceId) {
    this.contentResourceId = contentResourceId;
    return this;
  }

  public String getContentResourceId() {
    return contentResourceId;
  }

  public Rule setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public Rule setCreatedBy(Principal createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public Principal getCreatedBy() {
    return createdBy;
  }

  public Rule setDeduplication(RuleDeduplication deduplication) {
    this.deduplication = deduplication;
    return this;
  }

  public RuleDeduplication getDeduplication() {
    return deduplication;
  }

  public Rule setDeduplicationTimeWindow(String deduplicationTimeWindow) {
    this.deduplicationTimeWindow = deduplicationTimeWindow;
    return this;
  }

  public String getDeduplicationTimeWindow() {
    return deduplicationTimeWindow;
  }

  public Rule setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public Rule setEffectiveCatalogName(String effectiveCatalogName) {
    this.effectiveCatalogName = effectiveCatalogName;
    return this;
  }

  public String getEffectiveCatalogName() {
    return effectiveCatalogName;
  }

  public Rule setEffectiveRuleName(String effectiveRuleName) {
    this.effectiveRuleName = effectiveRuleName;
    return this;
  }

  public String getEffectiveRuleName() {
    return effectiveRuleName;
  }

  public Rule setEffectiveRunAsPrincipal(String effectiveRunAsPrincipal) {
    this.effectiveRunAsPrincipal = effectiveRunAsPrincipal;
    return this;
  }

  public String getEffectiveRunAsPrincipal() {
    return effectiveRunAsPrincipal;
  }

  public Rule setEffectiveSchemaName(String effectiveSchemaName) {
    this.effectiveSchemaName = effectiveSchemaName;
    return this;
  }

  public String getEffectiveSchemaName() {
    return effectiveSchemaName;
  }

  public Rule setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public Rule setFidelity(RuleFidelity fidelity) {
    this.fidelity = fidelity;
    return this;
  }

  public RuleFidelity getFidelity() {
    return fidelity;
  }

  public Rule setMitre(Collection<RuleMitreMapping> mitre) {
    this.mitre = mitre;
    return this;
  }

  public Collection<RuleMitreMapping> getMitre() {
    return mitre;
  }

  public Rule setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Rule setObjective(String objective) {
    this.objective = objective;
    return this;
  }

  public String getObjective() {
    return objective;
  }

  public Rule setOriginalContentPack(ContentPackReference originalContentPack) {
    this.originalContentPack = originalContentPack;
    return this;
  }

  public ContentPackReference getOriginalContentPack() {
    return originalContentPack;
  }

  public Rule setOutput(RuleOutput output) {
    this.output = output;
    return this;
  }

  public RuleOutput getOutput() {
    return output;
  }

  public Rule setOwner(Principal owner) {
    this.owner = owner;
    return this;
  }

  public Principal getOwner() {
    return owner;
  }

  public Rule setReferences(Collection<String> references) {
    this.references = references;
    return this;
  }

  public Collection<String> getReferences() {
    return references;
  }

  public Rule setRuleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

  public String getRuleId() {
    return ruleId;
  }

  public Rule setRuleName(String ruleName) {
    this.ruleName = ruleName;
    return this;
  }

  public String getRuleName() {
    return ruleName;
  }

  public Rule setRunAsPrincipal(String runAsPrincipal) {
    this.runAsPrincipal = runAsPrincipal;
    return this;
  }

  public String getRunAsPrincipal() {
    return runAsPrincipal;
  }

  public Rule setRunbook(String runbook) {
    this.runbook = runbook;
    return this;
  }

  public String getRunbook() {
    return runbook;
  }

  public Rule setSchedule(RuleSchedule schedule) {
    this.schedule = schedule;
    return this;
  }

  public RuleSchedule getSchedule() {
    return schedule;
  }

  public Rule setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public Rule setSeverity(String severity) {
    this.severity = severity;
    return this;
  }

  public String getSeverity() {
    return severity;
  }

  public Rule setStatus(ResourceStatus status) {
    this.status = status;
    return this;
  }

  public ResourceStatus getStatus() {
    return status;
  }

  public Rule setSuppressUntilTime(Timestamp suppressUntilTime) {
    this.suppressUntilTime = suppressUntilTime;
    return this;
  }

  public Timestamp getSuppressUntilTime() {
    return suppressUntilTime;
  }

  public Rule setTimerange(RuleTimeRange timerange) {
    this.timerange = timerange;
    return this;
  }

  public RuleTimeRange getTimerange() {
    return timerange;
  }

  public Rule setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
  }

  public Rule setUpdatedBy(Principal updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  public Principal getUpdatedBy() {
    return updatedBy;
  }

  public Rule setVersion(Long version) {
    this.version = version;
    return this;
  }

  public Long getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Rule that = (Rule) o;
    return Objects.equals(annotations, that.annotations)
        && Objects.equals(batch, that.batch)
        && Objects.equals(catalogName, that.catalogName)
        && Objects.equals(category, that.category)
        && Objects.equals(computeWorkspaceId, that.computeWorkspaceId)
        && Objects.equals(contentResourceId, that.contentResourceId)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(deduplication, that.deduplication)
        && Objects.equals(deduplicationTimeWindow, that.deduplicationTimeWindow)
        && Objects.equals(description, that.description)
        && Objects.equals(effectiveCatalogName, that.effectiveCatalogName)
        && Objects.equals(effectiveRuleName, that.effectiveRuleName)
        && Objects.equals(effectiveRunAsPrincipal, that.effectiveRunAsPrincipal)
        && Objects.equals(effectiveSchemaName, that.effectiveSchemaName)
        && Objects.equals(etag, that.etag)
        && Objects.equals(fidelity, that.fidelity)
        && Objects.equals(mitre, that.mitre)
        && Objects.equals(name, that.name)
        && Objects.equals(objective, that.objective)
        && Objects.equals(originalContentPack, that.originalContentPack)
        && Objects.equals(output, that.output)
        && Objects.equals(owner, that.owner)
        && Objects.equals(references, that.references)
        && Objects.equals(ruleId, that.ruleId)
        && Objects.equals(ruleName, that.ruleName)
        && Objects.equals(runAsPrincipal, that.runAsPrincipal)
        && Objects.equals(runbook, that.runbook)
        && Objects.equals(schedule, that.schedule)
        && Objects.equals(schemaName, that.schemaName)
        && Objects.equals(severity, that.severity)
        && Objects.equals(status, that.status)
        && Objects.equals(suppressUntilTime, that.suppressUntilTime)
        && Objects.equals(timerange, that.timerange)
        && Objects.equals(updateTime, that.updateTime)
        && Objects.equals(updatedBy, that.updatedBy)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        annotations,
        batch,
        catalogName,
        category,
        computeWorkspaceId,
        contentResourceId,
        createTime,
        createdBy,
        deduplication,
        deduplicationTimeWindow,
        description,
        effectiveCatalogName,
        effectiveRuleName,
        effectiveRunAsPrincipal,
        effectiveSchemaName,
        etag,
        fidelity,
        mitre,
        name,
        objective,
        originalContentPack,
        output,
        owner,
        references,
        ruleId,
        ruleName,
        runAsPrincipal,
        runbook,
        schedule,
        schemaName,
        severity,
        status,
        suppressUntilTime,
        timerange,
        updateTime,
        updatedBy,
        version);
  }

  @Override
  public String toString() {
    return new ToStringer(Rule.class)
        .add("annotations", annotations)
        .add("batch", batch)
        .add("catalogName", catalogName)
        .add("category", category)
        .add("computeWorkspaceId", computeWorkspaceId)
        .add("contentResourceId", contentResourceId)
        .add("createTime", createTime)
        .add("createdBy", createdBy)
        .add("deduplication", deduplication)
        .add("deduplicationTimeWindow", deduplicationTimeWindow)
        .add("description", description)
        .add("effectiveCatalogName", effectiveCatalogName)
        .add("effectiveRuleName", effectiveRuleName)
        .add("effectiveRunAsPrincipal", effectiveRunAsPrincipal)
        .add("effectiveSchemaName", effectiveSchemaName)
        .add("etag", etag)
        .add("fidelity", fidelity)
        .add("mitre", mitre)
        .add("name", name)
        .add("objective", objective)
        .add("originalContentPack", originalContentPack)
        .add("output", output)
        .add("owner", owner)
        .add("references", references)
        .add("ruleId", ruleId)
        .add("ruleName", ruleName)
        .add("runAsPrincipal", runAsPrincipal)
        .add("runbook", runbook)
        .add("schedule", schedule)
        .add("schemaName", schemaName)
        .add("severity", severity)
        .add("status", status)
        .add("suppressUntilTime", suppressUntilTime)
        .add("timerange", timerange)
        .add("updateTime", updateTime)
        .add("updatedBy", updatedBy)
        .add("version", version)
        .toString();
  }
}
