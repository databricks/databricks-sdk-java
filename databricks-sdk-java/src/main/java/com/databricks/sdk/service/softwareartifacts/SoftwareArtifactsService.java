// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.softwareartifacts;

import com.databricks.sdk.support.Generated;

/**
 * Manage software artifacts and their versions in Unity Catalog.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface SoftwareArtifactsService {
  /** Gets a software artifact. */
  SoftwareArtifact getSoftwareArtifact(GetSoftwareArtifactRequest getSoftwareArtifactRequest);

  /** Gets a software artifact version. */
  SoftwareArtifactVersion getSoftwareArtifactVersion(
      GetSoftwareArtifactVersionRequest getSoftwareArtifactVersionRequest);

  /** Lists the versions of a software artifact. */
  ListSoftwareArtifactVersionsResponse listSoftwareArtifactVersions(
      ListSoftwareArtifactVersionsRequest listSoftwareArtifactVersionsRequest);

  /** Lists software artifacts in a schema. */
  ListSoftwareArtifactsResponse listSoftwareArtifacts(
      ListSoftwareArtifactsRequest listSoftwareArtifactsRequest);

  /** Resolves a software artifact version from its tag alias. */
  ResolveSoftwareArtifactVersionResponse resolveSoftwareArtifactVersion(
      ResolveSoftwareArtifactVersionRequest resolveSoftwareArtifactVersionRequest);

  /**
   * Updates a software artifact. The name is immutable; only the owner may be changed. The
   * destination owner must exist in the account. The caller needs MANAGE_ACCESS_CONTROL on the
   * artifact. The response contains its name and the requested owner; audit fields are omitted.
   */
  SoftwareArtifact updateSoftwareArtifact(
      UpdateSoftwareArtifactRequest updateSoftwareArtifactRequest);
}
