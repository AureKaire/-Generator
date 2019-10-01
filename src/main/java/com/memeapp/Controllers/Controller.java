package com.memeapp.Controllers;

import com.memeapp.Data.PicRepository;
import com.memeapp.Model.Picture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class Controller {
    @Autowired
    private PicRepository picRepository;

    @RequestMapping(value = "/pictures", method = RequestMethod.GET, produces = "application/json")
    public List<Picture> listPics(){
        List<Picture> allPics = picRepository.getAllPics();
//       ("pics", allPics);
        // return "home";
        return allPics;

    }

}
