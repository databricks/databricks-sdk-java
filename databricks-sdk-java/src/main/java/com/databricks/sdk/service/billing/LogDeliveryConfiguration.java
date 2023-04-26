// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>LogDeliveryConfiguration class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class LogDeliveryConfiguration {
  /** The Databricks account ID that hosts the log delivery configuration. */
  @JsonProperty("account_id")
  private String accountId;

  /** Databricks log delivery configuration ID. */
  @JsonProperty("config_id")
  private String configId;

  /** The optional human-readable name of the log delivery configuration. Defaults to empty. */
  @JsonProperty("config_name")
  private String configName;

  /** Time in epoch milliseconds when the log delivery configuration was created. */
  @JsonProperty("creation_time")
  private Long creationTime;

  /**
   * The ID for a method:credentials/create that represents the AWS IAM role with policy and trust
   * relationship as described in the main billable usage documentation page. See [Configure
   * billable usage delivery].
   *
   * <p>[Configure billable usage delivery]:
   * https://docs.databricks.com/administration-guide/account-settings/billable-usage-delivery.html
   */
  @JsonProperty("credentials_id")
  private String credentialsId;

  /**
   * The optional delivery path prefix within Amazon S3 storage. Defaults to empty, which means that
   * logs are delivered to the root of the bucket. This must be a valid S3 object key. This must not
   * start or end with a slash character.
   */
  @JsonProperty("delivery_path_prefix")
  private String deliveryPathPrefix;

  /**
   * This field applies only if `log_type` is `BILLABLE_USAGE`. This is the optional start month and
   * year for delivery, specified in `YYYY-MM` format. Defaults to current year and month.
   * `BILLABLE_USAGE` logs are not available for usage before March 2019 (`2019-03`).
   */
  @JsonProperty("delivery_start_time")
  private String deliveryStartTime;

  /** Databricks log delivery status. */
  @JsonProperty("log_delivery_status")
  private LogDeliveryStatus logDeliveryStatus;

  /**
   * Log delivery type. Supported values are:
   *
   * <p>* `BILLABLE_USAGE` — Configure [billable usage log delivery]. For the CSV schema, see the
   * [View billable usage].
   *
   * <p>* `AUDIT_LOGS` — Configure [audit log delivery]. For the JSON schema, see [Configure audit
   * logging]
   *
   * <p>[Configure audit logging]:
   * https://docs.databricks.com/administration-guide/account-settings/audit-logs.html [View
   * billable usage]: https://docs.databricks.com/administration-guide/account-settings/usage.html
   * [audit log delivery]:
   * https://docs.databricks.com/administration-guide/account-settings/audit-logs.html [billable
   * usage log delivery]:
   * https://docs.databricks.com/administration-guide/account-settings/billable-usage-delivery.html
   */
  @JsonProperty("log_type")
  private LogType logType;

  /**
   * The file type of log delivery.
   *
   * <p>* If `log_type` is `BILLABLE_USAGE`, this value must be `CSV`. Only the CSV (comma-separated
   * values) format is supported. For the schema, see the [View billable usage] * If `log_type` is
   * `AUDIT_LOGS`, this value must be `JSON`. Only the JSON (JavaScript Object Notation) format is
   * supported. For the schema, see the [Configuring audit logs].
   *
   * <p>[Configuring audit logs]:
   * https://docs.databricks.com/administration-guide/account-settings/audit-logs.html [View
   * billable usage]: https://docs.databricks.com/administration-guide/account-settings/usage.html
   */
  @JsonProperty("output_format")
  private OutputFormat outputFormat;

  /**
   * Status of log delivery configuration. Set to `ENABLED` (enabled) or `DISABLED` (disabled).
   * Defaults to `ENABLED`. You can [enable or disable the
   * configuration](#operation/patch-log-delivery-config-status) later. Deletion of a configuration
   * is not supported, so disable a log delivery configuration that is no longer needed.
   */
  @JsonProperty("status")
  private LogDeliveryConfigStatus status;

  /**
   * "The ID for a method:storage/create that represents the S3 bucket with bucket policy as
   * described in the main billable usage documentation page. See [Configure billable usage
   * delivery]."
   *
   * <p>[Configure billable usage delivery]:
   * https://docs.databricks.com/administration-guide/account-settings/billable-usage-delivery.html
   */
  @JsonProperty("storage_configuration_id")
  private String storageConfigurationId;

  /** Time in epoch milliseconds when the log delivery configuration was updated. */
  @JsonProperty("update_time")
  private Long updateTime;

  /**
   * Optional filter that specifies workspace IDs to deliver logs for. By default the workspace
   * filter is empty and log delivery applies at the account level, delivering workspace-level logs
   * for all workspaces in your account, plus account level logs. You can optionally set this field
   * to an array of workspace IDs (each one is an `int64`) to which log delivery should apply, in
   * which case only workspace-level logs relating to the specified workspaces are delivered. If you
   * plan to use different log delivery configurations for different workspaces, set this field
   * explicitly. Be aware that delivery configurations mentioning specific workspaces won't apply to
   * new workspaces created in the future, and delivery won't include account level logs. For some
   * types of Databricks deployments there is only one workspace per account ID, so this field is
   * unnecessary.
   */
  @JsonProperty("workspace_ids_filter")
  private Collection<Long> workspaceIdsFilter;

  /**
   * <p>Setter for the field <code>accountId</code>.</p>
   *
   * @param accountId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.billing.LogDeliveryConfiguration} object
   */
  public LogDeliveryConfiguration setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <p>Getter for the field <code>accountId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getAccountId() {
    return accountId;
  }

  /**
   * <p>Setter for the field <code>configId</code>.</p>
   *
   * @param configId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.billing.LogDeliveryConfiguration} object
   */
  public LogDeliveryConfiguration setConfigId(String configId) {
    this.configId = configId;
    return this;
  }

  /**
   * <p>Getter for the field <code>configId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getConfigId() {
    return configId;
  }

  /**
   * <p>Setter for the field <code>configName</code>.</p>
   *
   * @param configName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.billing.LogDeliveryConfiguration} object
   */
  public LogDeliveryConfiguration setConfigName(String configName) {
    this.configName = configName;
    return this;
  }

  /**
   * <p>Getter for the field <code>configName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getConfigName() {
    return configName;
  }

  /**
   * <p>Setter for the field <code>creationTime</code>.</p>
   *
   * @param creationTime a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.billing.LogDeliveryConfiguration} object
   */
  public LogDeliveryConfiguration setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * <p>Getter for the field <code>creationTime</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getCreationTime() {
    return creationTime;
  }

  /**
   * <p>Setter for the field <code>credentialsId</code>.</p>
   *
   * @param credentialsId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.billing.LogDeliveryConfiguration} object
   */
  public LogDeliveryConfiguration setCredentialsId(String credentialsId) {
    this.credentialsId = credentialsId;
    return this;
  }

  /**
   * <p>Getter for the field <code>credentialsId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getCredentialsId() {
    return credentialsId;
  }

  /**
   * <p>Setter for the field <code>deliveryPathPrefix</code>.</p>
   *
   * @param deliveryPathPrefix a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.billing.LogDeliveryConfiguration} object
   */
  public LogDeliveryConfiguration setDeliveryPathPrefix(String deliveryPathPrefix) {
    this.deliveryPathPrefix = deliveryPathPrefix;
    return this;
  }

  /**
   * <p>Getter for the field <code>deliveryPathPrefix</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDeliveryPathPrefix() {
    return deliveryPathPrefix;
  }

  /**
   * <p>Setter for the field <code>deliveryStartTime</code>.</p>
   *
   * @param deliveryStartTime a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.billing.LogDeliveryConfiguration} object
   */
  public LogDeliveryConfiguration setDeliveryStartTime(String deliveryStartTime) {
    this.deliveryStartTime = deliveryStartTime;
    return this;
  }

  /**
   * <p>Getter for the field <code>deliveryStartTime</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDeliveryStartTime() {
    return deliveryStartTime;
  }

  /**
   * <p>Setter for the field <code>logDeliveryStatus</code>.</p>
   *
   * @param logDeliveryStatus a {@link com.databricks.sdk.service.billing.LogDeliveryStatus} object
   * @return a {@link com.databricks.sdk.service.billing.LogDeliveryConfiguration} object
   */
  public LogDeliveryConfiguration setLogDeliveryStatus(LogDeliveryStatus logDeliveryStatus) {
    this.logDeliveryStatus = logDeliveryStatus;
    return this;
  }

  /**
   * <p>Getter for the field <code>logDeliveryStatus</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.billing.LogDeliveryStatus} object
   */
  public LogDeliveryStatus getLogDeliveryStatus() {
    return logDeliveryStatus;
  }

  /**
   * <p>Setter for the field <code>logType</code>.</p>
   *
   * @param logType a {@link com.databricks.sdk.service.billing.LogType} object
   * @return a {@link com.databricks.sdk.service.billing.LogDeliveryConfiguration} object
   */
  public LogDeliveryConfiguration setLogType(LogType logType) {
    this.logType = logType;
    return this;
  }

  /**
   * <p>Getter for the field <code>logType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.billing.LogType} object
   */
  public LogType getLogType() {
    return logType;
  }

  /**
   * <p>Setter for the field <code>outputFormat</code>.</p>
   *
   * @param outputFormat a {@link com.databricks.sdk.service.billing.OutputFormat} object
   * @return a {@link com.databricks.sdk.service.billing.LogDeliveryConfiguration} object
   */
  public LogDeliveryConfiguration setOutputFormat(OutputFormat outputFormat) {
    this.outputFormat = outputFormat;
    return this;
  }

  /**
   * <p>Getter for the field <code>outputFormat</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.billing.OutputFormat} object
   */
  public OutputFormat getOutputFormat() {
    return outputFormat;
  }

  /**
   * <p>Setter for the field <code>status</code>.</p>
   *
   * @param status a {@link com.databricks.sdk.service.billing.LogDeliveryConfigStatus} object
   * @return a {@link com.databricks.sdk.service.billing.LogDeliveryConfiguration} object
   */
  public LogDeliveryConfiguration setStatus(LogDeliveryConfigStatus status) {
    this.status = status;
    return this;
  }

  /**
   * <p>Getter for the field <code>status</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.billing.LogDeliveryConfigStatus} object
   */
  public LogDeliveryConfigStatus getStatus() {
    return status;
  }

  /**
   * <p>Setter for the field <code>storageConfigurationId</code>.</p>
   *
   * @param storageConfigurationId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.billing.LogDeliveryConfiguration} object
   */
  public LogDeliveryConfiguration setStorageConfigurationId(String storageConfigurationId) {
    this.storageConfigurationId = storageConfigurationId;
    return this;
  }

  /**
   * <p>Getter for the field <code>storageConfigurationId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getStorageConfigurationId() {
    return storageConfigurationId;
  }

  /**
   * <p>Setter for the field <code>updateTime</code>.</p>
   *
   * @param updateTime a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.billing.LogDeliveryConfiguration} object
   */
  public LogDeliveryConfiguration setUpdateTime(Long updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * <p>Getter for the field <code>updateTime</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getUpdateTime() {
    return updateTime;
  }

  /**
   * <p>Setter for the field <code>workspaceIdsFilter</code>.</p>
   *
   * @param workspaceIdsFilter a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.billing.LogDeliveryConfiguration} object
   */
  public LogDeliveryConfiguration setWorkspaceIdsFilter(Collection<Long> workspaceIdsFilter) {
    this.workspaceIdsFilter = workspaceIdsFilter;
    return this;
  }

  /**
   * <p>Getter for the field <code>workspaceIdsFilter</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<Long> getWorkspaceIdsFilter() {
    return workspaceIdsFilter;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LogDeliveryConfiguration that = (LogDeliveryConfiguration) o;
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

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(LogDeliveryConfiguration.class)
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
