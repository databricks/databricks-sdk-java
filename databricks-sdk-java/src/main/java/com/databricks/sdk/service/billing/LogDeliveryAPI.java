// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

/**
 * These APIs manage log delivery configurations for this account. The two supported log types for
 * this API are <i>billable usage logs</i> (AWS only) and <i>audit logs</i> (AWS and GCP). This
 * feature is in Public Preview. This feature works with all account ID types.
 *
 * <p>Log delivery works with all account types. However, if your account is on the E2 version of
 * the platform or on a select custom plan that allows multiple workspaces per account, you can
 * optionally configure different storage destinations for each workspace. Log delivery status is
 * also provided to know the latest status of log delivery attempts.
 *
 * <p>The high-level flow of billable usage delivery (AWS only):
 *
 * <ol>
 *   <li><b>Create storage</b>: In AWS, <a
 *       href="https://docs.databricks.com/administration-guide/account-api/aws-storage.html">create
 *       a new AWS S3 bucket</a> with a specific bucket policy. Using Databricks APIs, call the
 *       Account API to create a <a href=":method:Storage/Create">storage configuration object</a>
 *       that uses the bucket name.
 *   <li><b>Create credentials</b>: In AWS, create the appropriate AWS IAM role. For full details,
 *       including the required IAM role policies and trust relationship, see <a
 *       href="https://docs.databricks.com/administration-guide/account-settings/billable-usage-delivery.html">Billable
 *       usage log delivery</a>. Using Databricks APIs, call the Account API to create a <a
 *       href=":method:Credentials/Create">credential configuration object</a> that uses the IAM
 *       role's ARN.
 *   <li><b>Create log delivery configuration</b>: Using Databricks APIs, call the Account API to <a
 *       href=":method:LogDelivery/Create">create a log delivery configuration</a> that uses the
 *       credential and storage configuration objects from previous steps. You can specify if the
 *       logs should include all events of that log type in your account (<i>Account level</i>
 *       delivery) or only events for a specific set of workspaces (<i>workspace level</i>
 *       delivery). Account level log delivery applies to all current and future workspaces plus
 *       account level logs, while workspace level log delivery solely delivers logs related to the
 *       specified workspaces. You can create multiple types of delivery configurations per account.
 * </ol>
 *
 * <p>For billable usage delivery (AWS only):
 *
 * <ul>
 *   <li>For more information about billable usage logs, see <a
 *       href="https://docs.databricks.com/administration-guide/account-settings/billable-usage-delivery.html">Billable
 *       usage log delivery</a>. For the CSV schema, see the <a
 *       href="https://docs.databricks.com/administration-guide/account-settings/usage.html">Usage
 *       page</a>.
 *   <li>The delivery location is {@code <bucket-name>/<prefix>/billable-usage/csv/}, where {@code
 *       <prefix>} is the name of the optional delivery path prefix you set up during log delivery
 *       configuration. Files are named {@code workspaceId=<workspace-id>-usageMonth=<month>.csv}.
 *   <li>All billable usage logs apply to specific workspaces (<i>workspace level</i> logs). You can
 *       aggregate usage for your entire account by creating an <i>account level</i> delivery
 *       configuration that delivers logs for all current and future workspaces in your account.
 *   <li>The files are delivered daily by overwriting the month's CSV file for each workspace.
 * </ul>
 *
 * <p>For audit log delivery (AWS and GCP):
 *
 * <ul>
 *   <li>For more information about about audit log delivery, see Audit log delivery <a
 *       href="https://docs.databricks.com/administration-guide/account-settings/audit-logs.html">AWS</a>
 *       or <a href="https://docs.databricks.com/gcp/en/admin/account-settings/audit-logs">GCP</a>,
 *       which includes information about the used JSON schema.
 *   <li>The delivery location is {@code
 *       <bucket-name>/<delivery-path-prefix>/workspaceId=<workspaceId>/date=<yyyy-mm-dd>/auditlogs_<internal-id>.json}.
 *       Files may get overwritten with the same content multiple times to achieve exactly-once
 *       delivery.
 *   <li>If the audit log delivery configuration included specific workspace IDs, only
 *       <i>workspace-level</i> audit logs for those workspaces are delivered. If the log delivery
 *       configuration applies to the entire account (<i>account level</i> delivery configuration),
 *       the audit log delivery includes workspace-level audit logs for all workspaces in the
 *       account as well as account-level audit logs. See Audit log delivery <a
 *       href="https://docs.databricks.com/administration-guide/account-settings/audit-logs.html">AWS</a>
 *       or <a href="https://docs.databricks.com/gcp/en/admin/account-settings/audit-logs">GCP</a>
 *       for details.
 *   <li>Auditable events are typically available in logs within 15 minutes.
 * </ul>
 */
