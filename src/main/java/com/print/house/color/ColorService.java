package com.print.house.color;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ColorService {

    @Autowired
    ColorRepository colorRepository;

    public List<Color> getAllColors() {
        List<Color> accessories = new ArrayList<>();
        colorRepository.findAll().forEach(accessories::add);
        return accessories;
    }

    public Color getColor(int id) {
        return colorRepository.findById(id).get();
    }

    public void addColor(Color color) {
        colorRepository.save(color);
    }

    public boolean deleteColor(int id) {
        try {
            colorRepository.deleteById(id);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public void updateColor(Color color) {
        colorRepository.save(color);
    }

}