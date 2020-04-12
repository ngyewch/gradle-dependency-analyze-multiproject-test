package service;

import org.apache.commons.codec.binary.Base64;

import java.nio.charset.StandardCharsets;

public class MyEncoderService
    implements EncoderService {

  @Override
  public String encode(String s) {
    return Base64.encodeBase64String(s.getBytes(StandardCharsets.UTF_8));
  }

  @Override
  public String getId() {
    return "MyEncoderService";
  }
}
