// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.aifunctions;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

/** Transform and enrich data with AI. */
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
   * Classifies content according to a set of provided labels. The AI Classify REST API has a
   * default rate limit of 1,200 requests per minute per workspace. Contact your account team to
   * request a higher limit.
   */
  public AiClassifyResponse aiClassify(AiClassifyRequest request) {
    return impl.aiClassify(request);
  }

  /**
   * Turn text and structured data into decisions your application can use. Define questions and
   * criteria to choose an option, estimate a probability, or assign a score given a provided state.
   * The AI Decide REST API has a default rate limit of 1,200 requests per minute per workspace.
   * Contact your account team to request a higher limit.
   *
   * <p>> **Note:** The v1 AI Decide syntax supporting strings and objects in `state` and objects
   * and arrays in `instructions` will no longer be supported starting February 1, 2027. To use AI
   * Decide, you must set `options.version` to `"2.0"`, pass an array of typed content objects to
   * `state`, and a nonblank string to `instructions`.
   */
  public AiDecideResponse aiDecide(AiDecideRequest request) {
    return impl.aiDecide(request);
  }

  /**
   * Extracts structured data from text and documents according to a provided schema. The AI Extract
   * REST API has a default rate limit of 120 requests per minute per workspace. Contact your
   * account team to request a higher limit.
   */
  public AiExtractResponse aiExtract(AiExtractRequest request) {
    return impl.aiExtract(request);
  }

  /** Parse structured content from unstructured documents. */
  public AiParseDocumentResponse aiParseDocument(AiParseDocumentRequest request) {
    return impl.aiParseDocument(request);
  }

  /**
   * Starts the asynchronous cancellation of a batch. Requests in progress are stopped, and the
   * results of the requests that finished are kept. Cancellation is best effort, so the batch can
   * still complete.
   */
  public CancelBatchResponse cancelBatch(CancelBatchRequest request) {
    return impl.cancelBatch(request);
  }

  /**
   * Creates a batch that runs an AI function on every request in a JSONL file on a Unity Catalog
   * volume. The batch runs asynchronously. To follow its progress, get the batch.
   */
  public Batch createBatch(CreateBatchRequest request) {
    return impl.createBatch(request);
  }

  public Batch getBatch(String name) {
    return getBatch(new GetBatchRequest().setName(name));
  }

  /** Gets the latest status and progress of a batch. */
  public Batch getBatch(GetBatchRequest request) {
    return impl.getBatch(request);
  }

  /** Lists the batches that the caller created in this workspace. */
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
