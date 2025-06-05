// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class PowerBiModelPb {
  @JsonProperty("authentication_method")
  private AuthenticationMethod authenticationMethod;

  @JsonProperty("model_name")
  private String modelName;

  @JsonProperty("overwrite_existing")
  private Boolean overwriteExisting;

  @JsonProperty("storage_mode")
  private StorageMode storageMode;

  @JsonProperty("workspace_name")
  private String workspaceName;

  public PowerBiModelPb setAuthenticationMethod(AuthenticationMethod authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
    return this;
  }

  public AuthenticationMethod getAuthenticationMethod() {
    return authenticationMethod;
  }

  public PowerBiModelPb setModelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

  public String getModelName() {
    return modelName;
  }

  public PowerBiModelPb setOverwriteExisting(Boolean overwriteExisting) {
    this.overwriteExisting = overwriteExisting;
    return this;
  }

  public Boolean getOverwriteExisting() {
    return overwriteExisting;
  }

  public PowerBiModelPb setStorageMode(StorageMode storageMode) {
    this.storageMode = storageMode;
    return this;
  }

  public StorageMode getStorageMode() {
    return storageMode;
  }

  public PowerBiModelPb setWorkspaceName(String workspaceName) {
    this.workspaceName = workspaceName;
    return this;
  }

  public String getWorkspaceName() {
    return workspaceName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PowerBiModelPb that = (PowerBiModelPb) o;
    return Objects.equals(authenticationMethod, that.authenticationMethod)
        && Objects.equals(modelName, that.modelName)
        && Objects.equals(overwriteExisting, that.overwriteExisting)
        && Objects.equals(storageMode, that.storageMode)
        && Objects.equals(workspaceName, that.workspaceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        authenticationMethod, modelName, overwriteExisting, storageMode, workspaceName);
  }

  @Override
  public String toString() {
    return new ToStringer(PowerBiModelPb.class)
        .add("authenticationMethod", authenticationMethod)
        .add("modelName", modelName)
        .add("overwriteExisting", overwriteExisting)
        .add("storageMode", storageMode)
        .add("workspaceName", workspaceName)
        .toString();
  }
}
