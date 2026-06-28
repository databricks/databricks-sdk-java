// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.knowledgeassistants;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** IndexSpec specifies a vector search index source configuration. */
@Generated
public class IndexSpec {
  /** The column that specifies a link or reference to where the information came from. */
  @JsonProperty("doc_uri_col")
  private String docUriCol;

  /** Full UC name of the vector search index, in the format of {CATALOG}.{SCHEMA}.{INDEX_NAME}. */
  @JsonProperty("index_name")
  private String indexName;

  /** The column that includes the document text for retrieval. */
  @JsonProperty("text_col")
  private String textCol;

  public IndexSpec setDocUriCol(String docUriCol) {
    this.docUriCol = docUriCol;
    return this;
  }

  public String getDocUriCol() {
    return docUriCol;
  }

  public IndexSpec setIndexName(String indexName) {
    this.indexName = indexName;
    return this;
  }

  public String getIndexName() {
    return indexName;
  }

  public IndexSpec setTextCol(String textCol) {
    this.textCol = textCol;
    return this;
  }

  public String getTextCol() {
    return textCol;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    IndexSpec that = (IndexSpec) o;
    return Objects.equals(docUriCol, that.docUriCol)
        && Objects.equals(indexName, that.indexName)
        && Objects.equals(textCol, that.textCol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docUriCol, indexName, textCol);
  }

  @Override
  public String toString() {
    return new ToStringer(IndexSpec.class)
        .add("docUriCol", docUriCol)
        .add("indexName", indexName)
        .add("textCol", textCol)
        .toString();
  }
}
