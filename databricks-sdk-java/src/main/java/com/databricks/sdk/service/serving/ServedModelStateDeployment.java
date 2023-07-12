// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The state of the served model deployment. DEPLOYMENT_CREATING indicates that the served model is
 * not ready yet because the deployment is still being created (i.e container image is building,
 * model server is deploying for the first time, etc.). DEPLOYMENT_RECOVERING indicates that the
 * served model was previously in a ready state but no longer is and is attempting to recover.
 * DEPLOYMENT_READY indicates that the served model is ready to receive traffic. DEPLOYMENT_FAILED
 * indicates that there was an error trying to bring up the served model (e.g container image build
 * failed, the model server failed to start due to a model loading error, etc.) DEPLOYMENT_ABORTED
 * indicates that the deployment was terminated likely due to a failure in bringing up another
 * served model under the same endpoint and config version.
 */
@Generated
public enum ServedModelStateDeployment {
  @JsonProperty("DEPLOYMENT_ABORTED")
  DEPLOYMENT_ABORTED,

  @JsonProperty("DEPLOYMENT_CREATING")
  DEPLOYMENT_CREATING,

  @JsonProperty("DEPLOYMENT_FAILED")
  DEPLOYMENT_FAILED,

  @JsonProperty("DEPLOYMENT_READY")
  DEPLOYMENT_READY,

  @JsonProperty("DEPLOYMENT_RECOVERING")
  DEPLOYMENT_RECOVERING,
}
