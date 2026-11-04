// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Collection;
import java.util.Objects;

/** Per-catalog rule-related config. Singleton. Name format: `catalogs/{catalog}/ruleConfig`. */
@Generated
public class RuleConfig {
  /**
   * Schema name of the registered folder (in this catalog) that a new rule is placed in when the
   * request does not specify a schema. Must name a schema registered as a folder. Omit to clear.
   * Reads return the value as supplied; the folder's current schema name is reported in
   * `effective_default_folder`.
   */
  @JsonProperty("default_folder")
  private String defaultFolder;

  /** Default schedule for rules that don't specify one. */
  @JsonProperty("default_schedule")
  private RuleSchedule defaultSchedule;

  /**
   * Default duration string for signal deduplication when a rule doesn't override it — compact
   * day/hour/minute/second components, e.g. `5d`, `1h`. Reads return the value as supplied; there
   * is no server default, so it is unset until set. An empty value clears it.
   */
  @JsonProperty("default_signal_collation_window")
  private String defaultSignalCollationWindow;

  /**
   * Available detection categories a rule can be tagged with. Reads return the value as supplied.
   * When empty, rules can be tagged with the default categories: `Static Signature`, `Fuzzy
   * Signature`, `Behavioral`, `Statistical`, and `Learning (AI/ML)`. The categories in effect are
   * reported in `effective_detection_categories`.
   */
  @JsonProperty("detection_categories")
  private Collection<String> detectionCategories;

  /**
   * The current schema name of the `default_folder` folder. Tracks UC schema renames. Unset when no
   * default is configured, or when the folder's schema no longer exists or is not visible to the
   * caller.
   */
  @JsonProperty("effective_default_folder")
  private String effectiveDefaultFolder;

  /**
   * The detection categories in effect: `detection_categories` when set, otherwise the default
   * categories.
   */
  @JsonProperty("effective_detection_categories")
  private Collection<String> effectiveDetectionCategories;

  /**
   * Opaque entity tag for optimistic concurrency. Returned on every read; pass it back as the
   * Update request's `etag` to make the update conditional on the resource being unchanged.
   */
  @JsonProperty("etag")
  private String etag;

  /** */
  @JsonProperty("name")
  private String name;

  /** */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  /** */
  @JsonProperty("updated_by")
  private Principal updatedBy;

  /**
   * Monotonic version, bumped on each update. Informational; use `etag` for optimistic concurrency.
   */
  @JsonProperty("version")
  private Long version;

  public RuleConfig setDefaultFolder(String defaultFolder) {
    this.defaultFolder = defaultFolder;
    return this;
  }

  public String getDefaultFolder() {
    return defaultFolder;
  }

  public RuleConfig setDefaultSchedule(RuleSchedule defaultSchedule) {
    this.defaultSchedule = defaultSchedule;
    return this;
  }

  public RuleSchedule getDefaultSchedule() {
    return defaultSchedule;
  }

  public RuleConfig setDefaultSignalCollationWindow(String defaultSignalCollationWindow) {
    this.defaultSignalCollationWindow = defaultSignalCollationWindow;
    return this;
  }

  public String getDefaultSignalCollationWindow() {
    return defaultSignalCollationWindow;
  }

  public RuleConfig setDetectionCategories(Collection<String> detectionCategories) {
    this.detectionCategories = detectionCategories;
    return this;
  }

  public Collection<String> getDetectionCategories() {
    return detectionCategories;
  }

  public RuleConfig setEffectiveDefaultFolder(String effectiveDefaultFolder) {
    this.effectiveDefaultFolder = effectiveDefaultFolder;
    return this;
  }

  public String getEffectiveDefaultFolder() {
    return effectiveDefaultFolder;
  }

  public RuleConfig setEffectiveDetectionCategories(
      Collection<String> effectiveDetectionCategories) {
    this.effectiveDetectionCategories = effectiveDetectionCategories;
    return this;
  }

  public Collection<String> getEffectiveDetectionCategories() {
    return effectiveDetectionCategories;
  }

  public RuleConfig setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public RuleConfig setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public RuleConfig setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
  }

  public RuleConfig setUpdatedBy(Principal updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  public Principal getUpdatedBy() {
    return updatedBy;
  }

  public RuleConfig setVersion(Long version) {
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
    RuleConfig that = (RuleConfig) o;
    return Objects.equals(defaultFolder, that.defaultFolder)
        && Objects.equals(defaultSchedule, that.defaultSchedule)
        && Objects.equals(defaultSignalCollationWindow, that.defaultSignalCollationWindow)
        && Objects.equals(detectionCategories, that.detectionCategories)
        && Objects.equals(effectiveDefaultFolder, that.effectiveDefaultFolder)
        && Objects.equals(effectiveDetectionCategories, that.effectiveDetectionCategories)
        && Objects.equals(etag, that.etag)
        && Objects.equals(name, that.name)
        && Objects.equals(updateTime, that.updateTime)
        && Objects.equals(updatedBy, that.updatedBy)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        defaultFolder,
        defaultSchedule,
        defaultSignalCollationWindow,
        detectionCategories,
        effectiveDefaultFolder,
        effectiveDetectionCategories,
        etag,
        name,
        updateTime,
        updatedBy,
        version);
  }

  @Override
  public String toString() {
    return new ToStringer(RuleConfig.class)
        .add("defaultFolder", defaultFolder)
        .add("defaultSchedule", defaultSchedule)
        .add("defaultSignalCollationWindow", defaultSignalCollationWindow)
        .add("detectionCategories", detectionCategories)
        .add("effectiveDefaultFolder", effectiveDefaultFolder)
        .add("effectiveDetectionCategories", effectiveDetectionCategories)
        .add("etag", etag)
        .add("name", name)
        .add("updateTime", updateTime)
        .add("updatedBy", updatedBy)
        .add("version", version)
        .toString();
  }
}
