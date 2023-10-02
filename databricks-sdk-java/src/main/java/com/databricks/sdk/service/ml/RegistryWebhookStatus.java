// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;

/**
 * Enable or disable triggering the webhook, or put the webhook into test mode. The default is
 * `ACTIVE`: * `ACTIVE`: Webhook is triggered when an associated event happens.
 *
 * <p>* `DISABLED`: Webhook is not triggered.
 *
 * <p>* `TEST_MODE`: Webhook can be triggered through the test endpoint, but is not triggered on a
 * real event.
 */
@Generated
public enum RegistryWebhookStatus {
  ACTIVE, // Webhook is triggered when an associated event happens.
  DISABLED, // Webhook is not triggered.
  TEST_MODE, // Webhook can be triggered through the test endpoint, but is not triggered on a
  // real event.

}
