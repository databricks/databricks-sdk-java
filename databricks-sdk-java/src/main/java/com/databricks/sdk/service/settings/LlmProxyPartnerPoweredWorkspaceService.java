// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * Determines if partner powered models are enabled or not for a specific workspace
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface LlmProxyPartnerPoweredWorkspaceService {
  /** Reverts the enable partner powered AI features workspace setting to its default value. */
  DeleteLlmProxyPartnerPoweredWorkspaceResponse delete(
      DeleteLlmProxyPartnerPoweredWorkspaceRequest deleteLlmProxyPartnerPoweredWorkspaceRequest);

  /** Gets the enable partner powered AI features workspace setting. */
  LlmProxyPartnerPoweredWorkspace get(
      GetLlmProxyPartnerPoweredWorkspaceRequest getLlmProxyPartnerPoweredWorkspaceRequest);

  /** Updates the enable partner powered AI features workspace setting. */
  LlmProxyPartnerPoweredWorkspace update(
      UpdateLlmProxyPartnerPoweredWorkspaceRequest updateLlmProxyPartnerPoweredWorkspaceRequest);
}
