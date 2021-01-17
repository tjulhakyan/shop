package be.realshoping.shop.controllers;

import be.realshoping.shop.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;

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
                .forEach(file -> fileService.uploadFile(file));

        redirectAttributes.addFlashAttribute("message",
                "You successfully uploaded all files!");

        return "redirect:/multiple-upload";
    }
}
