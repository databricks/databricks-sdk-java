// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class CreateLogDeliveryConfigurationParams {
    /**
     * The optional human-readable name of the log delivery configuration.
     * Defaults to empty.
     */
    @JsonProperty("config_name")
    private String configName;
    
    /**
     * The ID for a method:credentials/create that represents the AWS IAM role
     * with policy and trust relationship as described in the main billable
     * usage documentation page. See [Configure billable usage delivery].
     * 
     * [Configure billable usage delivery]: https://docs.databricks.com/administration-guide/account-settings/billable-usage-delivery.html
     */
    @JsonProperty("credentials_id")
    private String credentialsId;
    
    /**
     * The optional delivery path prefix within Amazon S3 storage. Defaults to
     * empty, which means that logs are delivered to the root of the bucket.
     * This must be a valid S3 object key. This must not start or end with a
     * slash character.
     */
    @JsonProperty("delivery_path_prefix")
    private String deliveryPathPrefix;
    
    /**
     * This field applies only if `log_type` is `BILLABLE_USAGE`. This is the
     * optional start month and year for delivery, specified in `YYYY-MM`
     * format. Defaults to current year and month. `BILLABLE_USAGE` logs are not
     * available for usage before March 2019 (`2019-03`).
     */
    @JsonProperty("delivery_start_time")
    private String deliveryStartTime;
    
    /**
     * Log delivery type. Supported values are:
     * 
     * * `BILLABLE_USAGE` — Configure [billable usage log delivery]. For the
     * CSV schema, see the [View billable usage].
     * 
     * * `AUDIT_LOGS` — Configure [audit log delivery]. For the JSON schema,
     * see [Configure audit logging]
     * 
     * [Configure audit logging]: https://docs.databricks.com/administration-guide/account-settings/audit-logs.html
     * [View billable usage]: https://docs.databricks.com/administration-guide/account-settings/usage.html
     * [audit log delivery]: https://docs.databricks.com/administration-guide/account-settings/audit-logs.html
     * [billable usage log delivery]: https://docs.databricks.com/administration-guide/account-settings/billable-usage-delivery.html
     */
    @JsonProperty("log_type")
    private LogType logType;
    
    /**
     * The file type of log delivery.
     * 
     * * If `log_type` is `BILLABLE_USAGE`, this value must be `CSV`. Only the
     * CSV (comma-separated values) format is supported. For the schema, see the
     * [View billable usage] * If `log_type` is `AUDIT_LOGS`, this value must be
     * `JSON`. Only the JSON (JavaScript Object Notation) format is supported.
     * For the schema, see the [Configuring audit logs].
     * 
     * [Configuring audit logs]: https://docs.databricks.com/administration-guide/account-settings/audit-logs.html
     * [View billable usage]: https://docs.databricks.com/administration-guide/account-settings/usage.html
     */
    @JsonProperty("output_format")
    private OutputFormat outputFormat;
    
    /**
     * Status of log delivery configuration. Set to `ENABLED` (enabled) or
     * `DISABLED` (disabled). Defaults to `ENABLED`. You can [enable or disable
     * the configuration](#operation/patch-log-delivery-config-status) later.
     * Deletion of a configuration is not supported, so disable a log delivery
     * configuration that is no longer needed.
     */
    @JsonProperty("status")
    private LogDeliveryConfigStatus status;
    
    /**
     * "The ID for a method:storage/create that represents the S3 bucket with
     * bucket policy as described in the main billable usage documentation page.
     * See [Configure billable usage delivery]."
     * 
     * [Configure billable usage delivery]: https://docs.databricks.com/administration-guide/account-settings/billable-usage-delivery.html
     */
    @JsonProperty("storage_configuration_id")
    private String storageConfigurationId;
    
    /**
     * Optional filter that specifies workspace IDs to deliver logs for. By
     * default the workspace filter is empty and log delivery applies at the
     * account level, delivering workspace-level logs for all workspaces in your
     * account, plus account level logs. You can optionally set this field to an
     * array of workspace IDs (each one is an `int64`) to which log delivery
     * should apply, in which case only workspace-level logs relating to the
     * specified workspaces are delivered. If you plan to use different log
     * delivery configurations for different workspaces, set this field
     * explicitly. Be aware that delivery configurations mentioning specific
     * workspaces won't apply to new workspaces created in the future, and
     * delivery won't include account level logs. For some types of Databricks
     * deployments there is only one workspace per account ID, so this field is
     * unnecessary.
     */
    @JsonProperty("workspace_ids_filter")
    private java.util.List<Long> workspaceIdsFilter;
    
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
    
    public CreateLogDeliveryConfigurationParams setStorageConfigurationId(String storageConfigurationId) {
        this.storageConfigurationId = storageConfigurationId;
        return this;
    }

    public String getStorageConfigurationId() {
        return storageConfigurationId;
    }
    
    public CreateLogDeliveryConfigurationParams setWorkspaceIdsFilter(java.util.List<Long> workspaceIdsFilter) {
        this.workspaceIdsFilter = workspaceIdsFilter;
        return this;
    }

    public java.util.List<Long> getWorkspaceIdsFilter() {
        return workspaceIdsFilter;
    }
    
}
