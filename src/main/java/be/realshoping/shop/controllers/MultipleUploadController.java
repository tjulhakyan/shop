package be.realshoping.shop.controllers;

import be.realshoping.shop.data.ProductImage;
import be.realshoping.shop.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class MultipleUploadController {
    @Autowired
    FileService fileService;

    @GetMapping("/multiple-upload")
    public String index() {
        return "multipleUpload";
    }

    @PostMapping("/multipleUploadFiles")
    public String uploadFiles(@RequestParam("files") MultipartFile[] files,
                              RedirectAttributes redirectAttributes) {

        Arrays.asList(files)
                .stream()
//                .peek(file -> System.out.println(file.getOriginalFilename()))
                .forEach(file -> fileService.uploadFile(file));


        List<ProductImage> prodImg= Arrays.asList(files).stream()
                .map(file -> new ProductImage(file.getOriginalFilename()))
                .collect(Collectors.toList());

        prodImg.forEach(img -> System.out.println(img.getImgUrl()));


        redirectAttributes.addFlashAttribute("message",
                "You successfully uploaded all files!");

        return "redirect:/multiple-upload";
    }
}
