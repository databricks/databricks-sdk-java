// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/**
 * In Databricks Runtime 13.3 and above, you can add libraries and init scripts to the `allowlist`
 * in UC so that users can leverage these artifacts on compute configured with shared access mode.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface ArtifactAllowlistsService {
  /**
   * Get an artifact allowlist.
   *
   * <p>Get the artifact allowlist of a certain artifact type. The caller must be a metastore admin
   * or have the **MANAGE ALLOWLIST** privilege on the metastore.
   */
  ArtifactAllowlistInfo get(GetArtifactAllowlistRequest getArtifactAllowlistRequest);

  /**
   * Set an artifact allowlist.
   *
   * <p>Set the artifact allowlist of a certain artifact type. The whole artifact allowlist is
   * replaced with the new allowlist. The caller must be a metastore admin or have the **MANAGE
   * ALLOWLIST** privilege on the metastore.
   */
  ArtifactAllowlistInfo update(SetArtifactAllowlist setArtifactAllowlist);
}
