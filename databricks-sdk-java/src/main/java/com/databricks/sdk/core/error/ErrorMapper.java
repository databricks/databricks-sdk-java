// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error;

import com.databricks.sdk.support.Generated;

@Generated
class ErrorMapper extends AbstractErrorMapper {
  public ErrorMapper() {
    statusCode(400, BadRequest::new);
    statusCode(401, Unauthenticated::new);
    statusCode(403, PermissionDenied::new);
    statusCode(404, NotFound::new);
    statusCode(409, ResourceConflict::new);
    statusCode(429, TooManyRequests::new);
    statusCode(499, Cancelled::new);
    statusCode(500, InternalError::new);
    statusCode(501, NotImplemented::new);
    statusCode(503, TemporarilyUnavailable::new);
    statusCode(504, DeadlineExceeded::new);

    errorCode("INVALID_PARAMETER_VALUE", InvalidParameterValue::new);
    errorCode("RESOURCE_DOES_NOT_EXIST", ResourceDoesNotExist::new);
    errorCode("ABORTED", Aborted::new);
    errorCode("ALREADY_EXISTS", AlreadyExists::new);
    errorCode("RESOURCE_ALREADY_EXISTS", ResourceAlreadyExists::new);
    errorCode("RESOURCE_EXHAUSTED", ResourceExhausted::new);
    errorCode("REQUEST_LIMIT_EXCEEDED", RequestLimitExceeded::new);
    errorCode("UNKNOWN", Unknown::new);
    errorCode("DATA_LOSS", DataLoss::new);
  }
}
