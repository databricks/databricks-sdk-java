// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;

/**
 * A clean room is a secure, privacy-protecting environment where two or more parties can share
 * sensitive enterprise data, including customer data, for measurements, insights, activation and
 * other use cases.
 *
 * <p>To create clean rooms, you must be a metastore admin or a user with the **CREATE_CLEAN_ROOM**
 * privilege.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface CleanRoomsService {
  /**
   * Create a clean room.
   *
   * <p>Creates a new clean room with specified colaborators. The caller must be a metastore admin
   * or have the **CREATE_CLEAN_ROOM** privilege on the metastore.
   */
  CleanRoomInfo create(CreateCleanRoom createCleanRoom);

  /**
   * Delete a clean room.
   *
   * <p>Deletes a data object clean room from the metastore. The caller must be an owner of the
   * clean room.
   */
  void delete(DeleteCleanRoomRequest deleteCleanRoomRequest);

  /**
   * Get a clean room.
   *
   * <p>Gets a data object clean room from the metastore. The caller must be a metastore admin or
   * the owner of the clean room.
   */
  CleanRoomInfo get(GetCleanRoomRequest getCleanRoomRequest);

  /**
   * List clean rooms.
   *
   * <p>Gets an array of data object clean rooms from the metastore. The caller must be a metastore
   * admin or the owner of the clean room. There is no guarantee of a specific ordering of the
   * elements in the array.
   */
  ListCleanRoomsResponse list(ListCleanRoomsRequest listCleanRoomsRequest);

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
  CleanRoomInfo update(UpdateCleanRoom updateCleanRoom);
}
