// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Delete init script */
public class DeleteGlobalInitScriptRequest {
  /** The ID of the global init script. */
  private String scriptId;

  public DeleteGlobalInitScriptRequest setScriptId(String scriptId) {
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
    DeleteGlobalInitScriptRequest that = (DeleteGlobalInitScriptRequest) o;
    return Objects.equals(scriptId, that.scriptId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scriptId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteGlobalInitScriptRequest.class).add("scriptId", scriptId).toString();
  }
}
