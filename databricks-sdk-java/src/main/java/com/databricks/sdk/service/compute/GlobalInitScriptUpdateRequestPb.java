// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class GlobalInitScriptUpdateRequestPb {
  @JsonProperty("enabled")
  private Boolean enabled;

  @JsonProperty("name")
  private String name;

  @JsonProperty("position")
  private Long position;

  @JsonProperty("script")
  private String script;

  @JsonIgnore private String scriptId;

  public GlobalInitScriptUpdateRequestPb setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public GlobalInitScriptUpdateRequestPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public GlobalInitScriptUpdateRequestPb setPosition(Long position) {
    this.position = position;
    return this;
  }

  public Long getPosition() {
    return position;
  }

  public GlobalInitScriptUpdateRequestPb setScript(String script) {
    this.script = script;
    return this;
  }

  public String getScript() {
    return script;
  }

  public GlobalInitScriptUpdateRequestPb setScriptId(String scriptId) {
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
    GlobalInitScriptUpdateRequestPb that = (GlobalInitScriptUpdateRequestPb) o;
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
    return new ToStringer(GlobalInitScriptUpdateRequestPb.class)
        .add("enabled", enabled)
        .add("name", name)
        .add("position", position)
        .add("script", script)
        .add("scriptId", scriptId)
        .toString();
  }
}
