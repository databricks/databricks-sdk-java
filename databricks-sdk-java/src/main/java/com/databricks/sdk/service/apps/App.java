// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class App {
  /** The active deployment of the app. */
  @JsonProperty("active_deployment")
  private AppDeployment activeDeployment;

  /** The creation time of the app. Formatted timestamp in ISO 6801. */
  @JsonProperty("create_time")
  private String createTime;

  /** The email of the user that created the app. */
  @JsonProperty("creator")
  private String creator;

  /** The description of the app. */
  @JsonProperty("description")
  private String description;

  /**
   * The name of the app. The name must contain only lowercase alphanumeric characters and hyphens.
   * It must be unique within the workspace.
   */
  @JsonProperty("name")
  private String name;

  /** The pending deployment of the app. */
  @JsonProperty("pending_deployment")
  private AppDeployment pendingDeployment;

  /** */
  @JsonProperty("service_principal_id")
  private Long servicePrincipalId;

  /** */
  @JsonProperty("service_principal_name")
  private String servicePrincipalName;

  /** */
  @JsonProperty("status")
  private AppStatus status;

  /** The update time of the app. Formatted timestamp in ISO 6801. */
  @JsonProperty("update_time")
  private String updateTime;

  /** The email of the user that last updated the app. */
  @JsonProperty("updater")
  private String updater;

  /** The URL of the app once it is deployed. */
  @JsonProperty("url")
  private String url;

  public App setActiveDeployment(AppDeployment activeDeployment) {
    this.activeDeployment = activeDeployment;
    return this;
  }

  public AppDeployment getActiveDeployment() {
    return activeDeployment;
  }

  public App setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public App setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public App setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public App setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public App setPendingDeployment(AppDeployment pendingDeployment) {
    this.pendingDeployment = pendingDeployment;
    return this;
  }

  public AppDeployment getPendingDeployment() {
    return pendingDeployment;
  }

  public App setServicePrincipalId(Long servicePrincipalId) {
    this.servicePrincipalId = servicePrincipalId;
    return this;
  }

  public Long getServicePrincipalId() {
    return servicePrincipalId;
  }

  public App setServicePrincipalName(String servicePrincipalName) {
    this.servicePrincipalName = servicePrincipalName;
    return this;
  }

  public String getServicePrincipalName() {
    return servicePrincipalName;
  }

  public App setStatus(AppStatus status) {
    this.status = status;
    return this;
  }

  public AppStatus getStatus() {
    return status;
  }

  public App setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  public App setUpdater(String updater) {
    this.updater = updater;
    return this;
  }

  public String getUpdater() {
    return updater;
  }

  public App setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getUrl() {
    return url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    App that = (App) o;
    return Objects.equals(activeDeployment, that.activeDeployment)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(creator, that.creator)
        && Objects.equals(description, that.description)
        && Objects.equals(name, that.name)
        && Objects.equals(pendingDeployment, that.pendingDeployment)
        && Objects.equals(servicePrincipalId, that.servicePrincipalId)
        && Objects.equals(servicePrincipalName, that.servicePrincipalName)
        && Objects.equals(status, that.status)
        && Objects.equals(updateTime, that.updateTime)
        && Objects.equals(updater, that.updater)
        && Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        activeDeployment,
        createTime,
        creator,
        description,
        name,
        pendingDeployment,
        servicePrincipalId,
        servicePrincipalName,
        status,
        updateTime,
        updater,
        url);
  }

  @Override
  public String toString() {
    return new ToStringer(App.class)
        .add("activeDeployment", activeDeployment)
        .add("createTime", createTime)
        .add("creator", creator)
        .add("description", description)
        .add("name", name)
        .add("pendingDeployment", pendingDeployment)
        .add("servicePrincipalId", servicePrincipalId)
        .add("servicePrincipalName", servicePrincipalName)
        .add("status", status)
        .add("updateTime", updateTime)
        .add("updater", updater)
        .add("url", url)
        .toString();
  }
}
