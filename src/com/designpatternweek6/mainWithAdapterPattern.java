package com.designpatternweek6;

import com.designpatternweek6.thirdPartyFilters.Caramel;

public class mainWithAdapterPattern {
    public static void main(String[] args) {
        ImageView imageView = new ImageView(new Image());
        imageView.apply(new CaramelFilter(new Caramel()));
    }
}
