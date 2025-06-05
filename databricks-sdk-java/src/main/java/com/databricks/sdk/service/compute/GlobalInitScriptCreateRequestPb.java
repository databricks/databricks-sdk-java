// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class GlobalInitScriptCreateRequestPb {
  @JsonProperty("enabled")
  private Boolean enabled;

  @JsonProperty("name")
  private String name;

  @JsonProperty("position")
  private Long position;

  @JsonProperty("script")
  private String script;

  public GlobalInitScriptCreateRequestPb setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public GlobalInitScriptCreateRequestPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public GlobalInitScriptCreateRequestPb setPosition(Long position) {
    this.position = position;
    return this;
  }

  public Long getPosition() {
    return position;
  }

  public GlobalInitScriptCreateRequestPb setScript(String script) {
    this.script = script;
    return this;
  }

  public String getScript() {
    return script;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GlobalInitScriptCreateRequestPb that = (GlobalInitScriptCreateRequestPb) o;
    return Objects.equals(enabled, that.enabled)
        && Objects.equals(name, that.name)
        && Objects.equals(position, that.position)
        && Objects.equals(script, that.script);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, name, position, script);
  }

  @Override
  public String toString() {
    return new ToStringer(GlobalInitScriptCreateRequestPb.class)
        .add("enabled", enabled)
        .add("name", name)
        .add("position", position)
        .add("script", script)
        .toString();
  }
}
