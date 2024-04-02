/*
 * Gitea API
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.21.10
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.Repository;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * DeployKey a deploy key
 */
@Schema(description = "DeployKey a deploy key")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-02T21:57:57.853188500+08:00[Asia/Hong_Kong]")

public class DeployKey {
  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("fingerprint")
  private String fingerprint = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("key_id")
  private Long keyId = null;

  @SerializedName("read_only")
  private Boolean readOnly = null;

  @SerializedName("repository")
  private Repository repository = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("url")
  private String url = null;

  public DeployKey createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public DeployKey fingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

   /**
   * Get fingerprint
   * @return fingerprint
  **/
  @Schema(description = "")
  public String getFingerprint() {
    return fingerprint;
  }

  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }

  public DeployKey id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DeployKey key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @Schema(description = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public DeployKey keyId(Long keyId) {
    this.keyId = keyId;
    return this;
  }

   /**
   * Get keyId
   * @return keyId
  **/
  @Schema(description = "")
  public Long getKeyId() {
    return keyId;
  }

  public void setKeyId(Long keyId) {
    this.keyId = keyId;
  }

  public DeployKey readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Get readOnly
   * @return readOnly
  **/
  @Schema(description = "")
  public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public DeployKey repository(Repository repository) {
    this.repository = repository;
    return this;
  }

   /**
   * Get repository
   * @return repository
  **/
  @Schema(description = "")
  public Repository getRepository() {
    return repository;
  }

  public void setRepository(Repository repository) {
    this.repository = repository;
  }

  public DeployKey title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @Schema(description = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public DeployKey url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeployKey deployKey = (DeployKey) o;
    return Objects.equals(this.createdAt, deployKey.createdAt) &&
        Objects.equals(this.fingerprint, deployKey.fingerprint) &&
        Objects.equals(this.id, deployKey.id) &&
        Objects.equals(this.key, deployKey.key) &&
        Objects.equals(this.keyId, deployKey.keyId) &&
        Objects.equals(this.readOnly, deployKey.readOnly) &&
        Objects.equals(this.repository, deployKey.repository) &&
        Objects.equals(this.title, deployKey.title) &&
        Objects.equals(this.url, deployKey.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, fingerprint, id, key, keyId, readOnly, repository, title, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeployKey {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
