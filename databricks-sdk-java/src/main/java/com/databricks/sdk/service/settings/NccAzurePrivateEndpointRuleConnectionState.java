// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * The current status of this private endpoint. The private endpoint rules are effective only if the
 * connection state is `ESTABLISHED`. Remember that you must approve new endpoints on your resources
 * in the Azure portal before they take effect.
 *
 * <p>The possible values are: - INIT: (deprecated) The endpoint has been created and pending
 * approval. - PENDING: The endpoint has been created and pending approval. - ESTABLISHED: The
 * endpoint has been approved and is ready to use in your serverless compute resources. - REJECTED:
 * Connection was rejected by the private link resource owner. - DISCONNECTED: Connection was
 * removed by the private link resource owner, the private endpoint becomes informative and should
 * be deleted for clean-up.
 */
@Generated
public enum NccAzurePrivateEndpointRuleConnectionState {
  DISCONNECTED,
  ESTABLISHED,
  INIT,
  PENDING,
  REJECTED,
}
