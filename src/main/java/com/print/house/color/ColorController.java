package com.print.house.color;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ColorController {

    @Autowired
    ColorService colorService;

    @RequestMapping(value = {"colors"}, method = RequestMethod.GET)
    public String getAllColors(Model model) {
        model.addAttribute("colors", this.colorService.getAllColors());
        return "colorList";
    }

    @RequestMapping(value = "/colors/{id}", method = RequestMethod.POST)
    public String getColor(@ModelAttribute Color color, @PathVariable int id) {

        this.colorService.updateColor(color);
        return "redirect:/colors";
    }

    @RequestMapping(value = "/colors", method = RequestMethod.POST)
    public String addColor(@ModelAttribute Color color, Model model) {
        this.colorService.addColor(color);
        model.addAttribute("colors", this.colorService.getAllColors());
        return "colorList";
    }

    @RequestMapping(value = "/deleteColorRecord/{id}", method = RequestMethod.GET)
    public String deleteColor(@PathVariable int id, Model model) {
        boolean isDeleted = colorService.deleteColor(id);
        if(!isDeleted) {
            model.addAttribute("errorDeleteColor", "error deleteColorRecord!");
        }
            this.colorService.deleteColor(id);
        model.addAttribute("colors", this.colorService.getAllColors());
        return "colorList";
    }

}
