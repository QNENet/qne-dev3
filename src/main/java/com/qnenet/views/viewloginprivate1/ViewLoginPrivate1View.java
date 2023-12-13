package com.qnenet.views.viewloginprivate1;

import com.qnenet.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;

@PageTitle("ViewLoginPrivate1")
@Route(value = "ViewLoginPrivate1", layout = MainLayout.class)
@PermitAll
@Uses(Icon.class)
public class ViewLoginPrivate1View extends Composite<VerticalLayout> {

    public ViewLoginPrivate1View() {
        H1 h1 = new H1();
        getContent().setHeightFull();
        getContent().setWidthFull();
        getContent().getStyle().set("flex-grow", "1");
        getContent().setJustifyContentMode(JustifyContentMode.CENTER);
        getContent().setAlignItems(Alignment.CENTER);
        h1.setText("View Login Private 1");
        h1.setWidth("max-content");
        getContent().add(h1);
    }
}
