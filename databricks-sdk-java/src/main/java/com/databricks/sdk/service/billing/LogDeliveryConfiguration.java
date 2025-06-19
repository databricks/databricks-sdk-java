// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = LogDeliveryConfiguration.LogDeliveryConfigurationSerializer.class)
@JsonDeserialize(using = LogDeliveryConfiguration.LogDeliveryConfigurationDeserializer.class)
public class LogDeliveryConfiguration {
  /** The Databricks account ID that hosts the log delivery configuration. */
  private String accountId;

  /** Databricks log delivery configuration ID. */
  private String configId;

  /** The optional human-readable name of the log delivery configuration. Defaults to empty. */
  private String configName;

  /** Time in epoch milliseconds when the log delivery configuration was created. */
  private Long creationTime;

  /**
   * The ID for a method:credentials/create that represents the AWS IAM role with policy and trust
   * relationship as described in the main billable usage documentation page. See [Configure
   * billable usage delivery].
   *
   * <p>[Configure billable usage delivery]:
   * https://docs.databricks.com/administration-guide/account-settings/billable-usage-delivery.html
   */
  private String credentialsId;

  /**
   * The optional delivery path prefix within Amazon S3 storage. Defaults to empty, which means that
   * logs are delivered to the root of the bucket. This must be a valid S3 object key. This must not
   * start or end with a slash character.
   */
  private String deliveryPathPrefix;

  /**
   * This field applies only if `log_type` is `BILLABLE_USAGE`. This is the optional start month and
   * year for delivery, specified in `YYYY-MM` format. Defaults to current year and month.
   * `BILLABLE_USAGE` logs are not available for usage before March 2019 (`2019-03`).
   */
  private String deliveryStartTime;

  /** Databricks log delivery status. */
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
  private OutputFormat outputFormat;

  /**
   * Status of log delivery configuration. Set to `ENABLED` (enabled) or `DISABLED` (disabled).
   * Defaults to `ENABLED`. You can [enable or disable the
   * configuration](#operation/patch-log-delivery-config-status) later. Deletion of a configuration
   * is not supported, so disable a log delivery configuration that is no longer needed.
   */
  private LogDeliveryConfigStatus status;

  /**
   * The ID for a method:storage/create that represents the S3 bucket with bucket policy as
   * described in the main billable usage documentation page. See [Configure billable usage
   * delivery].
   *
   * <p>[Configure billable usage delivery]:
   * https://docs.databricks.com/administration-guide/account-settings/billable-usage-delivery.html
   */
  private String storageConfigurationId;

  /** Time in epoch milliseconds when the log delivery configuration was updated. */
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
  private Collection<Long> workspaceIdsFilter;

  public LogDeliveryConfiguration setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public LogDeliveryConfiguration setConfigId(String configId) {
    this.configId = configId;
    return this;
  }

  public String getConfigId() {
    return configId;
  }

  public LogDeliveryConfiguration setConfigName(String configName) {
    this.configName = configName;
    return this;
  }

  public String getConfigName() {
    return configName;
  }

  public LogDeliveryConfiguration setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public Long getCreationTime() {
    return creationTime;
  }

  public LogDeliveryConfiguration setCredentialsId(String credentialsId) {
    this.credentialsId = credentialsId;
    return this;
  }

  public String getCredentialsId() {
    return credentialsId;
  }

  public LogDeliveryConfiguration setDeliveryPathPrefix(String deliveryPathPrefix) {
    this.deliveryPathPrefix = deliveryPathPrefix;
    return this;
  }

  public String getDeliveryPathPrefix() {
    return deliveryPathPrefix;
  }

  public LogDeliveryConfiguration setDeliveryStartTime(String deliveryStartTime) {
    this.deliveryStartTime = deliveryStartTime;
    return this;
  }

  public String getDeliveryStartTime() {
    return deliveryStartTime;
  }

