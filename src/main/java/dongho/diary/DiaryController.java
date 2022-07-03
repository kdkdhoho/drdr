package dongho.diary;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DiaryController {

    @GetMapping("/diaries/new")
    public String makeDiary() {
        return "/resources/templates/diary/NewDiary";
    }
}
