// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.agentkit;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

/**
 * APIs for managing agent memory and durable session state. This interface is under active
 * development and may change.
 */
@Generated
public class AgentKitAPI {
  private static final Logger LOG = LoggerFactory.getLogger(AgentKitAPI.class);

  private final AgentKitService impl;

  /** Regular-use constructor */
  public AgentKitAPI(ApiClient apiClient) {
    impl = new AgentKitImpl(apiClient);
  }

  /** Constructor for mocks */
  public AgentKitAPI(AgentKitService mock) {
    impl = mock;
  }

  /** Appends items to a session. */
  public AppendSessionItemsResponse appendSessionItems(AppendSessionItemsRequest request) {
    return impl.appendSessionItems(request);
  }

  /** Clears all items from a session. */
  public ClearSessionItemsResponse clearSessionItems(ClearSessionItemsRequest request) {
    return impl.clearSessionItems(request);
  }

  /**
   * Creates a managed memory entry using exclusive-create semantics. Callers may choose the entry
   * ID; the service generates one when it is omitted. Returns `ALREADY_EXISTS` when an entry with
   * the same actor, session, and path already exists. Omitted `session_id` is its own uniqueness
   * key: two omitted-session entries with the same actor and path conflict, but an omitted-session
   * entry does not conflict with a session-scoped entry at the same actor and path.
   */
  public ManagedMemoryEntry createMemory(CreateManagedMemoryEntryRequest request) {
    return impl.createMemory(request);
  }

  /** Creates a managed memory store in the caller's workspace. */
  public ManagedMemoryStore createMemoryStore(CreateManagedMemoryStoreRequest request) {
    return impl.createMemoryStore(request);
  }

  /** Creates a session within a session store. */
  public Session createSession(CreateSessionRequest request) {
    return impl.createSession(request);
  }

  /** Creates a session store. */
  public SessionStore createSessionStore(CreateSessionStoreRequest request) {
    return impl.createSessionStore(request);
  }

  public void deleteMemory(String name) {
    deleteMemory(new DeleteManagedMemoryEntryRequest().setName(name));
  }

  /**
   * Deletes a managed memory entry by resource name. Returns `NOT_FOUND` when the entry does not
   * exist in the caller's workspace.
   */
  public void deleteMemory(DeleteManagedMemoryEntryRequest request) {
    impl.deleteMemory(request);
  }

  public void deleteMemoryStore(String name) {
    deleteMemoryStore(new DeleteManagedMemoryStoreRequest().setName(name));
  }

  /**
   * Deletes a managed memory store by resource name. Returns `NOT_FOUND` when the store does not
   * exist in the caller's workspace.
   */
  public void deleteMemoryStore(DeleteManagedMemoryStoreRequest request) {
    impl.deleteMemoryStore(request);
  }

  public void deleteSession(String name) {
    deleteSession(new DeleteSessionRequest().setName(name));
  }

  /**
   * Deletes a session, its items, and any descendant sessions recursively. Independently retained
   * memory is not deleted.
   */
  public void deleteSession(DeleteSessionRequest request) {
    impl.deleteSession(request);
  }

  public void deleteSessionStore(String name) {
    deleteSessionStore(new DeleteSessionStoreRequest().setName(name));
  }

  /**
   * Deletes a session store, its sessions and items, and its service-managed storage. Memory
   * entries retained by a separate Memory Store are not deleted.
   */
  public void deleteSessionStore(DeleteSessionStoreRequest request) {
    impl.deleteSessionStore(request);
  }

  /**
   * Synchronously extracts memories from a single session into the given memory store, returning
   * the entries that were written.
   */
  public ExtractMemoriesResponse extractMemories(ExtractMemoriesRequest request) {
    return impl.extractMemories(request);
  }

  /** Forks a session into an independent top-level copy. */
  public ForkSessionResponse forkSession(ForkSessionRequest request) {
    return impl.forkSession(request);
  }

  public ManagedMemoryEntry getMemory(String name) {
    return getMemory(new GetManagedMemoryEntryRequest().setName(name));
  }

