package com.qnenet.views.viewroleprivate2;

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
import jakarta.annotation.security.RolesAllowed;

@PageTitle("ViewRolePrivate2")
@Route(value = "ViewRolePrivate2", layout = MainLayout.class)
@RolesAllowed("USER")
@Uses(Icon.class)
public class ViewRolePrivate2View extends Composite<VerticalLayout> {

    public ViewRolePrivate2View() {
        H1 h1 = new H1();
        getContent().setHeightFull();
        getContent().setWidthFull();
        getContent().setJustifyContentMode(JustifyContentMode.CENTER);
        getContent().setAlignItems(Alignment.CENTER);
        h1.setText("View Role Private 2");
        h1.setWidth("max-content");
        getContent().add(h1);
    }
}
