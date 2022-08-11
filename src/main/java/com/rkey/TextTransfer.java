package com.rkey;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.awt.datatransfer.*;
import java.io.IOException;

@Slf4j
@Component
public final class TextTransfer implements ClipboardOwner {

/*
Simple test harness.
    public static void main(String...  args){
        // TextTransfer textTransfer = new TextTransfer();

        //display what is currently on the clipboard
        // log.info("Clipboard contains={}", textTransfer.getClipboardContents());

        //change the contents and then re-display
        //textTransfer.setClipboardContents("blah, blah, blah");
        //log.info("Clipboard contains={}", textTransfer.getClipboardContents());
    }
*/

    /**
     * Empty implementation of the ClipboardOwner interface.
     */
    @Override public void lostOwnership(Clipboard clipboard, Transferable contents){
        //do nothing
    }

    /**
     * Place a String on the clipboard, and make this class the
     * owner of the Clipboard's contents.
     */
    public void setClipboardContents(String string) throws Exception {
        log.info("setClipboardContents()");
        try {
            StringSelection stringSelection = new StringSelection(string);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, this);
        } catch(Exception e) {
            throw e;
        }
        log.info("Clipboard contains={}", this.getClipboardContents());
    }

    /**
     * Get the String residing on the clipboard.
     *
     * @return any text found on the Clipboard; if none found, return an
     * empty String.
     */
    public String getClipboardContents() {
        String result = "";
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        //odd: the Object param of getContents is not currently used
        Transferable contents = clipboard.getContents(null);
        boolean hasTransferableText = (contents != null) && contents.isDataFlavorSupported(DataFlavor.stringFlavor);
        if (hasTransferableText) {
            try {
                result = (String)contents.getTransferData(DataFlavor.stringFlavor);
            }
            catch (UnsupportedFlavorException | IOException ex){
                System.out.println(ex);
                ex.printStackTrace();
            }
        }
        return result;
    }

    private static void log(String msg) {
        System.out.println(msg);
    }
}
