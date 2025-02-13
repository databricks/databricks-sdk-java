// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;

/**
 * Defines the identity to be used for authZ of the request on the server side. See one pager for
 * for more information: http://go/acl/service-identity
 */
@Generated
public enum RequestAuthzIdentity {
  REQUEST_AUTHZ_IDENTITY_SERVICE_IDENTITY,
  REQUEST_AUTHZ_IDENTITY_USER_CONTEXT,
}
