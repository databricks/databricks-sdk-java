// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.globalinitscripts;

import com.fasterxml.jackson.annotation.JsonProperty;

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

  public GlobalInitScriptCreateRequest setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public GlobalInitScriptCreateRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public GlobalInitScriptCreateRequest setPosition(Long position) {
    this.position = position;
    return this;
  }

  public Long getPosition() {
    return position;
  }

  public GlobalInitScriptCreateRequest setScript(String script) {
    this.script = script;
    return this;
  }

  public String getScript() {
    return script;
  }
}
