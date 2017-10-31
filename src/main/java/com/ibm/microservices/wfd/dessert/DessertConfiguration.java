package com.ibm.microservices.wfd.dessert;

/**
 *  Patterned after https://github.com/aykutakin/SpringConfigurationPropertiesSample
 *  due to issues with YAML-formatted lists
 **/

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.context.properties.ConfigurationProperties;

@RefreshScope
@Configuration
@ConfigurationProperties(prefix = "wfd.dessert")
public class DessertConfiguration{

  private List<String> menu;

  @Value("${wfd.dessert.type}")
  private String type;

  @Value("${wfd.dessert.order}")
  private int order;

  DessertConfiguration(){
    this.menu = new ArrayList<>();
    this.type = new String();
    this.order = 0;
  }

  public List<String> getMenu(){
    return this.menu;
  }

  public String getType(){
    return this.type;
  }

  public int getOrder(){
    return this.order;
  }

}
