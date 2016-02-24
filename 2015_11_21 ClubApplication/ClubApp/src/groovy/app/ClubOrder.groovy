package app

import com.vaadin.ui.UI
import com.vaadin.ui.VerticalLayout
import com.vaadin.server.VaadinRequest
import com.vaadin.ui.*
import com.vaadin.ui.MenuBar.MenuItem
import com.vaadin.grails.Grails

import com.vaadin.annotations.Theme
import app.*

class ClubOrder extends CustomComponent{
	public ClubOrder(){

	}

	public ClubOrder(String clubName){
		Panel panel = new Panel()
		VerticalLayout layout = new VerticalLayout()

		panel.setContent(layout)

		TabSheet order = new TabSheet()
		layout.addComponent(order)

		VerticalLayout tab = new VerticalLayout()
		tab.addComponent(new ClubData())
		order.addTab(tab, clubName)

		layout.addComponent(order)
		setCompositionRoot(panel)
	}
	

}