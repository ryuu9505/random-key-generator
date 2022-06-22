package com.rkey;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "/home";
    }

    @PostMapping("/")
    public String homeRedirect() {

        System.setProperty("java.awt.headless", "false");
        TextTransfer textTransfer = new TextTransfer();
        String str = RandomStringUtils.randomAlphanumeric(12);

        textTransfer.setClipboardContents(str);
        return "redirect:/";
    }
}
