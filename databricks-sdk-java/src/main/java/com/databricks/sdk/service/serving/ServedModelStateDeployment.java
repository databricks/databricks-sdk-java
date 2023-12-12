// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The state of the served entity deployment. DEPLOYMENT_CREATING indicates that the served entity
 * is not ready yet because the deployment is still being created (i.e container image is building,
 * model server is deploying for the first time, etc.). DEPLOYMENT_RECOVERING indicates that the
 * served entity was previously in a ready state but no longer is and is attempting to recover.
 * DEPLOYMENT_READY indicates that the served entity is ready to receive traffic. DEPLOYMENT_FAILED
 * indicates that there was an error trying to bring up the served entity (e.g container image build
 * failed, the model server failed to start due to a model loading error, etc.) DEPLOYMENT_ABORTED
 * indicates that the deployment was terminated likely due to a failure in bringing up another
 * served entity under the same endpoint and config version.
 */
@Generated
public enum ServedModelStateDeployment {
  @JsonProperty("DEPLOYMENT_ABORTED")
  ABORTED,

  @JsonProperty("DEPLOYMENT_CREATING")
  CREATING,

  @JsonProperty("DEPLOYMENT_FAILED")
  FAILED,

  @JsonProperty("DEPLOYMENT_READY")
  READY,

  @JsonProperty("DEPLOYMENT_RECOVERING")
  RECOVERING,
}
