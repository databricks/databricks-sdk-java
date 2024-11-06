// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;

/**
 * Behavior for PII filter. Currently only 'BLOCK' is supported. If 'BLOCK' is set for the input
 * guardrail and the request contains PII, the request is not sent to the model server and 400
 * status code is returned; if 'BLOCK' is set for the output guardrail and the model response
 * contains PII, the PII info in the response is redacted and 400 status code is returned.
 */
@Generated
public enum AiGatewayGuardrailPiiBehaviorBehavior {
  BLOCK,
  NONE,
}
