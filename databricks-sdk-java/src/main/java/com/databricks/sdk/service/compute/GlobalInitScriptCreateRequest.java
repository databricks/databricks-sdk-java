// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>GlobalInitScriptCreateRequest class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GlobalInitScriptCreateRequest {
  /** Specifies whether the script is enabled. The script runs only if enabled. */
  @JsonProperty("enabled")
  private Boolean enabled;

  /** The name of the script */
  @JsonProperty("name")
  private String name;

  /**
   * The position of a global init script, where 0 represents the first script to run, 1 is the
   * second script to run, in ascending order.
   *
   * <p>If you omit the numeric position for a new global init script, it defaults to last position.
   * It will run after all current scripts. Setting any value greater than the position of the last
   * script is equivalent to the last position. Example: Take three existing scripts with positions
   * 0, 1, and 2. Any position of (3) or greater puts the script in the last position. If an
   * explicit position value conflicts with an existing script value, your request succeeds, but the
   * original script at that position and all later scripts have their positions incremented by 1.
   */
  @JsonProperty("position")
  private Long position;

  /** The Base64-encoded content of the script. */
  @JsonProperty("script")
  private String script;

  /**
   * <p>Setter for the field <code>enabled</code>.</p>
   *
   * @param enabled a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.compute.GlobalInitScriptCreateRequest} object
   */
  public GlobalInitScriptCreateRequest setEnabled(Boolean enabled) {
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
   * @return a {@link com.databricks.sdk.service.compute.GlobalInitScriptCreateRequest} object
   */
  public GlobalInitScriptCreateRequest setName(String name) {
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
   * @return a {@link com.databricks.sdk.service.compute.GlobalInitScriptCreateRequest} object
   */
  public GlobalInitScriptCreateRequest setPosition(Long position) {
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
   * @return a {@link com.databricks.sdk.service.compute.GlobalInitScriptCreateRequest} object
   */
  public GlobalInitScriptCreateRequest setScript(String script) {
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

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GlobalInitScriptCreateRequest that = (GlobalInitScriptCreateRequest) o;
    return Objects.equals(enabled, that.enabled)
        && Objects.equals(name, that.name)
        && Objects.equals(position, that.position)
        && Objects.equals(script, that.script);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(enabled, name, position, script);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GlobalInitScriptCreateRequest.class)
        .add("enabled", enabled)
        .add("name", name)
        .add("position", position)
        .add("script", script)
        .toString();
  }
}
