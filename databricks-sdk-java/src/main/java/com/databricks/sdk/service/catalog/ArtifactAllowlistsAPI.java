// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.Collection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * In Databricks Runtime 13.3 and above, you can add libraries and init scripts to the `allowlist`
 * in UC so that users can leverage these artifacts on compute configured with shared access mode.
 */
@Generated
public class ArtifactAllowlistsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(ArtifactAllowlistsAPI.class);

  private final ArtifactAllowlistsService impl;

  /** Regular-use constructor */
  public ArtifactAllowlistsAPI(ApiClient apiClient) {
    impl = new ArtifactAllowlistsImpl(apiClient);
  }

  /** Constructor for mocks */
  public ArtifactAllowlistsAPI(ArtifactAllowlistsService mock) {
    impl = mock;
  }

  public ArtifactAllowlistInfo get(ArtifactType artifactType) {
    return get(new GetArtifactAllowlistRequest().setArtifactType(artifactType));
  }

  /**
   * Get an artifact allowlist.
   *
   * <p>Get the artifact allowlist of a certain artifact type. The caller must be a metastore admin
   * or have the **MANAGE ALLOWLIST** privilege on the metastore.
   */
  public ArtifactAllowlistInfo get(GetArtifactAllowlistRequest request) {
    return impl.get(request);
  }

  public ArtifactAllowlistInfo update(
      ArtifactType artifactType, Collection<ArtifactMatcher> artifactMatchers) {
    return update(
        new SetArtifactAllowlist()
            .setArtifactType(artifactType)
            .setArtifactMatchers(artifactMatchers));
  }

  /**
   * Set an artifact allowlist.
   *
   * <p>Set the artifact allowlist of a certain artifact type. The whole artifact allowlist is
   * replaced with the new allowlist. The caller must be a metastore admin or have the **MANAGE
   * ALLOWLIST** privilege on the metastore.
   */
  public ArtifactAllowlistInfo update(SetArtifactAllowlist request) {
    return impl.update(request);
  }

  public ArtifactAllowlistsService impl() {
    return impl;
  }
}
