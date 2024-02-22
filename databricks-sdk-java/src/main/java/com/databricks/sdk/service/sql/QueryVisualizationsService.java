// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;

/**
 * This is an evolving API that facilitates the addition and removal of vizualisations from existing
 * queries within the Databricks Workspace. Data structures may change over time.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface QueryVisualizationsService {
  /** Add visualization to a query. */
  Visualization create(CreateQueryVisualizationRequest createQueryVisualizationRequest);

  /** Remove visualization. */
  DeleteResponse delete(DeleteQueryVisualizationRequest deleteQueryVisualizationRequest);

  /** Edit existing visualization. */
  Visualization update(Visualization visualization);
}
