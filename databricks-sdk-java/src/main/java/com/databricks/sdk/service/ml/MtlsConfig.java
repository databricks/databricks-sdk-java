// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Mutual-TLS (mTLS) authentication configuration. The keystore (client certificate + private key)
 * and truststore (CAs trusted to verify the broker) live as JKS files on Unity Catalog volumes,
 * with their passwords stored in Databricks secret scopes. This matches the SSL setup pattern
 * documented at
 * https://docs.databricks.com/en/connect/streaming/kafka/authentication#use-ssl-to-connect-databricks-to-kafka.
 *
 * <p>At materialization time, the generated PySpark code passes the JKS file paths and resolved
 * passwords through to the Kafka SSL options (kafka.ssl.keystore.location,
 * kafka.ssl.keystore.password, kafka.ssl.key.password, kafka.ssl.truststore.location,
 * kafka.ssl.truststore.password). Passwords are resolved on the Spark cluster via
 * dbutils.secrets.get; this message stores only references, never password values.
 */
@Generated
public class MtlsConfig {
  /**
   * Set to true only when the broker certificate's SAN intentionally does not match the connection
   * endpoint — for example when reaching the cluster through a PrivateLink endpoint whose DNS name
   * is not in the broker certificate. Skipping the hostname check removes a defense against
   * man-in-the-middle attacks; do not enable casually. mTLS client authentication is unaffected by
   * this option.
   *
   * <p>See the Apache Kafka SSL security guide for background on this check:
   * https://kafka.apache.org/42/security/encryption-and-authentication-using-ssl/#host-name-verification
   */
  @JsonProperty("disable_hostname_verification")
  private Boolean disableHostnameVerification;

  /**
   * Secret-scope reference for the private key password. Often the same value as the keystore
   * password (keytool's default), but provided as a separate field because Apache Kafka requires it
   * as a distinct option (kafka.ssl.key.password).
   */
  @JsonProperty("key_password_ref")
  private SecretScopeReference keyPasswordRef;

  /**
   * Unity Catalog volume path to the JKS keystore file containing the client certificate and
   * private key. e.g. "/Volumes/<catalog>/<schema>/<volume>/client.jks". The materialization
   * compute must have read permission on this volume.
   */
  @JsonProperty("keystore_location")
  private String keystoreLocation;

  /** Secret-scope reference for the JKS keystore password. */
  @JsonProperty("keystore_password_ref")
  private SecretScopeReference keystorePasswordRef;

  /**
   * Unity Catalog volume path to the JKS truststore file containing the CA certificate(s) trusted
   * to verify the Kafka broker's server certificate. e.g.
   * "/Volumes/<catalog>/<schema>/<volume>/truststore.jks".
   */
  @JsonProperty("truststore_location")
  private String truststoreLocation;

  /** Secret-scope reference for the JKS truststore password. */
  @JsonProperty("truststore_password_ref")
  private SecretScopeReference truststorePasswordRef;

  public MtlsConfig setDisableHostnameVerification(Boolean disableHostnameVerification) {
    this.disableHostnameVerification = disableHostnameVerification;
    return this;
  }

  public Boolean getDisableHostnameVerification() {
    return disableHostnameVerification;
  }

  public MtlsConfig setKeyPasswordRef(SecretScopeReference keyPasswordRef) {
    this.keyPasswordRef = keyPasswordRef;
    return this;
  }

  public SecretScopeReference getKeyPasswordRef() {
    return keyPasswordRef;
  }

  public MtlsConfig setKeystoreLocation(String keystoreLocation) {
    this.keystoreLocation = keystoreLocation;
    return this;
  }

  public String getKeystoreLocation() {
    return keystoreLocation;
  }

  public MtlsConfig setKeystorePasswordRef(SecretScopeReference keystorePasswordRef) {
    this.keystorePasswordRef = keystorePasswordRef;
    return this;
  }

  public SecretScopeReference getKeystorePasswordRef() {
    return keystorePasswordRef;
  }

  public MtlsConfig setTruststoreLocation(String truststoreLocation) {
    this.truststoreLocation = truststoreLocation;
    return this;
  }

  public String getTruststoreLocation() {
    return truststoreLocation;
  }

  public MtlsConfig setTruststorePasswordRef(SecretScopeReference truststorePasswordRef) {
    this.truststorePasswordRef = truststorePasswordRef;
    return this;
  }

  public SecretScopeReference getTruststorePasswordRef() {
    return truststorePasswordRef;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MtlsConfig that = (MtlsConfig) o;
    return Objects.equals(disableHostnameVerification, that.disableHostnameVerification)
        && Objects.equals(keyPasswordRef, that.keyPasswordRef)
        && Objects.equals(keystoreLocation, that.keystoreLocation)
        && Objects.equals(keystorePasswordRef, that.keystorePasswordRef)
        && Objects.equals(truststoreLocation, that.truststoreLocation)
        && Objects.equals(truststorePasswordRef, that.truststorePasswordRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        disableHostnameVerification,
        keyPasswordRef,
        keystoreLocation,
        keystorePasswordRef,
        truststoreLocation,
        truststorePasswordRef);
  }

  @Override
  public String toString() {
    return new ToStringer(MtlsConfig.class)
        .add("disableHostnameVerification", disableHostnameVerification)
        .add("keyPasswordRef", keyPasswordRef)
        .add("keystoreLocation", keystoreLocation)
        .add("keystorePasswordRef", keystorePasswordRef)
        .add("truststoreLocation", truststoreLocation)
        .add("truststorePasswordRef", truststorePasswordRef)
        .toString();
  }
}
