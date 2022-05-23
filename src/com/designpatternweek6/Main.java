package com.designpatternweek6;

public class Main {

    public static void main(String[] args) {
        var imageView = new ImageView(new Image());
        imageView.apply(new VividFilter());
//        imageView.apply(new Caramel());

    }
}
