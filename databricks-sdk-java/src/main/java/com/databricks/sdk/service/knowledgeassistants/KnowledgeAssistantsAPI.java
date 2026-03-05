// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.knowledgeassistants;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

  /** Creates a Knowledge Assistant. */
  public KnowledgeAssistant createKnowledgeAssistant(CreateKnowledgeAssistantRequest request) {
    return impl.createKnowledgeAssistant(request);
  }

  /** Creates a Knowledge Source under a Knowledge Assistant. */
  public KnowledgeSource createKnowledgeSource(CreateKnowledgeSourceRequest request) {
    return impl.createKnowledgeSource(request);
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
   * Sync all non-index Knowledge Sources for a Knowledge Assistant (index sources do not require
   * sync)
   */
  public void syncKnowledgeSources(SyncKnowledgeSourcesRequest request) {
    impl.syncKnowledgeSources(request);
  }

  /** Updates a Knowledge Assistant. */
  public KnowledgeAssistant updateKnowledgeAssistant(UpdateKnowledgeAssistantRequest request) {
    return impl.updateKnowledgeAssistant(request);
  }

  /** Updates a Knowledge Source. */
  public KnowledgeSource updateKnowledgeSource(UpdateKnowledgeSourceRequest request) {
    return impl.updateKnowledgeSource(request);
  }

  public KnowledgeAssistantsService impl() {
    return impl;
  }
}
