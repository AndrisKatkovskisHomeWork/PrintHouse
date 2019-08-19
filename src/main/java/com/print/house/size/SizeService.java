package com.print.house.size;

import com.print.house.size.Size;
import com.print.house.size.SizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SizeService {

    @Autowired
    SizeRepository sizeRepository;

    public List<Size> getAllSizes() {
        List<Size> accessories = new ArrayList<>();
        sizeRepository.findAll().forEach(accessories::add);
        return accessories;
    }

    public Size getSize(int id) {
        return sizeRepository.findById(id).get();
    }

    public void addSize(Size size) {
        sizeRepository.save(size);
    }

    public boolean deleteSize(int id) {
        try {
            sizeRepository.deleteById(id);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public void updateSize(Size size) {
        sizeRepository.save(size);
    }

}