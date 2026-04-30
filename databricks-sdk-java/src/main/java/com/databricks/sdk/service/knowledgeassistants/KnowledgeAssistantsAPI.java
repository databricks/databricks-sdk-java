// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.knowledgeassistants;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

/** Manage Knowledge Assistants and related resources. */
@Generated
public class KnowledgeAssistantsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(KnowledgeAssistantsAPI.class);

  private final KnowledgeAssistantsService impl;

  /** Regular-use constructor */
  public KnowledgeAssistantsAPI(ApiClient apiClient) {
    impl = new KnowledgeAssistantsImpl(apiClient);
  }

  /** Constructor for mocks */
  public KnowledgeAssistantsAPI(KnowledgeAssistantsService mock) {
    impl = mock;
  }

  /** Creates an example for a Knowledge Assistant. */
  public Example createExample(CreateExampleRequest request) {
    return impl.createExample(request);
  }

  /** Creates a Knowledge Assistant. */
  public KnowledgeAssistant createKnowledgeAssistant(CreateKnowledgeAssistantRequest request) {
    return impl.createKnowledgeAssistant(request);
  }

  /** Creates a Knowledge Source under a Knowledge Assistant. */
  public KnowledgeSource createKnowledgeSource(CreateKnowledgeSourceRequest request) {
    return impl.createKnowledgeSource(request);
  }

  public void deleteExample(String name) {
    deleteExample(new DeleteExampleRequest().setName(name));
  }

  /** Deletes an example from a Knowledge Assistant. */
  public void deleteExample(DeleteExampleRequest request) {
    impl.deleteExample(request);
  }

  public void deleteKnowledgeAssistant(String name) {
    deleteKnowledgeAssistant(new DeleteKnowledgeAssistantRequest().setName(name));
  }

  /** Deletes a Knowledge Assistant. */
  public void deleteKnowledgeAssistant(DeleteKnowledgeAssistantRequest request) {
    impl.deleteKnowledgeAssistant(request);
  }

  public void deleteKnowledgeSource(String name) {
    deleteKnowledgeSource(new DeleteKnowledgeSourceRequest().setName(name));
  }

  /** Deletes a Knowledge Source. */
  public void deleteKnowledgeSource(DeleteKnowledgeSourceRequest request) {
    impl.deleteKnowledgeSource(request);
  }

  public Example getExample(String name) {
    return getExample(new GetExampleRequest().setName(name));
  }

  /** Gets an example from a Knowledge Assistant. */
  public Example getExample(GetExampleRequest request) {
    return impl.getExample(request);
  }

  public KnowledgeAssistant getKnowledgeAssistant(String name) {
    return getKnowledgeAssistant(new GetKnowledgeAssistantRequest().setName(name));
  }

  /** Gets a Knowledge Assistant. */
  public KnowledgeAssistant getKnowledgeAssistant(GetKnowledgeAssistantRequest request) {
    return impl.getKnowledgeAssistant(request);
  }

  public KnowledgeSource getKnowledgeSource(String name) {
    return getKnowledgeSource(new GetKnowledgeSourceRequest().setName(name));
  }

  /** Gets a Knowledge Source. */
  public KnowledgeSource getKnowledgeSource(GetKnowledgeSourceRequest request) {
    return impl.getKnowledgeSource(request);
  }

  public GetKnowledgeAssistantPermissionLevelsResponse getPermissionLevels(
      String knowledgeAssistantId) {
    return getPermissionLevels(
        new GetKnowledgeAssistantPermissionLevelsRequest()
            .setKnowledgeAssistantId(knowledgeAssistantId));
  }

  /** Gets the permission levels that a user can have on an object. */
  public GetKnowledgeAssistantPermissionLevelsResponse getPermissionLevels(
      GetKnowledgeAssistantPermissionLevelsRequest request) {
    return impl.getPermissionLevels(request);
  }

  public KnowledgeAssistantPermissions getPermissions(String knowledgeAssistantId) {
    return getPermissions(
        new GetKnowledgeAssistantPermissionsRequest()
            .setKnowledgeAssistantId(knowledgeAssistantId));
  }

  /**
   * Gets the permissions of a knowledge assistant. Knowledge assistants can inherit permissions
   * from their root object.
   */
  public KnowledgeAssistantPermissions getPermissions(
      GetKnowledgeAssistantPermissionsRequest request) {
    return impl.getPermissions(request);
  }

  public Iterable<Example> listExamples(String parent) {
    return listExamples(new ListExamplesRequest().setParent(parent));
  }

  /** Lists examples under a Knowledge Assistant. */
  public Iterable<Example> listExamples(ListExamplesRequest request) {
    return new Paginator<>(
        request,
        impl::listExamples,
        ListExamplesResponse::getExamples,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /** List Knowledge Assistants */
  public Iterable<KnowledgeAssistant> listKnowledgeAssistants(
      ListKnowledgeAssistantsRequest request) {
    return new Paginator<>(
        request,
        impl::listKnowledgeAssistants,
        ListKnowledgeAssistantsResponse::getKnowledgeAssistants,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<KnowledgeSource> listKnowledgeSources(String parent) {
    return listKnowledgeSources(new ListKnowledgeSourcesRequest().setParent(parent));
  }

  /** Lists Knowledge Sources under a Knowledge Assistant. */
  public Iterable<KnowledgeSource> listKnowledgeSources(ListKnowledgeSourcesRequest request) {
    return new Paginator<>(
        request,
        impl::listKnowledgeSources,
        ListKnowledgeSourcesResponse::getKnowledgeSources,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Sets permissions on an object, replacing existing permissions if they exist. Deletes all direct
   * permissions if none are specified. Objects can inherit permissions from their root object.
   */
  public KnowledgeAssistantPermissions setPermissions(
      KnowledgeAssistantPermissionsRequest request) {
    return impl.setPermissions(request);
  }

  /**
   * Sync all non-index Knowledge Sources for a Knowledge Assistant (index sources do not require
   * sync)
   */
  public void syncKnowledgeSources(SyncKnowledgeSourcesRequest request) {
    impl.syncKnowledgeSources(request);
  }

  /** Updates an example in a Knowledge Assistant. */
  public Example updateExample(UpdateExampleRequest request) {
    return impl.updateExample(request);
  }

  /** Updates a Knowledge Assistant. */
  public KnowledgeAssistant updateKnowledgeAssistant(UpdateKnowledgeAssistantRequest request) {
    return impl.updateKnowledgeAssistant(request);
  }

  /** Updates a Knowledge Source. */
  public KnowledgeSource updateKnowledgeSource(UpdateKnowledgeSourceRequest request) {
    return impl.updateKnowledgeSource(request);
  }

  /**
   * Updates the permissions on a knowledge assistant. Knowledge assistants can inherit permissions
   * from their root object.
   */
  public KnowledgeAssistantPermissions updatePermissions(
      KnowledgeAssistantPermissionsRequest request) {
    return impl.updatePermissions(request);
  }

  public KnowledgeAssistantsService impl() {
    return impl;
  }
}
