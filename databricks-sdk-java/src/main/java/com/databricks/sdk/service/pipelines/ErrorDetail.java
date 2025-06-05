// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

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

@Generated
@JsonSerialize(using = ErrorDetail.ErrorDetailSerializer.class)
@JsonDeserialize(using = ErrorDetail.ErrorDetailDeserializer.class)
public class ErrorDetail {
  /** The exception thrown for this error, with its chain of cause. */
  private Collection<SerializedException> exceptions;

  /** Whether this error is considered fatal, that is, unrecoverable. */
  private Boolean fatal;

  public ErrorDetail setExceptions(Collection<SerializedException> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  public Collection<SerializedException> getExceptions() {
    return exceptions;
  }

  public ErrorDetail setFatal(Boolean fatal) {
    this.fatal = fatal;
    return this;
  }

  public Boolean getFatal() {
    return fatal;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ErrorDetail that = (ErrorDetail) o;
    return Objects.equals(exceptions, that.exceptions) && Objects.equals(fatal, that.fatal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exceptions, fatal);
  }

  @Override
  public String toString() {
    return new ToStringer(ErrorDetail.class)
        .add("exceptions", exceptions)
        .add("fatal", fatal)
        .toString();
  }

  ErrorDetailPb toPb() {
    ErrorDetailPb pb = new ErrorDetailPb();
    pb.setExceptions(exceptions);
    pb.setFatal(fatal);

    return pb;
  }

  static ErrorDetail fromPb(ErrorDetailPb pb) {
    ErrorDetail model = new ErrorDetail();
    model.setExceptions(pb.getExceptions());
    model.setFatal(pb.getFatal());

    return model;
  }

  public static class ErrorDetailSerializer extends JsonSerializer<ErrorDetail> {
    @Override
    public void serialize(ErrorDetail value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ErrorDetailPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ErrorDetailDeserializer extends JsonDeserializer<ErrorDetail> {
    @Override
    public ErrorDetail deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ErrorDetailPb pb = mapper.readValue(p, ErrorDetailPb.class);
      return ErrorDetail.fromPb(pb);
    }
  }
}
