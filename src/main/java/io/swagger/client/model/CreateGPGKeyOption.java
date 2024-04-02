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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * CreateGPGKeyOption options create user GPG key
 */
@Schema(description = "CreateGPGKeyOption options create user GPG key")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-02T21:57:57.853188500+08:00[Asia/Hong_Kong]")

public class CreateGPGKeyOption {
  @SerializedName("armored_public_key")
  private String armoredPublicKey = null;

  @SerializedName("armored_signature")
  private String armoredSignature = null;

  public CreateGPGKeyOption armoredPublicKey(String armoredPublicKey) {
    this.armoredPublicKey = armoredPublicKey;
    return this;
  }

   /**
   * An armored GPG key to add
   * @return armoredPublicKey
  **/
  @Schema(required = true, description = "An armored GPG key to add")
  public String getArmoredPublicKey() {
    return armoredPublicKey;
  }

  public void setArmoredPublicKey(String armoredPublicKey) {
    this.armoredPublicKey = armoredPublicKey;
  }

  public CreateGPGKeyOption armoredSignature(String armoredSignature) {
    this.armoredSignature = armoredSignature;
    return this;
  }

   /**
   * Get armoredSignature
   * @return armoredSignature
  **/
  @Schema(description = "")
  public String getArmoredSignature() {
    return armoredSignature;
  }

  public void setArmoredSignature(String armoredSignature) {
    this.armoredSignature = armoredSignature;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateGPGKeyOption createGPGKeyOption = (CreateGPGKeyOption) o;
    return Objects.equals(this.armoredPublicKey, createGPGKeyOption.armoredPublicKey) &&
        Objects.equals(this.armoredSignature, createGPGKeyOption.armoredSignature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(armoredPublicKey, armoredSignature);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGPGKeyOption {\n");
    
    sb.append("    armoredPublicKey: ").append(toIndentedString(armoredPublicKey)).append("\n");
    sb.append("    armoredSignature: ").append(toIndentedString(armoredSignature)).append("\n");
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
