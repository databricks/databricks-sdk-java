// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A clean room uses Delta Sharing and serverless compute to provide a secure and privacy-protecting
 * environment where multiple parties can work together on sensitive enterprise data without direct
 * access to each other’s data.
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

  public CleanRoom create(CleanRoom cleanRoom) {
    return create(new CreateCleanRoomRequest().setCleanRoom(cleanRoom));
  }

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
  public CleanRoom create(CreateCleanRoomRequest request) {
    return impl.create(request);
  }

  public CreateCleanRoomOutputCatalogResponse createOutputCatalog(
      String cleanRoomName, CleanRoomOutputCatalog outputCatalog) {
    return createOutputCatalog(
        new CreateCleanRoomOutputCatalogRequest()
            .setCleanRoomName(cleanRoomName)
            .setOutputCatalog(outputCatalog));
  }

  /**
   * Create an output catalog.
   *
   * <p>Create the output catalog of the clean room.
   */
  public CreateCleanRoomOutputCatalogResponse createOutputCatalog(
      CreateCleanRoomOutputCatalogRequest request) {
    return impl.createOutputCatalog(request);
  }

  public void delete(String name) {
    delete(new DeleteCleanRoomRequest().setName(name));
  }

  /**
   * Delete a clean room.
   *
   * <p>Delete a clean room. After deletion, the clean room will be removed from the metastore. If
   * the other collaborators have not deleted the clean room, they will still have the clean room in
   * their metastore, but it will be in a DELETED state and no operations other than deletion can be
   * performed on it.
   */
  public void delete(DeleteCleanRoomRequest request) {
    impl.delete(request);
  }

  public CleanRoom get(String name) {
    return get(new GetCleanRoomRequest().setName(name));
  }

  /**
   * Get a clean room.
   *
   * <p>Get the details of a clean room given its name.
   */
  public CleanRoom get(GetCleanRoomRequest request) {
    return impl.get(request);
  }

  /**
   * List clean rooms.
   *
   * <p>Get a list of all clean rooms of the metastore. Only clean rooms the caller has access to
   * are returned.
   */
  public Iterable<CleanRoom> list(ListCleanRoomsRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListCleanRoomsResponse::getCleanRooms,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public CleanRoom update(String name) {
    return update(new UpdateCleanRoomRequest().setName(name));
  }

  /**
   * Update a clean room.
   *
   * <p>Update a clean room. The caller must be the owner of the clean room, have
   * **MODIFY_CLEAN_ROOM** privilege, or be metastore admin.
   *
   * <p>When the caller is a metastore admin, only the __owner__ field can be updated.
   */
  public CleanRoom update(UpdateCleanRoomRequest request) {
    return impl.update(request);
  }

  public CleanRoomsService impl() {
    return impl;
  }
}
