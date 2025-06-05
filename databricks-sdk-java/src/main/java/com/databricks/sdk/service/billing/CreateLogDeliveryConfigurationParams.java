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
@JsonSerialize(
    using =
        CreateLogDeliveryConfigurationParams.CreateLogDeliveryConfigurationParamsSerializer.class)
@JsonDeserialize(
    using =
        CreateLogDeliveryConfigurationParams.CreateLogDeliveryConfigurationParamsDeserializer.class)
public class CreateLogDeliveryConfigurationParams {
  /** The optional human-readable name of the log delivery configuration. Defaults to empty. */
  private String configName;

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

  public CreateLogDeliveryConfigurationParams setConfigName(String configName) {
    this.configName = configName;
    return this;
  }

  public String getConfigName() {
    return configName;
  }

  public CreateLogDeliveryConfigurationParams setCredentialsId(String credentialsId) {
    this.credentialsId = credentialsId;
    return this;
  }

  public String getCredentialsId() {
    return credentialsId;
  }

  public CreateLogDeliveryConfigurationParams setDeliveryPathPrefix(String deliveryPathPrefix) {
    this.deliveryPathPrefix = deliveryPathPrefix;
    return this;
  }

  public String getDeliveryPathPrefix() {
    return deliveryPathPrefix;
  }

  public CreateLogDeliveryConfigurationParams setDeliveryStartTime(String deliveryStartTime) {
    this.deliveryStartTime = deliveryStartTime;
    return this;
  }

  public String getDeliveryStartTime() {
    return deliveryStartTime;
  }

  public CreateLogDeliveryConfigurationParams setLogType(LogType logType) {
    this.logType = logType;
    return this;
  }

  public LogType getLogType() {
    return logType;
  }

  public CreateLogDeliveryConfigurationParams setOutputFormat(OutputFormat outputFormat) {
    this.outputFormat = outputFormat;
    return this;
  }

  public OutputFormat getOutputFormat() {
    return outputFormat;
  }

  public CreateLogDeliveryConfigurationParams setStatus(LogDeliveryConfigStatus status) {
    this.status = status;
    return this;
  }

  public LogDeliveryConfigStatus getStatus() {
    return status;
  }

  public CreateLogDeliveryConfigurationParams setStorageConfigurationId(
      String storageConfigurationId) {
    this.storageConfigurationId = storageConfigurationId;
    return this;
  }

  public String getStorageConfigurationId() {
    return storageConfigurationId;
  }

  public CreateLogDeliveryConfigurationParams setWorkspaceIdsFilter(
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
    CreateLogDeliveryConfigurationParams that = (CreateLogDeliveryConfigurationParams) o;
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
    return new ToStringer(CreateLogDeliveryConfigurationParams.class)
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

  CreateLogDeliveryConfigurationParamsPb toPb() {
    CreateLogDeliveryConfigurationParamsPb pb = new CreateLogDeliveryConfigurationParamsPb();
    pb.setConfigName(configName);
    pb.setCredentialsId(credentialsId);
    pb.setDeliveryPathPrefix(deliveryPathPrefix);
    pb.setDeliveryStartTime(deliveryStartTime);
    pb.setLogType(logType);
    pb.setOutputFormat(outputFormat);
    pb.setStatus(status);
    pb.setStorageConfigurationId(storageConfigurationId);
    pb.setWorkspaceIdsFilter(workspaceIdsFilter);

    return pb;
  }

  static CreateLogDeliveryConfigurationParams fromPb(CreateLogDeliveryConfigurationParamsPb pb) {
    CreateLogDeliveryConfigurationParams model = new CreateLogDeliveryConfigurationParams();
    model.setConfigName(pb.getConfigName());
    model.setCredentialsId(pb.getCredentialsId());
    model.setDeliveryPathPrefix(pb.getDeliveryPathPrefix());
    model.setDeliveryStartTime(pb.getDeliveryStartTime());
    model.setLogType(pb.getLogType());
    model.setOutputFormat(pb.getOutputFormat());
    model.setStatus(pb.getStatus());
    model.setStorageConfigurationId(pb.getStorageConfigurationId());
    model.setWorkspaceIdsFilter(pb.getWorkspaceIdsFilter());

    return model;
  }

  public static class CreateLogDeliveryConfigurationParamsSerializer
      extends JsonSerializer<CreateLogDeliveryConfigurationParams> {
    @Override
    public void serialize(
        CreateLogDeliveryConfigurationParams value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateLogDeliveryConfigurationParamsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateLogDeliveryConfigurationParamsDeserializer
      extends JsonDeserializer<CreateLogDeliveryConfigurationParams> {
    @Override
    public CreateLogDeliveryConfigurationParams deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateLogDeliveryConfigurationParamsPb pb =
          mapper.readValue(p, CreateLogDeliveryConfigurationParamsPb.class);
      return CreateLogDeliveryConfigurationParams.fromPb(pb);
    }
  }
}
