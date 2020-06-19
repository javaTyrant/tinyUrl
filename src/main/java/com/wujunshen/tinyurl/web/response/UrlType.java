package com.wujunshen.tinyurl.web.response;

import java.util.stream.Stream;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author frank woo(吴峻申) <br>
 *     email:<a href="mailto:frank_wjs@hotmail.com">frank_wjs@hotmail.com</a> <br>
 * @date 2020/4/27 2:13 上午 <br>
 */
@Getter
@AllArgsConstructor
public enum UrlType {
  // 系统
  SYSTEM(0, "system"),

  // 自定义
  CUSTOM(1, "custom"),
  ;

  private final int code;
  private final String type;

  public static UrlType getByCode(int code) {
    return Stream.of(UrlType.values())
        .filter(element -> element.ordinal() == code)
        .findFirst()
        .orElse(null);
  }
}
