// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.httpcallv2;

import com.databricks.sdk.support.Generated;

/**
 * Lorem Ipsum
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface HttpCallV2Service {
  /** This mimics "old" style post requests which have the resource inlined. */
  Resource createResource(CreateResourceRequest createResourceRequest);

  Resource getResource(GetResourceRequest getResourceRequest);

  /** This mimics "new" style post requests which have a body field. */
  Resource updateResource(UpdateResourceRequest updateResourceRequest);
}
