// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class LogDeliveryConfigurationPb {
  @JsonProperty("account_id")
  private String accountId;

  @JsonProperty("config_id")
  private String configId;

  @JsonProperty("config_name")
  private String configName;

  @JsonProperty("creation_time")
  private Long creationTime;

  @JsonProperty("credentials_id")
  private String credentialsId;

  @JsonProperty("delivery_path_prefix")
  private String deliveryPathPrefix;

  @JsonProperty("delivery_start_time")
  private String deliveryStartTime;

  @JsonProperty("log_delivery_status")
  private LogDeliveryStatus logDeliveryStatus;

  @JsonProperty("log_type")
  private LogType logType;

  @JsonProperty("output_format")
  private OutputFormat outputFormat;

  @JsonProperty("status")
  private LogDeliveryConfigStatus status;

  @JsonProperty("storage_configuration_id")
  private String storageConfigurationId;

  @JsonProperty("update_time")
  private Long updateTime;

  @JsonProperty("workspace_ids_filter")
  private Collection<Long> workspaceIdsFilter;

  public LogDeliveryConfigurationPb setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public LogDeliveryConfigurationPb setConfigId(String configId) {
    this.configId = configId;
    return this;
  }

  public String getConfigId() {
    return configId;
  }

  public LogDeliveryConfigurationPb setConfigName(String configName) {
    this.configName = configName;
    return this;
  }

  public String getConfigName() {
    return configName;
  }

  public LogDeliveryConfigurationPb setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public Long getCreationTime() {
    return creationTime;
  }

  public LogDeliveryConfigurationPb setCredentialsId(String credentialsId) {
    this.credentialsId = credentialsId;
    return this;
  }

  public String getCredentialsId() {
    return credentialsId;
  }

  public LogDeliveryConfigurationPb setDeliveryPathPrefix(String deliveryPathPrefix) {
    this.deliveryPathPrefix = deliveryPathPrefix;
    return this;
  }

  public String getDeliveryPathPrefix() {
    return deliveryPathPrefix;
  }

  public LogDeliveryConfigurationPb setDeliveryStartTime(String deliveryStartTime) {
    this.deliveryStartTime = deliveryStartTime;
    return this;
  }

  public String getDeliveryStartTime() {
    return deliveryStartTime;
  }

  public LogDeliveryConfigurationPb setLogDeliveryStatus(LogDeliveryStatus logDeliveryStatus) {
    this.logDeliveryStatus = logDeliveryStatus;
    return this;
  }

  public LogDeliveryStatus getLogDeliveryStatus() {
    return logDeliveryStatus;
  }

  public LogDeliveryConfigurationPb setLogType(LogType logType) {
    this.logType = logType;
    return this;
  }

  public LogType getLogType() {
    return logType;
  }

  public LogDeliveryConfigurationPb setOutputFormat(OutputFormat outputFormat) {
    this.outputFormat = outputFormat;
    return this;
  }

  public OutputFormat getOutputFormat() {
    return outputFormat;
  }

  public LogDeliveryConfigurationPb setStatus(LogDeliveryConfigStatus status) {
    this.status = status;
    return this;
  }

  public LogDeliveryConfigStatus getStatus() {
    return status;
  }

  public LogDeliveryConfigurationPb setStorageConfigurationId(String storageConfigurationId) {
    this.storageConfigurationId = storageConfigurationId;
    return this;
  }

  public String getStorageConfigurationId() {
    return storageConfigurationId;
  }

  public LogDeliveryConfigurationPb setUpdateTime(Long updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public Long getUpdateTime() {
    return updateTime;
  }

  public LogDeliveryConfigurationPb setWorkspaceIdsFilter(Collection<Long> workspaceIdsFilter) {
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
    LogDeliveryConfigurationPb that = (LogDeliveryConfigurationPb) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(configId, that.configId)
        && Objects.equals(configName, that.configName)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(credentialsId, that.credentialsId)
        && Objects.equals(deliveryPathPrefix, that.deliveryPathPrefix)
        && Objects.equals(deliveryStartTime, that.deliveryStartTime)
        && Objects.equals(logDeliveryStatus, that.logDeliveryStatus)
        && Objects.equals(logType, that.logType)
        && Objects.equals(outputFormat, that.outputFormat)
        && Objects.equals(status, that.status)
        && Objects.equals(storageConfigurationId, that.storageConfigurationId)
        && Objects.equals(updateTime, that.updateTime)
        && Objects.equals(workspaceIdsFilter, that.workspaceIdsFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        configId,
        configName,
        creationTime,
        credentialsId,
        deliveryPathPrefix,
        deliveryStartTime,
        logDeliveryStatus,
        logType,
        outputFormat,
        status,
        storageConfigurationId,
        updateTime,
        workspaceIdsFilter);
  }

  @Override
  public String toString() {
    return new ToStringer(LogDeliveryConfigurationPb.class)
        .add("accountId", accountId)
        .add("configId", configId)
        .add("configName", configName)
        .add("creationTime", creationTime)
        .add("credentialsId", credentialsId)
        .add("deliveryPathPrefix", deliveryPathPrefix)
        .add("deliveryStartTime", deliveryStartTime)
        .add("logDeliveryStatus", logDeliveryStatus)
        .add("logType", logType)
        .add("outputFormat", outputFormat)
        .add("status", status)
        .add("storageConfigurationId", storageConfigurationId)
        .add("updateTime", updateTime)
        .add("workspaceIdsFilter", workspaceIdsFilter)
        .toString();
  }
}
