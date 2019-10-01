package com.memeapp.Data;

import com.memeapp.Model.Picture;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class
PicRepository {
    private static final List<Picture> ALL_PICS = Arrays.asList(
//            new Picture("think", 2),
            new Picture("happy", 2),
            new Picture("face1", 3),
            new Picture("face2", 3),
            new Picture("face3", 3),
            new Picture("face4", 1)



    );

    public Picture findByName(String name) {
        for (Picture pic : ALL_PICS) {
            if (pic.getName().equals(name)) {
                return pic;
            }
        }
        return null;
    }

    public List<Picture> getAllPics() {
        return ALL_PICS;
    }

    public List<Picture> findByCategoryId(int id) {
        List<Picture> pics = new ArrayList<>();
        for (Picture pic : ALL_PICS) {
            if (pic.getCategoryId() == id) {
                pics.add(pic);
            }
        }
        return pics;
    }
}
