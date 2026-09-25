// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mason;

import com.databricks.sdk.support.Generated;

/**
 * APIs for managing agent memory and durable session state. This interface is under active
 * development and may change.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface MasonService {
  /** Appends items to a session. */
  AppendSessionItemsResponse appendSessionItems(
      AppendSessionItemsRequest appendSessionItemsRequest);

  /** Clears all items from a session. */
  ClearSessionItemsResponse clearSessionItems(ClearSessionItemsRequest clearSessionItemsRequest);

  /**
   * Creates a managed memory entry using exclusive-create semantics. Callers may choose the entry
   * ID; the service generates one when it is omitted. Returns `ALREADY_EXISTS` when an entry with
   * the same actor, session, and path already exists. Omitted `session_id` is its own uniqueness
   * key: two omitted-session entries with the same actor and path conflict, but an omitted-session
   * entry does not conflict with a session-scoped entry at the same actor and path.
   */
  ManagedMemoryEntry createMemory(CreateManagedMemoryEntryRequest createManagedMemoryEntryRequest);

  /** Creates a managed memory store in the caller's workspace. */
  ManagedMemoryStore createMemoryStore(
      CreateManagedMemoryStoreRequest createManagedMemoryStoreRequest);

  /** Creates a session within a session store. */
  Session createSession(CreateSessionRequest createSessionRequest);

  /** Creates a session store. */
  SessionStore createSessionStore(CreateSessionStoreRequest createSessionStoreRequest);

  /**
   * Deletes a managed memory entry by resource name. Returns `NOT_FOUND` when the entry does not
   * exist in the caller's workspace.
   */
  void deleteMemory(DeleteManagedMemoryEntryRequest deleteManagedMemoryEntryRequest);

  /**
   * Deletes a managed memory store by resource name. Returns `NOT_FOUND` when the store does not
   * exist in the caller's workspace.
   */
  void deleteMemoryStore(DeleteManagedMemoryStoreRequest deleteManagedMemoryStoreRequest);

  /**
   * Deletes a session, its items, and any descendant sessions recursively. Independently retained
   * memory is not deleted.
   */
  void deleteSession(DeleteSessionRequest deleteSessionRequest);

  /**
   * Deletes a session store, its sessions and items, and its service-managed storage. Memory
   * entries retained by a separate Memory Store are not deleted.
   */
  void deleteSessionStore(DeleteSessionStoreRequest deleteSessionStoreRequest);

  /**
   * Synchronously extracts memories from a single session into the given memory store, returning
   * the entries that were written.
   */
  ExtractMemoriesResponse extractMemories(ExtractMemoriesRequest extractMemoriesRequest);

  /** Forks a session into an independent top-level copy. */
  ForkSessionResponse forkSession(ForkSessionRequest forkSessionRequest);

  /**
   * Retrieves a managed memory entry, including its content, by resource name. Returns `NOT_FOUND`
   * when the entry does not exist in the caller's workspace.
   */
  ManagedMemoryEntry getMemory(GetManagedMemoryEntryRequest getManagedMemoryEntryRequest);

  /**
   * Retrieves a managed memory store by resource name. Returns `NOT_FOUND` when the store does not
   * exist in the caller's workspace.
   */
  ManagedMemoryStore getMemoryStore(GetManagedMemoryStoreRequest getManagedMemoryStoreRequest);

  /** Gets a session by resource name. */
  Session getSession(GetSessionRequest getSessionRequest);

  /** Gets a session store by resource name. */
  SessionStore getSessionStore(GetSessionStoreRequest getSessionStoreRequest);

  /**
   * Lists managed memory entries for one actor. An exact `path` filters entries across sessions,
   * ignoring session metadata. Otherwise, `session_id` and `path_prefix` restrict the actor
   * partition. `read_mask` selects fields in each returned entry.
   */
  ListManagedMemoryEntriesResponse listMemories(
      ListManagedMemoryEntriesRequest listManagedMemoryEntriesRequest);

  /** Lists managed memory stores in the caller's workspace. */
  ListManagedMemoryStoresResponse listMemoryStores(
      ListManagedMemoryStoresRequest listManagedMemoryStoresRequest);

  /** Lists items in a session. */
  ListSessionItemsResponse listSessionItems(ListSessionItemsRequest listSessionItemsRequest);

  /** Lists session stores. */
  ListSessionStoresResponse listSessionStores(ListSessionStoresRequest listSessionStoresRequest);

  /** Lists sessions within a session store. */
  ListSessionsResponse listSessions(ListSessionsRequest listSessionsRequest);

  /** Pops the newest item from a session. */
  PopSessionItemResponse popSessionItem(PopSessionItemRequest popSessionItemRequest);

  /**
   * Searches managed memory entries by text query for one actor. Returns matching entries and
   * scores ranked by relevance; `read_mask` selects fields in each returned entry.
   */
  SearchManagedMemoryEntriesResponse searchMemories(
      SearchManagedMemoryEntriesRequest searchManagedMemoryEntriesRequest);

  /** Updates selected mutable fields on a managed memory entry. Identity fields are immutable. */
  ManagedMemoryEntry updateMemory(UpdateManagedMemoryEntryRequest updateManagedMemoryEntryRequest);

  /** Updates a managed memory store's description. */
  ManagedMemoryStore updateMemoryStore(
      UpdateManagedMemoryStoreRequest updateManagedMemoryStoreRequest);

  /** Updates a session's mutable fields. */
  Session updateSession(UpdateSessionRequest updateSessionRequest);

  /** Updates a session store's description and metadata. */
  SessionStore updateSessionStore(UpdateSessionStoreRequest updateSessionStoreRequest);
}
