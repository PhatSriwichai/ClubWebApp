package app

import com.vaadin.ui.UI
import com.vaadin.ui.VerticalLayout
import com.vaadin.server.VaadinRequest
import com.vaadin.ui.*
import com.vaadin.grails.Grails

import app.*
import com.vaadin.annotations.Theme

@Theme("ClubApp")
class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {

		VerticalLayout layout = new VerticalLayout()

        ClubOrder club = new ClubOrder("Logic")
        layout.addComponent(club)

        // example of how to get Grails service and call a method
        // List<User> users = Grails.get(UserService).getListOfUsers()
        //    for (User user : users) {
        //    	layout.addComponent(new Label(user.name))
        // }

		setContent(layout)
    }
}
