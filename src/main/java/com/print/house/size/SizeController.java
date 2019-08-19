package com.print.house.size;

import com.print.house.size.Size;
import com.print.house.size.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SizeController {

    @Autowired
    SizeService sizeService;

    @RequestMapping(value = {"sizes"}, method = RequestMethod.GET)
    public String getAllSizes(Model model) {
        model.addAttribute("sizes", this.sizeService.getAllSizes());
        return "sizeList";
    }

    @RequestMapping(value = "/sizes/{id}", method = RequestMethod.POST)
    public String getSize(@ModelAttribute Size size, @PathVariable int id) {

        this.sizeService.updateSize(size);
        return "redirect:/sizes";
    }

    @RequestMapping(value = "/sizes", method = RequestMethod.POST)
    public String addSize(@ModelAttribute Size size, Model model) {
        this.sizeService.addSize(size);
        model.addAttribute("sizes", this.sizeService.getAllSizes());
        return "sizeList";
    }

    @RequestMapping(value = "/deleteSizeRecord/{id}", method = RequestMethod.GET)
    public String deleteSize(@PathVariable int id, Model model) {
        boolean isDeleted = sizeService.deleteSize(id);
        if(!isDeleted) {
            model.addAttribute("errorDeleteSize", "error deleteSizeRecord!");
        }
            this.sizeService.deleteSize(id);
        model.addAttribute("sizes", this.sizeService.getAllSizes());
        return "sizeList";
    }

}