  public LogDeliveryConfiguration setLogDeliveryStatus(LogDeliveryStatus logDeliveryStatus) {
    this.logDeliveryStatus = logDeliveryStatus;
    return this;
  }

  public LogDeliveryStatus getLogDeliveryStatus() {
    return logDeliveryStatus;
  }

  public LogDeliveryConfiguration setLogType(LogType logType) {
    this.logType = logType;
    return this;
  }

  public LogType getLogType() {
    return logType;
  }

  public LogDeliveryConfiguration setOutputFormat(OutputFormat outputFormat) {
    this.outputFormat = outputFormat;
    return this;
  }

  public OutputFormat getOutputFormat() {
    return outputFormat;
  }

  public LogDeliveryConfiguration setStatus(LogDeliveryConfigStatus status) {
    this.status = status;
    return this;
  }

  public LogDeliveryConfigStatus getStatus() {
    return status;
  }

  public LogDeliveryConfiguration setStorageConfigurationId(String storageConfigurationId) {
    this.storageConfigurationId = storageConfigurationId;
    return this;
  }

  public String getStorageConfigurationId() {
    return storageConfigurationId;
  }

  public LogDeliveryConfiguration setUpdateTime(Long updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public Long getUpdateTime() {
    return updateTime;
  }

  public LogDeliveryConfiguration setWorkspaceIdsFilter(Collection<Long> workspaceIdsFilter) {
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

  LogDeliveryConfigurationPb toPb() {
    LogDeliveryConfigurationPb pb = new LogDeliveryConfigurationPb();
    pb.setAccountId(accountId);
    pb.setConfigId(configId);
    pb.setConfigName(configName);
    pb.setCreationTime(creationTime);
    pb.setCredentialsId(credentialsId);
    pb.setDeliveryPathPrefix(deliveryPathPrefix);
    pb.setDeliveryStartTime(deliveryStartTime);
    pb.setLogDeliveryStatus(logDeliveryStatus);
    pb.setLogType(logType);
    pb.setOutputFormat(outputFormat);
    pb.setStatus(status);
    pb.setStorageConfigurationId(storageConfigurationId);
    pb.setUpdateTime(updateTime);
    pb.setWorkspaceIdsFilter(workspaceIdsFilter);

    return pb;
  }

  static LogDeliveryConfiguration fromPb(LogDeliveryConfigurationPb pb) {
    LogDeliveryConfiguration model = new LogDeliveryConfiguration();
    model.setAccountId(pb.getAccountId());
    model.setConfigId(pb.getConfigId());
    model.setConfigName(pb.getConfigName());
    model.setCreationTime(pb.getCreationTime());
    model.setCredentialsId(pb.getCredentialsId());
    model.setDeliveryPathPrefix(pb.getDeliveryPathPrefix());
    model.setDeliveryStartTime(pb.getDeliveryStartTime());
    model.setLogDeliveryStatus(pb.getLogDeliveryStatus());
    model.setLogType(pb.getLogType());
    model.setOutputFormat(pb.getOutputFormat());
    model.setStatus(pb.getStatus());
    model.setStorageConfigurationId(pb.getStorageConfigurationId());
    model.setUpdateTime(pb.getUpdateTime());
    model.setWorkspaceIdsFilter(pb.getWorkspaceIdsFilter());

    return model;
  }

  public static class LogDeliveryConfigurationSerializer
      extends JsonSerializer<LogDeliveryConfiguration> {
    @Override
    public void serialize(
        LogDeliveryConfiguration value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      LogDeliveryConfigurationPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class LogDeliveryConfigurationDeserializer
      extends JsonDeserializer<LogDeliveryConfiguration> {
    @Override
    public LogDeliveryConfiguration deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      LogDeliveryConfigurationPb pb = mapper.readValue(p, LogDeliveryConfigurationPb.class);
      return LogDeliveryConfiguration.fromPb(pb);
    }
  }
}
