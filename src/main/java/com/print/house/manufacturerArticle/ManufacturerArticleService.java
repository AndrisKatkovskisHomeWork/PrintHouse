package com.print.house.manufacturerArticle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ManufacturerArticleService {

    @Autowired
    ManufacturerArticleRepository manufacturerArticleRepository;

    public List<ManufacturerArticle> getAllManufacturerArticles() {
        List<ManufacturerArticle> accessories = new ArrayList<>();
        manufacturerArticleRepository.findAll().forEach(accessories::add);
        return accessories;
    }

    public ManufacturerArticle getManufacturerArticle(int id) {
        return manufacturerArticleRepository.findById(id).get();
    }

    public void addManufacturerArticle(ManufacturerArticle manufacturerArticle) {
        manufacturerArticleRepository.save(manufacturerArticle);
    }

    public boolean deleteManufacturerArticle(int id) {
        try {
            manufacturerArticleRepository.deleteById(id);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public void updateManufacturerArticle(ManufacturerArticle manufacturerArticle) {
        manufacturerArticleRepository.save(manufacturerArticle);
    }

}