  /**
   * Retrieves a managed memory entry, including its content, by resource name. Returns `NOT_FOUND`
   * when the entry does not exist in the caller's workspace.
   */
  public ManagedMemoryEntry getMemory(GetManagedMemoryEntryRequest request) {
    return impl.getMemory(request);
  }

  public ManagedMemoryStore getMemoryStore(String name) {
    return getMemoryStore(new GetManagedMemoryStoreRequest().setName(name));
  }

  /**
   * Retrieves a managed memory store by resource name. Returns `NOT_FOUND` when the store does not
   * exist in the caller's workspace.
   */
  public ManagedMemoryStore getMemoryStore(GetManagedMemoryStoreRequest request) {
    return impl.getMemoryStore(request);
  }

  public Session getSession(String name) {
    return getSession(new GetSessionRequest().setName(name));
  }

  /** Gets a session by resource name. */
  public Session getSession(GetSessionRequest request) {
    return impl.getSession(request);
  }

  public SessionStore getSessionStore(String name) {
    return getSessionStore(new GetSessionStoreRequest().setName(name));
  }

  /** Gets a session store by resource name. */
  public SessionStore getSessionStore(GetSessionStoreRequest request) {
    return impl.getSessionStore(request);
  }

  public Iterable<ManagedMemoryEntry> listMemories(String parent, String actorId) {
    return listMemories(
        new ListManagedMemoryEntriesRequest().setParent(parent).setActorId(actorId));
  }

  /**
   * Lists managed memory entries for one actor. An exact `path` filters entries across sessions,
   * ignoring session metadata. Otherwise, `session_id` and `path_prefix` restrict the actor
   * partition. `read_mask` selects fields in each returned entry.
   */
  public Iterable<ManagedMemoryEntry> listMemories(ListManagedMemoryEntriesRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listMemories,
        ListManagedMemoryEntriesResponse::getManagedMemoryEntries,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /** Lists managed memory stores in the caller's workspace. */
  public Iterable<ManagedMemoryStore> listMemoryStores(ListManagedMemoryStoresRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listMemoryStores,
        ListManagedMemoryStoresResponse::getManagedMemoryStores,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<SessionItem> listSessionItems(String parent) {
    return listSessionItems(new ListSessionItemsRequest().setParent(parent));
  }

  /** Lists items in a session. */
  public Iterable<SessionItem> listSessionItems(ListSessionItemsRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listSessionItems,
        ListSessionItemsResponse::getSessionItems,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /** Lists session stores. */
  public Iterable<SessionStore> listSessionStores(ListSessionStoresRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listSessionStores,
        ListSessionStoresResponse::getSessionStores,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<Session> listSessions(String parent) {
    return listSessions(new ListSessionsRequest().setParent(parent));
  }

  /** Lists sessions within a session store. */
  public Iterable<Session> listSessions(ListSessionsRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listSessions,
        ListSessionsResponse::getSessions,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /** Pops the newest item from a session. */
  public PopSessionItemResponse popSessionItem(PopSessionItemRequest request) {
    return impl.popSessionItem(request);
  }

  /**
   * Searches managed memory entries by text query for one actor. Returns matching entries and
   * scores ranked by relevance; `read_mask` selects fields in each returned entry.
   */
  public Iterable<ManagedMemoryEntrySearchResult> searchMemories(
      SearchManagedMemoryEntriesRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::searchMemories,
        SearchManagedMemoryEntriesResponse::getResults,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /** Updates selected mutable fields on a managed memory entry. Identity fields are immutable. */
  public ManagedMemoryEntry updateMemory(UpdateManagedMemoryEntryRequest request) {
    return impl.updateMemory(request);
  }

  /** Updates a managed memory store's description. */
  public ManagedMemoryStore updateMemoryStore(UpdateManagedMemoryStoreRequest request) {
    return impl.updateMemoryStore(request);
  }

  /** Updates a session's mutable fields. */
  public Session updateSession(UpdateSessionRequest request) {
    return impl.updateSession(request);
  }

  /** Updates a session store's description and metadata. */
  public SessionStore updateSessionStore(UpdateSessionStoreRequest request) {
    return impl.updateSessionStore(request);
  }

  public AgentKitService impl() {
    return impl;
  }
}
