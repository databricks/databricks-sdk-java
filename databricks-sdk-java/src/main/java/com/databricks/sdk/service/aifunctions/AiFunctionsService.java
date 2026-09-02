// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.aifunctions;

import com.databricks.sdk.support.Generated;

/**
 * Transform and enrich data with AI on Databricks.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface AiFunctionsService {
  /** Classifies content according to a set of provided labels. */
  AiClassifyResponse aiClassify(AiClassifyRequest aiClassifyRequest);

  /** Extracts structured data from text and documents according to a provided schema. */
  AiExtractResponse aiExtract(AiExtractRequest aiExtractRequest);

  /** Parse structured content from unstructured documents. */
  AiParseDocumentResponse aiParseDocument(AiParseDocumentRequest aiParseDocumentRequest);
}
