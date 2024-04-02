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
import io.swagger.client.model.GPGKey;
import io.swagger.client.model.GPGKeyEmail;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * GPGKey a user GPG key to sign commit and tag in repository
 */
@Schema(description = "GPGKey a user GPG key to sign commit and tag in repository")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-02T21:57:57.853188500+08:00[Asia/Hong_Kong]")

public class GPGKey {
  @SerializedName("can_certify")
  private Boolean canCertify = null;

  @SerializedName("can_encrypt_comms")
  private Boolean canEncryptComms = null;

  @SerializedName("can_encrypt_storage")
  private Boolean canEncryptStorage = null;

  @SerializedName("can_sign")
  private Boolean canSign = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("emails")
  private List<GPGKeyEmail> emails = null;

  @SerializedName("expires_at")
  private OffsetDateTime expiresAt = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("key_id")
  private String keyId = null;

  @SerializedName("primary_key_id")
  private String primaryKeyId = null;

  @SerializedName("public_key")
  private String publicKey = null;

  @SerializedName("subkeys")
  private List<GPGKey> subkeys = null;

  @SerializedName("verified")
  private Boolean verified = null;

  public GPGKey canCertify(Boolean canCertify) {
    this.canCertify = canCertify;
    return this;
  }

   /**
   * Get canCertify
   * @return canCertify
  **/
  @Schema(description = "")
  public Boolean isCanCertify() {
    return canCertify;
  }

  public void setCanCertify(Boolean canCertify) {
    this.canCertify = canCertify;
  }

  public GPGKey canEncryptComms(Boolean canEncryptComms) {
    this.canEncryptComms = canEncryptComms;
    return this;
  }

   /**
   * Get canEncryptComms
   * @return canEncryptComms
  **/
  @Schema(description = "")
  public Boolean isCanEncryptComms() {
    return canEncryptComms;
  }

  public void setCanEncryptComms(Boolean canEncryptComms) {
    this.canEncryptComms = canEncryptComms;
  }

  public GPGKey canEncryptStorage(Boolean canEncryptStorage) {
    this.canEncryptStorage = canEncryptStorage;
    return this;
  }

   /**
   * Get canEncryptStorage
   * @return canEncryptStorage
  **/
  @Schema(description = "")
  public Boolean isCanEncryptStorage() {
    return canEncryptStorage;
  }

  public void setCanEncryptStorage(Boolean canEncryptStorage) {
    this.canEncryptStorage = canEncryptStorage;
  }

  public GPGKey canSign(Boolean canSign) {
    this.canSign = canSign;
    return this;
  }

   /**
   * Get canSign
   * @return canSign
  **/
  @Schema(description = "")
  public Boolean isCanSign() {
    return canSign;
  }

  public void setCanSign(Boolean canSign) {
    this.canSign = canSign;
  }

  public GPGKey createdAt(OffsetDateTime createdAt) {
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

  public GPGKey emails(List<GPGKeyEmail> emails) {
    this.emails = emails;
    return this;
  }

  public GPGKey addEmailsItem(GPGKeyEmail emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<GPGKeyEmail>();
    }
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * Get emails
   * @return emails
  **/
  @Schema(description = "")
  public List<GPGKeyEmail> getEmails() {
    return emails;
  }

  public void setEmails(List<GPGKeyEmail> emails) {
    this.emails = emails;
  }

  public GPGKey expiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Get expiresAt
   * @return expiresAt
  **/
  @Schema(description = "")
  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }

  public GPGKey id(Long id) {
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

  public GPGKey keyId(String keyId) {
    this.keyId = keyId;
    return this;
  }

   /**
   * Get keyId
   * @return keyId
  **/
  @Schema(description = "")
  public String getKeyId() {
    return keyId;
  }

  public void setKeyId(String keyId) {
    this.keyId = keyId;
  }

  public GPGKey primaryKeyId(String primaryKeyId) {
    this.primaryKeyId = primaryKeyId;
    return this;
  }

   /**
   * Get primaryKeyId
   * @return primaryKeyId
  **/
  @Schema(description = "")
  public String getPrimaryKeyId() {
    return primaryKeyId;
  }

  public void setPrimaryKeyId(String primaryKeyId) {
    this.primaryKeyId = primaryKeyId;
  }

  public GPGKey publicKey(String publicKey) {
    this.publicKey = publicKey;
    return this;
  }

   /**
   * Get publicKey
   * @return publicKey
  **/
  @Schema(description = "")
  public String getPublicKey() {
    return publicKey;
  }

  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }

  public GPGKey subkeys(List<GPGKey> subkeys) {
    this.subkeys = subkeys;
    return this;
  }

  public GPGKey addSubkeysItem(GPGKey subkeysItem) {
    if (this.subkeys == null) {
      this.subkeys = new ArrayList<GPGKey>();
    }
    this.subkeys.add(subkeysItem);
    return this;
  }

   /**
   * Get subkeys
   * @return subkeys
  **/
  @Schema(description = "")
  public List<GPGKey> getSubkeys() {
    return subkeys;
  }

  public void setSubkeys(List<GPGKey> subkeys) {
    this.subkeys = subkeys;
  }

  public GPGKey verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

   /**
   * Get verified
   * @return verified
  **/
  @Schema(description = "")
  public Boolean isVerified() {
    return verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GPGKey gpGKey = (GPGKey) o;
    return Objects.equals(this.canCertify, gpGKey.canCertify) &&
        Objects.equals(this.canEncryptComms, gpGKey.canEncryptComms) &&
        Objects.equals(this.canEncryptStorage, gpGKey.canEncryptStorage) &&
        Objects.equals(this.canSign, gpGKey.canSign) &&
        Objects.equals(this.createdAt, gpGKey.createdAt) &&
        Objects.equals(this.emails, gpGKey.emails) &&
        Objects.equals(this.expiresAt, gpGKey.expiresAt) &&
        Objects.equals(this.id, gpGKey.id) &&
        Objects.equals(this.keyId, gpGKey.keyId) &&
        Objects.equals(this.primaryKeyId, gpGKey.primaryKeyId) &&
        Objects.equals(this.publicKey, gpGKey.publicKey) &&
        Objects.equals(this.subkeys, gpGKey.subkeys) &&
        Objects.equals(this.verified, gpGKey.verified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canCertify, canEncryptComms, canEncryptStorage, canSign, createdAt, emails, expiresAt, id, keyId, primaryKeyId, publicKey, subkeys, verified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GPGKey {\n");
    
    sb.append("    canCertify: ").append(toIndentedString(canCertify)).append("\n");
    sb.append("    canEncryptComms: ").append(toIndentedString(canEncryptComms)).append("\n");
    sb.append("    canEncryptStorage: ").append(toIndentedString(canEncryptStorage)).append("\n");
    sb.append("    canSign: ").append(toIndentedString(canSign)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
    sb.append("    primaryKeyId: ").append(toIndentedString(primaryKeyId)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    subkeys: ").append(toIndentedString(subkeys)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
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
