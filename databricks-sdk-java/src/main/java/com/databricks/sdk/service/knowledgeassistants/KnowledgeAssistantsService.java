// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.knowledgeassistants;

import com.databricks.sdk.support.Generated;

/**
 * Manage Knowledge Assistants and related resources.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface KnowledgeAssistantsService {
  /** Creates a Knowledge Assistant. */
  KnowledgeAssistant createKnowledgeAssistant(
      CreateKnowledgeAssistantRequest createKnowledgeAssistantRequest);

  /** Creates a Knowledge Source under a Knowledge Assistant. */
  KnowledgeSource createKnowledgeSource(CreateKnowledgeSourceRequest createKnowledgeSourceRequest);

  /** Deletes a Knowledge Assistant. */
  void deleteKnowledgeAssistant(DeleteKnowledgeAssistantRequest deleteKnowledgeAssistantRequest);

  /** Deletes a Knowledge Source. */
  void deleteKnowledgeSource(DeleteKnowledgeSourceRequest deleteKnowledgeSourceRequest);

  /** Gets a Knowledge Assistant. */
  KnowledgeAssistant getKnowledgeAssistant(
      GetKnowledgeAssistantRequest getKnowledgeAssistantRequest);

  /** Gets a Knowledge Source. */
  KnowledgeSource getKnowledgeSource(GetKnowledgeSourceRequest getKnowledgeSourceRequest);

  /** List Knowledge Assistants */
  ListKnowledgeAssistantsResponse listKnowledgeAssistants(
      ListKnowledgeAssistantsRequest listKnowledgeAssistantsRequest);

  /** Lists Knowledge Sources under a Knowledge Assistant. */
  ListKnowledgeSourcesResponse listKnowledgeSources(
      ListKnowledgeSourcesRequest listKnowledgeSourcesRequest);

  /**
   * Sync all non-index Knowledge Sources for a Knowledge Assistant (index sources do not require
   * sync)
   */
  void syncKnowledgeSources(SyncKnowledgeSourcesRequest syncKnowledgeSourcesRequest);

  /** Updates a Knowledge Assistant. */
  KnowledgeAssistant updateKnowledgeAssistant(
      UpdateKnowledgeAssistantRequest updateKnowledgeAssistantRequest);

  /** Updates a Knowledge Source. */
  KnowledgeSource updateKnowledgeSource(UpdateKnowledgeSourceRequest updateKnowledgeSourceRequest);
}
