// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListGlobalInitScriptsResponsePb {
  @JsonProperty("scripts")
  private Collection<GlobalInitScriptDetails> scripts;

  public ListGlobalInitScriptsResponsePb setScripts(Collection<GlobalInitScriptDetails> scripts) {
    this.scripts = scripts;
    return this;
  }

  public Collection<GlobalInitScriptDetails> getScripts() {
    return scripts;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListGlobalInitScriptsResponsePb that = (ListGlobalInitScriptsResponsePb) o;
    return Objects.equals(scripts, that.scripts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scripts);
  }

  @Override
  public String toString() {
    return new ToStringer(ListGlobalInitScriptsResponsePb.class).add("scripts", scripts).toString();
  }
}
