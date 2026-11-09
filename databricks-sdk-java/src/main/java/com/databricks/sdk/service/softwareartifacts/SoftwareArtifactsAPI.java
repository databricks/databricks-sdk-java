// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.softwareartifacts;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

/** Manage software artifacts and their versions in Unity Catalog. */
@Generated
public class SoftwareArtifactsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(SoftwareArtifactsAPI.class);

  private final SoftwareArtifactsService impl;

  /** Regular-use constructor */
  public SoftwareArtifactsAPI(ApiClient apiClient) {
    impl = new SoftwareArtifactsImpl(apiClient);
  }

  /** Constructor for mocks */
  public SoftwareArtifactsAPI(SoftwareArtifactsService mock) {
    impl = mock;
  }

  public SoftwareArtifact getSoftwareArtifact(String name) {
    return getSoftwareArtifact(new GetSoftwareArtifactRequest().setName(name));
  }

  /** Gets a software artifact. */
  public SoftwareArtifact getSoftwareArtifact(GetSoftwareArtifactRequest request) {
    return impl.getSoftwareArtifact(request);
  }

  public SoftwareArtifactVersion getSoftwareArtifactVersion(String name) {
    return getSoftwareArtifactVersion(new GetSoftwareArtifactVersionRequest().setName(name));
  }

  /** Gets a software artifact version. */
  public SoftwareArtifactVersion getSoftwareArtifactVersion(
      GetSoftwareArtifactVersionRequest request) {
    return impl.getSoftwareArtifactVersion(request);
  }

  public Iterable<SoftwareArtifactVersion> listSoftwareArtifactVersions(String parent) {
    return listSoftwareArtifactVersions(
        new ListSoftwareArtifactVersionsRequest().setParent(parent));
  }

  /** Lists the versions of a software artifact. */
  public Iterable<SoftwareArtifactVersion> listSoftwareArtifactVersions(
      ListSoftwareArtifactVersionsRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listSoftwareArtifactVersions,
        ListSoftwareArtifactVersionsResponse::getSoftwareArtifactVersions,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<SoftwareArtifact> listSoftwareArtifacts(String parent) {
    return listSoftwareArtifacts(new ListSoftwareArtifactsRequest().setParent(parent));
  }

  /** Lists software artifacts in a schema. */
  public Iterable<SoftwareArtifact> listSoftwareArtifacts(ListSoftwareArtifactsRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listSoftwareArtifacts,
        ListSoftwareArtifactsResponse::getSoftwareArtifacts,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /** Resolves a software artifact version from its tag alias. */
  public ResolveSoftwareArtifactVersionResponse resolveSoftwareArtifactVersion(
      ResolveSoftwareArtifactVersionRequest request) {
    return impl.resolveSoftwareArtifactVersion(request);
  }

  /**
   * Updates a software artifact. The name is immutable; only the owner may be changed. The
   * destination owner must exist in the account. The caller needs MANAGE_ACCESS_CONTROL on the
   * artifact. The response contains its name and the requested owner; audit fields are omitted.
   */
  public SoftwareArtifact updateSoftwareArtifact(UpdateSoftwareArtifactRequest request) {
    return impl.updateSoftwareArtifact(request);
  }

  public SoftwareArtifactsService impl() {
    return impl;
  }
}
