// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.globalinitscripts;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class GlobalInitScriptDetailsWithContent {
  /** Time when the script was created, represented as a Unix timestamp in milliseconds. */
  @JsonProperty("created_at")
  private Long createdAt;

  /** The username of the user who created the script. */
  @JsonProperty("created_by")
  private String createdBy;

  /** Specifies whether the script is enabled. The script runs only if enabled. */
  @JsonProperty("enabled")
  private Boolean enabled;

  /** The name of the script */
  @JsonProperty("name")
  private String name;

  /**
   * The position of a script, where 0 represents the first script to run, 1 is the second script to
   * run, in ascending order.
   */
  @JsonProperty("position")
  private Long position;

  /** The Base64-encoded content of the script. */
  @JsonProperty("script")
  private String script;

  /** The global init script ID. */
  @JsonProperty("script_id")
  private String scriptId;

  /** Time when the script was updated, represented as a Unix timestamp in milliseconds. */
  @JsonProperty("updated_at")
  private Long updatedAt;

  /** The username of the user who last updated the script */
  @JsonProperty("updated_by")
  private String updatedBy;

  public GlobalInitScriptDetailsWithContent setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public GlobalInitScriptDetailsWithContent setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public GlobalInitScriptDetailsWithContent setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public GlobalInitScriptDetailsWithContent setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public GlobalInitScriptDetailsWithContent setPosition(Long position) {
    this.position = position;
    return this;
  }

  public Long getPosition() {
    return position;
  }

  public GlobalInitScriptDetailsWithContent setScript(String script) {
    this.script = script;
    return this;
  }

  public String getScript() {
    return script;
  }

  public GlobalInitScriptDetailsWithContent setScriptId(String scriptId) {
    this.scriptId = scriptId;
    return this;
  }

  public String getScriptId() {
    return scriptId;
  }

  public GlobalInitScriptDetailsWithContent setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public GlobalInitScriptDetailsWithContent setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GlobalInitScriptDetailsWithContent that = (GlobalInitScriptDetailsWithContent) o;
    return Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(enabled, that.enabled)
        && Objects.equals(name, that.name)
        && Objects.equals(position, that.position)
        && Objects.equals(script, that.script)
        && Objects.equals(scriptId, that.scriptId)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(updatedBy, that.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt, createdBy, enabled, name, position, script, scriptId, updatedAt, updatedBy);
  }

  @Override
  public String toString() {
    return new ToStringer(GlobalInitScriptDetailsWithContent.class)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("enabled", enabled)
        .add("name", name)
        .add("position", position)
        .add("script", script)
        .add("scriptId", scriptId)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .toString();
  }
}
