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
  /**
   * This mimics "old" style post requests which have the resource inlined.
   *
   * <p>Set the `path_param_string` value before calling. The _resource_ is sent as the request
   * **body**. See the [API overview] for details.
   *
   * <p>Supported body styles:
   *
   * <p>- [inline] - referenced
   *
   * <p>Resolution order:
   *
   * <p>1. inline body 2. referenced resource
   *
   * <p>[API overview]: https://docs.databricks.com/api [inline]:
   * https://docs.databricks.com/api/inline
   */
  Resource createResource(CreateResourceRequest createResourceRequest);

  Resource getResource(GetResourceRequest getResourceRequest);

  /**
   * This mimics "new" style post requests which have a body field.
   *
   * <p>> Prefer this over the inline form.
   */
  Resource updateResource(UpdateResourceRequest updateResourceRequest);
}
