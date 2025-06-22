// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;

/**
 * These APIs manage Log delivery configurations for this account. Log delivery configs enable you
 * to configure the delivery of the specified type of logs to your storage account.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface LogDeliveryService {
  /**
   * Creates a new Databricks log delivery configuration to enable delivery of the specified type of
   * logs to your storage location. This requires that you already created a [credential
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
  WrappedLogDeliveryConfiguration create(
      WrappedCreateLogDeliveryConfiguration wrappedCreateLogDeliveryConfiguration);

  /** Gets a Databricks log delivery configuration object for an account, both specified by ID. */
  GetLogDeliveryConfigurationResponse get(GetLogDeliveryRequest getLogDeliveryRequest);

  /** Gets all Databricks log delivery configurations associated with an account specified by ID. */
  WrappedLogDeliveryConfigurations list(ListLogDeliveryRequest listLogDeliveryRequest);

  /**
   * Enables or disables a log delivery configuration. Deletion of delivery configurations is not
   * supported, so disable log delivery configurations that are no longer needed. Note that you
   * can't re-enable a delivery configuration if this would violate the delivery configuration
   * limits described under [Create log delivery](:method:LogDelivery/Create).
   */
  void patchStatus(
      UpdateLogDeliveryConfigurationStatusRequest updateLogDeliveryConfigurationStatusRequest);
}
