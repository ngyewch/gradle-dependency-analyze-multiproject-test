package test;

import service.EncoderService;
import service.MyEncoderService;

public class Main {

  public static void main(String[] args)
      throws Exception {
    System.out.println("Hello, world!");

    final EncoderService encoderService = new MyEncoderService();
    final String text = "This is a test!";
    System.out.format("%s -> %s\n", text, encoderService.encode(text));
  }
}
