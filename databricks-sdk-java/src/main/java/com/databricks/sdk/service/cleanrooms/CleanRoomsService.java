// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;

/**
 * A clean room uses Delta Sharing and serverless compute to provide a secure and privacy-protecting
 * environment where multiple parties can work together on sensitive enterprise data without direct
 * access to each other’s data.
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
   * <p>Create a new clean room with the specified collaborators. This method is asynchronous; the
   * returned name field inside the clean_room field can be used to poll the clean room status,
   * using the :method:cleanrooms/get method. When this method returns, the clean room will be in a
   * PROVISIONING state, with only name, owner, comment, created_at and status populated. The clean
   * room will be usable once it enters an ACTIVE state.
   *
   * <p>The caller must be a metastore admin or have the **CREATE_CLEAN_ROOM** privilege on the
   * metastore.
   */
  CleanRoom create(CreateCleanRoomRequest createCleanRoomRequest);

  /**
   * Create an output catalog.
   *
   * <p>Create the output catalog of the clean room.
   */
  CreateCleanRoomOutputCatalogResponse createOutputCatalog(
      CreateCleanRoomOutputCatalogRequest createCleanRoomOutputCatalogRequest);

  /**
   * Delete a clean room.
   *
   * <p>Delete a clean room. After deletion, the clean room will be removed from the metastore. If
   * the other collaborators have not deleted the clean room, they will still have the clean room in
   * their metastore, but it will be in a DELETED state and no operations other than deletion can be
   * performed on it.
   */
  void delete(DeleteCleanRoomRequest deleteCleanRoomRequest);

  /**
   * Get a clean room.
   *
   * <p>Get the details of a clean room given its name.
   */
  CleanRoom get(GetCleanRoomRequest getCleanRoomRequest);

  /**
   * List clean rooms.
   *
   * <p>Get a list of all clean rooms of the metastore. Only clean rooms the caller has access to
   * are returned.
   */
  ListCleanRoomsResponse list(ListCleanRoomsRequest listCleanRoomsRequest);

  /**
   * Update a clean room.
   *
   * <p>Update a clean room. The caller must be the owner of the clean room, have
   * **MODIFY_CLEAN_ROOM** privilege, or be metastore admin.
   *
   * <p>When the caller is a metastore admin, only the __owner__ field can be updated.
   */
  CleanRoom update(UpdateCleanRoomRequest updateCleanRoomRequest);
}
