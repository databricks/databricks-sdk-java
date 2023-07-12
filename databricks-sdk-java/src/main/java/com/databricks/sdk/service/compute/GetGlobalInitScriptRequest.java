// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;


/**
 * Get an init script
 */
@Generated
public class GetGlobalInitScriptRequest {
  /**
   * The ID of the global init script.
   */
  
  private String scriptId;
  
  public GetGlobalInitScriptRequest setScriptId(String scriptId) {
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
    GetGlobalInitScriptRequest that = (GetGlobalInitScriptRequest) o;
    return Objects.equals(scriptId, that.scriptId)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(scriptId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetGlobalInitScriptRequest.class)
      .add("scriptId", scriptId).toString();
  }
}
