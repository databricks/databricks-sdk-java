// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** // TODO(yuyuan.tang) to add the description for the setting */
@Generated
public class SettingsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(SettingsAPI.class);

  private final SettingsService impl;

  /** Regular-use constructor */
  public SettingsAPI(ApiClient apiClient) {
    impl = new SettingsImpl(apiClient);
  }

  /** Constructor for mocks */
  public SettingsAPI(SettingsService mock) {
    impl = mock;
  }

  public DeleteDefaultWorkspaceNamespaceResponse deleteDefaultWorkspaceNamespace(String etag) {
    return deleteDefaultWorkspaceNamespace(
        new DeleteDefaultWorkspaceNamespaceRequest().setEtag(etag));
  }

  /**
   * Delete the default namespace.
   *
   * <p>Deletes the default namespace.
   */
  public DeleteDefaultWorkspaceNamespaceResponse deleteDefaultWorkspaceNamespace(
      DeleteDefaultWorkspaceNamespaceRequest request) {
    return impl.deleteDefaultWorkspaceNamespace(request);
  }

  public DefaultNamespaceSetting readDefaultWorkspaceNamespace(String etag) {
    return readDefaultWorkspaceNamespace(new ReadDefaultWorkspaceNamespaceRequest().setEtag(etag));
  }

  /**
   * Get the default namespace.
   *
   * <p>Gets the default namespace.
   */
  public DefaultNamespaceSetting readDefaultWorkspaceNamespace(
      ReadDefaultWorkspaceNamespaceRequest request) {
    return impl.readDefaultWorkspaceNamespace(request);
  }

  /**
   * Updates the default namespace setting.
   *
   * <p>Updates the default namespace setting for the workspace. A fresh etag needs to be provided
   * in PATCH requests (as part the setting field). The etag can be retrieved by making a GET
   * request before the PATCH request. Note that if the setting does not exist, GET will return a
   * NOT_FOUND error and the etag will be present in the error response, which should be set in the
   * PATCH request.
   */
  public DefaultNamespaceSetting updateDefaultWorkspaceNamespace(
      UpdateDefaultWorkspaceNamespaceRequest request) {
    return impl.updateDefaultWorkspaceNamespace(request);
  }

  public SettingsService impl() {
    return impl;
  }
}
