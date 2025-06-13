// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * These APIs manage Log delivery configurations for this account. Log delivery configs enable you
 * to configure the delivery of the specified type of logs to your storage account.
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

  public WrappedLogDeliveryConfiguration create(
      CreateLogDeliveryConfigurationParams logDeliveryConfiguration) {
    return create(
        new WrappedCreateLogDeliveryConfiguration()
            .setLogDeliveryConfiguration(logDeliveryConfiguration));
  }

  /**
   * Create a new log delivery configuration.
   *
   * <p>Creates a new Databricks log delivery configuration to enable delivery of the specified type
   * of logs to your storage location. This requires that you already created a [credential
   * object](:method:Credentials/Create) (which encapsulates a cross-account service IAM role) and a
   * [storage configuration object](:method:Storage/Create) (which encapsulates an S3 bucket).
   *
   * <p>For full details, including the required IAM role policies and bucket policies, see [Deliver
   * and access billable usage logs] or [Configure audit logging].
   *
   * <p>**Note**: There is a limit on the number of log delivery configurations available per
   * account (each limit applies separately to each log type including billable usage and audit
   * logs). You can create a maximum of two enabled account-level delivery configurations
   * (configurations without a workspace filter) per type. Additionally, you can create two enabled
   * workspace-level delivery configurations per workspace for each log type, which means that the
   * same workspace ID can occur in the workspace filter for no more than two delivery
   * configurations per log type.
   *
   * <p>You cannot delete a log delivery configuration, but you can disable it (see [Enable or
   * disable log delivery configuration](:method:LogDelivery/PatchStatus)).
   *
   * <p>[Configure audit logging]:
   * https://docs.databricks.com/administration-guide/account-settings/audit-logs.html [Deliver and
   * access billable usage logs]:
   * https://docs.databricks.com/administration-guide/account-settings/billable-usage-delivery.html
   */
  public WrappedLogDeliveryConfiguration create(WrappedCreateLogDeliveryConfiguration request) {
    return impl.create(request);
  }

  public GetLogDeliveryConfigurationResponse get(String logDeliveryConfigurationId) {
    return get(
        new GetLogDeliveryRequest().setLogDeliveryConfigurationId(logDeliveryConfigurationId));
  }

  /**
   * Get log delivery configuration.
   *
   * <p>Gets a Databricks log delivery configuration object for an account, both specified by ID.
   */
  public GetLogDeliveryConfigurationResponse get(GetLogDeliveryRequest request) {
    return impl.get(request);
  }

  /**
   * Get all log delivery configurations.
   *
   * <p>Gets all Databricks log delivery configurations associated with an account specified by ID.
   */
  public Iterable<LogDeliveryConfiguration> list(ListLogDeliveryRequest request) {
    return new Paginator<>(
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

  public void patchStatus(String logDeliveryConfigurationId, LogDeliveryConfigStatus status) {
    patchStatus(
        new UpdateLogDeliveryConfigurationStatusRequest()
            .setLogDeliveryConfigurationId(logDeliveryConfigurationId)
            .setStatus(status));
  }

  /**
   * Enable or disable log delivery configuration.
   *
   * <p>Enables or disables a log delivery configuration. Deletion of delivery configurations is not
   * supported, so disable log delivery configurations that are no longer needed. Note that you
   * can't re-enable a delivery configuration if this would violate the delivery configuration
   * limits described under [Create log delivery](:method:LogDelivery/Create).
   */
  public void patchStatus(UpdateLogDeliveryConfigurationStatusRequest request) {
    impl.patchStatus(request);
  }

  public LogDeliveryService impl() {
    return impl;
  }
}
