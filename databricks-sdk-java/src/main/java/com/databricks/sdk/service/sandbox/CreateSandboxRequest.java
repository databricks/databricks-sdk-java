// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sandbox;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateSandboxRequest {
  /** The sandbox to create. */
  @JsonProperty("sandbox")
  private Sandbox sandbox;

  /** Client-supplied ID that becomes the final path segment of the resource name. */
  @JsonIgnore
  @QueryParam("sandbox_id")
  private String sandboxId;

  public CreateSandboxRequest setSandbox(Sandbox sandbox) {
    this.sandbox = sandbox;
    return this;
  }

  public Sandbox getSandbox() {
    return sandbox;
  }

  public CreateSandboxRequest setSandboxId(String sandboxId) {
    this.sandboxId = sandboxId;
    return this;
  }

  public String getSandboxId() {
    return sandboxId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateSandboxRequest that = (CreateSandboxRequest) o;
    return Objects.equals(sandbox, that.sandbox) && Objects.equals(sandboxId, that.sandboxId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sandbox, sandboxId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateSandboxRequest.class)
        .add("sandbox", sandbox)
        .add("sandboxId", sandboxId)
        .toString();
  }
}
