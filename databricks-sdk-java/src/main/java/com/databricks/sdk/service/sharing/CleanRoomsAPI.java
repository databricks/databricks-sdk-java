// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sharing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A clean room is a secure, privacy-protecting environment where two or more parties can share
 * sensitive enterprise data, including customer data, for measurements, insights, activation and
 * other use cases.
 *
 * <p>To create clean rooms, you must be a metastore admin or a user with the **CREATE_CLEAN_ROOM**
 * privilege.
 */
@Generated
public class CleanRoomsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(CleanRoomsAPI.class);

  private final CleanRoomsService impl;

  /** Regular-use constructor */
  public CleanRoomsAPI(ApiClient apiClient) {
    impl = new CleanRoomsImpl(apiClient);
  }

  /** Constructor for mocks */
  public CleanRoomsAPI(CleanRoomsService mock) {
    impl = mock;
  }

  public CleanRoomInfo create(String name, CentralCleanRoomInfo remoteDetailedInfo) {
    return create(new CreateCleanRoom().setName(name).setRemoteDetailedInfo(remoteDetailedInfo));
  }

  /**
   * Create a clean room.
   *
   * <p>Creates a new clean room with specified colaborators. The caller must be a metastore admin
   * or have the **CREATE_CLEAN_ROOM** privilege on the metastore.
   */
  public CleanRoomInfo create(CreateCleanRoom request) {
    return impl.create(request);
  }

  public void delete(String nameArg) {
    delete(new DeleteCleanRoomRequest().setNameArg(nameArg));
  }

  /**
   * Delete a clean room.
   *
   * <p>Deletes a data object clean room from the metastore. The caller must be an owner of the
   * clean room.
   */
  public void delete(DeleteCleanRoomRequest request) {
    impl.delete(request);
  }

  public CleanRoomInfo get(String nameArg) {
    return get(new GetCleanRoomRequest().setNameArg(nameArg));
  }

  /**
   * Get a clean room.
   *
   * <p>Gets a data object clean room from the metastore. The caller must be a metastore admin or
   * the owner of the clean room.
   */
  public CleanRoomInfo get(GetCleanRoomRequest request) {
    return impl.get(request);
  }

  /**
   * List clean rooms.
   *
   * <p>Gets an array of data object clean rooms from the metastore. The caller must be a metastore
   * admin or the owner of the clean room. There is no guarantee of a specific ordering of the
   * elements in the array.
   */
  public Iterable<CleanRoomInfo> list(ListCleanRoomsRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListCleanRoomsResponse::getCleanRooms,
        response -> {
          String token = response.getNextPageToken();
          if (token == null) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public CleanRoomInfo update(String nameArg) {
    return update(new UpdateCleanRoom().setNameArg(nameArg));
  }

  /**
   * Update a clean room.
   *
   * <p>Updates the clean room with the changes and data objects in the request. The caller must be
   * the owner of the clean room or a metastore admin.
   *
   * <p>When the caller is a metastore admin, only the __owner__ field can be updated.
   *
   * <p>In the case that the clean room name is changed **updateCleanRoom** requires that the caller
   * is both the clean room owner and a metastore admin.
   *
   * <p>For each table that is added through this method, the clean room owner must also have
   * **SELECT** privilege on the table. The privilege must be maintained indefinitely for recipients
   * to be able to access the table. Typically, you should use a group as the clean room owner.
   *
   * <p>Table removals through **update** do not require additional privileges.
   */
  public CleanRoomInfo update(UpdateCleanRoom request) {
    return impl.update(request);
  }

  public CleanRoomsService impl() {
    return impl;
  }
}
