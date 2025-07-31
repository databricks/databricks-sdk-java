// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import com.databricks.sdk.support.Wait;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A clean room uses Delta Sharing and serverless compute to provide a secure and privacy-protecting
 * environment where multiple parties can work together on sensitive enterprise data without direct
 * access to each other's data.
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

  public CleanRoom waitGetCleanRoomActive(String name) throws TimeoutException {
    return waitGetCleanRoomActive(name, Duration.ofMinutes(20), null);
  }

  public CleanRoom waitGetCleanRoomActive(
      String name, Duration timeout, Consumer<CleanRoom> callback) throws TimeoutException {
    long deadline = System.currentTimeMillis() + timeout.toMillis();
    java.util.List<CleanRoomStatusEnum> targetStates = Arrays.asList(CleanRoomStatusEnum.ACTIVE);
    String statusMessage = "polling...";
    int attempt = 1;
    while (System.currentTimeMillis() < deadline) {
      CleanRoom poll = get(new GetCleanRoomRequest().setName(name));
      CleanRoomStatusEnum status = poll.getStatus();
      statusMessage = String.format("current status: %s", status);
      if (targetStates.contains(status)) {
        return poll;
      }
      if (callback != null) {
        callback.accept(poll);
      }
      String prefix = String.format("name=%s", name);
      int sleep = attempt;
      if (sleep > 10) {
        // sleep 10s max per attempt
        sleep = 10;
      }
      LOG.info("{}: ({}) {} (sleeping ~{}s)", prefix, status, statusMessage, sleep);
      try {
        Thread.sleep((long) (sleep * 1000L + Math.random() * 1000));
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        throw new DatabricksException("Current thread was interrupted", e);
      }
      attempt++;
    }
    throw new TimeoutException(String.format("timed out after %s: %s", timeout, statusMessage));
  }

  /**
   * Create a new clean room with the specified collaborators. This method is asynchronous; the
   * returned name field inside the clean_room field can be used to poll the clean room status,
   * using the :method:cleanrooms/get method. When this method returns, the clean room will be in a
   * PROVISIONING state, with only name, owner, comment, created_at and status populated. The clean
   * room will be usable once it enters an ACTIVE state.
   *
   * <p>The caller must be a metastore admin or have the **CREATE_CLEAN_ROOM** privilege on the
   * metastore.
   */
  public Wait<CleanRoom, CleanRoom> create(CreateCleanRoomRequest request) {
    CleanRoom response = impl.create(request);
    return new Wait<>(
        (timeout, callback) -> waitGetCleanRoomActive(response.getName(), timeout, callback),
        response);
  }

  /** Create the output catalog of the clean room. */
  public CreateCleanRoomOutputCatalogResponse createOutputCatalog(
      CreateCleanRoomOutputCatalogRequest request) {
    return impl.createOutputCatalog(request);
  }

  public void delete(String name) {
    delete(new DeleteCleanRoomRequest().setName(name));
  }

  /**
   * Delete a clean room. After deletion, the clean room will be removed from the metastore. If the
   * other collaborators have not deleted the clean room, they will still have the clean room in
   * their metastore, but it will be in a DELETED state and no operations other than deletion can be
   * performed on it.
   */
  public void delete(DeleteCleanRoomRequest request) {
    impl.delete(request);
  }

  public CleanRoom get(String name) {
    return get(new GetCleanRoomRequest().setName(name));
  }

  /** Get the details of a clean room given its name. */
  public CleanRoom get(GetCleanRoomRequest request) {
    return impl.get(request);
  }

  /**
   * Get a list of all clean rooms of the metastore. Only clean rooms the caller has access to are
   * returned.
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

  /**
   * Update a clean room. The caller must be the owner of the clean room, have **MODIFY_CLEAN_ROOM**
   * privilege, or be metastore admin.
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
