// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>GlobalInitScriptDetailsWithContent class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>createdAt</code>.</p>
   *
   * @param createdAt a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.GlobalInitScriptDetailsWithContent} object
   */
  public GlobalInitScriptDetailsWithContent setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * <p>Getter for the field <code>createdAt</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getCreatedAt() {
    return createdAt;
  }

  /**
   * <p>Setter for the field <code>createdBy</code>.</p>
   *
   * @param createdBy a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.GlobalInitScriptDetailsWithContent} object
   */
  public GlobalInitScriptDetailsWithContent setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * <p>Getter for the field <code>createdBy</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * <p>Setter for the field <code>enabled</code>.</p>
   *
   * @param enabled a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.compute.GlobalInitScriptDetailsWithContent} object
   */
  public GlobalInitScriptDetailsWithContent setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * <p>Getter for the field <code>enabled</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.GlobalInitScriptDetailsWithContent} object
   */
  public GlobalInitScriptDetailsWithContent setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * <p>Setter for the field <code>position</code>.</p>
   *
   * @param position a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.GlobalInitScriptDetailsWithContent} object
   */
  public GlobalInitScriptDetailsWithContent setPosition(Long position) {
    this.position = position;
    return this;
  }

  /**
   * <p>Getter for the field <code>position</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getPosition() {
    return position;
  }

  /**
   * <p>Setter for the field <code>script</code>.</p>
   *
   * @param script a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.GlobalInitScriptDetailsWithContent} object
   */
  public GlobalInitScriptDetailsWithContent setScript(String script) {
    this.script = script;
    return this;
  }

  /**
   * <p>Getter for the field <code>script</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getScript() {
    return script;
  }

  /**
   * <p>Setter for the field <code>scriptId</code>.</p>
   *
   * @param scriptId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.GlobalInitScriptDetailsWithContent} object
   */
  public GlobalInitScriptDetailsWithContent setScriptId(String scriptId) {
    this.scriptId = scriptId;
    return this;
  }

  /**
   * <p>Getter for the field <code>scriptId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getScriptId() {
    return scriptId;
  }

  /**
   * <p>Setter for the field <code>updatedAt</code>.</p>
   *
   * @param updatedAt a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.compute.GlobalInitScriptDetailsWithContent} object
   */
  public GlobalInitScriptDetailsWithContent setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * <p>Getter for the field <code>updatedAt</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getUpdatedAt() {
    return updatedAt;
  }

  /**
   * <p>Setter for the field <code>updatedBy</code>.</p>
   *
   * @param updatedBy a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.GlobalInitScriptDetailsWithContent} object
   */
  public GlobalInitScriptDetailsWithContent setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * <p>Getter for the field <code>updatedBy</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getUpdatedBy() {
    return updatedBy;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt, createdBy, enabled, name, position, script, scriptId, updatedAt, updatedBy);
  }

  /** {@inheritDoc} */
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
