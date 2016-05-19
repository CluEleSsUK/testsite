package com.tekhaus.resource;

import static org.assertj.core.api.Assertions.assertThat;

public class HomeResourceTest {

    private HomeResource homeResource = new HomeResource();

    public void shouldReturn200OnGet() throws Exception {
        assertThat(homeResource.homepage().getStatus()).isEqualTo(200);
    }
}
