package ben.com.demo.controller;

import ben.com.demo.model.Image;
import ben.com.demo.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ImageController {

    @Autowired
    private ImageRepository imageRepository;

    public ImageController(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    @GetMapping("/images")
    public Iterable<Image> getAllImages() {
        return imageRepository.findAll();
    }

    @PostMapping("/addImage")
    public Image addImage(@RequestBody Image image) {
        return imageRepository.save(image);
    }

    @DeleteMapping("/deleteImage/{id}")
    public void deleteImage(@PathVariable Long id) {
        imageRepository.deleteById(id);
    }
}
