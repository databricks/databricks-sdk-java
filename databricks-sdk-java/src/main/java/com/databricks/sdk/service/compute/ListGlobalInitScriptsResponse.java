// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class ListGlobalInitScriptsResponse {
  /**
   
   */
  @JsonProperty("scripts")
  private Collection<GlobalInitScriptDetails> scripts;
  
  public ListGlobalInitScriptsResponse setScripts(Collection<GlobalInitScriptDetails> scripts) {
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
    ListGlobalInitScriptsResponse that = (ListGlobalInitScriptsResponse) o;
    return Objects.equals(scripts, that.scripts)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(scripts);
  }

  @Override
  public String toString() {
    return new ToStringer(ListGlobalInitScriptsResponse.class)
      .add("scripts", scripts).toString();
  }
}
