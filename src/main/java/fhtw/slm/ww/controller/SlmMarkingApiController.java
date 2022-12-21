package fhtw.slm.ww.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SlmMarkingApiController {
  @GetMapping("api/mark")
  public int calculateGrade (@RequestParam int percentage){
    int returnGrade = 0;
    if (percentage < 50 ) {
      returnGrade = 5;
    } else if (percentage >= 50 && percentage < 63) {
      returnGrade = 4;
    }else if (percentage >= 63 && percentage < 75) {
      returnGrade = 3;
    }else if (percentage >= 75 && percentage < 88) {
      returnGrade = 2;
    } else {
      returnGrade = 1;
    }
    return returnGrade;
  }
}
