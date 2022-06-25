package com.kimson.seedprj.restController;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
@CrossOrigin("*")
public class TestRestController {

  @GetMapping("/test")
  public String test() {
    return "test2";
  }

  @GetMapping("/wow")
  public String wow() {
    return "wow";
  }
}