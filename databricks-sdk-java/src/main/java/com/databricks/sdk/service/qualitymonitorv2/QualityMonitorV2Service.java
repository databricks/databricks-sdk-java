// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.qualitymonitorv2;

import com.databricks.sdk.support.Generated;

/**
 * Deprecated: Please use the Data Quality Monitoring API instead (REST:
 * /api/data-quality/v1/monitors). Manage data quality of UC objects (currently support `schema`).
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface QualityMonitorV2Service {
  /**
   * Deprecated: Use Data Quality Monitoring API instead (/api/data-quality/v1/monitors). Create a
   * quality monitor on UC object.
   */
  QualityMonitor createQualityMonitor(CreateQualityMonitorRequest createQualityMonitorRequest);

  /**
   * Deprecated: Use Data Quality Monitoring API instead (/api/data-quality/v1/monitors). Delete a
   * quality monitor on UC object.
   */
  void deleteQualityMonitor(DeleteQualityMonitorRequest deleteQualityMonitorRequest);

  /**
   * Deprecated: Use Data Quality Monitoring API instead (/api/data-quality/v1/monitors). Read a
   * quality monitor on UC object.
   */
  QualityMonitor getQualityMonitor(GetQualityMonitorRequest getQualityMonitorRequest);

  /**
   * Deprecated: Use Data Quality Monitoring API instead (/api/data-quality/v1/monitors).
   * (Unimplemented) List quality monitors.
   */
  ListQualityMonitorResponse listQualityMonitor(
      ListQualityMonitorRequest listQualityMonitorRequest);

  /**
   * Deprecated: Use Data Quality Monitoring API instead (/api/data-quality/v1/monitors).
   * (Unimplemented) Update a quality monitor on UC object.
   */
  QualityMonitor updateQualityMonitor(UpdateQualityMonitorRequest updateQualityMonitorRequest);
}
