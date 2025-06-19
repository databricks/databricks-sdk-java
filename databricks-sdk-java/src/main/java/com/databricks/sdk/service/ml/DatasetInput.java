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
import java.util.Collection;
import java.util.Objects;

/** DatasetInput. Represents a dataset and input tags. */
@Generated
@JsonSerialize(using = DatasetInput.DatasetInputSerializer.class)
@JsonDeserialize(using = DatasetInput.DatasetInputDeserializer.class)
public class DatasetInput {
  /** The dataset being used as a Run input. */
  private Dataset dataset;

  /** A list of tags for the dataset input, e.g. a “context” tag with value “training” */
  private Collection<InputTag> tags;

  public DatasetInput setDataset(Dataset dataset) {
    this.dataset = dataset;
    return this;
  }

  public Dataset getDataset() {
    return dataset;
  }

  public DatasetInput setTags(Collection<InputTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<InputTag> getTags() {
    return tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DatasetInput that = (DatasetInput) o;
    return Objects.equals(dataset, that.dataset) && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataset, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(DatasetInput.class).add("dataset", dataset).add("tags", tags).toString();
  }

  DatasetInputPb toPb() {
    DatasetInputPb pb = new DatasetInputPb();
    pb.setDataset(dataset);
    pb.setTags(tags);

    return pb;
  }

  static DatasetInput fromPb(DatasetInputPb pb) {
    DatasetInput model = new DatasetInput();
    model.setDataset(pb.getDataset());
    model.setTags(pb.getTags());

    return model;
  }

  public static class DatasetInputSerializer extends JsonSerializer<DatasetInput> {
    @Override
    public void serialize(DatasetInput value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DatasetInputPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DatasetInputDeserializer extends JsonDeserializer<DatasetInput> {
    @Override
    public DatasetInput deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DatasetInputPb pb = mapper.readValue(p, DatasetInputPb.class);
      return DatasetInput.fromPb(pb);
    }
  }
}
