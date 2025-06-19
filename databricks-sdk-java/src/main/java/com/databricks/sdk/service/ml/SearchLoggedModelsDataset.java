// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Objects;

@Generated
@JsonSerialize(using = SearchLoggedModelsDataset.SearchLoggedModelsDatasetSerializer.class)
@JsonDeserialize(using = SearchLoggedModelsDataset.SearchLoggedModelsDatasetDeserializer.class)
public class SearchLoggedModelsDataset {
  /** The digest of the dataset. */
  private String datasetDigest;

  /** The name of the dataset. */
  private String datasetName;

  public SearchLoggedModelsDataset setDatasetDigest(String datasetDigest) {
    this.datasetDigest = datasetDigest;
    return this;
  }

  public String getDatasetDigest() {
    return datasetDigest;
  }

  public SearchLoggedModelsDataset setDatasetName(String datasetName) {
    this.datasetName = datasetName;
    return this;
  }

  public String getDatasetName() {
    return datasetName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SearchLoggedModelsDataset that = (SearchLoggedModelsDataset) o;
    return Objects.equals(datasetDigest, that.datasetDigest)
        && Objects.equals(datasetName, that.datasetName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasetDigest, datasetName);
  }

  @Override
  public String toString() {
    return new ToStringer(SearchLoggedModelsDataset.class)
        .add("datasetDigest", datasetDigest)
        .add("datasetName", datasetName)
        .toString();
  }

  SearchLoggedModelsDatasetPb toPb() {
    SearchLoggedModelsDatasetPb pb = new SearchLoggedModelsDatasetPb();
    pb.setDatasetDigest(datasetDigest);
    pb.setDatasetName(datasetName);

    return pb;
  }

  static SearchLoggedModelsDataset fromPb(SearchLoggedModelsDatasetPb pb) {
    SearchLoggedModelsDataset model = new SearchLoggedModelsDataset();
    model.setDatasetDigest(pb.getDatasetDigest());
    model.setDatasetName(pb.getDatasetName());

    return model;
  }

  public static class SearchLoggedModelsDatasetSerializer
      extends JsonSerializer<SearchLoggedModelsDataset> {
    @Override
    public void serialize(
        SearchLoggedModelsDataset value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SearchLoggedModelsDatasetPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SearchLoggedModelsDatasetDeserializer
      extends JsonDeserializer<SearchLoggedModelsDataset> {
    @Override
    public SearchLoggedModelsDataset deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SearchLoggedModelsDatasetPb pb = mapper.readValue(p, SearchLoggedModelsDatasetPb.class);
      return SearchLoggedModelsDataset.fromPb(pb);
    }
  }
}
