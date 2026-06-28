// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class PowerBiModel {
  /** How the published Power BI model authenticates to Databricks */
  @JsonProperty("authentication_method")
  private AuthenticationMethod authenticationMethod;

  /** The name of the Power BI model */
  @JsonProperty("model_name")
  private String modelName;

  /** Whether to overwrite existing Power BI models */
  @JsonProperty("overwrite_existing")
  private Boolean overwriteExisting;

  /** The default storage mode of the Power BI model */
  @JsonProperty("storage_mode")
  private StorageMode storageMode;

  /** The name of the Power BI workspace of the model */
  @JsonProperty("workspace_name")
  private String workspaceName;

  public PowerBiModel setAuthenticationMethod(AuthenticationMethod authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
    return this;
  }

  public AuthenticationMethod getAuthenticationMethod() {
    return authenticationMethod;
  }

  public PowerBiModel setModelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

  public String getModelName() {
    return modelName;
  }

  public PowerBiModel setOverwriteExisting(Boolean overwriteExisting) {
    this.overwriteExisting = overwriteExisting;
    return this;
  }

  public Boolean getOverwriteExisting() {
    return overwriteExisting;
  }

  public PowerBiModel setStorageMode(StorageMode storageMode) {
    this.storageMode = storageMode;
    return this;
  }

  public StorageMode getStorageMode() {
    return storageMode;
  }

  public PowerBiModel setWorkspaceName(String workspaceName) {
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
    PowerBiModel that = (PowerBiModel) o;
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
    return new ToStringer(PowerBiModel.class)
        .add("authenticationMethod", authenticationMethod)
        .add("modelName", modelName)
        .add("overwriteExisting", overwriteExisting)
        .add("storageMode", storageMode)
        .add("workspaceName", workspaceName)
        .toString();
  }
}
