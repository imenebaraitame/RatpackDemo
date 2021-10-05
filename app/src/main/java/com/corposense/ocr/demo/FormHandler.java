package com.corposense.ocr.demo;

import ratpack.form.Form;
import ratpack.form.UploadedFile;
import ratpack.handling.Context;
import ratpack.handling.Handler;

import java.util.List;

public class FormHandler implements Handler {
    @Override
    public void handle(Context ctx) {
        ctx.parse(Form.class).then(form -> {
            UploadedFile file = form.file("test2.jpg");
            String param = form.get("param");
            List<String> multi = form.getAll("multi");
            ctx.render("form uploaded!");
            ctx.next();

        });
    }
}
