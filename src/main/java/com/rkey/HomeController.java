package com.rkey;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(@ModelAttribute Data data, Model model) {

        model.addAttribute("data", data);

        return "/home";
    }

/*    @GetMapping("/{length}")
    public String home(@PathVariable int length) {

        System.setProperty("java.awt.headless", "false");
        TextTransfer textTransfer = new TextTransfer();
        String str = RandomStringUtils.randomAlphanumeric(length);

        textTransfer.setClipboardContents(str);
        return "redirect:/";
    }*/

    @PostMapping("/")
    public String homeRedirect() {

        System.setProperty("java.awt.headless", "false");
        TextTransfer textTransfer = new TextTransfer();
        String str = RandomStringUtils.randomAlphanumeric(12);

        textTransfer.setClipboardContents(str);
        return "redirect:/";
    }
}
