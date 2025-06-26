// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.qualitymonitorv2;

import com.databricks.sdk.support.Generated;

/**
 * Manage data quality of UC objects (currently support `schema`)
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface QualityMonitorV2Service {
  /** Create a quality monitor on UC object */
  QualityMonitor createQualityMonitor(CreateQualityMonitorRequest createQualityMonitorRequest);

  /** Delete a quality monitor on UC object */
  void deleteQualityMonitor(DeleteQualityMonitorRequest deleteQualityMonitorRequest);

  /** Read a quality monitor on UC object */
  QualityMonitor getQualityMonitor(GetQualityMonitorRequest getQualityMonitorRequest);

  /** (Unimplemented) List quality monitors */
  ListQualityMonitorResponse listQualityMonitor(
      ListQualityMonitorRequest listQualityMonitorRequest);

  /** (Unimplemented) Update a quality monitor on UC object */
  QualityMonitor updateQualityMonitor(UpdateQualityMonitorRequest updateQualityMonitorRequest);
}
