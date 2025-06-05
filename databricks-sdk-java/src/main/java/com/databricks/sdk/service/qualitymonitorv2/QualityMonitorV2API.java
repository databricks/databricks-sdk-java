// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.qualitymonitorv2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Manage data quality of UC objects (currently support `schema`) */
@Generated
public class QualityMonitorV2API {
  private static final Logger LOG = LoggerFactory.getLogger(QualityMonitorV2API.class);

  private final QualityMonitorV2Service impl;

  /** Regular-use constructor */
  public QualityMonitorV2API(ApiClient apiClient) {
    impl = new QualityMonitorV2Impl(apiClient);
  }

  /** Constructor for mocks */
  public QualityMonitorV2API(QualityMonitorV2Service mock) {
    impl = mock;
  }

  public QualityMonitor createQualityMonitor(QualityMonitor qualityMonitor) {
    return createQualityMonitor(
        new CreateQualityMonitorRequest().setQualityMonitor(qualityMonitor));
  }

  /**
   * Create a quality monitor.
   *
   * <p>Create a quality monitor on UC object
   */
  public QualityMonitor createQualityMonitor(CreateQualityMonitorRequest request) {
    return impl.createQualityMonitor(request);
  }

  public void deleteQualityMonitor(String objectType, String objectId) {
    deleteQualityMonitor(
        new DeleteQualityMonitorRequest().setObjectType(objectType).setObjectId(objectId));
  }

  /**
   * Delete a quality monitor.
   *
   * <p>Delete a quality monitor on UC object
   */
  public void deleteQualityMonitor(DeleteQualityMonitorRequest request) {
    impl.deleteQualityMonitor(request);
  }

  public QualityMonitor getQualityMonitor(String objectType, String objectId) {
    return getQualityMonitor(
        new GetQualityMonitorRequest().setObjectType(objectType).setObjectId(objectId));
  }

  /**
   * Read a quality monitor.
   *
   * <p>Read a quality monitor on UC object
   */
  public QualityMonitor getQualityMonitor(GetQualityMonitorRequest request) {
    return impl.getQualityMonitor(request);
  }

  /**
   * List quality monitors.
   *
   * <p>(Unimplemented) List quality monitors
   */
  public Iterable<QualityMonitor> listQualityMonitor(ListQualityMonitorRequest request) {
    return new Paginator<>(
        request,
        impl::listQualityMonitor,
        ListQualityMonitorResponse::getQualityMonitors,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public QualityMonitor updateQualityMonitor(
      String objectType, String objectId, QualityMonitor qualityMonitor) {
    return updateQualityMonitor(
        new UpdateQualityMonitorRequest()
            .setObjectType(objectType)
            .setObjectId(objectId)
            .setQualityMonitor(qualityMonitor));
  }

  /**
   * Update a quality monitor.
   *
   * <p>(Unimplemented) Update a quality monitor on UC object
   */
  public QualityMonitor updateQualityMonitor(UpdateQualityMonitorRequest request) {
    return impl.updateQualityMonitor(request);
  }

  public QualityMonitorV2Service impl() {
    return impl;
  }
}
