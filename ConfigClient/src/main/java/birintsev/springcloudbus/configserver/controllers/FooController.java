package birintsev.springcloudbus.configserver.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RefreshScope
@RestController
@RequestMapping
public class FooController {

    @Value("${foo.bar}")
    private String fooBar;

    @RequestMapping(method = GET)
    public ResponseEntity<SimpleResponseMessage> fooBar() {
        return ResponseEntity.ok(new SimpleResponseMessage(fooBar));
    }
}
