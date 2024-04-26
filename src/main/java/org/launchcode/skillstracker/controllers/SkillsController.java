package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {
    @RequestMapping(value="")
    public String skillTracker() {
        String html = "<hi>Skill Tracker</h1>"+
                "<h2>These are my programming skills that id like to learn</h2>"+
                "<ol>"+
                "<li>java</li>"+
                "<li>javaScript</li>"+
                "<li>Html</li>"+
                "</ol>";

                return html;
    }

    @GetMapping("form")
    public String skillsForm(){
        String html = "<form method = 'post'>"+
                "Name:<br>"+
                "<input type = 'text' name = 'name' />"+
                "<br>My Favourite Language is : </br>"+
                "<select name = 'firstChoice'>"+
                "<option value = 'java'>Java</option>"+
                "<option value = 'javaScript'>JavaScript</option>"+
                "<option value = 'java'>Html</option>"+
                "</select>"+
                "<br>My Second Favourite Language is : </br>"+
                "<select name = 'secondChoice'>"+
                "<option value = 'java'>Java</option>"+
                "<option value = 'javaScript'>JavaScript</option>"+
                "<option value = 'java'>Html</option>"+
                "</select>"+
                "<br>My Third Favourite Language is : </br>"+
                "<select name = 'thirdChoice'>"+
                "<option value = 'java'>Java</option>"+
                "<option value = 'javaScript'>JavaScript</option>"+
                "<option value = 'java'>Html</option>"+
                "</select>"+
                "<br><input type = 'submit' value = 'Submit'>"+
                "</form>";
                return html;

    }

    @PostMapping("form")
    public String mySkillsPage(@RequestParam String name,@RequestParam String firstChoice,@RequestParam String secondChoice,@RequestParam String thirdChoice){
        String html = "<h1>"+name+"</h1>"+
                "<ol>"+
                "<li>"+firstChoice+"</li>"+
                "<li>"+secondChoice+"</li>"+
                "<li>"+thirdChoice+"</li>"+
                "</ol>";
        return html;
    }


}
