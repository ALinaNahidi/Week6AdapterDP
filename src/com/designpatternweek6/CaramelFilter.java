package com.designpatternweek6;

import com.designpatternweek6.thirdPartyFilters.Caramel;

public class CaramelFilter implements Filter{

    private Caramel caramel;

    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
}
