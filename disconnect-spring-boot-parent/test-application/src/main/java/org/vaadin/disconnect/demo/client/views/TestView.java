package org.vaadin.disconnect.demo.client.views;

import org.vaadin.disconnect.demo.backend.GreeterService;
import org.vaadin.disconnect.demo.client.TestState;
import org.vaadin.disconnect.vue.annotations.Route;
import org.vaadin.disconnect.vue.annotations.InjectState;
import org.vaadin.disconnect.vue.annotations.VueComponent;
import org.vaadin.disconnect.vue.client.binding.Binder;
import org.vaadin.disconnect.vue.client.elements.Element;
import org.vaadin.disconnect.vue.client.ui.Component;
import org.vaadin.disconnect.vuetify.elements.Button;
import org.vaadin.disconnect.vuetify.elements.Icon;
import org.vaadin.disconnect.vuetify.elements.inputs.TextField;
import org.vaadin.disconnect.vuetify.elements.wrappers.VerticalLayout;
import org.vaadin.disconnect.vuetify.icons.MDI;
import org.vaadin.disconnect.vuetify.theme.MaterialColor;

import javax.annotation.Resource;
import java.util.Objects;


@VueComponent
@Route("test")
public class TestView extends Component {

    private UserDetails details = new UserDetails();

    private TextField email = new TextField("Email address");
    private TextField password = new TextField("Type password");
    private TextField confirmPassword = new TextField("Type password again");

    @InjectState
    private TestState testState;

    @Resource
    private GreeterService service;

    @Override
    public Element init() {
        Binder<UserDetails> binder = Binder.bind(details,this);

        Button button = new Button("Test validation");

        observe(() -> testState.getEmailAddress()).then(details::setEmail);
        observe(() -> Objects.equals(details.getPassword(), details.getConfirmPassword()))
                .map(equals -> equals ? null : "passwords must match")
                .then(confirmPassword::setErrorMessage);
        observe(binder::isValid).then(button::setEnabled);

        button.onClick(() -> {
            testState.setEmailAddress(details.getEmail());
            System.out.println(service.hello(details.getEmail()));
        });

        return new VerticalLayout(new Icon(MDI.LAN_DISCONNECT), email, password, confirmPassword, button);
    }
}