@Generated
public class LogDeliveryAPI {
  private static final Logger LOG = LoggerFactory.getLogger(LogDeliveryAPI.class);

  private final LogDeliveryService impl;

  /** Regular-use constructor */
  public LogDeliveryAPI(ApiClient apiClient) {
    impl = new LogDeliveryImpl(apiClient);
  }

  /** Constructor for mocks */
  public LogDeliveryAPI(LogDeliveryService mock) {
    impl = mock;
  }

  /**
   * Creates a new Databricks log delivery configuration to enable delivery of the specified type of
   * logs to your storage location. This requires that you already created a <a
   * href=":method:Credentials/Create">credential object</a> (which encapsulates a cross-account
   * service IAM role) and a <a href=":method:Storage/Create">storage configuration object</a>
   * (which encapsulates an S3 bucket).
   *
   * <p>For full details, including the required IAM role policies and bucket policies, see <a
   * href="https://docs.databricks.com/administration-guide/account-settings/billable-usage-delivery.html">Deliver
   * and access billable usage logs</a> or <a
   * href="https://docs.databricks.com/administration-guide/account-settings/audit-logs.html">Configure
   * audit logging</a>.
   *
   * <p><b>Note</b>: There is a limit on the number of log delivery configurations available per
   * account (each limit applies separately to each log type including billable usage and audit
   * logs). You can create a maximum of two enabled account-level delivery configurations
   * (configurations without a workspace filter) per type. Additionally, you can create two enabled
   * workspace-level delivery configurations per workspace for each log type, which means that the
   * same workspace ID can occur in the workspace filter for no more than two delivery
   * configurations per log type.
   *
   * <p>You cannot delete a log delivery configuration, but you can disable it (see <a
   * href=":method:LogDelivery/PatchStatus">Enable or disable log delivery configuration</a>).
   */
  public WrappedLogDeliveryConfiguration create(WrappedCreateLogDeliveryConfiguration request) {
    return impl.create(request);
  }

  public GetLogDeliveryConfigurationResponse get(String logDeliveryConfigurationId) {
    return get(
        new GetLogDeliveryRequest().setLogDeliveryConfigurationId(logDeliveryConfigurationId));
  }

  /** Gets a Databricks log delivery configuration object for an account, both specified by ID. */
  public GetLogDeliveryConfigurationResponse get(GetLogDeliveryRequest request) {
    return impl.get(request);
  }

  /** Gets all Databricks log delivery configurations associated with an account specified by ID. */
  public Iterable<LogDeliveryConfiguration> list(ListLogDeliveryRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::list,
        WrappedLogDeliveryConfigurations::getLogDeliveryConfigurations,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Enables or disables a log delivery configuration. Deletion of delivery configurations is not
   * supported, so disable log delivery configurations that are no longer needed. Note that you
   * can't re-enable a delivery configuration if this would violate the delivery configuration
   * limits described under <a href=":method:LogDelivery/Create">Create log delivery</a>.
   */
  public void patchStatus(UpdateLogDeliveryConfigurationStatusRequest request) {
    impl.patchStatus(request);
  }

  public LogDeliveryService impl() {
    return impl;
  }
}
