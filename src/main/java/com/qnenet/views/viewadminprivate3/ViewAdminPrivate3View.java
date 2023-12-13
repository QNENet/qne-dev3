package com.qnenet.views.viewadminprivate3;

import com.qnenet.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.RolesAllowed;

@PageTitle("ViewAdminPrivate3")
@Route(value = "ViewRolePrivate3", layout = MainLayout.class)
@RolesAllowed("ADMIN")
@Uses(Icon.class)
public class ViewAdminPrivate3View extends Composite<VerticalLayout> {

    public ViewAdminPrivate3View() {
        H1 h1 = new H1();
        getContent().setHeightFull();
        getContent().setWidthFull();
        getContent().setJustifyContentMode(JustifyContentMode.CENTER);
        getContent().setAlignItems(Alignment.CENTER);
        h1.setText("View Admin Private 3");
        getContent().setAlignSelf(FlexComponent.Alignment.CENTER, h1);
        h1.setWidth("max-content");
        getContent().add(h1);
    }
}
