// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error;

import com.databricks.sdk.support.Generated;

@Generated
class ErrorMapper extends AbstractErrorMapper {
  public ErrorMapper() {
    statusCode(400, com.databricks.sdk.core.error.platform.BadRequest::new);
    statusCode(401, com.databricks.sdk.core.error.platform.Unauthenticated::new);
    statusCode(403, com.databricks.sdk.core.error.platform.PermissionDenied::new);
    statusCode(404, com.databricks.sdk.core.error.platform.NotFound::new);
    statusCode(409, com.databricks.sdk.core.error.platform.ResourceConflict::new);
    statusCode(429, com.databricks.sdk.core.error.platform.TooManyRequests::new);
    statusCode(499, com.databricks.sdk.core.error.platform.Cancelled::new);
    statusCode(500, com.databricks.sdk.core.error.platform.InternalError::new);
    statusCode(501, com.databricks.sdk.core.error.platform.NotImplemented::new);
    statusCode(503, com.databricks.sdk.core.error.platform.TemporarilyUnavailable::new);
    statusCode(504, com.databricks.sdk.core.error.platform.DeadlineExceeded::new);

    errorCode("INVALID_STATE", com.databricks.sdk.core.error.platform.InvalidState::new);
    errorCode(
        "INVALID_PARAMETER_VALUE",
        com.databricks.sdk.core.error.platform.InvalidParameterValue::new);
    errorCode(
        "RESOURCE_DOES_NOT_EXIST",
        com.databricks.sdk.core.error.platform.ResourceDoesNotExist::new);
    errorCode("ABORTED", com.databricks.sdk.core.error.platform.Aborted::new);
    errorCode("ALREADY_EXISTS", com.databricks.sdk.core.error.platform.AlreadyExists::new);
    errorCode(
        "RESOURCE_ALREADY_EXISTS",
        com.databricks.sdk.core.error.platform.ResourceAlreadyExists::new);
    errorCode("RESOURCE_EXHAUSTED", com.databricks.sdk.core.error.platform.ResourceExhausted::new);
    errorCode(
        "REQUEST_LIMIT_EXCEEDED", com.databricks.sdk.core.error.platform.RequestLimitExceeded::new);
    errorCode("UNKNOWN", com.databricks.sdk.core.error.platform.Unknown::new);
    errorCode("DATA_LOSS", com.databricks.sdk.core.error.platform.DataLoss::new);
  }
}
