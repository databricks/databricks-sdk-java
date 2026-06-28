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
  /** Creates an example for a Knowledge Assistant. */
  Example createExample(CreateExampleRequest createExampleRequest);

  /** Creates a Knowledge Assistant. */
  KnowledgeAssistant createKnowledgeAssistant(
      CreateKnowledgeAssistantRequest createKnowledgeAssistantRequest);

  /** Creates a Knowledge Source under a Knowledge Assistant. */
  KnowledgeSource createKnowledgeSource(CreateKnowledgeSourceRequest createKnowledgeSourceRequest);

  /** Deletes an example from a Knowledge Assistant. */
  void deleteExample(DeleteExampleRequest deleteExampleRequest);

  /** Deletes a Knowledge Assistant. */
  void deleteKnowledgeAssistant(DeleteKnowledgeAssistantRequest deleteKnowledgeAssistantRequest);

  /** Deletes a Knowledge Source. */
  void deleteKnowledgeSource(DeleteKnowledgeSourceRequest deleteKnowledgeSourceRequest);

  /** Gets an example from a Knowledge Assistant. */
  Example getExample(GetExampleRequest getExampleRequest);

  /** Gets a Knowledge Assistant. */
  KnowledgeAssistant getKnowledgeAssistant(
      GetKnowledgeAssistantRequest getKnowledgeAssistantRequest);

  /** Gets a Knowledge Source. */
  KnowledgeSource getKnowledgeSource(GetKnowledgeSourceRequest getKnowledgeSourceRequest);

  /** Gets the permission levels that a user can have on an object. */
  GetKnowledgeAssistantPermissionLevelsResponse getPermissionLevels(
      GetKnowledgeAssistantPermissionLevelsRequest getKnowledgeAssistantPermissionLevelsRequest);

  /**
   * Gets the permissions of a knowledge assistant. Knowledge assistants can inherit permissions
   * from their root object.
   */
  KnowledgeAssistantPermissions getPermissions(
      GetKnowledgeAssistantPermissionsRequest getKnowledgeAssistantPermissionsRequest);

  /** Lists examples under a Knowledge Assistant. */
  ListExamplesResponse listExamples(ListExamplesRequest listExamplesRequest);

  /** List Knowledge Assistants */
  ListKnowledgeAssistantsResponse listKnowledgeAssistants(
      ListKnowledgeAssistantsRequest listKnowledgeAssistantsRequest);

  /** Lists Knowledge Sources under a Knowledge Assistant. */
  ListKnowledgeSourcesResponse listKnowledgeSources(
      ListKnowledgeSourcesRequest listKnowledgeSourcesRequest);

  /**
   * Sets permissions on an object, replacing existing permissions if they exist. Deletes all direct
   * permissions if none are specified. Objects can inherit permissions from their root object.
   */
  KnowledgeAssistantPermissions setPermissions(
      KnowledgeAssistantPermissionsRequest knowledgeAssistantPermissionsRequest);

  /**
   * Sync all non-index Knowledge Sources for a Knowledge Assistant (index sources do not require
   * sync)
   */
  void syncKnowledgeSources(SyncKnowledgeSourcesRequest syncKnowledgeSourcesRequest);

  /** Updates an example in a Knowledge Assistant. */
  Example updateExample(UpdateExampleRequest updateExampleRequest);

  /** Updates a Knowledge Assistant. */
  KnowledgeAssistant updateKnowledgeAssistant(
      UpdateKnowledgeAssistantRequest updateKnowledgeAssistantRequest);

  /** Updates a Knowledge Source. */
  KnowledgeSource updateKnowledgeSource(UpdateKnowledgeSourceRequest updateKnowledgeSourceRequest);

  /**
   * Updates the permissions on a knowledge assistant. Knowledge assistants can inherit permissions
   * from their root object.
   */
  KnowledgeAssistantPermissions updatePermissions(
      KnowledgeAssistantPermissionsRequest knowledgeAssistantPermissionsRequest);
}
