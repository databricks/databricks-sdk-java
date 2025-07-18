// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * External Metadata objects enable customers to register and manage metadata about external systems
 * within Unity Catalog.
 *
 * <p>These APIs provide a standardized way to create, update, retrieve, list, and delete external
 * metadata objects. Fine-grained authorization ensures that only users with appropriate permissions
 * can view and manage external metadata objects.
 */
@Generated
public class ExternalMetadataAPI {
  private static final Logger LOG = LoggerFactory.getLogger(ExternalMetadataAPI.class);

  private final ExternalMetadataService impl;

  /** Regular-use constructor */
  public ExternalMetadataAPI(ApiClient apiClient) {
    impl = new ExternalMetadataImpl(apiClient);
  }

  /** Constructor for mocks */
  public ExternalMetadataAPI(ExternalMetadataService mock) {
    impl = mock;
  }

  /**
   * Creates a new external metadata object in the parent metastore if the caller is a metastore
   * admin or has the **CREATE_EXTERNAL_METADATA** privilege. Grants **BROWSE** to all account users
   * upon creation by default.
   */
  public ExternalMetadata createExternalMetadata(CreateExternalMetadataRequest request) {
    return impl.createExternalMetadata(request);
  }

  public void deleteExternalMetadata(String name) {
    deleteExternalMetadata(new DeleteExternalMetadataRequest().setName(name));
  }

  /**
   * Deletes the external metadata object that matches the supplied name. The caller must be a
   * metastore admin, the owner of the external metadata object, or a user that has the **MANAGE**
   * privilege.
   */
  public void deleteExternalMetadata(DeleteExternalMetadataRequest request) {
    impl.deleteExternalMetadata(request);
  }

  public ExternalMetadata getExternalMetadata(String name) {
    return getExternalMetadata(new GetExternalMetadataRequest().setName(name));
  }

  /**
   * Gets the specified external metadata object in a metastore. The caller must be a metastore
   * admin, the owner of the external metadata object, or a user that has the **BROWSE** privilege.
   */
  public ExternalMetadata getExternalMetadata(GetExternalMetadataRequest request) {
    return impl.getExternalMetadata(request);
  }

  /**
   * Gets an array of external metadata objects in the metastore. If the caller is the metastore
   * admin, all external metadata objects will be retrieved. Otherwise, only external metadata
   * objects that the caller has **BROWSE** on will be retrieved. There is no guarantee of a
   * specific ordering of the elements in the array.
   */
  public Iterable<ExternalMetadata> listExternalMetadata(ListExternalMetadataRequest request) {
    return new Paginator<>(
        request,
        impl::listExternalMetadata,
        ListExternalMetadataResponse::getExternalMetadata,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Updates the external metadata object that matches the supplied name. The caller can only update
   * either the owner or other metadata fields in one request. The caller must be a metastore admin,
   * the owner of the external metadata object, or a user that has the **MODIFY** privilege. If the
   * caller is updating the owner, they must also have the **MANAGE** privilege.
   */
  public ExternalMetadata updateExternalMetadata(UpdateExternalMetadataRequest request) {
    return impl.updateExternalMetadata(request);
  }

  public ExternalMetadataService impl() {
    return impl;
  }
}
