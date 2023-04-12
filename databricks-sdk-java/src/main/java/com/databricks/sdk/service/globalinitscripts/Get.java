// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.globalinitscripts;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Get an init script */
public class Get {
  /** The ID of the global init script. */
  private String scriptId;

  public Get setScriptId(String scriptId) {
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
    Get that = (Get) o;
    return Objects.equals(scriptId, that.scriptId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scriptId);
  }

  @Override
  public String toString() {
    return new ToStringer(Get.class).add("scriptId", scriptId).toString();
  }
}
