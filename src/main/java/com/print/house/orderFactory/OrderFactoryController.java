package com.print.house.orderFactory;

import com.print.house.color.ColorService;
import com.print.house.manufacturerArticle.ManufacturerArticleService;
import com.print.house.size.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


@Controller
public class OrderFactoryController {

    @Autowired
    OrderFactoryService orderFactoryService;

    @Autowired
    ColorService colorService;

    @Autowired
    SizeService sizeService;

    @Autowired
    ManufacturerArticleService manufacturerArticleService;


//    @RequestMapping("/orderFactoryList")
//    public String orderFactoryList() {
//        return "orderFactoryList";
//    }

    @RequestMapping(value = "/orderFactoryList", method = RequestMethod.GET)
    public String getAllOrderFactorys(Model model) {
        colorManufacturerArticlesSizes(model);
        model.addAttribute("orderFactorysList", orderFactoryService.getAllOrderFactorys());
        return "orderFactoryList";
    }

    private void colorManufacturerArticlesSizes(Model model) {
        model.addAttribute("colors", this.colorService.getAllColors());
        model.addAttribute("manufacturerArticles", this.manufacturerArticleService.getAllManufacturerArticles());
        model.addAttribute("sizes", this.sizeService.getAllSizes());
        model.addAttribute("booking", new OrderFactory());
    }

    @RequestMapping(value = "/orderFactoryList", method = RequestMethod.POST)
    public String addOrderFactory(@ModelAttribute OrderFactory orderFactory, BindingResult bindingResult, Model model) {
        this.orderFactoryService.addOrderFactory(orderFactory);
        colorManufacturerArticlesSizes(model);
        model.addAttribute("orderFactorysList", orderFactoryService.getAllOrderFactorys());
        return "orderFactoryList";
    }


    @RequestMapping(value = "/deleteOrderFactoryRecord/{id}", method = RequestMethod.GET)
    public String deleteOrderFactory(@PathVariable int id) {
        this.orderFactoryService.deleteOrderFactory(id);
        return "redirect:/orderFactoryList";
    }
}