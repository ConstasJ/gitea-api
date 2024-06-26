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
 * UpdateRepoAvatarUserOption options when updating the repo avatar
 */
@Schema(description = "UpdateRepoAvatarUserOption options when updating the repo avatar")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-02T21:57:57.853188500+08:00[Asia/Hong_Kong]")

public class UpdateRepoAvatarOption {
  @SerializedName("image")
  private String image = null;

  public UpdateRepoAvatarOption image(String image) {
    this.image = image;
    return this;
  }

   /**
   * image must be base64 encoded
   * @return image
  **/
  @Schema(description = "image must be base64 encoded")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRepoAvatarOption updateRepoAvatarOption = (UpdateRepoAvatarOption) o;
    return Objects.equals(this.image, updateRepoAvatarOption.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRepoAvatarOption {\n");
    
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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
