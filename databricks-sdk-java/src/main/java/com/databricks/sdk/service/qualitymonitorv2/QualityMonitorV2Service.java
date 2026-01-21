// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.qualitymonitorv2;

import com.databricks.sdk.support.Generated;

/**
 * [DEPRECATED] This API is deprecated. Please use the Data Quality Monitoring API instead (REST:
 * /api/data-quality/v1/monitors). Manage data quality of UC objects (currently support `schema`).
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface QualityMonitorV2Service {
  /**
   * [DEPRECATED] Create a quality monitor on UC object. Use Data Quality Monitoring API instead.
   */
  QualityMonitor createQualityMonitor(CreateQualityMonitorRequest createQualityMonitorRequest);

  /**
   * [DEPRECATED] Delete a quality monitor on UC object. Use Data Quality Monitoring API instead.
   */
  void deleteQualityMonitor(DeleteQualityMonitorRequest deleteQualityMonitorRequest);

  /** [DEPRECATED] Read a quality monitor on UC object. Use Data Quality Monitoring API instead. */
  QualityMonitor getQualityMonitor(GetQualityMonitorRequest getQualityMonitorRequest);

  /**
   * [DEPRECATED] (Unimplemented) List quality monitors. Use Data Quality Monitoring API instead.
   */
  ListQualityMonitorResponse listQualityMonitor(
      ListQualityMonitorRequest listQualityMonitorRequest);

  /**
   * [DEPRECATED] (Unimplemented) Update a quality monitor on UC object. Use Data Quality Monitoring
   * API instead.
   */
  QualityMonitor updateQualityMonitor(UpdateQualityMonitorRequest updateQualityMonitorRequest);
}
