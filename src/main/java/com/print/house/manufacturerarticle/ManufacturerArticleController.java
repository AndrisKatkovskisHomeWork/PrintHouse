package com.print.house.manufacturerarticle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ManufacturerArticleController {

    @Autowired
    ManufacturerArticleService manufacturerArticleService;

    @RequestMapping(value = {"manufacturerArticles"}, method = RequestMethod.GET)
    public String getAllManufacturerArticles(Model model) {
        model.addAttribute("manufacturerArticles", this.manufacturerArticleService.getAllManufacturerArticles());
        return "manufacturerArticleList";
    }

    @RequestMapping(value = "/manufacturerArticles/{id}", method = RequestMethod.POST)
    public String getManufacturerArticle(@ModelAttribute ManufacturerArticle manufacturerArticle, @PathVariable int id) {

        this.manufacturerArticleService.updateManufacturerArticle(manufacturerArticle);
        return "redirect:/manufacturerArticles";
    }

    @RequestMapping(value = "/manufacturerArticles", method = RequestMethod.POST)
    public String addManufacturerArticle(@ModelAttribute ManufacturerArticle manufacturerArticle, Model model) {
        this.manufacturerArticleService.addManufacturerArticle(manufacturerArticle);
        model.addAttribute("manufacturerArticles", this.manufacturerArticleService.getAllManufacturerArticles());
        return "manufacturerArticleList";
    }

    @RequestMapping(value = "/deleteManufacturerArticleRecord/{id}", method = RequestMethod.GET)
    public String deleteManufacturerArticle(@PathVariable int id, Model model) {
        boolean isDeleted = manufacturerArticleService.deleteManufacturerArticle(id);
        if (!isDeleted) {
            model.addAttribute("errorDeleteManufacturerArticle", "error deleteManufacturerArticleRecord!");
        }
        this.manufacturerArticleService.deleteManufacturerArticle(id);
        model.addAttribute("manufacturerArticles", this.manufacturerArticleService.getAllManufacturerArticles());
        return "manufacturerArticleList";
    }

}
