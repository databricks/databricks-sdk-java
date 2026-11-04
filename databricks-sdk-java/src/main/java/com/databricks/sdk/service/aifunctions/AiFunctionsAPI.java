// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.aifunctions;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

/** Transform and enrich data with AI on Databricks. */
@Generated
public class AiFunctionsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(AiFunctionsAPI.class);

  private final AiFunctionsService impl;

  /** Regular-use constructor */
  public AiFunctionsAPI(ApiClient apiClient) {
    impl = new AiFunctionsImpl(apiClient);
  }

  /** Constructor for mocks */
  public AiFunctionsAPI(AiFunctionsService mock) {
    impl = mock;
  }

  /**
   * Classifies content according to a set of provided labels. For REST API requests, the default
   * rate limit is 1,200 requests per minute per workspace. Contact your Databricks account team to
   * request a higher limit.
   */
  public AiClassifyResponse aiClassify(AiClassifyRequest request) {
    return impl.aiClassify(request);
  }

  /**
   * Turn text and structured data into decisions your application can use. Define questions and
   * criteria to choose an option, estimate a probability, or assign a score given a provided state.
   */
  public AiDecideResponse aiDecide(AiDecideRequest request) {
    return impl.aiDecide(request);
  }

  /**
   * Extracts structured data from text and documents according to a provided schema. For REST API
   * requests, the default rate limit is 120 requests per minute per workspace. Contact your
   * Databricks account team to request a higher limit.
   */
  public AiExtractResponse aiExtract(AiExtractRequest request) {
    return impl.aiExtract(request);
  }

  /** Parse structured content from unstructured documents. */
  public AiParseDocumentResponse aiParseDocument(AiParseDocumentRequest request) {
    return impl.aiParseDocument(request);
  }

  /**
   * Cancel a batch. Cancellation is asynchronous: requests in flight drain first, so read the batch
   * to observe the `CANCELLING` and `CANCELLED` statuses.
   */
  public CancelBatchResponse cancelBatch(CancelBatchRequest request) {
    return impl.cancelBatch(request);
  }

  /**
   * Run an AI function over every request in a file on a Unity Catalog volume. The batch runs
   * asynchronously; read it to follow its progress.
   */
  public Batch createBatch(CreateBatchRequest request) {
    return impl.createBatch(request);
  }

  public Batch getBatch(String name) {
    return getBatch(new GetBatchRequest().setName(name));
  }

  /** Read one batch, with its status and progress. */
  public Batch getBatch(GetBatchRequest request) {
    return impl.getBatch(request);
  }

  /** List the batches the caller created in this workspace. */
  public Iterable<Batch> listBatches(ListBatchesRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listBatches,
        ListBatchesResponse::getBatches,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public AiFunctionsService impl() {
    return impl;
  }
}
