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
 * PackageFile represents a package file
 */
@Schema(description = "PackageFile represents a package file")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-02T21:57:57.853188500+08:00[Asia/Hong_Kong]")

public class PackageFile {
  @SerializedName("Size")
  private Long size = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("md5")
  private String md5 = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("sha1")
  private String sha1 = null;

  @SerializedName("sha256")
  private String sha256 = null;

  @SerializedName("sha512")
  private String sha512 = null;

  public PackageFile size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @Schema(description = "")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public PackageFile id(Long id) {
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

  public PackageFile md5(String md5) {
    this.md5 = md5;
    return this;
  }

   /**
   * Get md5
   * @return md5
  **/
  @Schema(description = "")
  public String getMd5() {
    return md5;
  }

  public void setMd5(String md5) {
    this.md5 = md5;
  }

  public PackageFile name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PackageFile sha1(String sha1) {
    this.sha1 = sha1;
    return this;
  }

   /**
   * Get sha1
   * @return sha1
  **/
  @Schema(description = "")
  public String getSha1() {
    return sha1;
  }

  public void setSha1(String sha1) {
    this.sha1 = sha1;
  }

  public PackageFile sha256(String sha256) {
    this.sha256 = sha256;
    return this;
  }

   /**
   * Get sha256
   * @return sha256
  **/
  @Schema(description = "")
  public String getSha256() {
    return sha256;
  }

  public void setSha256(String sha256) {
    this.sha256 = sha256;
  }

  public PackageFile sha512(String sha512) {
    this.sha512 = sha512;
    return this;
  }

   /**
   * Get sha512
   * @return sha512
  **/
  @Schema(description = "")
  public String getSha512() {
    return sha512;
  }

  public void setSha512(String sha512) {
    this.sha512 = sha512;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageFile packageFile = (PackageFile) o;
    return Objects.equals(this.size, packageFile.size) &&
        Objects.equals(this.id, packageFile.id) &&
        Objects.equals(this.md5, packageFile.md5) &&
        Objects.equals(this.name, packageFile.name) &&
        Objects.equals(this.sha1, packageFile.sha1) &&
        Objects.equals(this.sha256, packageFile.sha256) &&
        Objects.equals(this.sha512, packageFile.sha512);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, id, md5, name, sha1, sha256, sha512);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageFile {\n");
    
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sha1: ").append(toIndentedString(sha1)).append("\n");
    sb.append("    sha256: ").append(toIndentedString(sha256)).append("\n");
    sb.append("    sha512: ").append(toIndentedString(sha512)).append("\n");
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
