// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The notification destinations API lets you programmatically manage a workspace's notification
 * destinations. Notification destinations are used to send notifications for query alerts and jobs
 * to destinations outside of Databricks. Only workspace admins can create, update, and delete
 * notification destinations.
 */
@Generated
public class NotificationDestinationsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(NotificationDestinationsAPI.class);

  private final NotificationDestinationsService impl;

  /** Regular-use constructor */
  public NotificationDestinationsAPI(ApiClient apiClient) {
    impl = new NotificationDestinationsImpl(apiClient);
  }

  /** Constructor for mocks */
  public NotificationDestinationsAPI(NotificationDestinationsService mock) {
    impl = mock;
  }

  /**
   * Create a notification destination.
   *
   * <p>Creates a notification destination. Requires workspace admin permissions.
   */
  public NotificationDestination create(CreateNotificationDestinationRequest request) {
    return impl.create(request);
  }

  public void delete(String id) {
    delete(new DeleteNotificationDestinationRequest().setId(id));
  }

  /**
   * Delete a notification destination.
   *
   * <p>Deletes a notification destination. Requires workspace admin permissions.
   */
  public void delete(DeleteNotificationDestinationRequest request) {
    impl.delete(request);
  }

  public NotificationDestination get(String id) {
    return get(new GetNotificationDestinationRequest().setId(id));
  }

  /**
   * Get a notification destination.
   *
   * <p>Gets a notification destination.
   */
  public NotificationDestination get(GetNotificationDestinationRequest request) {
    return impl.get(request);
  }

  /**
   * List notification destinations.
   *
   * <p>Lists notification destinations.
   */
  public Iterable<ListNotificationDestinationsResult> list(
      ListNotificationDestinationsRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListNotificationDestinationsResponse::getResults,
        response -> {
          String token = response.getNextPageToken();
          if (token == null) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public NotificationDestination update(String id) {
    return update(new UpdateNotificationDestinationRequest().setId(id));
  }

  /**
   * Update a notification destination.
   *
   * <p>Updates a notification destination. Requires workspace admin permissions. At least one field
   * is required in the request body.
   */
  public NotificationDestination update(UpdateNotificationDestinationRequest request) {
    return impl.update(request);
  }

  public NotificationDestinationsService impl() {
    return impl;
  }
}
