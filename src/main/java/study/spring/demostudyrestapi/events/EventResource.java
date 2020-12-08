package study.spring.demostudyrestapi.events;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.RepresentationModel;

import static org.springframework.hateoas.server.mvc.ControllerLinkBuilder.linkTo;

// BeanSerializer
public class EventResource extends EntityModel<Event> {
    // hateoas latest version : https://docs.spring.io/spring-hateoas/docs/1.0.1.RELEASE/reference/html/
    // ResourceSupport is now RepresentationModel
    // Resource is now EntityModel
    // Resources is now CollectionModel
    // PagedResources is now PagedModel

    public EventResource(Event event, Link... links) {
        super(event, links);
        add(linkTo(EventController.class).slash(event.getId()).withSelfRel());
    }
}
