// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class CreateLogDeliveryConfigurationParamsPb {
  @JsonProperty("config_name")
  private String configName;

  @JsonProperty("credentials_id")
  private String credentialsId;

  @JsonProperty("delivery_path_prefix")
  private String deliveryPathPrefix;

  @JsonProperty("delivery_start_time")
  private String deliveryStartTime;

  @JsonProperty("log_type")
  private LogType logType;

  @JsonProperty("output_format")
  private OutputFormat outputFormat;

  @JsonProperty("status")
  private LogDeliveryConfigStatus status;

  @JsonProperty("storage_configuration_id")
  private String storageConfigurationId;

  @JsonProperty("workspace_ids_filter")
  private Collection<Long> workspaceIdsFilter;

  public CreateLogDeliveryConfigurationParamsPb setConfigName(String configName) {
    this.configName = configName;
    return this;
  }

  public String getConfigName() {
    return configName;
  }

  public CreateLogDeliveryConfigurationParamsPb setCredentialsId(String credentialsId) {
    this.credentialsId = credentialsId;
    return this;
  }

  public String getCredentialsId() {
    return credentialsId;
  }

  public CreateLogDeliveryConfigurationParamsPb setDeliveryPathPrefix(String deliveryPathPrefix) {
    this.deliveryPathPrefix = deliveryPathPrefix;
    return this;
  }

  public String getDeliveryPathPrefix() {
    return deliveryPathPrefix;
  }

  public CreateLogDeliveryConfigurationParamsPb setDeliveryStartTime(String deliveryStartTime) {
    this.deliveryStartTime = deliveryStartTime;
    return this;
  }

  public String getDeliveryStartTime() {
    return deliveryStartTime;
  }

  public CreateLogDeliveryConfigurationParamsPb setLogType(LogType logType) {
    this.logType = logType;
    return this;
  }

  public LogType getLogType() {
    return logType;
  }

  public CreateLogDeliveryConfigurationParamsPb setOutputFormat(OutputFormat outputFormat) {
    this.outputFormat = outputFormat;
    return this;
  }

  public OutputFormat getOutputFormat() {
    return outputFormat;
  }

  public CreateLogDeliveryConfigurationParamsPb setStatus(LogDeliveryConfigStatus status) {
    this.status = status;
    return this;
  }

  public LogDeliveryConfigStatus getStatus() {
    return status;
  }

  public CreateLogDeliveryConfigurationParamsPb setStorageConfigurationId(
      String storageConfigurationId) {
    this.storageConfigurationId = storageConfigurationId;
    return this;
  }

  public String getStorageConfigurationId() {
    return storageConfigurationId;
  }

  public CreateLogDeliveryConfigurationParamsPb setWorkspaceIdsFilter(
      Collection<Long> workspaceIdsFilter) {
    this.workspaceIdsFilter = workspaceIdsFilter;
    return this;
  }

  public Collection<Long> getWorkspaceIdsFilter() {
    return workspaceIdsFilter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateLogDeliveryConfigurationParamsPb that = (CreateLogDeliveryConfigurationParamsPb) o;
    return Objects.equals(configName, that.configName)
        && Objects.equals(credentialsId, that.credentialsId)
        && Objects.equals(deliveryPathPrefix, that.deliveryPathPrefix)
        && Objects.equals(deliveryStartTime, that.deliveryStartTime)
        && Objects.equals(logType, that.logType)
        && Objects.equals(outputFormat, that.outputFormat)
        && Objects.equals(status, that.status)
        && Objects.equals(storageConfigurationId, that.storageConfigurationId)
        && Objects.equals(workspaceIdsFilter, that.workspaceIdsFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        configName,
        credentialsId,
        deliveryPathPrefix,
        deliveryStartTime,
        logType,
        outputFormat,
        status,
        storageConfigurationId,
        workspaceIdsFilter);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateLogDeliveryConfigurationParamsPb.class)
        .add("configName", configName)
        .add("credentialsId", credentialsId)
        .add("deliveryPathPrefix", deliveryPathPrefix)
        .add("deliveryStartTime", deliveryStartTime)
        .add("logType", logType)
        .add("outputFormat", outputFormat)
        .add("status", status)
        .add("storageConfigurationId", storageConfigurationId)
        .add("workspaceIdsFilter", workspaceIdsFilter)
        .toString();
  }
}
