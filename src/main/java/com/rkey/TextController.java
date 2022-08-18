package com.rkey;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
public class TextController {

    /*TODO
    private final TextTransfer textTransfer;

    @GetMapping("/")
    public String home(@ModelAttribute Data data, Model model) {

        log.info("GetMapping to /"); // TODO
        model.addAttribute("data", data);
        return "home";
    }

    @GetMapping("/{length}")
    public String home(@PathVariable int length) {

        System.setProperty("java.awt.headless", "false");
        TextTransfer textTransfer = new TextTransfer();
        String str = RandomStringUtils.randomAlphanumeric(length);

        textTransfer.setClipboardContents(str);
        return "redirect:/";
    }

    @PostMapping("/")
    public String SetClipboard() throws Exception{

        log.info("PostMapping to /"); // TODO
        try {
            System.setProperty("java.awt.headless", "false");
            String str = RandomStringUtils.randomAlphanumeric(12);
            textTransfer.setClipboardContents(str);
        } catch (Exception e) {
            log.info("Exception={}", e);
            throw e;
        }
        return "redirect:/";
    }
    */

}
