// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class GlobalInitScriptUpdateRequest {
  /** Specifies whether the script is enabled. The script runs only if enabled. */
  @JsonProperty("enabled")
  private Boolean enabled;

  /** The name of the script */
  @JsonProperty("name")
  private String name;

  /**
   * The position of a script, where 0 represents the first script to run, 1 is the second script to
   * run, in ascending order. To move the script to run first, set its position to 0.
   *
   * <p>To move the script to the end, set its position to any value greater or equal to the
   * position of the last script. Example, three existing scripts with positions 0, 1, and 2. Any
   * position value of 2 or greater puts the script in the last position (2).
   *
   * <p>If an explicit position value conflicts with an existing script, your request succeeds, but
   * the original script at that position and all later scripts have their positions incremented by
   * 1.
   */
  @JsonProperty("position")
  private Long position;

  /** The Base64-encoded content of the script. */
  @JsonProperty("script")
  private String script;

  /** The ID of the global init script. */
  private String scriptId;

  public GlobalInitScriptUpdateRequest setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public GlobalInitScriptUpdateRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public GlobalInitScriptUpdateRequest setPosition(Long position) {
    this.position = position;
    return this;
  }

  public Long getPosition() {
    return position;
  }

  public GlobalInitScriptUpdateRequest setScript(String script) {
    this.script = script;
    return this;
  }

  public String getScript() {
    return script;
  }

  public GlobalInitScriptUpdateRequest setScriptId(String scriptId) {
    this.scriptId = scriptId;
    return this;
  }

  public String getScriptId() {
    return scriptId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GlobalInitScriptUpdateRequest that = (GlobalInitScriptUpdateRequest) o;
    return Objects.equals(enabled, that.enabled)
        && Objects.equals(name, that.name)
        && Objects.equals(position, that.position)
        && Objects.equals(script, that.script)
        && Objects.equals(scriptId, that.scriptId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, name, position, script, scriptId);
  }

  @Override
  public String toString() {
    return new ToStringer(GlobalInitScriptUpdateRequest.class)
        .add("enabled", enabled)
        .add("name", name)
        .add("position", position)
        .add("script", script)
        .add("scriptId", scriptId)
        .toString();
  }
}
